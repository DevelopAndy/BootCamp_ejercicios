// Crea un nuevo proyecto de Node
// - Instala la dependencia ESLint (https://www.npmjs.com/package/eslint)
// - Duplica el archivo del ejercicio de la sesión 04-Textos
// - Utiliza los tres estilos de comillas de forma alterna (comillas simples, dobles, backticks)
// - Crea el fichero .eslintrc.json
// - Cambia la configuración de ESLint para que la versión ecmaVersion sea "latest"
// - Cambia la configuración de ESLint para que muestre un error cada vez que las comillas no sean dobles
// - Crea un script en el package.json para corregir automáticamente todos los errores
// - Ejecuta el script a través del terminal 

let nombre = "Andy";
let apellido = "Abs";
let estudiante = `${nombre} ${apellido}`;
let estudianteMayus = estudiante.toUpperCase();
let estudianteMinus = estudiante.toLowerCase();
let numeroLetrasEstudiante = estudiante.length;
let primeraLetraNombre = nombre[0];
let ultimaLetraApellido = apellido[2];
let sinEspacios = estudiante.replace(" ", "");
let existeNombre = estudiante.includes(nombre);
