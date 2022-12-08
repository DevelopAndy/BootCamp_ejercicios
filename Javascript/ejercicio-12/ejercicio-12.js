// Crea un nuevo fichero JS que contenga las siguientes líneas
// - Una función que admita un parámetro "num", y devuelva una lista con esa cantidad de números de la secuencia de Fibonacci (Por ejemplo: num = 6 => Resultado [1, 1, 2, 3, 5, 8])
// - Ejecuta la depuración de VSCode para visualizar la ejecución de la función

function listaFibonacci(num) {
	let lista = [0, 1];
	num -= 2;
	if (num >= 0) {
		for (let i = 0; i < num; i++) {
			const Fibonacci = lista[i + 1] + lista[i];
			lista = [...lista, Fibonacci];
		}
	} else if (num === -1) {
		lista = lista[0];
	} else return 'Ingresa un numero mayor a 0';

	return lista;
}

console.log(listaFibonacci(13));
