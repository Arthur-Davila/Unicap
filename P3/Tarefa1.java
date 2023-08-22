package P3;
import java.util.Scanner;


import javax.sound.sampled.SourceDataLine;




public class Tarefa1{
    private static String idade;
    private static String nome ;
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        //QUESTÃO 1;
        System.out.println("Qual o seu nome?");
        nome = sc.nextLine();
        System.out.println("Seja bem-vindo "+nome);




        //QUESTÃO 2;
        System.out.println("Qual sua idade?");
        idade = sc.nextLine();
        int idad =  Integer.parseInt(idade);
       
        //QUESTÃO 3;
         System.out.println("Escreva um numero:");
        float numero1 = sc.nextInt();


        //Questão 4;
        System.out.println("Escreva um numero:");
        int num1 = sc.nextInt();
        System.out.println("Escreva outro numero:");
        int num2 = sc.nextInt();
        int num3 = num1+num2;
        System.out.println("A soma é "+num3);
       
        //Questão 5:
        System.out.println("Escreva um numero decimal:");
        double dec = sc.nextDouble();
        double dec2 = Math.pow(dec,2);
        System.out.println("Seu numero ao quadrado é "+dec2);
        //Questão 6:
        System.out.println("Que ano você nasceu: ");
        int ano = sc.nextInt();
        ano = 2023 - ano;
        if(ano>0){
            System.out.println(ano);
        }
        //Questão 7:
        System.out.println("Qual é seu primeiro nome: ");
        String nome = sc.next();
        System.out.println("Agora seu sobrenome:");
        String sobrenome = sc.next();
        String nomeCompleto = nome.concat(" "+sobrenome);
        System.out.println(nomeCompleto);


        //Questão 8:
        System.out.println("Escreva a quantidade de numeros separados por espaço:");
        String numeros = sc. nextLine();
        int tam = numeros.length();
        char[] car = new char[tam];
        int digit = 0, white =0;
        for(int i = 0; i<tam;i++){
            car[i] = numeros.charAt(i);
           
            if(Character.isDigit(car[i])){
                digit++;
            }
            else if(Character.isWhitespace(car[i])){
                white++;
            }
        }
        if(white==digit-1){
            System.out.println("A quantidade de digitos é "+ digit);
        }


        //Questão 9
        System.out.println("Digite um animal:");
        String animal = sc.nextLine();
        System.out.println("Esse foi o animal:\n"+animal);


        //Questão 10
          System.out.println("Qual é seu primeiro nome: ");
        String nome1 = sc.next();
        System.out.println("Agora seu sobrenome:");
        String sobrenome1 = sc.next();
        String nomeContrario = sobrenome1.concat(" "+nome1);
        System.out.println(nomeContrario);


        //Questão 11
        System.out.println("Digite uma String");
        String str = sc.nextLine();
        int tam1 = str.length();


        //Questão 12:
        System.out.println("Escreva um numero inteiro");
        int sera = sc.nextInt();
        if(sera%2==0){
            System.out.println("Esse numero é par");
        }
        else{
            System.out.println("Esse numero é impar");
        }


        //Questão 13
         System.out.println("Escreva um numero inteiro");
        int sera1 = sc.nextInt();
        if(sera1<0){
            System.out.println("Esse numero é positivo");
        }
        else if(sera1==0){
            System.out.println("Esse numero é 0");
        }
        else{
            System.out.println("Esse numero é negativo");
        }




        //Questão 14
        System.out.println("Coloque o primeiro numero :");
        int pri = sc.nextInt();
        System.out.println("Coloque o segundo numero");
        int sec = sc.nextInt();
        if(pri>sec){
            System.out.println(pri+" esse é maior que "+sec);
        }
        else if(pri==sec){
            System.out.println("São do mesmo tamanho");


        }
        else{
            System.out.println(sec+" esse é maior que "+pri);
        }
        //Questão 15
        System.out.println("Coloque sua altura:");
        double altura = sc.nextDouble();
        System.out.println("Coloque seu peso:");
        double peso = sc.nextDouble();
        double IMC = peso/ (altura*altura);
        System.out.printf("Seu IMC é : %.2f",IMC);

