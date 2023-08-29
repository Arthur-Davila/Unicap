import java.util.Scanner;

public class Main {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int num = -9;

System.out.println("Coloque o tamanho do vetor:");

int tam = sc.nextInt();

CadastroProdutos cad = new CadastroProdutos(tam);

while(num!=0){

System.out.println("Loja Preço Bom");

System.out.println("Sistema de Controle de Estoque\n");

System.out.println("Opções");

System.out.println("1-Cadastro de um produto");

System.out.println("2-Exibição dos dados de um produto");

System.out.println("3-Exibição de todos os produtos da loja");

System.out.println("4-Alterar o preço de um produto");

System.out.println("5-Atualizar o estoque de um produto");

System.out.println("6-Realizar a venda de um produto");

System.out.println("7-Remover um produto do cadastro");

System.out.println("0-Sair do programa");

System.out.println("Digite a opção desejada:");

num = sc.nextInt();

switch(num){

case 1:

System.out.println("Coloque o Codigo a ser cadastrado:");

String cod = sc.next();

System.out.println("Coloque a descrição do produto:");

String des = sc.nextLine();

System.out.println("Coloque o fornecedor do produto:");

String forc = sc.nextLine();

System.out.println("Coloque o preço do produto:");

double pre = sc.nextDouble();

System.out.println("Coloque quantos desse produtos tem no estoque:");

int quant = sc.nextInt();

Produto p = new Produto(cod,des,forc,pre,quant);

cad.cadastrar(p);

break;

case 2:

cad.exibirProdutos();

break;

case 3:

System.out.println("Coloque o codigo do produto para ser exibido");

String codig = sc.next();

cad.exibir(codig);

break;

case 4:

System.out.println("Coloque o codigo do produto que deseja buscar:");

codig = sc.next();

System.out.println("Coloque se quer 1 para aumentar ou 2 para colocar desconto:");

int tipo = sc.nextInt();

System.out.println("Coloque a porcentagem:");

double percent = sc.nextDouble();

cad.alterarPreco(codig, percent, tipo);

break;

case 5:

System.out.println("Coloque o codigo do produto que deseja buscar:");

codig = sc.next();

System.out.println("Coloque quantos itens quer aumentar:");

int aumentar = sc.nextInt();

cad.atualizarEstoque(codig, aumentar);

break;

case 6:

System.out.println("Coloque o codigo do produto que deseja buscar:");

codig = sc.next();

System.out.println("Coloque quantos itens serão vendido do produto:");

int vende = sc.nextInt();

cad.venderProduto(codig, vende);

break;

case 7:

System.out.println("Coloque o codigo do produto que deseja remover:");

codig = sc.next();

cad.removerCadastro(codig);

break;

case 0:

break;

default:

System.out.println("Não possui essa opção.");

}

}

}

}