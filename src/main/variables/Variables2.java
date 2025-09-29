package main.variables;

public class Variables2 {
    public static void main(String[] args) {

        char letraDNI = 'X';
        int numeroDNI = 12345678;

        if ((letraDNI >= 'A' && letraDNI <= 'Z') && (numeroDNI >= 10000000 && numeroDNI <= 99999999)) {
           
            System.out.println("Tu DNI a sido guardado correctamente");
            System.out.println("Tu DNI es: " + numeroDNI + letraDNI);

        } else {

            System.out.println("Tu DNI no es correcto, revisalo");

        }

        // constantes con identificador en mayusculas
        final float IVA = 0.21f;
        final double PI = 3.1416;
        double salario = 950.70f; // al ponerle la f al final lo toma como float

        int salarioNeto = (int) salario - (int) (salario * IVA);
        byte varbyte = (byte) salarioNeto;

        System.out.println("tu salario bruto es salario: " + salario + "el cual es un float");
        System.out.println("Tu salario neto es: " + salarioNeto + "el cual es el float casteado a int.");
        System.out.println("El valor de varbyte es: " + varbyte + " el cual es el int casteado a byte.");
    }
}
