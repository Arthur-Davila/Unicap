package Funcionario;

public class Funcionario  implements Comparable {
    private String matricula;
    private String nome;
    private String Cargo;
    private double Salario;
    private int anoDeContratacao;
    public Funcionario(String mat, String nome, String Cargo, double salario, int anoDeContratacao){
        this.matricula = mat;
        this.nome = nome;
        this.Cargo = Cargo;
        this.Salario = salario;
        this.anoDeContratacao = anoDeContratacao;
        

    }
        public int getAnoDeContratacao() {
            return anoDeContratacao;
        }
        public String getCargo() {
            return Cargo;
        }
        public String getMatricula() {
            return matricula;
        }
        public String getNome() {
            return nome;
        }
        public double getSalario() {
            return Salario;
        }
        public void setAnoDeContratacao(int anoDeContratacao) {
            this.anoDeContratacao = anoDeContratacao;
        }
        public void setCargo(String cargo) {
            Cargo = cargo;
        }
        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setSalario(double salario) {
            Salario = salario;
        }
        
       
        public String toString() {
            
            return super.toString();
        }
        public int compareTo(Funcionario func){
            if(this.matricula.compareTo(func.matricula)==0){
                return 0;
            }
            else if(this.matricula.compareTo(func.matricula)>0){
                return 1;

            }
            else{
                return -1;
            }

        }
        public void aumentoDeSalario(double aumento){
            this.Salario = this.Salario+(this.Salario*aumento/100);
        }
}
