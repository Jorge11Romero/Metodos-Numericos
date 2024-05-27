def coeficiente_newton(x0, y0, x1, y1):
    return (y1 - y0) / (x1 - x0)

def interpolacion_newton(x0, y0, x1, y1, xi):
    a = coeficiente_newton(x0, y0, x1, y1)
    b = y0 - a * x0
    return a * xi + b

def main():
    # Puntos de datos (x, y)
    x0 = 0
    y0 = 1
    x1 = 2
    y1 = 3

    xi = 1

    yi = interpolacion_newton(x0, y0, x1, y1, xi)
    print(f"Valor interpolado en x = {xi} es y = {yi}")

if __name__ == "__main__":
    main()
