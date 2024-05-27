### Ejercicio 3:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/e4488854-4353-4aa6-8d34-6837f337b0b3)

### Resuelto analíticamente:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/c1d300e1-1ea4-4595-8b4c-fe81ba825414)

### Resuelto por código:

    from typing import Callable
    
    def euler(x0: float, y0: float, h: float, n: int, f: Callable[[float], float]) -> float:
        xn = x0
        yn = y0
    
        for _ in range(n):
            yn = yn + h * f(xn)
            xn = xn + h
    
        return yn
    
    def runge_kutta(x0: float, y0: float, h: float, n: int, f: Callable[[float], float]) -> float:
        xn = x0
        yn = y0
    
        for _ in range(n):
            k1 = h * f(xn)
            k2 = h * f(xn + h / 2)
            k3 = h * f(xn + h / 2)
            k4 = h * f(xn + h)
    
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
        f = lambda x: x + y0  # Ejemplo simple, y' = x + y
    
        # Método de Euler
        resultado_euler = euler(x0, y0, h, n, f)
        print("Resultado utilizando el método de Euler:", resultado_euler)
    
        # Método de Runge-Kutta
        resultado_rk = runge_kutta(x0, y0, h, n, f)
        print("Resultado utilizando el método de Runge-Kutta:", resultado_rk)
    
    if __name__ == "__main__":
        main()


![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/5ed8c0dd-dbf3-4b1b-87ad-8333bca52804)
