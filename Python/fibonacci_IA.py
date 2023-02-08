def fibonacci(n):
    a = 0
    b = 1
    result = [a, b]
    for i in range(2, n):
        c = a + b
        a = b
        b = c
        result.append(b)
    return result

num = int(input("Ingresa un número: "))
print("La sucesión de Fibonacci hasta", num, "es:", fibonacci(num))

