public abstract class Cirurgiao extends Medico {

    public Cirurgiao
            (String nome, Integer idade, Double salario, Integer anosDeEmpresa, String crm, Paciente paciente) {
        super(nome, idade, salario, anosDeEmpresa, crm, paciente);
    }

    public abstract void realizarCirurgia(Cirurgia cirurgia);

    public String getNomeCirurgiao() {
        return this.getNome();
    }
}
