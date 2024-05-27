### Ejercicio 2:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/26f42c68-b6e3-415f-8bab-afdc54a5f366)

### Resuelto analíticamente:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/3682bcdb-acb1-4712-8c7f-b4c552814324)


### Resuelto por código:

    def lagrange(x, y, xi):
        resultado = 0.0
        n = len(x)
    
        for i in range(n):
            termino = y[i]
            for j in range(n):
                if j != i:
                    termino *= (xi - x[j]) / (x[i] - x[j])
            resultado += termino
    
        return resultado
    
    def main():
        # Puntos de datos (x, y) generados a partir de la función f(x) = x^2 + 3x + 2
        x = [-2, 0, 2, 4]   # Valores de x
        y = [0, 2, 10, 26]  # Valores de f(x)
    
        # Punto donde queremos estimar el valor de la función
        xi = 1  # Valor de x donde queremos estimar f(x)
    
        # Calcular el valor estimado de la función en xi
        yi = lagrange(x, y, xi)
        print(f"El valor estimado de la función en x = {xi:.1f} es f(x) = {yi:.2f}")
    
    if __name__ == "__main__":
        main()

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/156e908b-309b-4ae1-a401-f5ebda7af987)

