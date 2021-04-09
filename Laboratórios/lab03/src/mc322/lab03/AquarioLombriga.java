package mc322.lab03;

public class AquarioLombriga {
    int cabeca;
    int cauda;
    int tamanho_aq;
    boolean direcao; // ser� true quando for para direita e false quando for para a esquerda;
    String aquario;

    AquarioLombriga(int tamanho_aq, int tamanho_lomb, int pos_lomb) {
        this.tamanho_aq = tamanho_aq;
        cauda = pos_lomb;
        aquario = "";
        direcao = true;

        if (tamanho_lomb > tamanho_aq) {
            this.tamanho_aq = tamanho_lomb;
        }

        cabeca = cauda + tamanho_lomb - 1;

        if (this.cabeca > tamanho_aq) {
            cauda = 1;
            cabeca = cauda + tamanho_lomb - 1;
        }

        for (int i = 1; i <= this.tamanho_aq; i++) {
            if (cauda <= i && i < cabeca) {
                aquario += "@";
            } else if (cabeca == i) {
                aquario += "O";
            } else {
                aquario += "#";
            }
        }
    }

    void crescer() {
        if (cauda != 1 && cauda != tamanho_aq) {
            char[] aquario_arr = aquario.toCharArray();
            if (direcao) {
                aquario_arr[cauda - 2] = '@';
                cauda -= 1;
            } else if (!direcao) {
                aquario_arr[cauda] = '@';
                cauda += 1;
            }
            aquario = String.valueOf(aquario_arr);
        }
    }

    void virar() {
        int aux;
        aux = cabeca;
        cabeca = cauda;
        cauda = aux;
        if (direcao)
            direcao = false;
        else
            direcao = true;
        char[] aquario_arr = aquario.toCharArray();

        aquario_arr[cabeca - 1] = 'O';
        aquario_arr[cauda - 1] = '@';

        aquario = String.valueOf(aquario_arr);
    }

    void mover() {
        if (cabeca != tamanho_aq && cabeca != 1) {
            if (direcao) {
                char[] aquario_arr = aquario.toCharArray();
                aquario_arr[cauda - 1] = '#';
                aquario_arr[cabeca - 1] = '@';
                aquario_arr[cabeca] = 'O';
                cabeca += 1;
                cauda += 1;
                aquario = String.valueOf(aquario_arr);
            } else {
                char[] aquario_arr = aquario.toCharArray();
                aquario_arr[cauda - 1] = '#';
                aquario_arr[cabeca - 1] = '@';
                aquario_arr[cabeca - 2] = 'O';
                cabeca -= 1;
                cauda -= 1;
                aquario = String.valueOf(aquario_arr);
            }
        } else {
            virar();
        }
    }

    void apresenta() {
        System.out.println(aquario);
    }
}
