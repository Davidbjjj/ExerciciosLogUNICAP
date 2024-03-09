function verificarMaioridade(dataNascimento) {

    var dataAtual = new Date();
    var partesData = dataNascimento.split("/");
    var dataNascimentoFormatada = new Date(partesData[2], partesData[1] - 1, partesData[0]);
    var diferencaMilissegundos = dataAtual - dataNascimentoFormatada;
    var idade = Math.floor(diferencaMilissegundos / (1000 * 60 * 60 * 24 * 365.25));
    
    if (idade >= 18) {
        return "Você é maior de idade.";
    } else {
        return "Você é menor de idade.";
    }
}

function Maioridade() {
    var dataNascimento = prompt("Digite sua data de nascimento (DD/MM/AAAA):");
    var mensagem = verificarMaioridade(dataNascimento);
    console.log(mensagem);
}

Maioridade();
