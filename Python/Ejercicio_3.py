# Escribe un programa python que pida al usuario su peso (en kg) y estatura (en metros), 
# calcule el índice de masa corporal y lo almacene en una variable, e imprima por pantalla 
# la frase "Tu índice de masa corporal es" donde es el índice de masa corporal calculado 
# redondeado con dos decimales.

peso = float(input("Digite su peso en kg: "))
estatura = float(input("Digite su estatura en metros: "))

IMC = peso / estatura

imcRound = round(IMC, 2)

print("Tu índice de masa corporal es: " + str(imcRound))