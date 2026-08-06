package estrutura.dados;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Agenda agenda = new Agenda(2);

        agenda.inserir(new Contato("gustavo", "123"));

        agenda.listar();

        agenda.inserir(new Contato("gustavo", "123"));

        agenda.listar();

    }
}
