import module.Conta;
import view.MenuView;

public class Main {

    public static void main (String[] args){

    Conta.criarConta();

    MenuView view = new MenuView();
    System.out.println(view);




    }
}
