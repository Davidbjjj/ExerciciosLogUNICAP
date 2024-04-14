const readlineSync = require('readline-sync');

// Funcao para calcular o n-ésimo número da sequência de Pell de forma recursiva
function pell(n) {
  if (n === 0) {
    return 0;
  } else if (n === 1) {
    return 1;
  } else {
    return 2 * pell(n - 1) + pell(n - 2);
  }
}

// Obtém o valor de N do usuário
const n = parseInt(readlineSync.question("Digite o valor de N: "));
console.log("O " + n + "-ésimo número da sequência de Pell é " + pell(n));
