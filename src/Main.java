public class Main {
    public static void main(String[] args) {
        Paciente pedro = new Paciente("Pedro",28,"59494");
        pedro.relatarSintomas("tosse");
        pedro.relatarSintomas("dor de cabeça");
        pedro.relatarSintomas("vomito");
        pedro.exibirSintomas();

        ClinicoGeral cg =
                new ClinicoGeral("Maria",65,20000.00,12,"524959245",pedro);

        System.out.println(cg.realizarDiagnostico(pedro.getSintomas()));

    }
}