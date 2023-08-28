package br.com.contabanco.aldenor.project;

import br.com.contabanco.aldenor.project.model.ContaTerminal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor informe o número da conta.");

        ContaTerminal contaTerminal = new ContaTerminal();

        while (contaTerminal.getNumber() == null) {
            String number = scanner.next();
            if (isNumberInt(number)) contaTerminal.setNumber(Integer.parseInt(number));
            else System.out.println("Por favor, informe o número da conta, lembrando, apenas números são permitidos.");
        }

        System.out.println("Por favor, informe o seu nome.");
        String nome = scanner.next();
        contaTerminal.setClientName(nome);

        System.out.println("Por favor, informe a sua Agência.");
        String agencia = scanner.next();
        contaTerminal.setAgencia(agencia);

        System.out.println("Por favor informe o saldo da sua conta.");
        while (contaTerminal.getBalance() == null) {
            String balance = scanner.next();
            if (isNumberDouble(balance)) contaTerminal.setBalance(Double.parseDouble(balance));
            else System.out.println("Por favor, informe o saldo da sua conta valido, lembrando, apenas números são permitidos.");
        }
        System.out.println("Olá "+contaTerminal.getClientName()+
                ", obrigado por criar uma conta em nosso banco, sua agência é " +
                contaTerminal.getAgencia()+", conta "+contaTerminal.getNumber()+" e seu saldo "+contaTerminal.getBalance()+" já está disponível para saque.");
        scanner.close();
    }

    public static boolean isNumberInt(String numberString) {
        try {
            Integer.parseInt(numberString);
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }

    public static boolean isNumberDouble(String numberString) {
        try {
            Double.parseDouble(numberString);
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }

}
