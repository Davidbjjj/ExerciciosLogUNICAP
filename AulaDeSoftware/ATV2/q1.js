function calcularIMC(peso, altura) {
    return peso / (altura * altura);
}

function categorizarIMC(imc) {
    if (imc < 18.5) {
        return alert("Abaixo do peso");
    } else if (imc >= 18.5 && imc < 25.0) {
        return alert("Peso normal");
    } else if (imc >= 25.0 && imc < 30.0) {
        return alert("Excesso de peso");
    } else if (imc >= 30.0 && imc < 35.0) {
        return alert("Obesidade grau I");
    } else if (imc >= 35.0 && imc < 40.0) {
        return alert("Obesidade grau II");
    } else {
        return alert("Obesidade grau III");
    }
}

function Calcular(){
    var peso = parseFloat(prompt("Digite o seu peso em kg:"));
    var altura = parseFloat(prompt("Digite a sua altura em metros:"));

    var imc = calcularIMC(peso, altura);
    var categoria = categorizarIMC(imc);

    console.log("Seu IMC é:", imc.toFixed(2));
    console.log("Categoria do IMC:", categoria);
}

Calcular();
