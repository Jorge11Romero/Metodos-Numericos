    public class Secante {
    
    public static double funcion(double x) {
        return Math.pow(x, 3) - 2;
    }

    public static double secante(double x0, double x1, double tolerancia) {
        double x2;
        do {
            x2 = x1 - (funcion(x1) * (x1 - x0)) / (funcion(x1) - funcion(x0));
            
            x0 = x1;
            x1 = x2;
        } while (Math.abs(funcion(x2)) >= tolerancia);

        return x2;
    }

    public static void main(String[] args) {
        double x0 = 1.0, x1 = 2.0; 
        double tolerancia = 0.0001;
        double raiz = secante(x0, x1, tolerancia);

        System.out.printf("La raíz es: %.4f%n", raiz);
    }
}
