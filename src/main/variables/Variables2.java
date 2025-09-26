package main.variables;

public class Variables2 {
    public static void main(String[] args) {
        
        char letraDNI = 'X';
        int numeroDNI = 12345678;
        if ((letraDNI >= 'A' && letraDNI <= 'Z') &&(numeroDNI >= 10000000 && numeroDNI <= 99999999)){
            System.out.println("Tu DNI a sido guardado correctamente");
            System.out.println("Tu DNI es: " + numeroDNI + letraDNI);
        } else {
            System.out.println("Tu DNI no es correcto");
        }
        


    }
}
