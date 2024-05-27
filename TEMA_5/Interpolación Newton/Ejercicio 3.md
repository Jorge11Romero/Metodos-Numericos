### Ejercicio 3:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/333623a9-ba25-4ae0-9f08-988a326ae4a3)

### Resuelto analíticamente:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/3196b889-aa3d-4cd8-9a9a-109ea7fad45c)

### Resuelto por código:

    def coeficiente_newton(x0, y0, x1, y1):
        return (y1 - y0) / (x1 - x0)
    
    def interpolacion_newton(x0, y0, x1, y1, xi):
        a = coeficiente_newton(x0, y0, x1, y1)
        b = y0 - a * x0
        return a * xi + b
    
    def main():
        # Puntos de datos (x, y)
        x0 = -3.0
        y0 = 8
        x1 = 4
        y1 = 18
        xi = 0
    
        # Calcular la interpolación lineal de Newton en xi
        yi = interpolacion_newton(x0, y0, x1, y1, xi)
        print(f"Valor interpolado en x = {xi} es y = {yi}")
    
    if __name__ == "__main__":
        main()


![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/1b8ef55c-6bdc-4813-ba9d-b8298cb97172)
