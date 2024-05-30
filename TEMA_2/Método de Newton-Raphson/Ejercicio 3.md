### Ejercicio 3:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/836a34b5-ca7c-4a75-b9c7-f8d4c74d4cc7)

### Resuelto analíticamente:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/b4f4ccd7-f3fb-400a-ab24-ecc56e1f43db)

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
        x = [0, 6, 12, 18]   # Horas del día
        y = [20, 25, 30, 22]  # Temperatura en grados Celsius
    
        # Hora en la que queremos interpolar la temperatura
        xi = 9  # Hora 9:00 AM
    
        # Calcular la temperatura interpolada en xi
        yi = lagrange(x, y, xi)
        print(f"La temperatura interpolada a las {xi:.1f} horas es de {yi:.2f} grados Celsius")
    
    if __name__ == "__main__":
        main()

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/210975d7-df05-48e5-bffc-8bc45a36b2d7)
