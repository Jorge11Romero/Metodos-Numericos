### Ejercicio 4:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/23ff93b6-d3c5-49fa-b05b-675e1227b9b7)

### Resuelto analíticamente:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/9eb892d0-f54f-4ee5-9cc2-e6a225c612e9)

### Resuelto por código:

    def euler(x0, y0, h, n, f):
        xn = x0
        yn = y0
    
        for i in range(n):
            yn = yn + h * f(xn, yn)
            xn = xn + h
    
        return round(yn, 4)  # Redondear a cuatro dígitos decimales
    
    def runge_kutta(x0, y0, h, n, f):
        xn = x0
        yn = y0
    
        for i in range(n):
            k1 = h * f(xn, yn)
            k2 = h * f(xn + h / 2, yn + k1 / 2)
            k3 = h * f(xn + h / 2, yn + k2 / 2)
            k4 = h * f(xn + h, yn + k3)
    
            yn = yn + (k1 + 2 * k2 + 2 * k3 + k4) / 6
            xn = xn + h
    
        return round(yn, 4)  # Redondear a cuatro dígitos decimales
    
    def main():
        # Valores iniciales
        x0 = 0     # Valor inicial de x (tiempo en horas)
        y0 = 100   # Valor inicial de y (temperatura inicial en grados Celsius)
        h = 0.1    # Tamaño del paso
        n = 10     # Número de pasos (para llegar a t = 1 hora)
    
        # Parámetros de la Ley de Enfriamiento de Newton
        k = 0.07      # Constante de proporcionalidad
        T_amb = 20    # Temperatura del ambiente en grados Celsius
    
        # Función diferencial dy/dx = -k * (y - T_amb)
        f = lambda x, y: -k * (y - T_amb)
    
        # Método de Euler
        resultado_euler = euler(x0, y0, h, n, f)
        print("Resultado utilizando el método de Euler:", resultado_euler)
    
        # Método de Runge-Kutta
        resultado_rk = runge_kutta(x0, y0, h, n, f)
        print("Resultado utilizando el método de Runge-Kutta:", resultado_rk)
    
    if __name__ == "__main__":
        main()

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/1c9f5093-9c6a-4d18-807c-a245a38e1833)


   
