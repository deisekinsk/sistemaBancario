package view;

import module.Operacoes;

import javax.swing.*;

public class MenuView {
    private Operacoes operacoes;

    public MenuView(){
        menuSelect();
    }

    public void menuSelect(){

        boolean opr = false;
        String menu;
        String tipo = "N";

        menu = "Operações Bancárias:" + "\n 1 = Consulta Saldo" +
                "\n 2 = Consulta Extrato" + "\n 3 = Transferência" +
                "\n 4 = SAIR";

        while (opr != true){
            tipo = JOptionPane.showInputDialog(menu);

            if(tipo.equals("1") || tipo.equals("2") || tipo.equals("3") || tipo.equals("4"))
            {opr = true;}
        }


        switch (tipo){
            case "1":
                //System.out.printf("Saldo: %s%n", operacoes.getSaldo());
                break;
            case "2":
                //System.out.println(operacoes.getExtrato());
                break;
            case "3":
                //System.out.println(operacoes.getTransferencia());
                break;
            case "4":
                System.out.println("Sistema Encerrado.");
                break;
        }
    }
}
