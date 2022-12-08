// Crea un archivo llamado fechas.js que contenga las siguientes líneas
// - La fecha de hoy
// - La fecha de tu nacimiento
// - Un variable que indique si hoy es más tarde (>) que la fecha de tu nacimiento
// - Una variable que contenga el día de tu nacimiento
// - Una variable que contenga el mes de tu nacimiento (recuerda que Enero es mes 0)
// - Una variable que contenga el año de tu nacimiento (con 4 dígitos)

let fecha = new Date();
let nacimiento = new Date(1986, 10, 13);
let compararFecha = fecha.getTime() > nacimiento.getTime();
let diaNacimiento = nacimiento.getDay();
let mesNacimiento = nacimiento.getMonth() + 1;
let anyoNacimiento = nacimiento.getFullYear();
