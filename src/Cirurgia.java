import java.util.Date;

public class Cirurgia {
    private String diaDaCirurgia;
    private String mesDaCirurgia;
    private String anoDaCirurgia;
    private NeuroCirurgiao neuroCirurgiao;
    private Paciente paciente;

    public Cirurgia() {}
    public Cirurgia (String diaDaCirurgia, String mesDaCirurgia, String anoDaCirurgia, NeuroCirurgiao neuroCirurgiao, Paciente paciente) {
        this.diaDaCirurgia = diaDaCirurgia;
        this.mesDaCirurgia = mesDaCirurgia;
        this.anoDaCirurgia = anoDaCirurgia;
        this.neuroCirurgiao = neuroCirurgiao;
        this.paciente = paciente;
    }

    public String getDataDaCirurgia() {
        return (this.diaDaCirurgia+"/"+this.mesDaCirurgia+"/"+this.anoDaCirurgia);
    }


    public String getNomeNeuroCirurgiao() {
        return neuroCirurgiao.getNome();
    }

    public String getNomePaciente() {
        return paciente.getNome();
    }
}
