// Crea un archivo JS que contenga las siguientes líneas
// - Una función sin parámetros que devuelva siempre "true"
// - Una función asíncrona que utilice un setTimeout y pase por consola un "Hola soy una promesa" 5 segundos después de haberse ejecutado
// - Una función generadora de índices pares automáticos

function verdadero() {
	return true;
}

function asinc() {
	return setTimeout(() => console.log('Hola soy una promesa'), 5000);
}

function* generaradora() {
	let id = 0;
	while (true) {
		id += 2;
		yield id;
	}
}

const gen = generaradora();

console.log(gen.next().value);
console.log(gen.next().value);
console.log(gen.next().value);

asinc();
