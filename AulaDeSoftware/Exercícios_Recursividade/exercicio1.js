const readlineSync = require('readline-sync');

// Funcao para calcular a soma de 1 a N de forma recursiva
function somaDe1aN(n) {
  if (n === 1) {
    return 1;
  } else {
    return n + somaDe1aN(n - 1);
  }
}

// Obtem o valor de N do usuario
const n = parseInt(readlineSync.question("Digite o valor de N: "));
console.log("A soma de 1 a " + n + " e " + somaDe1aN(n));
