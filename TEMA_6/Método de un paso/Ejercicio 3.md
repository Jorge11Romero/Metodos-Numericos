### Ejercicio 2:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/5a1b88c7-c99f-49fc-9475-d38fa719077e)

### Resuelto analíticamente:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/a6beed0a-a573-4007-9759-0d2aa1c3f5d3)

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
        x0 = 0    # Valor inicial de x (tiempo)
        y0 = 1    # Valor inicial de y (población)
        h = 0.1   # Tamaño del paso
        n = 10    # Número de pasos (para llegar a t = 1)
    
        # Parámetros de la ecuación logística
        r = 0.5   # Tasa de crecimiento intrínseca
        K = 10    # Capacidad de carga
    
        # Función diferencial dy/dx = f(x, y) para la ecuación logística
        f = lambda x, y: r * y * (1 - y / K)
    
        # Método de Euler
        resultado_euler = euler(x0, y0, h, n, f)
        print("Resultado utilizando el método de Euler:", resultado_euler)
    
        # Método de Runge-Kutta
        resultado_rk = runge_kutta(x0, y0, h, n, f)
        print("Resultado utilizando el método de Runge-Kutta:", resultado_rk)
    
    if __name__ == "__main__":
        main()


  ![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/15f351e4-c0b2-4476-8315-4853b4d06515)
