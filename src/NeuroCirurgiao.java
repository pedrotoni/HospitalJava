import java.util.ArrayList;

public final class NeuroCirurgiao extends Cirurgiao{
    public NeuroCirurgiao
            (String nome, Integer idade, Double salario, Integer anosDeEmpresa, String crm, Paciente paciente) {
        super(nome,idade,salario,anosDeEmpresa,crm,paciente);
    }

    @Override
    public void realizarDiagnostico(ArrayList<String> sintomas) {
        if (sintomas.size() <= 2) {
            System.out.println(this.getNomePaciente()+", toma um dipirona que você vai ficar bem.\n");
        } else if (sintomas.size() >= 3 && sintomas.size() <= 5) {
            System.out.println(this.getNomePaciente()+", você será internado(a) temporariamente para observação.\n");
        } else {
            System.out.println(this.getNomePaciente()+", seu caso é grave e precisaremos operar o quanto antes.\n");
        }
    }

    public void realizarCirurgia(Cirurgia cirurgia) {
        System.out.println("-----Dados da Neurocirurgia-----\n" +
                "Data: "+cirurgia.getDataDaCirurgia()+
                "\nPaciente: "+cirurgia.getNomePaciente()+
                "\nNeurocirurgião: "+cirurgia.getNomeNeuroCirurgiao());
        System.out.println(cirurgia.getNomeNeuroCirurgiao()+" realizou a cirurgia com sucesso.\n");
    };
}