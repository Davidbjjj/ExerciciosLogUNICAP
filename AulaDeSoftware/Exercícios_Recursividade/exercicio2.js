const readlineSync = require('readline-sync');

// Funcao para calcular a soma de fracoes de 1 a 1/N de forma recursiva
function somaDe1aNFracoes(n) {
  if (n === 1) {
    return 1;
  } else {
    return 1.0 / n + somaDe1aNFracoes(n - 1);
  }
}

// Obtem o valor de N do usuario
const n = parseInt(readlineSync.question("Digite o valor de N: "));
console.log("A soma de 1/1 a 1/" + n + " e " + somaDe1aNFracoes(n));
