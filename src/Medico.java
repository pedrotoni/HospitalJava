import java.util.ArrayList;

public abstract class Medico extends Funcionario {
    private String crm;
    private Paciente paciente;

    public Medico() {}

    public Medico(String nome, Integer idade, Double salario, Integer anosDeEmpresa, String crm, Paciente paciente) {
        super(nome, idade, salario, anosDeEmpresa);
        this.crm = crm;
        this.paciente = paciente;
    }

    public String getCrm(){
        return this.crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }

    public abstract void realizarDiagnostico(ArrayList<String> sintomas);

    public String getNomePaciente() {
        return paciente.getNome();
    }

}
