package mc322.lab03;

public class Animacao {
    String processos;
    AquarioLombriga aquario;

    Animacao(String entrada) {
        String aux_entrada = entrada.substring(0, 2);
        int tamanho_aq = Integer.parseInt(aux_entrada);
        aux_entrada = entrada.substring(2, 4);
        int tamanho_lomb = Integer.parseInt(aux_entrada);
        aux_entrada = entrada.substring(4, 6);
        int pos_cauda = Integer.parseInt(aux_entrada);

        processos = entrada.substring(6);
        aquario = new AquarioLombriga(tamanho_aq, tamanho_lomb, pos_cauda);
    }

    void apresenta() {
        System.out.println(aquario.aquario);
    }

    void passo() {
        for (int i = 0; i < processos.length(); i++) {
            switch (processos.charAt(i)) {
            case 'M':
                aquario.mover();
                break;
            case 'C':
                aquario.crescer();
                break;
            case 'V':
                aquario.virar();
                break;
            }
            apresenta();
        }
    }
}