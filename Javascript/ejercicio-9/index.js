// Crea un nuevo proyecto de Node
// - Instala la dependencia Winston
// - En el archivo index.js crea una función que devuelva un error con un mensaje personalizado
// - Registra el error en un archivo a través de un try...catch

const winston = require('winston');

const logger = winston.createLogger({
	level: 'error',
	format: winston.format.json(),
	transports: [
		new winston.transports.File({filename: 'error.log', level: 'error'}),
	],
});

function showError() {
	throw new Error('estoy devolviendo un error');
}

try {
	showError();
} catch (e) {
	logger.log('error', e.toString());
}
