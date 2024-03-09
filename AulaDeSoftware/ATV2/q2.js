function gerarNumeroAleatorio() {
    return Math.floor(Math.random() * 100);
  }
  
  function jogoDeAdivinhacao() {
    const numeroSecreto = gerarNumeroAleatorio();
    let palpite=0;
    let tentativas = 0;
  
    while (true) {
      palpite = parseInt(prompt("Adivinhe o número secreto entre 1 e 100:"));
      tentativas++;
  
      if ( palpite < 1 || palpite > 100) {
        alert("Por favor, Digite um número válido entre 1 e 100.");
        continue;
      }
  
      if (palpite === numeroSecreto) {
        alert(`Parabéns! Você acertou o número secreto ${numeroSecreto} em ${tentativas} tentativas.`);
        break;
      } else if (palpite < numeroSecreto) {
        alert("O número secreto é maior.");
      } else {
        alert("O número secreto é menor.");
      }
    }
  }
  
  jogoDeAdivinhacao();
  