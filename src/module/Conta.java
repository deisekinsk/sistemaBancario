package module;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Conta {

    public static void criarConta() {
        int idConta;

        String cliente  = JOptionPane.showInputDialog(
                "Vamos criar sua conta.\nInsira seu nome: ");

        //try{}catch (Exception e){} //try catch for: '. ,'
        double saldo = Double.parseDouble(JOptionPane.showInputDialog(
                "Quanto você depositará?\nEx.: 135.50 "));



        List<Object> addCliente = new ArrayList<Object>();
        Random numeroRandom = new Random();

        idConta = 1 + numeroRandom.nextInt(99999);

        addCliente.add(cliente);
        addCliente.add(saldo);
        addCliente.add(idConta);


        System.out.println("Bem vind@ "+ addCliente.get(0)+",\nesses são os dados da sua conta: "
                + "\n* Conta Corrente: "+ addCliente.get(2) + "\n* Saldo: R$ "+ addCliente.get(1));


    }


}
