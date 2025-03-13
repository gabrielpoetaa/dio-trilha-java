import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    static double salarioBase = 2000.0;
    public static void main(String[] args) throws Exception {
        // analisarCandidato(1900.0);
        // analisarCandidato(2220.0);
        // analisarCandidato(2000.0);
    //    System.out.printf("%.2f", valorPretendido());
    //    selecaoCandidatos();

    String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

    for (String candidato: candidatos) {
        entrarEmContato(candidato);
    }
}

    static void analisarCandidato (double salarioPretendido){
        if ( salarioBase > salarioPretendido ){
            System.out.println("Ligar para o candidato. ");
        } else if( salarioBase == salarioPretendido ){
            System.out.println("Ligar para o candidato com uma contra proposta.");
        }else{
            System.out.println("Aguardando demais candidatos.");
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        List<String> listaCandidatosSelecionados = new ArrayList<String>();
        int candidatosSelecionados = 0;
        for(String candidato: candidatos) {
            double salarioPretendido = valorPretendido();
            if(salarioBase >= salarioPretendido && candidatosSelecionados < 5){
                listaCandidatosSelecionados.add(candidato);
                System.out.printf("O candidato %s solicitou um salario de %.2f e foi selecionado.%n", candidato, salarioPretendido );
                candidatosSelecionados++;
            }
        }
        System.out.println("Lista dos candidatos selecionados: " + listaCandidatosSelecionados);
    }

    static void entrarEmContato(String candidato) {
        int tentativasRealizadas = 0;
        boolean seguirTentando = true;

        while(tentativasRealizadas < 3 && seguirTentando){
            boolean atendeu = atender();
            tentativasRealizadas++;

            if (atendeu) {
                seguirTentando = false;
                System.out.println("Conseguimos contato com o candidato " + candidato + ". Tentativas realizadas: " + tentativasRealizadas);
            } else if (tentativasRealizadas == 3) {
                System.out.println("Nao conseguimos contato com o candidato: " + candidato + ". Tentativas realizadas: " + tentativasRealizadas);
            }
        }
    }

    // Métodos auxiliares
    static double valorPretendido () {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

}
