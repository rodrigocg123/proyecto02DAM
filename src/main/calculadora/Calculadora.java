package main.calculadora;

import java.util.Scanner;

public class Calculadora {
    int num1;
    int num2;
    int resultado;
    private Scanner scanner = new Scanner(System.in);
    private Operaciones operaciones = new Operaciones();

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.leerEnteros();
        int resultado = calc.realizarSuma();
        System.out.println("El resultado de la suma es: " + resultado);
        System.out.println("El resultado de la resta es: " + calc.realizarResta());
        System.out.println("El resultado de la multiplicacion es: " + calc.realizarMultiplicacion());

        /*
        El resultado de dos variables es una varbiable nueva del tipo igual 
        al de la variable de mayor tamaño
        */
        
        System.out.println("El resultado de la division es: " + calc.realizarDivision());
        System.out.println("El resultado del modulo es: " + calc.realizarModulo());
    }

    public int leerEnteros() {
        System.out.println("Introduce el primer numero: ");
        num1 = scanner.nextInt();
        System.out.println("Introduce el segundo numero: ");
        num2 = scanner.nextInt();
        return num1;
    }

    public int realizarSuma() {
        resultado = num1 + num2;
        return resultado;
    }
    public int realizarResta() {
        resultado = num1 - num2;
        return resultado;
    }
    public int realizarMultiplicacion() {
        resultado = num1 * num2;
        return resultado;
    }
    public int realizarDivision() {
        if (num2 != 0) {
            resultado = num1 / num2;
        } else {
            System.out.println("Error: Division por cero no es permitida.");
            resultado = 0; // O manejar el error de otra manera
        }
        return resultado;
    }
    public int realizarModulo() {
        if (num2 != 0) {
            resultado = num1 % num2;
        } else {
            System.out.println("Error: Modulo por cero no es permitida.");
            resultado = 0; // O manejar el error de otra manera
        }
        return resultado;
    }
}
