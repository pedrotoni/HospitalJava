public class Main {
    public static void main(String[] args) {
        //teste metodos classe Paciente
        Paciente p1 = new Paciente("Pedro",23,"200303");
        p1.relatarSintomas("tosse");
        p1.relatarSintomas("febre");
        p1.exibirSintomas();

        //teste metodo realizarDiagnostico() declarado na classe Medico e implementado em ClinicoGeral
        ClinicoGeral cg1 = new ClinicoGeral("Dr. Arthur",39,15000.00,3,"3040103",p1);
        cg1.realizarDiagnostico(p1.getSintomas());

        //teste metodo realizarCirurgia(Cirurgia cirurgia) declarado na classe e implementado em NeuroCirurgiao
        NeuroCirurgiao nc1 = new NeuroCirurgiao("Margareth",61,30000.00,16,"02450240",p1);
        Cirurgia c1 = new Cirurgia("24","12","2024",nc1,p1);
        nc1.realizarCirurgia(c1);




    }
}