# En este segundo ejercicio, tendréis que crear un archivo py y dentro crearéis una 
# clase Vehículo, haréis un objeto de ella, lo guardaréis en un archivo y luego lo 
# cargamos.

import pickle

class Vehiculo():
    color = "violeta"
    ruedas = 4
    puertas = 5

def __init__(self, color, ruedas, puertas):
    self.color = color
    self.ruedas = ruedas
    self.puertas = puertas

    
v1 = Vehiculo()
f = open('datos.bin', 'wb')
pickle.dump(v1, f)
f.close()

g = open('datos.bin', 'rb')
v2 = pickle.load(g)
g.close()