        //Questão 16
        System.out.println("Coloque seu nome:");
        String nm = sc.nextLine();
        int tam2 = nm.length();
        char[] car1 = new char[tam2];
        int carac =0;
        for(int i =0;i<tam2;i++){
            car1[i] = nm.charAt(i);
            if(Character.isAlphabetic(car1[i])){
                carac ++;
            }
        }
        if(carac>5){
            System.out.println("Seu nome tem acima de 5 caracteres ");
        }
        else if(carac == 5 ){
            System.out.println( "Seu nome tem 5 caracteres ");
        }
        else{
            System.out.println("Seu nome tem menos que 5 caracteres");
        }

        //Questão 17
        System.out.println("Escreva uma das opções do seu estado civil (Escreva exatamente igual) ");
        System.out.println("Solteiro ou Solteira");
        System.out.println("Casado ou Casada");
        System.out.println("Separado ou Separada");
        System.out.println("Divorciado ou Divorciada");
        System.out.println("Viuvo ou Viuva");
        String estado = sc.nextLine();
        

        if("Solteiro".compareTo(estado)==0 || "Solteira".compareTo(estado)==0){
            System.out.println("Você é Solteiro(a)");
        }
        else if ("Casado".compareTo(estado)==0||"Casada".compareTo(estado)==0){
            System.out.println("Você é Casado(a)");

        }
        else if("Separado".compareTo(estado)==0 || "Separada".compareTo(estado)==0){
            System.out.println("Você é Separado(o)");
        }
        else if("Divorciado".compareTo(estado)==0 || "Divorciada".compareTo(estado)==0){
            System.out.println("Você é Divorciado(a)");
        }
        else{
            System.out.println("Você é Viuvo(a)");
        }
       

        //Questão 18:
        System.out.println("Defina a altura do seu Triângulo :");
        double alt = sc.nextDouble();
        System.out.println("Defina a base do seu Triângulo :");
        double base = sc.nextDouble();
        double area = base*alt/2;
        System.out.println("A area é : " + area);

        //Questão 19:
        System.out.println("Coloque sua cidade:");
        String cidade = sc.nextLine();
        int tam5 =  cidade.length();
        char[] jun = new char[tam5];
        for(int i=0;i<tam5;i++){
            jun[i] = cidade.charAt(i);
            Character.toUpperCase(jun[i]);
            if(jun[0]=='S'){
                System.out.println("Sua cidade começa com S");
            }
        }
        //Questão 20:
        System.out.println("Insira o Dividendo:");
        double dividendo = sc.nextDouble();
        System.out.println("Insira o Divisor:");
        double divisor = sc.nextDouble();
        double resto = dividendo%divisor;
        System.out.println(resto);


        //Questão 21:
        System.out.println("Coloque um numero decimal");
        double transformar = sc.nextDouble();
        int transformado = (int) transformar;
        System.out.println(transformado);


        //Questão 22:
        System.out.println("Coloque um numero para somar 10:");
        String som = sc.nextLine();
        int somado = Integer.parseInt(som)+10;
        String voltado = Integer.toString(somado);
        System.out.println(voltado);

        //Questão 23:
        System.out.println("Insira uma data (dd/mm/aaaa): ");
        String data = sc.next();
        tam = data.length();
        char[] dataTotal = new char[tam];
        char[] dia = new char[2];
        char[] mes = new char[2];
        char[] ano1 = new char [4];
        for(int i =0;i<tam;i++){
            dataTotal[i] = data.charAt(i);
            if(Character.isDigit(dataTotal[i])){
                if(i<2){
                    dia[i]=dataTotal[i];
                }
                else if(i>2&&i<=4){
                    mes[i-3]=dataTotal[i];
                }
                else {
                    ano1[i-6] = dataTotal[i+1];
                }   
            
            }
        }
        String anoString = new String (ano1);
        String mesString = new String (mes);
        String diaString = new String(dia);
        System.out.println("Dia :"+diaString+" \n"+"Mês :"+mesString+"\n"+"Ano :"+anoString);

        //Questão 24:
        System.out.println("Escreva uma cidade:");
        String cida = sc.nextLine();
        System.out.println("Escreva o estado para essa cidade");
        String esta = sc.nextLine();
        String cidaEsta = cida.concat(",".concat(esta));
        System.out.println("Você mora em "+cidaEsta);

        //Questão 25:
        System.out.println("Escreva sua ano de nascimento: ");
        int nascimento = sc.nextInt();
        System.out.println("Bem-vindo ao nosso programa, nascido em".concat(nascimento+"!"));

        //Questão 26:
        System.out.println("Escreva um inteiro :");
        
        



    }
}




