            import java.util.Arrays;
    
    public class MetodoGauss {
    
        public static void main(String[] args) {
            double[][] A = {
                {4, 2, 5},
                {2, 5, 8},
                {5, 4, 3}
            };
    
            double[][] B = {
                {60.70},
                {92.90},
                {56.30}
            };
    
            double casicero = 1e-15; // Considerar como 0
    
            double[][] AB = new double[A.length][A[0].length + 1];
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    AB[i][j] = A[i][j];
                }
                AB[i][A[i].length] = B[i][0];
            }
    
            double[][] AB0 = new double[AB.length][AB[0].length];
            for (int i = 0; i < AB.length; i++) {
                AB0[i] = Arrays.copyOf(AB[i], AB[i].length);
            }
    
            int n = AB.length;
            int m = AB[0].length;
    
            for (int i = 0; i < n - 1; i++) {
                // columna desde diagonal i en adelante
                double[] columna = new double[n - i];
                for (int k = i; k < n; k++) {
                    columna[k - i] = Math.abs(AB[k][i]);
                }
                int dondemax = i + encontrarMaximoIndice(columna);
    
                if (dondemax != 0) {
                    // intercambia filas
                    double[] temporal = Arrays.copyOf(AB[i], AB[i].length);
                    AB[i] = Arrays.copyOf(AB[dondemax], AB[dondemax].length);
                    AB[dondemax] = Arrays.copyOf(temporal, temporal.length);
                }
            }
    
            double[][] AB1 = new double[AB.length][AB[0].length];
            for (int i = 0; i < AB.length; i++) {
                AB1[i] = Arrays.copyOf(AB[i], AB[i].length);
            }
    
            for (int i = 0; i < n - 1; i++) {
                double pivote = AB[i][i];
                for (int k = i + 1; k < n; k++) {
                    double factor = AB[k][i] / pivote;
                    for (int j = i; j < m; j++) {
                        AB[k][j] -= AB[i][j] * factor;
                    }
                }
            }
    
            int ultfila = n - 1;
            int ultcolumna = m - 1;
            double[] X = new double[n];
    
            for (int i = ultfila; i >= 0; i--) {
                double suma = 0;
                for (int j = i + 1; j < ultcolumna; j++) {
                    suma += AB[i][j] * X[j];
                }
                double b = AB[i][ultcolumna];
                X[i] = (b - suma) / AB[i][i];
            }
    
            System.out.println("Matriz aumentada:");
            imprimirMatriz(AB0);
            System.out.println("Pivoteo parcial por filas:");
            imprimirMatriz(AB1);
            System.out.println("Eliminacion hacia adelante:");
            imprimirMatriz(AB);
            System.out.println("Solucion:");
            imprimirVector(X);
        }
    
        public static int encontrarMaximoIndice(double[] arreglo) {
            int indiceMaximo = 0;
            for (int i = 1; i < arreglo.length; i++) {
                if (arreglo[i] > arreglo[indiceMaximo]) {
                    indiceMaximo = i;
                }
            }
            return indiceMaximo;
        }
    
        public static void imprimirMatriz(double[][] matriz) {
            for (double[] fila : matriz) {
                for (double elemento : fila) {
                    System.out.printf("%.2f\t", elemento);
                }
                System.out.println();
            }
        }
    
        public static void imprimirVector(double[] vector) {
            for (double elemento : vector) {
                System.out.printf("%.2f\t", elemento);
            }
            System.out.println();
        }
    }


