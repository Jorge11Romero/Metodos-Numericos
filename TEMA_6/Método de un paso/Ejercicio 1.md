### Ejercicio 1:
![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/b835607f-a735-4b83-a0ec-f006cc1d4214)

### Resuelto analíticamente:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/2c24c0d1-80c9-4203-a5bd-b91d583d2751)

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
        y0 = 100  # Valor inicial de y (población inicial)
        h = 0.2   # Tamaño del paso
        n = 10    # Número de pasos (para llegar a t = 2 unidades de tiempo)
    
        # Tasa de crecimiento
        r = 0.05
    
        # Función diferencial dy/dx = r * y
        f = lambda x, y: r * y
    
        # Método de Euler
        resultado_euler = euler(x0, y0, h, n, f)
        print("Resultado utilizando el método de Euler:", resultado_euler)
    
        # Método de Runge-Kutta
        resultado_rk = runge_kutta(x0, y0, h, n, f)
        print("Resultado utilizando el método de Runge-Kutta:", resultado_rk)
    
    if __name__ == "__main__":
        main()


![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/f6c67fb6-f1e0-47a0-a5fa-a1fb910ac6e9)
