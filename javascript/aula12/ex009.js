//chamar o node no console: node javascript\aula12\ex009.js

console.log('Olá Mundo!');
console.log('------------')
var agora = new Date();
var hora = agora.getHours();
console.log(`Agora são exatamente ${hora} horas`);
if (hora<12){
    console.log('Bom dia!');
}

switch(hora%3){
    case 1:
        console.log('Restou 1');
        break;
    case 2:
        console.log('Restou 2');
        break;
    case 0:
        console.log('Restou 0');
        break;
    default:
        console.log('Default');
        break;
}