public class Clinica{
    public static void main(String[] args) {
        Paciente p1 = new Paciente("123", "Maria" , "222" );
        System.out.println("Paciente 1: "+ p1);
        System.out.println("O telefone do "+p1.getNome()+" é "+p1.getFone());
        Paciente p2 = new Paciente("123");
        p2.setNome("Almeida");
        p2.setFone("555");
        System.out.println("Fone do paciente "+p2.getFone()+" é "+p2.getFone());
    }
}