### Ejercicio 2:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/c55d89f7-d0a8-4a07-8674-32ca2348e757)

### Resuelto analíticamente:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/5ff5e420-ede9-40b8-83a3-b065c3867599)

### Resuelto por código:

    def coeficiente_newton(x0, y0, x1, y1):
        return (y1 - y0) / (x1 - x0)
    
    def interpolacion_newton(x0, y0, x1, y1, xi):
        a = coeficiente_newton(x0, y0, x1, y1)
        b = y0 - a * x0
        return a * xi + b
    
    def main():
        # Puntos de datos (x, y)
        x0 = -2.0
        y0 = 7
        x1 = 8
        y1 = 25
        xi = 4
    
        # Calcular la interpolación lineal de Newton en xi
        yi = interpolacion_newton(x0, y0, x1, y1, xi)
        print(f"Valor interpolado en x = {xi} es y = {yi}")
    
    if __name__ == "__main__":
        main()


![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/61bd818c-0aa2-4541-b8ba-62a407295d5c)
