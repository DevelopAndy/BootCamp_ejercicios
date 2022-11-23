# En este ejercicio tenéis que crear una lista de RadioButton que muestre la opción 
# que se ha seleccionado y que contenga un botón de reinicio para que deje todo como 
# al principio.Al principio no tiene que haber una opción seleccionada.

from tkinter import *

def selec():
    monitor.config(text = "Opción {}".format(opcion.get() ) )
    
def reset():
    opcion.set(None)
    monitor.config(text="")

window = Tk()
window.config(bd=15)

opcion = IntVar() # Como StrinVar pero en entero

Radiobutton(window, text="Opción 1", variable=opcion, 
            value=1, command=selec).pack()
Radiobutton(window, text="Opción 2", variable=opcion,
            value=2, command=selec).pack()
Radiobutton(window, text="Opción 3", variable=opcion, 
            value=3, command=selec).pack()

monitor = Label(window)
monitor.pack()

Button(window, text="Reiniciar", command=reset).pack()

window.mainloop()

