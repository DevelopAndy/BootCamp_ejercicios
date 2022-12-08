// Crea un archivo llamado objetos.js que contenga las siguientes líneas
// - Un objeto con tus datos personales (nombre, apellido, edad, altura, eresDesarrollador)
// - Una variable que obtenga tu edad a partir del objeto anterior
// - Una lista que contenga el objeto con tus datos personales y un nuevo objeto con los datos personales de tus dos mejores amig@s
// - Una nueva lista con los objetos de la lista anterior ordenados por edad, de mayor a menor

let personales = {
	nombre: 'Andy',
	apellido: 'Abs',
	edad: 36,
	altura: 1.76,
	desarrollador: true,
};

let edad = personales.edad;

let amigosYYo = [
	personales,
	{
		nombre: 'Juan',
		apellido: 'Quix',
		edad: 30,
		altura: 1.86,
		desarrollador: false,
	},
	{
		nombre: 'Otto',
		apellido: 'Amigu',
		edad: 28,
		altura: 1.72,
		desarrollador: false,
	},
];

let listaOrdenada = amigosYYo.sort((a, b) => a.edad + b.edad);

console.log(edad);
console.log(amigosYYo);
console.log(listaOrdenada);
