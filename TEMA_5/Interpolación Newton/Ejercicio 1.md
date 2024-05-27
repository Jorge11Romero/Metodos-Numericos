### Ejercicio 1:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/a5677c93-fd92-487e-9555-6d98ecffdd42)

### Resuelto analíticamente:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/76bd5339-6038-44fa-aa5e-48138f4ceeb8)

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
        y0 = 5
        x1 = 8
        y1 = 15
    
        # Punto donde queremos evaluar la interpolación
        xi = 4
    
        # Calcular la interpolación lineal de Newton en xi
        yi = interpolacion_newton(x0, y0, x1, y1, xi)
        print(f"La temperatura estimada después de {xi} minutos es {yi}°C")
    
    if __name__ == "__main__":
        main()

  ![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/1986a198-a1dd-43e1-ae3f-37e32cd0da22)

