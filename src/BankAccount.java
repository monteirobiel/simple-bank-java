import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        double balance = 0;
        int option = 0;
        System.out.println("*****Welcome*****");

        System.out.println("Your name: ");
        String name = reading.nextLine();
        System.out.println("Your account type: ");
        String type = reading.nextLine();

        System.out.println("***********************");
        System.out.println("CLIENTE:");
        System.out.println("name: " +name);
        System.out.println("Account Type: " + type);
        System.out.println("Your balance: " + balance);
        System.out.println("***********************");


        System.out.println("Operations");
        String menu = """
                ** Type your option **
                
                1- Check balance
                2- Transfer amount
                3- Receive amount
                4- Exit
                
                """;


        while(option !=4) {

            System.out.println(menu);
            option = reading.nextInt();

            if (option == 1) {
                System.out.println("Current Balance: " + balance);
            }else if (option == 2) {
                System.out.println("Type the amount for transfer: " );
                double valor = reading.nextDouble();
                if (valor > balance) {
                    System.out.println("You don't have the amount for transfer: ");
                }else {
                    balance -= valor;
                    System.out.println("Successful Transfer: ");
                }
            } else if (option == 3) {
                System.out.println("Received amount: ");
                double amount = reading.nextDouble();
                balance += amount;
            }else {
                System.out.println("Invalid Option ");
            }

        }
    }
}