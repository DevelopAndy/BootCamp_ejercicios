# En este segundo ejercicio, tendréis que crear un programa que tenga una clase llamada 
# Alumno que tenga como atributos su nombre y su nota. Deberéis de definir los métodos 
# para inicializar sus atributos, imprimirlos y mostrar un mensaje con el resultado de 
# la nota y si ha aprobado o no.

class Alumno():
    nombre = None
    nota = None
    
    def __init__(self, nombre, nota):
        self.nombre = nombre
        self.nota = nota
        print(f"nombre: {nombre} \nnota: {nota}")
    
    def aprueba(self):
        if self.nota > 3:
            print(f"La nota del estudiante es: {self.nota} y aprobó la materia")
        else:
            print(f"La nota del estudiante es: {self.nota} y NO aprobó la materia")

a1 = Alumno("Rodrigo", 3.5)
a1.aprueba()
