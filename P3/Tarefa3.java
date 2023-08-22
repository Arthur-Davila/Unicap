package P3;

import java.util.Scanner;

public class Tarefa3{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       try{
        int n = sc.nextInt();
       }
       catch(java.util.InputMismatchException e || java.util.InvalidPropertiesFormatException ){

       }
    }
    public static void questao1(){
        System.out.println("Questão 1:\n");
        double[] alunos = new double[5];
        int i,passou =0;
        for(i=0;i<alunos.length;i++){
            System.out.println("Coloque a nota no aluno "+(i+1));
            alunos[i] = sc.nextDouble();
            if(alunos[i]>=7){
                passou++;
            }
        }
        System.out.println("Essa Quantidade de alunos Passaram: "+passou );

        }
        public static void questao2(){
            System.out.println("Questão 2\n");
            int numeros;
            System.out.println("Coloque um numero:");
            numeros = sc.nextInt();
            String nume = Integer.toString(numeros);
            int tam = nume.length();
            int total = 0;
            char[] car  = new char[tam];
            for(int i = 0;i<tam;i++){
                car[i] = nume.charAt(i);
                total = (car[i]-'0')+total;
                
            }
            System.out.println("O total é "+total);
        }
        public static void questao3(){
            System.out.println("Coloque um numero inteiro");
            int num = sc.nextInt();
            for(int i=0;i<num;i++){
                if(num%(i+1)==0){
                System.out.println(i+1);
         
            }
        }
        }
}
