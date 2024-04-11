const readlineSync = require('readline-sync');

// Funcao para calcular o n-ésimo número da sequência de Tribonacci de forma recursiva
function tribonacci(n) {
    
  if (n === 0) {
    return 0;
  } else if (n === 1 || n === 2) {
    return 1;
  } else {
    return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
  }
}

// Obtém o valor de N do usuário
const n = parseInt(readlineSync.question("Digite o valor de N: "));
console.log("O " + n + "-ésimo número da sequência de Tribonacci é " + tribonacci(n));
