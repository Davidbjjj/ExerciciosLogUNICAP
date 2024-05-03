async function consultarCEP() {
    const cep = document.getElementById('cep').value;
    const endereco = document.getElementById('endereco');

    try {
        const response = await fetch(`https://viacep.com.br/ws/${cep}/json/`);
        const data = await response.json();
        endereco.innerText = `Endereço: ${data.logradouro}, ${data.bairro}, ${data.localidade} - ${data.uf}`;
    } catch (error) {
        console.error('Erro ao consultar CEP:', error);
        endereco.innerText = 'CEP não encontrado.';
    }
}

async function consultarClima() {
    const cidade = document.getElementById('cidade').value;
    const clima = document.getElementById('clima');

    try {
        const response = await fetch(`https://api.openweathermap.org/data/2.5/weather?q=${cidade}&appid=SEU_APP_ID&units=metric&lang=pt`);
        const data = await response.json();

        // Verifica se os dados retornados contêm a propriedade 'main'
        if (data.main && data.main.temp) {
            const temperatura = data.main.temp;
            const descricao = data.weather[0].description;
            clima.innerText = `Clima em ${cidade}: ${temperatura}°C, ${descricao}`;
        } else {
            // Se os dados não contiverem a propriedade esperada, exibe uma mensagem de erro
            throw new Error('Dados de temperatura não disponíveis para esta cidade.');
        }
    } catch (error) {
        console.error('Erro ao consultar clima:', error);
        clima.innerText = 'Cidade não encontrada ou dados de clima não disponíveis.';
    }
}