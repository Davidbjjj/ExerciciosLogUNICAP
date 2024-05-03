async function consultarCEP() {
    const cep = document.getElementById('cep').value;
    const endereco = document.getElementById('endereco');

    try {
        const response = await fetch(`https://viacep.com.br/ws/${cep}/json/`);
        const data = await response.json();
        endereco.innerText = `Endereço: ${data.logradouro}, ${data.bairro}, ${data.localidade} - ${data.uf}`;

        // Após consultar o CEP, chama a função para consultar o clima da cidade obtida
        consultarClima(data.localidade, 'cidade');
    } catch (error) {
        console.error('Erro ao consultar CEP:', error);
        endereco.innerText = 'CEP não encontrado.';
    }
}

async function consultarClimaPorCidade() {
    const cidade = document.getElementById('cidade').value;

    if (cidade.trim() === '') {
        alert('Por favor, insira o nome da cidade.');
        return;
    }

    consultarClima(cidade, 'cidade');
}

async function consultarClima(local, tipo) {
    const clima = document.getElementById('clima');
    const apiKey = '8c12f65456e6d11aa1f8c2d29c8a84f3'; // Insira sua chave de API da OpenWeatherMap aqui
    let url;

    if (tipo === 'cidade') {
        url = `https://api.openweathermap.org/data/2.5/weather?q=${local}&appid=${apiKey}&units=metric&lang=pt`;
    } else if (tipo === 'cep') {
        url = `https://api.openweathermap.org/data/2.5/weather?zip=${local}&appid=${apiKey}&units=metric&lang=pt`;
    } else {
        console.error('Tipo de local inválido. Use "cidade" ou "cep".');
        clima.innerText = 'Tipo de local inválido.';
        return;
    }

    try {
        const response = await fetch(url);
        const data = await response.json();

        // Verifica se os dados retornados contêm a propriedade 'main'
        if (data.main && data.main.temp) {
            const temperatura = data.main.temp;
            const descricao = data.weather[0].description;
            const nomeLocal = tipo === 'cidade' ? data.name : `${data.name}, ${data.sys.country}`;
            clima.innerText = `Clima em ${nomeLocal}: ${temperatura}°C, ${descricao}`;
        } else {
            // Se os dados não contiverem a propriedade esperada, exibe uma mensagem de erro
            throw new Error('Dados de temperatura não disponíveis para este local.');
        }
    } catch (error) {
        console.error('Erro ao consultar clima:', error);
        clima.innerText = 'Local não encontrado ou dados de clima não disponíveis.';
    }
}
