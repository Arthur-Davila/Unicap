
package P3;


import java.util.Scanner;


public class Tarefa3{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        questao11();
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
            System.out.println("Questão 3\n");
            System.out.println("Coloque um numero inteiro");
            int num = sc.nextInt();
            for(int i=0;i<num;i++){
                if(num%(i+1)==0){
                System.out.println(i+1);
         
            }
        }
        }
        public static void questao4(){
        System.out.println("Questão 4\n");
            double media=0;
            int i;
            for(i=0;i<5;i++){
                System.out.println("Coloque a altura da pessoa "+(i+1));
                media = sc.nextDouble() + media;
            }
            media = media/5;
            System.out.println("A media das altura das pessoas é "+media);
           
           
    }
    public static void questao5(){
        System.out.println("Questão 5\n");
        int i;
        for(i=0;i<100;i++){
            if(i%5==0 && i%3==0){
                System.out.println("FizzBuzz");
            }
           
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
    }


    }
    public static void questao6(){
        System.out.println("Questão 6\n");
        int i;
        System.out.println("Coloque um numero:");
        int num = sc.nextInt();
        String nume = Integer.toString(num);
        int tam = nume.length();
        char[] car = new char[tam];
        int soma =0;
        for(i=0;i<tam;i++){
            car[i] = nume.charAt(i);
            if(car[i]-'0'%2 == 0){
                soma = car[i]-'0'+soma;
        }
        System.out.println(soma);
    }


    }
    public static void questao7(){
        System.out.println("Questão 7\n");
        int i;
        System.out.println("Coloque um numero:");
         int num = sc.nextInt();
        String nume = Integer.toString(num);
        int tam = nume.length();
        char[] car = new char[tam];
        for(i=0;i<tam;i++){
            car[i] = nume.charAt(tam -i);
         
    }
     String cara = new String(car);
     System.out.println(cara);
    }
    public static void questao8(){
        System.out.println("Questão 8\n");
        int i = 0,soma =0;
        while(i<100){
            soma = i+soma;
            i++;


        }
        System.out.println(soma);
    }
    public static void questao9(){
        System.out.println("Questão 9\n");
        int i = 0,produto =0;
        while(i<5){
            produto = i*produto;
            i++;
        }
    }
    public static void questao10(){
        System.out.println("Questão 10\n");
        int i = 0,noves =0;
        while(i<=90){
            noves = i*9;
            i++;
            System.out.println(noves);
    }
    }
    public static void questao11(){
        System.out.println("Questão 11\n");
            double numeral = 0;
            double maior, menor;
            double temp = 0;
            System.out.println("Coloque um numero:");
            numeral = sc.nextDouble();
            maior = numeral;
            menor = numeral;
            int sair;
            
             while(true){
                
                
               
                System.out.println("Coloque um numero:");
                temp = numeral;
                numeral = sc.nextDouble();
                System.out.println("Pressione 0 para sair e pressione qualquer numero para continuar:");
                sair= sc.nextInt();
                
               
                if(temp<numeral){
                    maior = numeral;
                }
                else{
                    maior = numeral;
                }
                if(temp<numeral){
                    menor = temp;
                }
                else{
                    menor = numeral;
                }
                if(sair == 0 ){
                    break;
                }

             }System.out.println(menor);
               System.out.println(maior);


}
    public static void questao12(){
       
    }
}

