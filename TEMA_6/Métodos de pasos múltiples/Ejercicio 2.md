### Ejercicio 2:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/be123136-2515-427d-9e76-6304138b1398)


### Resuelto analíticamente:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/4124f1e6-c9e4-4c96-8b36-ed5f17093977)


### Resuelto por código:

        def euler(x0, y0, h, n, f):
            xn = x0
            yn = y0
        
            for _ in range(n):
                yn = yn + h * f(xn)
                xn = xn + h
        
            return round(yn, 4)  # Redondear a cuatro dígitos decimales
        
        def runge_kutta(x0, y0, h, n, f):
            xn = x0
            yn = y0
        
            for _ in range(n):
                k1 = h * f(xn)
                k2 = h * f(xn + h / 2)
                k3 = h * f(xn + h / 2)
                k4 = h * f(xn + h)
        
                yn = yn + (k1 + 2 * k2 + 2 * k3 + k4) / 6
                xn = xn + h
        
            return round(yn, 4)  # Redondear a cuatro dígitos decimales
        
        def main():
            # Nuevos valores iniciales y parámetros
            x0 = 0  # Valor inicial de x
            y0 = 3  # Nuevo valor inicial de y
            h = 0.1  # Nuevo tamaño del paso
            n = 10  # Nuevo número de pasos
        
            # Nueva función diferencial dy/dx = f(x)
            f = lambda x: -2 * x  # Nueva función, y' = -2y
        
            # Método de Euler
            resultado_euler = euler(x0, y0, h, n, f)
            print("Resultado utilizando el método de Euler:", resultado_euler)
        
            # Método de Runge-Kutta
            resultado_rk = runge_kutta(x0, y0, h, n, f)
            print("Resultado utilizando el método de Runge-Kutta:", resultado_rk)
        
        if __name__ == "__main__":
            main()

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/23a241ae-d8f0-43d6-8c22-5b9a1aa259e8)
