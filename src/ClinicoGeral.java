import java.util.ArrayList;

public class ClinicoGeral extends Medico {

    public ClinicoGeral
            (String nome, Integer idade, Double salario, Integer anosDeEmpresa, String crm, Paciente paciente) {
        super(nome, idade, salario, anosDeEmpresa, crm, paciente);
    }
    @Override
    public void realizarDiagnostico(ArrayList<String> sintomas) {
        if (sintomas.size() <= 4) {
            System.out.println(this.getNomePaciente()+", toma um dipirona que você vai ficar bem.\n");
        } else if (sintomas.size() >= 5 && sintomas.size() <= 7) {
            System.out.println(this.getNomePaciente()+", você será internado(a) temporariamente para observação.\n");
        } else {
            System.out.println(this.getNomePaciente()+", seu caso é grave e precisaremos operar o quanto antes.\n");
        }
    }

}
