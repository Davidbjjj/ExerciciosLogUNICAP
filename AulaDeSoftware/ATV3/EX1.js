function verificarSaldo(saldo) {
    if (saldo > 0) {
        alert("Saldo positivo");
    } else {
        alert("Saldo negativo ou igual a zero");
    }
}

// Exemplo de uso da função
let saldo = parseInt(prompt("Digite o saldo: "));
verificarSaldo(saldo);
