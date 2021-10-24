package module;

import javax.swing.*;
import java.util.Random;

public class Conta {

    private String nomeCliente;
    private double saldo;
    private int idConta;

    public void setCliente() {
        this.nomeCliente = JOptionPane.showInputDialog(
                "\"Vamos criar sua conta.\\nInsira seu nome: \""
        );
    }

    public String getCliente(){
        return this.nomeCliente;
    }

    public void setSaldo(){
        this.saldo = Double.parseDouble(JOptionPane.showInputDialog(
                "Quanto você depositará?\nEx.: 135.50 "
        ));
    }

    public double getSaldo(){
        return this.saldo;
    }


    public void setIdConta() {
        Random numeroRandom = new Random();
        this.idConta = 1 + numeroRandom.nextInt(99999);
    }

    public int getIdConta(){
        return this.idConta;
    }


}
