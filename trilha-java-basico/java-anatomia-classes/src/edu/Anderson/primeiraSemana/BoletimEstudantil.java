package edu.Anderson.primeiraSemana;
public class BoletimEstudantil{

    /**
     * @param args
     */
    public static void main(String[]args) {
        final int mediaFinal = 7;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else  
        System.out.println("APROVADO");
    }
}