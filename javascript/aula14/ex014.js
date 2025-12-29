//chamar o node no console: node javascript\aula14\ex014.js

let num=[4,6,7]

num.push(9)
num.push(0)
num.sort()

console.log(`Nosso vetor é o ${num}`);
console.log(`O tamanho do nosso vetor é ${num.length}`)

for(let pos=0;pos<num.length;pos++){
    console.log(num[pos])
}

console.log('-----------')

for(let pos in num){
    console.log(num[pos])
}

console.log(`O número 6 está na posição ${num.indexOf(6)}`)