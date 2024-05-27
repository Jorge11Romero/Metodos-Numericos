### Ejercicio 3:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/3c4c3480-78a5-4f9c-8728-f2d8398ffb8f)

### Resuelto analíticamente:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/097b3efc-4d34-4265-9960-fe9386c84cd6)

### Resuelto por código:

    def euler(x0, y0, h, n, f):
        xn = x0
        yn = y0
    
        for _ in range(n):
            yn = yn + h * f(xn, yn)
            xn = xn + h
    
        return yn
    
    def runge_kutta(x0, y0, h, n, f):
        xn = x0
        yn = y0
    
        for _ in range(n):
            k1 = h * f(xn, yn)
            k2 = h * f(xn + h / 2, yn + k1 / 2)
            k3 = h * f(xn + h / 2, yn + k2 / 2)
            k4 = h * f(xn + h, yn + k3)
    
            yn = yn + (k1 + 2 * k2 + 2 * k3 + k4) / 6
            xn = xn + h
    
        return yn
    
    def main():
        # Valores iniciales
        x0 = 0  # Valor inicial de x
        y0 = 1  # Valor inicial de y
        h = 0.1  # Tamaño del paso
        n = 10  # Número de pasos
    
        # Función diferencial dy/dx = f(x, y)
        f = lambda x, y: 2 * x - y  # Nueva función, y' = 2x - y
    
        # Método de Euler
        resultado_euler = euler(x0, y0, h, n, f)
        print("Resultado utilizando el método de Euler:", resultado_euler)
    
        # Método de Runge-Kutta
        resultado_rk = runge_kutta(x0, y0, h, n, f)
        print("Resultado utilizando el método de Runge-Kutta:", resultado_rk)
    
    if __name__ == "__main__":
        main()


![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/c90200dc-5608-4ec6-92c2-34d1ab4dbc3b)
