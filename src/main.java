package src;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean exit = false;
        while (!exit){
        System.out.println("---------------------------------------------");
        System.out.println("UTP Zahra Kuvita Aberlin");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.print("Pick your choice : ");

        int pilihan = input.nextInt();
        switch (pilihan){
            case 1:
            login();
            break;
            case 2:
            register();
            break;
            case 3:
            exit = true;
        }

        }
    }

    public static void login(){
        System.out.println("---------------------------------------------");
        System.out.println("Login to our system");
        System.out.print("Email : alek04@gmail.com");
        System.out.println("Password : 1234");
        System.out.println("Login Success");
    }
    public static void register(){
        System.out.println("---------------------------------------------");
        System.out.println(" Register to our system");
        System.out.println("Fullname : Aleksius Aurelia");
        System.out.println("Email : alek04@gmail.com");
        System.out.println("Initial balance : 10000");
        System.out.println("Successfully registered User!");
    }
}
