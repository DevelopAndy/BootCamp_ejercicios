# En este segundo ejercicio, tendréis que crear una interfaz sencilla la cual debe 
# de contener una lista de elementos seleccionables, también debe de tener un label 
# con el texto que queráis.

import tkinter
from tkinter import ttk

window = tkinter.Tk()

window.columnconfigure(0, weight=1)
window.columnconfigure(1, weight=3)

selected = tkinter.StringVar()

r1 = ttk.Radiobutton(window, text='Sí', value='1', variable=selected)
r2 = ttk.Radiobutton(window, text='No', value='2', variable=selected)
r3 = ttk.Radiobutton(window, text='Quizás', value='3', variable=selected)

r1.grid(column=0, row=1, padx=5, pady=5)
r2.grid(column=0, row=2, padx=5, pady=5)
r3.grid(column=0, row=3, padx=5, pady=5)

label = ttk.Label(window, text="Opciones:")
label.grid(column=0, row=0, sticky=tkinter.W, padx=5, pady=5)


window.mainloop()