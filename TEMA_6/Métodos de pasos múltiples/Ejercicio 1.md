### Ejercicio 1:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/daecee42-08dc-4417-9d16-be79d211e2ed)

### Resuelto analíticamente:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/762e1b2d-927f-4cc0-82a4-69cc7ece86d5)

### Resuelto por código:

    def euler(x0, y0, h, n, f):
        xn = x0
        yn = y0
    
        for _ in range(n):
            yn = yn + h * f(yn)
            xn = xn + h
    
        return yn
    
    def runge_kutta(x0, y0, h, n, f):
        xn = x0
        yn = y0
    
        for _ in range(n):
            k1 = h * f(yn)
            k2 = h * f(yn + k1 / 2)
            k3 = h * f(yn + k2 / 2)
            k4 = h * f(yn + k3)
    
            yn = yn + (k1 + 2 * k2 + 2 * k3 + k4) / 6
            xn = xn + h
    
        return yn
    
    def main():
        # Nuevos valores iniciales y parámetros
        x0 = 0  # Valor inicial de x
        y0 = 2  # Nuevo valor inicial de y
        h = 0.1  # Nuevo tamaño del paso
        n = 10  # Nuevo número de pasos
    
        # Nueva función diferencial dy/dx = f(x, y)
        f = lambda y: -0.5 * y  # Nueva función, y' = -0.5y
    
        # Método de Euler
        resultado_euler = euler(x0, y0, h, n, f)
        print("Resultado utilizando el método de Euler:", resultado_euler)
    
        # Método de Runge-Kutta
        resultado_rk = runge_kutta(x0, y0, h, n, f)
        print("Resultado utilizando el método de Runge-Kutta:", resultado_rk)
    
    if __name__ == "__main__":
        main()


 ![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/ad06b462-222b-4f42-a184-ec7b4acdbcf0)



