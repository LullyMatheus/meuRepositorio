//Javascript rodando fora do navegador
//Exeutar com F8

//chamar o node no console: node javascript\aula11\ex008.js

console.log('O console esta funcionando');
console.log('------------------');
var velocidade = 100;
console.log(`Você passou pelo radar a ${velocidade}Km/h`);
if (velocidade>60){
    console.log('Você ultrapassou o limite de 60km/h. MULTADO!');
} else {
    console.log('Você respeitou o limite de 60km/h. Parabéns!');
}