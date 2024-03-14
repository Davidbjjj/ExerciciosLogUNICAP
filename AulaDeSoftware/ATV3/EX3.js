function realizarDeposito(saldoAtual, valorDeposito) {
    saldoAtual += valorDeposito;
    alert(`Depósito realizado com sucesso. Novo saldo: R$${saldoAtual}`);
}

let saldoAtual = parseFloat(prompt("Digite o saldo atual: "));
let valorDeposito = parseFloat(prompt("Digite o valor do depósito: "));

realizarDeposito(saldoAtual, valorDeposito);
