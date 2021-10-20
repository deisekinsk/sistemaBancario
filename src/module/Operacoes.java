package module;

import javax.swing.*;

public class Operacoes {
    //recupera saldo
    private Conta conta;
    double saldo;

    public static void Operacoes() {

    }

    public static double getSaldo(){
        double a = 125.00;
        return a;
    }

    public  static double getTransferencia(){
        double valor;
        double saldo = getSaldo();
        valor = Double.parseDouble(JOptionPane.showInputDialog(
                "Qual o valor você quer transferir? Ex.: 25.50"));
        valor = valor + getSaldo();
        saldo = saldo - valor;
        return valor;
    }

    public static double getExtrato(){
        System.out.println("EXTRATO");
        return 0;
    }
}
