### Ejercicio 1:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/f8d4679f-cf61-4a5e-b874-9cd4b95e61cf)

### Resuelto analíticamente:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/d780d32d-ecc3-403a-bce5-9686173c4f4f)

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
        # Puntos de datos (x, y)
        x = [0, 2, 4, 6]  # Días
        y = [5, 9, 15, 20]  # Altura de la planta en cm
    
        # Punto donde queremos evaluar el polinomio
        xi = 3  # Día 3
    
        # Calcular el valor interpolado en xi
        yi = lagrange(x, y, xi)
        print("Valor interpolado en el día", xi, "es altura =", yi, "cm")
    
    if __name__ == "__main__":
        main()


![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/c506e444-7c75-4f57-80d5-7679d7469c7b)
