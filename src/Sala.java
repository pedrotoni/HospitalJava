public class Sala {

    private Medico medico;
    private Integer numeroSala;

    public Sala(Medico medico, Integer numeroSala) {
        this.medico = medico;
        this.numeroSala = numeroSala;
    }

    public void reservarSala(Integer dia, Integer mes, Integer ano) {
        System.out.println(medico.getNome()+
                " reservou a sala "+this.numeroSala+" para a data "+dia+"/"+mes+"/"+ano+".");
    }
}
