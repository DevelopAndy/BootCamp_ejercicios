// Crea un nuevo archivo JS que contenga una lista con los siguientes elementos:
// - Tu nombre (string)
// - Tu edad (number)
// - ¿Eres desarrollador? (boolean)
// - Tu fecha de nacimiento (Date)
// - Tu libro favorito (Objeto con propiedades: titulo, autor, fecha, url)

const nombre = 'Andy';
const edad = 36;
const eresDesarrollador = true;
const fechaNacimiento = new Date(1986, 10, 13);
const libroFavorito = {
	titulo: 'La Biblia',
	autor: 'Dios',
	fecha: 'miles de años',
	url: 'https://biblia.com/',
};

let lista = [nombre, edad, eresDesarrollador, fechaNacimiento, libroFavorito];
