import accounts.*;
import java.util.ArrayList;
import java.util.Scanner;
public class App {

    private static ArrayList<Account> accounts = new ArrayList<>();
    private static Scanner reading = new Scanner(System.in);
    private static Boolean option = true;
    public static void main(String args[]) {

        menu();
    }

    public static void menu() {

        while (option == true) {

            Integer number = null;

            try {

                System.out.println("DIGITE UM NÚMERO PARA REALIZAR UMA AÇÃO: \n");
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Transferir");
                System.out.println("4 - Consultar informações da conta \n");

                System.out.print("DIGITE: ");
                number = reading.nextInt();

                if (number == 0 || number > 4) {

                    System.out.print("\n");
                    errorMessage();
                }

                else {

                    option = false;
                    System.out.print("\n");
                    choiceOption(number);
                }
            }
            
            catch(Exception error) {

                reading.nextLine();
                System.out.print("\n");
                errorMessage();
            }
        }    
    }

    public static void choiceOption(Integer value) {

        switch (value) {

            case 1:
                deposit();
                break;

            case 2:
                withdraw();
                break;

            case 3:
                transfer();
                break;

            case 4:
                showInfo();

            default:
                break;
        }
    }

    public static void errorMessage() {

        System.out.println("ENTRADA INVÁLIDA!");
    }

    public static void deposit() {

        System.out.println("Você está em depósito!");
    }

    public static void withdraw() {


    }

    public static void transfer() {


    }

    public static void showInfo() {


    }

    public static Account login(Account value) {

        

        if (accounts.size() == 0) {

            System.out.println("NÃO HÁ CONTA CADASTRADA NO SISTEMA! \n");
            System.out.println("REGISTRE-SE");

            register();
        }

        else {

            System.out.println("Digite o nome da conta: ");
            String name = reading.nextLine();
        }

        return null;
    }

    public static void register() {

        Boolean progress = true;
        String name = "";

        while(progress == true) {

            try {

                System.out.println("Qual o seu nome? ");
                name = reading.nextLine();

                System.out.println(name + "! REGISTRADO COM SUCESSO!");
                progress = false;
            }
        
            catch(Exception error) {

                System.out.println("NOME DIGITADO INVÁLIDO!");
            }
        }

        createAccount(name);
    }

    public static void createAccount(String value) {


    }
}
