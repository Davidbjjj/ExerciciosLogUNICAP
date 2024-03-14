function realizarSaque(saldoAtual, valorSaque) {
    if (valorSaque <= saldoAtual) {
        saldoAtual -= valorSaque;
        alert(`Saque realizado com sucesso. Saldo atual: R$${saldoAtual}`);
    } else {
        alert("Saldo insuficiente");
    }
}

let saldoAtual = parseInt(prompt("Digite o saldo atual: "));
let valorSaque = parseInt(prompt("Digite o valor do saque: "));

realizarSaque(saldoAtual, valorSaque);
