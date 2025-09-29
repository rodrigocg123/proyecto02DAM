package main.calculadora;

public class Operaciones {
    public int suma(int num1, int num2) {
        return num1 + num2;
    }
    public int resta(int num1, int num2) {
        return num1 - num2;
    }
    public int realizarMultiplicacion(int num1, int num2) {
        return num1 * num2;
    }
    public int realizarDivision(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division por cero no es permitida.");
            return 0; // O manejar el error de otra manera
        }
    }
    public int realizarModulo(int num1, int num2) {
        if (num2 != 0) {
            return num1 % num2;
        } else {
            System.out.println("Error: Modulo por cero no es permitida.");
            return 0; // O manejar el error de otra manera
        }
    }
    
}
