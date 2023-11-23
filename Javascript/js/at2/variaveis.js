let timePokemon = [
    ["Pikachu", "M", 200, 18],
    ["Butterfly", "F", 180, 25],
    ["Cyndaquil","M", 140, 12]
]

console.log("o nome do pokemon: "+ timePokemon[1][0]);
console.log("o sexo do pokemon é: "+ timePokemon[1][1]);
console.log("pode lutar:");

if(timePokemon[1][2]<=200){
    console.log("pode lutar");
}else{
    console.log("Não pode lutar");
}

console.log("vida: "+timePokemon[1][2]);
console.log("Nivel: "+timePokemon[1][3]);