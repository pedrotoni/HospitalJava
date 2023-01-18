import java.util.ArrayList;

public class ClinicoGeral extends Medico {

    public ClinicoGeral
            (String nome, Integer idade, Double salario, Integer anosDeEmpresa, String crm, Paciente paciente) {
        super(nome, idade, salario, anosDeEmpresa, crm, paciente);
    }
    @Override
    public String realizarDiagnostico(ArrayList<String> sintomas) {
        if (sintomas.size() <= 2) {
            return "Toma um dipirona que você vai ficar bem.";
        } else if (sintomas.size() >= 3 && sintomas.size() <= 5) {
            return "Você será internado(a) temporariamente para observação.";
        } else {
            return "Seu caso é grave e precisaremos operar imediatamente.";
        }
    }
}
