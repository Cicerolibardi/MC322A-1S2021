package mc322.lab03;

public class Animacao{
    String processos;
    String aux_entrada;
    int tamanho_aq;
    int tamanho_lomb;
    int pos_cauda;
    AquarioLombriga aquario;

    Animacao(String entrada){
        aux_entrada = entrada.substring(0, 2);
        tamanho_aq = Integer.parseInt(aux_entrada);
        aux_entrada = entrada.substring(2, 4);
        tamanho_lomb = Integer.parseInt(aux_entrada);
        aux_entrada = entrada.substring(4, 6);
        pos_cauda = Integer.parseInt(aux_entrada);
        
        processos = entrada.substring(6);
        aquario = new AquarioLombriga(tamanho_aq, tamanho_lomb, pos_cauda);
    }
    
    void apresenta(){
        System.out.println(aquario.aquario);
    }
   
    
   void passo(){
        for (int i = 0; i < processos.length(); i++){
            switch (processos.charAt(i)){
                case 'M':
                    aquario.mover(); break;
                case 'C':
                    aquario.crescer(); break;
                case 'V':
                    aquario.virar(); break;
            }
            apresenta();
        }
    }
}