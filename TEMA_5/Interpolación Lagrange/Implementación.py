def lagrange(x, y, xi):
    resultado = 0.0
    n = len(x)

    for i in range(n):
        termino = y[i]
        for j in range(n):
            if j != i:
                termino *= (xi - x[j]) / (x[i] - x[j])
        resultado += termino

    return resultado

def main():
    # Puntos de datos (x, y)
    x = [0, 1, 2, 3]
    y = [1, 3, 2, 5]

    xi = 2.5

    yi = lagrange(x, y, xi)
    print("Valor interpolado en x =", xi, "es y =", yi)

if __name__ == "__main__":
    main()
