package main.variables;

public class Bucles {
    public static void main(String[] args) {
        // Bucle for
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i en el bucle for: " + i);
        }
        // Bucle for con incremento de 2
        for (int i = 0; i < 5; i +=2) {
            System.out.println("Valor de i en el bucle for: " + i);
        }

        // Bucle while
        int j = 0;
        while (j < 5) {
            System.out.println("Valor de j en el bucle while: " + j);
            j++;
        }

        // Bucle do-while
        int k = 0;
        do {
            System.out.println("Valor de k en el bucle do-while: " + k);
            k++;
        } while (k < 5);
        
        int w=8;
        do {
            System.out.println("Valor de w en el bucle do-while: " + w);
            w++;
        } while (w < 5);

        //sentencia if
        if (w > 5){
            System.out.println("w es mayor que 5");
        } else {
            System.out.println("w no es mayor que 5");
        }
    }
}
