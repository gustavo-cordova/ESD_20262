package estrutura.dados;

public class VetorObjeto {

    private Object[] elementos;
    private int tamanho;

    public VetorObjeto (int capacidade){
        elementos = new Object[capacidade];
    }

    public void inserir(Object elemento) {
        if (tamanho == elementos.length) {
            IO.println("tá cheio");;
            return;
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public void ler(){

    }
}


