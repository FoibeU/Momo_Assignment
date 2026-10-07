import sample.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("**************MTN MOMO MENU*******************");

        Scanner sc = new Scanner(System.in);
        int choice;


        do {

            mainMenu(sc);

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 0: {
                    voicePack(sc);
                    System.out.println("Enter your choice : ");
                    choice = sc.nextInt();
                    break;
                }

                case 1: {
                    sendMoney(sc);
                    System.out.print("Enter your choice : ");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            momoUser(sc);
                            break;
                        case 2:
                            sendEkash(sc);
                            break;
                        case 3:
                            internationalTransfer(sc);
                            System.out.print("Enter your choice : ");
                            choice = sc.nextInt();
                    }
                    break;
                }

                case 2: {

                    buy(sc);
                    break;
                }

                default:
                    System.out.println("Invalid choice. Try again");

            }


        } while (choice != 99);


    }

    public static void mainMenu(Scanner sc) {
        System.out.println("0. MTN Packs");
        System.out.println("1. Send Money");
        System.out.println("2. Buy");
        System.out.println("3. Pay Bill");
        System.out.println("4. Bank services");
        System.out.println("5. Loans and savings ");
        System.out.println("6. My momo account");
        System.out.println("7. Pendind Approvals");
        System.out.println("8. Momo pay");
        System.out.println("99. Exit");

    }

    public static void voicePack(Scanner sc) {
        System.out.println("1. Buying Airtime , VoicePack and Databundles");
        System.out.println("99. Go back");
    }

    public static void sendMoney(Scanner sc) {
        System.out.println("1.Momo Users");
        System.out.println("2.Send to Ekash");
        System.out.println("3. International Remittance");
        System.out.println("4.Cancel Voucher");
        System.out.println("5. Display voucher ");
        System.out.println("6.List Active voucher ");
    }

    public static void momoUser(Scanner sc) {
        System.out.println("enter the recipient number");
    }

    public static void sendEkash(Scanner sc) {
        System.out.println("enter the recipient number");

    }

    public static void internationalTransfer(Scanner sc) {
        System.out.println("1. To mobile number");
        System.out.println("2. other wallets");
        System.out.println("3. to banks");
        System.out.println("4. Pay international merchant");
        System.out.println("5. exit");
    }

    public static void buy(Scanner sc) {
        System.out.println("1. Buying Airtime , VoicePack and Databundles");
        System.out.println("2. Electricity");
        System.out.println("3. International subscription");
        System.out.println("4. Solar");
        System.out.println("5. Pay transport fare");
        System.out.println("6. Exit");
    }


}
