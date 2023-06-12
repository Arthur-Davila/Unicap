public class Paciente {
    private String cpf;
    private String nome;
    private String fone;

    public Paciente(String cpf){
        this.cpf = cpf;
    }
    public Paciente(String cpf, String nome, String fone){
        this.cpf = cpf;
        this.nome = nome;
        this.fone = fone;
    }
    public String toString(){
        return this.cpf + " " + this.nome+" "+ this.fone;
    }
    public String getNome(){
        return this.nome;
    }
    
    public String getCPF(){
        return this.cpf;
    }
    
    public String getFone(){
        return this.fone;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    public void setFone(String novoFone){
        this.fone = novoFone;
    }
}
