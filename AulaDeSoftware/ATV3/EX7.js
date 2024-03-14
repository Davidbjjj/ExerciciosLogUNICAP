function avaliarCredito(saldo, historicoCredito, rendaMensal) {
    if (saldo > 1000 && historicoCredito && rendaMensal > 3000) {
        alert("Crédito aprovado");
    } else {
        alert("Crédito negado");
    }
}

let saldo = parseFloat(prompt("Digite o saldo atual: "));
let historicoCreditoInput = prompt("Seu histórico de crédito é bom? Responda 'sim' ou 'não': ");
let historicoCredito = historicoCreditoInput.toLowerCase() === "sim";
let rendaMensal = parseFloat(prompt("Digite a renda mensal: "));

avaliarCredito(saldo, historicoCredito, rendaMensal);
