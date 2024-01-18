// Simulação de autenticação
let currentUser = null;

function loginUser(email, password) {
    // Verifique o email e senha do usuário (simulado)
    if (email === 'usuario@example.com' && password === 'senha123') {
        currentUser = { id: 1, name: 'Usuário' };
        return true;
    }
    return false;
}

function logoutUser() {
    currentUser = null;
}

function createUserAccount(name, email, password) {
    // Crie uma nova conta de usuário no banco de dados (simulado)
    const newUser = { id: 2, name, email };
    currentUser = newUser;
}
