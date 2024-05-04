// Função para buscar filmes
function searchMovies() {
    const apiKey = '29334a08'; // Insira sua chave de API do OMDb aqui
    const searchInput = document.getElementById('searchInput').value;
    const url = `http://www.omdbapi.com/?apikey=${apiKey}&s=${searchInput}`;
  
    // Limpar resultados anteriores
    document.getElementById('movieResults').innerHTML = '';
  
    // Fazer a requisição para a API
    fetch(url)
      .then(response => response.json())
      .then(data => {
        if (data.Search) {
          data.Search.forEach(movie => {
            const movieCard = `
              <div class="col-md-4">
                <div class="card mb-4">
                  <img src="${movie.Poster}" class="card-img-top" alt="...">
                  <div class="card-body">
                    <h5 class="card-title">${movie.Title}</h5>
                    <p class="card-text">Ano: ${movie.Year}</p>
                    <a href="#" class="btn btn-primary">Ver Detalhes</a>
                  </div>
                </div>
              </div>
            `;
            document.getElementById('movieResults').innerHTML += movieCard;
          });
        } else {
          document.getElementById('movieResults').innerHTML = '<div class="col"><p>Nenhum resultado encontrado.</p></div>';
        }
      })
      .catch(error => console.log('Erro ao buscar filmes:', error));
  }
  
  // Evento de clique no botão de busca
  document.getElementById('searchBtn').addEventListener('click', searchMovies);
  