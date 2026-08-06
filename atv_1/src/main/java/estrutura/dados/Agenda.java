package estrutura.dados;

import java.util.Arrays;

public class Agenda {

    private Contato[] contatos;
    private int tamanho;

    public Agenda(int quantidade) {
        contatos = new Contato[quantidade];
        this.tamanho = 0;
    }

    public void inserir (Contato contato){
        if (tamanho < contatos.length){
            contatos[tamanho] = contato;
            tamanho++;
        }else{
        IO.println("Agenda está cheia");
        }
    }

    public void inserir (int indice, Contato contato){
        if (tamanho >= contatos.length) {
            System.out.println("Agenda cheia!");
            return;
        }

        if (indice < 0 || indice > contatos.length) {
            System.out.println("Posição Inválida");
            return;
        }

        for (int i = tamanho ; i > indice; i-- ) {
            contatos[i] = contatos[i-1];
        }
        contatos[indice] = contato;
        tamanho++;
    }


    public void listar() {
        IO.println( "Agenda{" +
                "contatos=" + Arrays.toString(contatos) +
                '}');
    }
}







