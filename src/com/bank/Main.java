package com.bank;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static Scanner input = new Scanner(System.in);
    public static Scanner stringInput = new Scanner(System.in);
    public static String[] usrNamePass = new String[4];

    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to XYZ Bank! Please Login by typing  \n Register by pressing 1");
        int UInput = input.nextInt();
        if (UInput == 1) {
            registrationMsg();
        }
    }

    public static boolean isValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    static void registrationMsg() throws IOException {
        System.out.println("Welcome to registration, please type your username followed by your password ");
        registration1();
    }

    static void registration1() throws IOException {
        System.out.println("Enter a username");
        usrNamePass[0] = input.next();
        System.out.println("Please enter an email");
        usrNamePass[3] = input.next();
        if (isValid(usrNamePass[3])) {
            registration2();
        } else if (!isValid(usrNamePass[3])) {
            System.out.println("The email you entered is not a valid email");
        }

    }

    static void registration2() throws IOException {
        System.out.println("Enter Password");
        usrNamePass[1] = input.next();
        System.out.println("Confirm your password");
        usrNamePass[2] = input.next();

        if (usrNamePass[1].equals(usrNamePass[2])) {
            System.out.println("Are you sure you want your username to be " + usrNamePass[1] + "?");
            LoginMsg();
        } else {
            System.out.println("Passwords do not match, please try again by pressing 1");
            int UInput = input.nextInt();
            if (UInput == 1) {
                registration1();
            }
        }


    }

    static void LoginMsg() {
        System.out.println("Your account has been created, please enter your details again to login");
        Login();
    }
        static void Login(){
        String[] log = new String[2];
        System.out.println("Type your username");
        log[0] = stringInput.next();


        if (usrNamePass[0].equals(log[0])) {
            System.out.println("Type your password");
            log[1] = stringInput.next();
            if (usrNamePass[1].equals(log[1])) {
                bankMenu.menu();
            } else if (!usrNamePass[1].equals(log[1])) {
                System.out.println("Password is incorrect \n If you forgot your password, press 1 for password reset or press 2 to try again");
                int UInput = input.nextInt();
                if (UInput == 1) {
                    forgotPassword();
                }
                if (UInput == 2){

                }
            }
        } else if (!usrNamePass[0].equals(log[0])) {
            System.out.println("Username is incorrect");
            Login();
        }

    }

    static void forgotPassword() {
        String[] email = new String[1];
        System.out.println("Enter email");
        email[0] = input.next();
        if (email[0].equals(usrNamePass[3])) {
            System.out.println("Enter New Password");
            usrNamePass[1] = input.next();
            System.out.println("Confirm your new password");
            usrNamePass[2] = input.next();
            if (!usrNamePass[1].equals(usrNamePass[2])) {
                System.out.println("Passwords do not match, try again");
                forgotPassword();
            }
            Login();
        }
        else if (!email[0].equals(usrNamePass[3])) {
            System.out.println("Email does not match, please try again");
                forgotPassword();
        }
    }
}
