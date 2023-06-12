import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,tam=2;
        Pessoa alguem[] = new Pessoa[tam];
        for(i = 0;i<alguem.length;i++){
            System.out.println("Pessoa "+(i+1));
            System.out.print(" informe o nome:");
            String nome = sc.nextLine();
            System.out.print("Informe a idade:");
            int idade = sc.nextInt();sc.nextLine();
            Pessoa p = new Pessoa(idade,nome);
            alguem[i] = p;
            

        }
        for(i = 0;i<alguem.length;i++){
            System.out.println(alguem[i]);
        }
        bubblesort(alguem, tam);
        for(i = 0;i<alguem.length;i++){
            System.out.println(alguem[i].toString());
        }
        
    }public static void bubblesort (Pessoa v [ ], int n) {
        int i, fim, pos;
        Pessoa chave;
        boolean troca;
        fim = n - 2; pos = 0;
        do {
        troca = false;
        for (i = 0; i <= fim; i++) {
        if (v[i].compareTo(v[i+1])>0) {
        chave = v[i]; v[i] = v[i+1]; v[i+1] = chave;
        pos = i; troca = true;
        }
        }
        fim = pos-1;
        } while (troca == true);
        }
 
    }