# En este ejercicio vais a crear la clase Vehículo la cual tendrá los siguientes atributos:
# Color
# Ruedas
# Puertas
# Por otro lado crearéis la clase Coche la cual heredará de Vehículo y tendrá los siguientes atributos:
# Velocidad
# Cilindrada
# Por último, tendrás que crear un objeto de la clase Coche y mostrarlo por consola.

class Vehiculo:

    color = ""
    ruedas = 4
    puertas = 5
    
class Coche(Vehiculo):
    
    velocidad = 50
    cilindrada = 80

c1 = Coche()
c1.color = "violeta"
print(f"El color del coche es: {c1.color}")
print(f"El coche tiene: {c1.ruedas} ruedas")
print(f"El coche tiene {c1.puertas} puertas")
print(f"El coche tiene una velocidad de {c1.velocidad} km/h")
print(f"El coche tiene un cilindraje de: {c1.cilindrada} cc")