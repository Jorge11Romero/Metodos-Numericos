def euler(x0, y0, h, n, f):
    xn = x0
    yn = y0

    for i in range(n):
        yn = yn + h * f(xn, yn)
        xn = xn + h

    return yn

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

    return yn

def main():
    # Valores iniciales
    x0 = 0
    y0 = 1
    h = 0.1
    n = 10

    f = lambda x, y: x + y

    resultado_euler = euler(x0, y0, h, n, f)
    print("Resultado utilizando el método de Euler:", resultado_euler)

    resultado_rk = runge_kutta(x0, y0, h, n, f)
    print("Resultado utilizando el método de Runge-Kutta:", resultado_rk)

if __name__ == "__main__":
    main()
