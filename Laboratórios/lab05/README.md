# Lab05

## Jogo de Damas

Nesse repositório contém códigos que consistem em simular o jogo "Damas".

Para jogar essas damas, deve-se colocar em um arquivo .csv, na pasta [data](https://github.com/Cicerolibardi/MC322A-1S2021/tree/main/Laborat%C3%B3rios/lab05/data) instruções de movimento do tipo "a3:b4, b4:c5", sendo a parte anterior ao caractere ":" a peça que deseja-se mover, e a parte posterior ao caractere ":" a casa em que deseja-se mover a peça,
sendo esse movimento de captura, ou somente de movimento. Para caso o movimento seja válido, será impresso o tabuleiro após cada movimentação. Caso contrário, será impresso uma 
mensagem do tipo "Movimento inválido!", ou seja, o movimento desejado não é possível de ser realizado pelas regras das Damas.

Após criado o arquivo .csv com as movimentações, deve-se inserir no console o comando "java mc322.lab05b.AppDama" dentro do repositório "bin". Como argumentos de tal comando, deve-se informar primeiramente o caminho para o arquivo de entrada csv criado, e, separado por um espaço, o nome do arquivoout.csv que deseja-se obter a resposta do tabuleiro após a última movimentaçao. Exemplo de execução com arquivos existentes "java mc322.lab05b.AppDama ../data/arq001.csv ../data/arq001out.csv".

* [Link para arquivos Java sobre o jogo versão "a" de "Damas"](https://github.com/Cicerolibardi/MC322A-1S2021/tree/main/Laborat%C3%B3rios/lab05/src/mc322/lab05a)

* [Link para arquivos Java sobre o jogo versão "b" de "Damas"](https://github.com/Cicerolibardi/MC322A-1S2021/tree/main/Laborat%C3%B3rios/lab05/src/mc322/lab05b)

