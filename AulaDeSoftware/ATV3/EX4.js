function realizarTransferencia(saldoOrigem, saldoDestino, valorTransferencia, limiteTransferencia) {
    if (valorTransferencia <= saldoOrigem && valorTransferencia <= limiteTransferencia) {
        saldoOrigem -= valorTransferencia;
        saldoDestino += valorTransferencia;
        alert("Transferência realizada com sucesso");
    } else if (valorTransferencia > saldoOrigem) {
        alert("Saldo insuficiente para transferência");
    } else {
        alert("Valor excede o limite de transferência");
    }
}

let saldoOrigem = parseFloat(prompt("Digite o saldo da conta de origem: "));
let saldoDestino = parseFloat(prompt("Digite o saldo da conta de destino: "));
let valorTransferencia = parseFloat(prompt("Digite o valor da transferência: "));
let limiteTransferencia = parseFloat(prompt("Digite o limite de transferência: "));

realizarTransferencia(saldoOrigem, saldoDestino, valorTransferencia, limiteTransferencia);
