const readlineSync = require('readline-sync');

// Funcao para calcular a potencia de x elevado a k de forma recursiva
function potencia(x, k) {
  if (k === 0) {
    return 1;
  } else {
    return x * potencia(x, k - 1);
  }
}

// Obtem os valores de X e K do usuario
const x = parseInt(readlineSync.question("Digite o valor de X: "));
const k = parseInt(readlineSync.question("Digite o valor de K: "));
console.log(x + " elevado a " + k + " e " + potencia(x, k));
