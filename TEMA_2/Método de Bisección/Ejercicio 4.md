### Ejercicio 4:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/51348f76-0792-45a5-bb02-d7cd329353ee)

### Resuelto analíticamente:

![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/3b37e703-9e9d-496d-b099-7607e314a923)

### Resuelto por código:

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
        x = [150, 170, 180, 190]  # Altura en cm
        y = [50, 65, 75, 85]      # Peso en kg
    
        # Valor para interpolar
        xi = 175  # Altura de la persona en cm
    
        # Calcular el valor interpolado
        yi = lagrange(x, y, xi)
        print(f"Para una altura de {xi} cm, el peso interpolado es de {yi:.2f} kg")
    
    if __name__ == "__main__":
        main()

   
![image](https://github.com/Jorge11Romero/Metodos-Numericos/assets/147437900/676a70b5-2f81-4f4e-b0de-474e8ef5e31b)
