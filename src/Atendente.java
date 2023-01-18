import java.util.ArrayList;

public class Atendente extends Funcionario {
    private Paciente paciente;

    public Atendente() {}
    public Atendente(String nome, Integer idade, Double salario,
                     Integer anosDeEmpresa, Paciente paciente) {
        super(nome,idade,salario,anosDeEmpresa);
        this.paciente = paciente;
    }

    public final void iniciarAtendimento(Paciente paciente){
        System.out.println(this.getNome()+" irá realizar o atendimento do(a) paciente "+paciente.getNome()+".");
        System.out.println("-----Dados----- \nNome: "+paciente.getNome()+
                "\nSenha de Atendimento: "+paciente.getSenhaDeAtendimento()+
                "\nIdade: "+paciente.getIdade()+"\n");
    }

}
