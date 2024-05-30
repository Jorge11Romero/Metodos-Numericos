    public class FalsaPosicion {
    
    
    public static double funcion(double x) {
        return 4 * x * x - 5 * x;
    }

    public static double falsaPosicion(double a, double b, double tolerancia) {
        double c = a;
        while (Math.abs(b - a) >= tolerancia) {
            
            c = a - (funcion(a) * (b - a)) / (funcion(b) - funcion(a));
            
            if (funcion(c) == 0.0) {
                break;
            } else if (funcion(c) * funcion(a) < 0) {
                b = c;
            } else {
                a = c;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        double a = 1, b = 1.6, tolerancia = 0.0001;
        double raiz = falsaPosicion(a, b, tolerancia);
        
        System.out.printf("La raíz es: %.4f%n", raiz);
    }
}
