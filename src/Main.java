import module.Conta;
import view.MenuView;

public class Main {

    public static void main (String[] args){

        Conta addCliente = new Conta();

        addCliente.setCliente();
        addCliente.setSaldo();
        addCliente.setIdConta();


        System.out.println(
                "Bem vindo/a " +
                        addCliente.getCliente() + "\n sua conta é: " +
                        addCliente.getIdConta() + "\n seu saldo atual é R$ " +
                        addCliente.getSaldo()
        );

    }
}
