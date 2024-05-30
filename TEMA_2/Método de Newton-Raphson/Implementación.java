public class NewtonRaphson {
    
    public static double funcion(double x) {
        return x * x - 4;
    }
    
    public static double derivada(double x) {
        return 2 * x;
    }
    
    public static double newtonRaphson(double x0, double tolerancia) {
        double x = x0;
        double h = funcion(x) / derivada(x);
        
        while (Math.abs(h) >= tolerancia) {
            h = funcion(x) / derivada(x);
            x = x - h;
        }
        
        return x;
    }
    
    public static void main(String[] args) {
        double x0 = 2; 
        double tolerancia = 0.0001;
        double raiz = newtonRaphson(x0, tolerancia);
        
        System.out.printf("La raíz es: %.4f%n", raiz);
    }
}
