public abstract class Funcionario extends Pessoa {
    private Double salario;
    private Integer anosDeEmpresa;

    public Funcionario() {}
    public Funcionario(String nome, Integer idade, Double salario, Integer anosDeEmpresa) {
        super(nome,idade);
        this.salario = salario;
        this.anosDeEmpresa = anosDeEmpresa;
    }

    public Double getSalario() {
        return this.salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Integer getAnosDeEmpresa() {
        return this.anosDeEmpresa;
    }
    public void setAnosDeEmpresa(Integer anosDeEmpresa) {
        this.anosDeEmpresa = anosDeEmpresa;
    }

}
