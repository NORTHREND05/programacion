package mislibrerias;

public class Figuras {
    public static String figuraEjercicio10(int n) {
        String dibujo = "";
        for (int i = 1; i <= n - 3; i++) {
            for (int j = 0; j < n; j++) {
                if (i%2==0) {
                    dibujo = dibujo + "* ";
                } else {
                    dibujo = dibujo + " *";
                }
            }
            dibujo = dibujo + "\n";
        }
        return dibujo;
    }
    public static String figuraEjercicio17(int n) {
        int cont1 = n/2, cont2 = 1, alto= n/2 + 1;
        String aux = "";
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < cont1; j++) {
                aux += " ";
            }
            for (int j = 0; j < cont2; j++) {
                aux += "*";
            }
            aux+= "\n";
            cont1--;
            cont2 += 2;
        }
        return aux;
    }
    public static String figuraEj17Recursiva(int alto, int cont1, int cont2) {
        String aux="";
        if(alto == 0) {
            return aux;
        } else {
            for (int i = 0; i < cont1; i++) {
                aux+=" ";
            }
            for (int i = 0; i < cont2; i++) {
                aux+= "*";
            }
            aux+="\n";
            return aux + figuraEj17Recursiva(alto-1, cont1-1, cont2+2);
        }
    }
    public static String romboVacio(int n) {
        int cont1 = n/2, cont2=1;
        String aux = "";
        for (int i = 0; i < n; i++) {
            // Imprimir espacios
            for (int j = 0; j < cont1; j++) {
                aux+= " ";
            }
            // Imprimir asteriscos
            for (int j = 0; j < cont2; j++) {
                if(j==0 || j==cont2-1) {
                    aux+= "*";
                } else {
                    aux+= " ";
                }
            }
            aux+= "\n";
            // Actualizar contadores
            if (i < n / 2) {
                cont1--;
                cont2 += 2;
            } else {
                cont1++;
                cont2 -= 2;
            }
        }
        return aux;
    }
    public static String pinza(int n) {
        String aux="";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j==0 || j==n-1 || i==j || i+j==n-1) {
                    aux+="*";
                } else {
                    aux+=" ";
                }
            }
            aux+="\n";
        }
        return aux;
    }
    public static String tableroAjedrez(int n) {
        String aux = "";
        for (int i = 1; i <= 8; i++) {
            for (int k = 1; k <= n; k++){
                for (int j = 1; j <= 8; j++) {
                    for (int l = 1; l <= n; l++) {
                        if((i+j)%2==0) {
                            aux+=" ";
                        } else {
                            aux+="*";
                        }
                    }
                }
                aux+="\n";
            }
        }
        return aux;
    }
}
