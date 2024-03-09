function classificarTriangulo(lado1, lado2, lado3) {
    if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
        if (lado1 === lado2 && lado1 === lado3) {
            return alert("O triângulo é equilátero.");
        } else if (lado1 === lado2 || lado1 === lado3 || lado2 === lado3) {
            return alert("O triângulo é isósceles.");
        } else {
            return alert("O triângulo é escaleno.");
        }
    } else {
        return "Os lados fornecidos não formam um triângulo válido.";
    }
}

function triangulos() {
    var lado1 = parseFloat(prompt("Digite o comprimento do primeiro lado do triângulo:"));
    var lado2 = parseFloat(prompt("Digite o comprimento do segundo lado do triângulo:"));
    var lado3 = parseFloat(prompt("Digite o comprimento do terceiro lado do triângulo:"));

    var classificacao = classificarTriangulo(lado1, lado2, lado3);
    console.log(classificacao);
}

triangulos();
