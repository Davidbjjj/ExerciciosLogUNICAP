function checarChequeEspecial(saldo) {
    if (saldo < 0) {
        alert("Dentro do limite do cheque especial");
    } else {
        alert("Fora do limite do cheque especial");
    }
}

let saldo = parseFloat(prompt("Digite o saldo da conta: "));
checarChequeEspecial(saldo);
