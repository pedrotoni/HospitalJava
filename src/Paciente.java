import java.util.ArrayList;

public class Paciente extends Pessoa {
    private String senhaDeAtendimento;
    private ArrayList<String> sintomas;


    public Paciente(String nome, Integer idade, String senhaDeAtendimento) {
        super(nome,idade);
        this.senhaDeAtendimento = senhaDeAtendimento;
        this.sintomas = new ArrayList<>();
    }

    public String getSenhaDeAtendimento() {
        return this.senhaDeAtendimento;
    }
    public void setSenhaDeAtendimento(String senhaDeAtendimento) {
        this.senhaDeAtendimento = senhaDeAtendimento;
    }
    public ArrayList<String> getSintomas() {
        return this.sintomas;
    }
    public void relatarSintomas(String sintoma) {
        this.sintomas.add(sintoma);
    }

    public void exibirSintomas() {
        System.out.println(this.sintomas);
    }
}
