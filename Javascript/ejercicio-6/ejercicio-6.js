// Crea un archivo JS que contenga las siguientes líneas
// - Una variable que contenga la lista de la compra (mínimo 5 elementos)
// - Modifica la lista de la compra y añádele "Aceite de Girasol"
// - Vuelve a modificar la lista de la compra eliminando "Aceite de Girasol"
// - Una lista de tus 3 películas favoritas (objetos con propiedades: titulo, director, fecha)
// - Una nueva lista que contenga las películas posteriores al 1 de enero de 2010 (utilizando filter)
// - Una nueva lista que contenga los directores de la lista de películas original (utilizando map)
// - Una nueva lista que contenga los títulos de la lista de películas original (utilizando map)
// - Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando concat)
// - Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando el factor de propagación)

let compra = ['huevos', 'Aceite', 'pan', 'queso', 'yuca'];
compra.push('Aceite de Girasol');
compra.pop();

let peliculasFavoritas = [
	{
		titulo: 'Avengers',
		director: 'George Lucas',
		fecha: new Date(2015, 1, 16),
	},
	{
		titulo: 'La Cosa',
		director: 'Andy Abs',
		fecha: new Date(2008, 2, 25),
	},
	{
		titulo: 'Venom',
		director: 'Simbionte',
		fecha: new Date(2016, 4, 13),
	},
];

let peliculasPosteriores = peliculasFavoritas.filter(
	(fecha) => fecha.fecha > new Date(2010, 0, 1)
);

let directores = peliculasFavoritas.map((directores) => directores.director);

let titulos = peliculasFavoritas.map((pelicula) => pelicula.titulo);

let directorPelicula = directores.concat(titulos);

let directorYPelicula2 = [...directores, ...titulos];
