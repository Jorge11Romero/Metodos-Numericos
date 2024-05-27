### Ejercicio 4:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/243643af-a929-4f3a-a37f-64d1127f7416)

### Resuelto analíticamente:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/03ae5c0f-6015-499c-ba22-5a0572be0372)

### Resuelto por código:

    def coeficiente_newton(x0, y0, x1, y1):
        return (y1 - y0) / (x1 - x0)
    
    def interpolacion_newton(x0, y0, x1, y1, xi):
        a = coeficiente_newton(x0, y0, x1, y1)
        b = y0 - a * x0
        return a * xi + b
    
    def main():
        # Puntos de datos (x, y)
        x0 = 2.0
        y0 = 4
        x1 = 6
        y1 = 12
    
        # Punto donde queremos evaluar la interpolación
        xi = 4
    
        # Calcular la interpolación lineal de Newton en xi
        yi = interpolacion_newton(x0, y0, x1, y1, xi)
        print(f"Valor interpolado en x = {xi} es y = {yi}")
    
    if __name__ == "__main__":
        main()

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/ef5c4ecc-14cd-4640-a76f-0476b96cc86f)


