function simularSaque(valor) {
    if (valor % 10 === 0) {
        return alert("Saque realizado com sucesso.");
    } else {
        return alert("Valor inválido. Digite um valor múltiplo de 10.");
    }
}

function Saque() {
    var valor = parseInt(prompt("Digite o valor que deseja sacar:"));

    var mensagem = simularSaque(valor);
    console.log(mensagem);
}

Saque();
