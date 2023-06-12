public class Pessoa implements Comparable <Pessoa>{
    private String pessoa;
    private int idade;
    public Pessoa(String pessoa){
        this.pessoa  = pessoa;
    }
    public Pessoa(int idade,String pessoa){
        this.pessoa = pessoa;
        this.idade = idade;

    }
    public String toString(){
        return this.pessoa+" "+this.idade;
    }

    public int getIdade(){
        return this.idade;
    }
    public String getPessoa(){
        return this.pessoa;
    }
    public void setIdade(int novaIdade){
        this.idade = novaIdade;
    }
    public int compareTo(Pessoa p){
        int result = this.pessoa.compareTo(p.pessoa);
        return result;
    }
}