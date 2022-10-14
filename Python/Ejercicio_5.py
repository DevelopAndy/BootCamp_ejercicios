#Escribe una función que pueda decirte si un año (número entero) es bisiesto o no

anio = int(input("Digite el año: "))

if((anio % 4 == 0 and anio % 100 == 0 and anio % 400 == 0) or (anio % 4 == 0 and anio % 100 != 0 and anio % 400 != 0)):
    print("Es bisiesto")
else: print("No es bisiesto")