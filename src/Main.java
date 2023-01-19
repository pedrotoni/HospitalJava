import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //instanciando pacientes
        Paciente paciente1 = new Paciente("Pedro",23,"200303");
        Paciente paciente2 = new Paciente("Julia",43,"25044502");
        Paciente paciente3 = new Paciente("Fernanda",11,"30502450");
        Paciente paciente4 = new Paciente("Armando",66,"03502540c");
        Paciente paciente5 = new Paciente("Carlos",33,"524kkwfd0");

        //testes dos metodos da classe Fila
        Fila fila = new Fila();
        fila.entraNaFila(paciente1);
        fila.entraNaFila(paciente2);
        fila.entraNaFila(paciente3);
        fila.entraNaFila(paciente4);
        fila.entraNaFila(paciente5);
        fila.exibirNomesDaFila();

        //teste metodo iniciarAtendimento(Paciente paciente)
        Atendente atendente = new Atendente("João",34,3000.00,5,paciente1);
        atendente.iniciarAtendimento(paciente1);

        ClinicoGeral clinicoGeral =
                new ClinicoGeral("Dr. Arthur",39,15000.00,3,"3040103",paciente1);
        NeuroCirurgiao neuroCirurgiao =
                new NeuroCirurgiao("Dra. Margareth",61,30000.00,16,"02450240",paciente1);

        //teste metodos classe Paciente
        paciente1.relatarSintomas("tosse");
        paciente1.relatarSintomas("febre");
        paciente1.relatarSintomas("ansiedade");
        paciente1.relatarSintomas("dor no peito");
        paciente1.relatarSintomas("tontura");
        paciente1.relatarSintomas("vomito");
        paciente1.exibirSintomas();

        /*teste metodo realizarDiagnostico() declarado na classe Medico e implementado em ClinicoGeral
        * e NeuroCirurgiao, com algumas diferenças em suas implementações dependendo da classe.*/
        System.out.println("Diagnóstico do Clinico Geral");
        clinicoGeral.realizarDiagnostico(paciente1.getSintomas());

        System.out.println("Diagnóstico do Neurocirurgião");
        neuroCirurgiao.realizarDiagnostico(paciente1.getSintomas());


        //teste metodo realizarCirurgia(Cirurgia cirurgia) declarado na classe Cirurgiao e implementado em NeuroCirurgiao
        Cirurgia cirurgia =
                new Cirurgia(18,1,2023,neuroCirurgiao,paciente1);
        neuroCirurgiao.realizarCirurgia(cirurgia);

        //teste metodo da classe Sala reservar();
        System.out.println("Reserva de Salas: ");
        Sala sala430 = new Sala(clinicoGeral,430);
        sala430.reservarSala(4,4,2023);
        Sala sala583 = new Sala(neuroCirurgiao,583);
        sala583.reservarSala(5,6,2023);

        //Teste equals usando classe Paciente;
        System.out.println("Teste Equals: ");
        Paciente paciente7 = new Paciente("Ana",23,"123");
        Paciente paciente8 = new Paciente("Ana",23,"123");
        System.out.println("Instância paciente7 é igual a si mesma? -> "+paciente7.equals(paciente7));
        System.out.println("Instância paciente7 é igual a Instância paciente8?" +
                " (OBS: Ambas possuem os mesmos valores de atributos) -> "+paciente7.equals(paciente8));


    }
}