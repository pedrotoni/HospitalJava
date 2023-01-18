import java.util.ArrayList;

public class Fila {
    private ArrayList<String> fila;

    public Fila() {
        this.fila = new ArrayList<>();
    }

    public void entraNaFila(Paciente paciente) {
        this.fila.add(paciente.getNomePaciente());
    }

    public void exibirNomesDaFila() {
        System.out.println("Fila em espera: ");
        int ordem = 0;
        for (String paciente : this.fila) {
            System.out.println((ordem+1)+"- "+paciente);
            ordem++;
        }
        System.out.println("Número de pacientes em espera: "+ordem+"\n");
    }
}
