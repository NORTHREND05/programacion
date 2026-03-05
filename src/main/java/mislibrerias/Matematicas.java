package mislibrerias;

public class Matematicas {
    public static long getFactorial(int num) {
        long factorial = 1;
        if (num == 0) {
            factorial = 1;
        }
        for (int i = num; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }
    public static long getFactorialRec(int num) {
        long factorial;
        if (num == 0) {
            factorial = 1;
        } else {
            factorial = num * getFactorialRec(num - 1);
        }
        return factorial;
    }
    public static boolean esDivisor(int dividendo, int divisor) {
        return dividendo % divisor == 0;
    }
    public static double getAreaOrVolumenCilindro(int eleccion, int altura, int radio) {
        if (eleccion == 1) {
            return getAreaCilindro(altura, radio);
        } else if (eleccion == 2) {
            return getVolumenCilindro(altura, radio);
        } else {
            System.out.println("Error en el parametro eleccion.");
            return 0;
        }
    }
    public static double getVolumenCilindro(int altura, int radio) {
        double volumen = Math.PI * radio * radio * altura;
        return volumen;
    }
    public static double getAreaCilindro(int altura, int radio) {
        double area = 2 * Math.PI * radio * (altura + radio);
        return area;
    }
    public static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i < num; i++) {
            if (esDivisor(num, i)) {
                return false;
            }
        }
        return true;
    }
    public static boolean esPrimoRec(int n) {
        if (n <= 1) return false;          // 0 y 1 no son primos
        return esPrimoRec(n, 2);           // empezamos a probar desde 2
    }
    public static boolean esPrimoRec(int n, int i) {
        if (i >= n) return true;           // si llegamos a n sin divisores → primo
        if (n % i == 0) return false;      // si encontramos un divisor → no primo
        return esPrimoRec(n, i + 1);       // seguimos con el siguiente número
    }

    public static String getDivisores(int n) {
        String aux = "";
        for (int i = 1; i <= n; i++) {
            if (esDivisor(n, i)) {
                aux += i + " ";
            }
        }
        return aux;
    }
    public static String listaFactoriales(int n) {
        String factoriales = "";
        for (int i = 0; i <= n; i++) {
            factoriales += + getFactorial(i) + " ";
        }
        return factoriales;
    }
    public static int sumaDivisores(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            if (esDivisor(n, i)) {
                suma += i;
            }
        }
        return suma;
    }
    public static int potencia(int base, int exponente) {
        if(exponente == 1) {
            return base;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }
    public static void listaDescendiente(int n) {
        if (n == 1) {
            System.out.println(n + ".");
        } else {
            System.out.print(n + ", ");
            listaDescendiente(n - 1);
        }
    }
    public static long sumaFactoriales(int n) {
        long producto;
        if(n == 0) {
            producto = 1;
        } else {
            producto = getFactorialRec(n);
            producto += sumaFactoriales(n - 1);
        }
        return producto;
    }
    public static String divisoresPrimos(int n) {
        String aux="";
        for (int i = 1; i <= n; i++) {
            if(esDivisor(n, i) && esPrimo(i)) {
                aux += i + " ";
            }
        }
        return aux;
    }
    public static String tablaMultiplicar(int n, int contador,int producto) {
        if (contador == 10) {
            return n+"x"+contador+"="+producto;
        } else {
            return n+"x"+contador+"="+producto+"\n"+tablaMultiplicar(n, contador+1, producto+n);
        }
    }
    public static String listaNumerosRec(int n) {
        if(n==1) {
            return "1";
        } else {
            return listaNumerosRec(n-1)+ "," + n;
        }
    }
    public static int sumaDigitosRec(int n) {
        if(n<10) {
            return n;
        } else {
            return sumaDigitosRec(n/10) + n%10;
        }
    }
    public static int multiplicarConSuma(int n1, int n2) {
        int producto=0;
        for (int i = 0; i < n2; i++) {
            producto += n1;
        }
        return producto;
    }
    public static int multiplicarConSumaRec(int n1, int n2) {
        if(n2==0)return 0;
        return n1 + multiplicarConSumaRec(n1, n2 - 1);
    }
    public static int potenciaConSuma(int b, int e) {
        int resultado=b, acumulacion;
        for (int i = 1; i < e; i++) {
            acumulacion=0;
            for (int j = 0; j < b; j++) {
                acumulacion += resultado;
            }
            resultado = acumulacion;
        }
        return resultado;
    }
    public static int potenciaConSumaRec(int b, int e) {
        if(e==0) return 1;
        if(e==1) return b;
        return multiplicarConSumaRec(b, potenciaConSumaRec(b, e-1));
    }
    public static String esPrimoYParOImpar(int n) {
        String aux= n + (esPrimoRec(n) ? " es primo" : " no es primo")
                + " y es " + (n%2==0 ? "par." : "impar.");
        return aux;
    }
}
