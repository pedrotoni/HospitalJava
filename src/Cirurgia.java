import java.util.Date;

public class Cirurgia {
    private Integer diaDaCirurgia;
    private Integer mesDaCirurgia;
    private Integer anoDaCirurgia;
    private NeuroCirurgiao neuroCirurgiao;
    private Paciente paciente;

    public Cirurgia() {}
    public Cirurgia (Integer diaDaCirurgia, Integer mesDaCirurgia, Integer anoDaCirurgia, NeuroCirurgiao neuroCirurgiao, Paciente paciente) {
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
