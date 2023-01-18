public class Atendente extends Funcionario {
    private Paciente paciente;

    public Atendente() {}
    public Atendente(String nome, Integer idade, Double salario, Integer anosDeEmpresa, Paciente paciente) {
        super(nome,idade,salario,anosDeEmpresa);
        this.paciente = paciente;
    }


}
