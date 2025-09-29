package main.variables;

public class Variables3 {
    public static void main(String[] args) {
        double miNumero = 305;
        miNumero++;
        System.out.println(miNumero);
        
        miNumero--;
        System.out.println(miNumero);

        short postIncremento = 125;

        System.out.println(postIncremento++);//aqui mandas el incremento a la variable

        System.out.println(postIncremento);//se muestra en consola en esta linea

        short preIncremento = 99;

        System.out.println(++preIncremento);//aqui se incrementa y se muestra en consola en la misma linea

        postIncremento += preIncremento;
        System.out.println("valor final " + postIncremento);
    
        postIncremento -= 55;
        postIncremento *= 2;
        postIncremento /= 3;
        System.out.println("valor final " + postIncremento);
    }
}
