let sexo="feminino";
let nome=["Pikachu", "Butterfly", "Cyndaquil"];
let livel="15";
let lutar=false;
let hp=200

console.log("o sexo do pokemon é:"+ sexo);
console.log("o nome do pokemon:"+nome[1]);
console.log("pode lutar:");
if(lutar ||  hp<=0){
    console.log("pode lutar");
}else{
    console.log("Não pode lutar");
}
console.log("vida:"+hp);