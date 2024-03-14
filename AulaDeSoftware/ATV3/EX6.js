function atualizarCadastro(cadastroAtivo, saldo) {
    if (cadastroAtivo) {
        if (saldo > 0) {
            alert("Cadastro ativo e saldo positivo");
        } else {
            alert("Cadastro ativo mas precisa regularizar saldo");
        }
    } else {
        alert("Por favor, atualize seu cadastro");
    }
}

let cadastroAtivo = confirm("Seu cadastro está ativo?"); // Usando confirm para obter um valor booleano
let saldo = parseFloat(prompt("Digite o saldo da conta: "));
atualizarCadastro(cadastroAtivo, saldo);
