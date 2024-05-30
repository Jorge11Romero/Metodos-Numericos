public class Biseccion {
    
    public static double funcion(double x) {
        return x * x - 4;
    }

    public static double biseccion(double a, double b, double tolerancia) {
        double c = a;
        while ((b - a) >= tolerancia) {
            c = (a + b) / 2;
            
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
        double a = 0, b = 3, tolerancia = 0.0001;
        double raiz = biseccion(a, b, tolerancia);
        System.out.println("La raíz es: " + raiz);
    }
}
