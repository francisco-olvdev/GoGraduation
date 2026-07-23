const API_BASE_URL = "bora-formar-api-ergrardbhvhwcpa6.eastus-01.azurewebsites.net";

function getToken() {
    return localStorage.getItem("token");
}

function setToken(token) {
    localStorage.setItem("token", token);
}

function clearToken() {
    localStorage.removeItem("token");
}

async function request(endpoint, options = {}) {
    const token = getToken();

    const headers = {
        "Content-Type": "application/json",
        ...(token ? { "Authorization": `Bearer ${token}` } : {}),
        ...options.headers
    };

    const response = await fetch(`${API_BASE_URL}${endpoint}`, {
        ...options,
        headers
    });

    if (response.status === 204) {
        return null;
    }

    let data = null;
    const contentType = response.headers.get("content-type");
    if (contentType && contentType.includes("application/json")) {
        data = await response.json().catch(() => null);
    }

    if (!response.ok) {
        const message = (data && (data.message || data.error)) || `Erro ${response.status} ao acessar ${endpoint}`;

        if (response.status === 401) {
            clearToken();
        }

        throw new Error(message);
    }

    return data;
}

const apiClient = {
    get(endpoint) {
        return request(endpoint, { method: "GET" });
    },
    post(endpoint, body) {
        return request(endpoint, { method: "POST", body: body !== undefined ? JSON.stringify(body) : undefined });
    },
    put(endpoint, body) {
        return request(endpoint, { method: "PUT", body: body !== undefined ? JSON.stringify(body) : undefined });
    },
    delete(endpoint) {
        return request(endpoint, { method: "DELETE" });
    },
    getToken,
    setToken,
    clearToken
};

export default apiClient;
