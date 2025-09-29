package main.variables;

public class Variables1 {
    public static void main(String[] args) {
        byte mybyte = -123;
        short myshort = 190;
        int myint = 18;

        long isbn = 978849838708L;
        float decimal = 1.1f;
        double decimalLargo = 1.111;

        char caracter = 'a';
        char otroCaracter = '*';

        String saludo = "Hola que tal";
        String despedida = "Adios";

        boolean decision1 = true;
        boolean decision2 = false;

        String cadena = "Esto es una cadena de caracteres";
        System.out.println(cadena);
        System.out.println("La cadena tiene una longitud de: " + cadena.length());

        // injerencia de datos
        var otraVariable = 15;
        var otroDecimal = 1.5;
        var otroChar = 'b';
        var otraCadena = "Otra cadena";
        System.out.println(otraCadena + "tiene un numero de letras de:" + otraCadena.length());
        System.out.println("El valor de otraVariable es: " + otraVariable);
        System.out.println("El valor de otroDecimal es: " + otroDecimal);
        System.out.println("El valor de otroChar es: " + otroChar);

    }
}
