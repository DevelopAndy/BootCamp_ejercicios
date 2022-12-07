// factorial-while.js -> Este archivo debe calcular el factorial de 10
// utilizando un bucle while

let factorial = 10;
let resultado = 1;

while (factorial > 0) {
	resultado *= factorial;
	factorial--;
}

console.log(resultado);
