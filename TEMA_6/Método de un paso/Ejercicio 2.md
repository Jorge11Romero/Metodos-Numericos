### Ejercicio 2:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/1df420b4-359e-4765-875e-ca4453375f47)

### Resuelto analíticamente:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/597098d9-356a-4e57-9382-aeb3506ae733)

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
        x0 = 0     # Tiempo inicial
        y0 = 100   # Temperatura inicial del objeto
        h = 0.5    # Tamaño del paso
        n = 10     # Número de pasos (para llegar a t = 5 unidades de tiempo)
    
        # Parámetros de la ecuación diferencial
        Ta = 25    # Temperatura ambiente
        k = 0.07   # Constante de enfriamiento
    
        # Función diferencial dT/dt = -k(T - Ta)
        f = lambda t, T: -k * (T - Ta)
    
        # Método de Euler
        resultado_euler = euler(x0, y0, h, n, f)
        print("Resultado utilizando el método de Euler:", resultado_euler)
    
        # Método de Runge-Kutta
        resultado_rk = runge_kutta(x0, y0, h, n, f)
        print("Resultado utilizando el método de Runge-Kutta:", resultado_rk)
    
    if __name__ == "__main__":
        main()


![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/d205364f-821d-4f3e-b7b7-500c7b375707)
