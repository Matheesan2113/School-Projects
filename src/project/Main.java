/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.*;
import java.io.*;
import java.lang.*;
import java.time.*;

/**
 *
 * @author mathe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String d="",f,g;
        int login=0;
        while (!d.matches("exit")) {//WHILE LOOP USED TO RUN PROGRAM UNTIL USER WISHES TO EXIT
            Scanner innew = new Scanner(System.in);
            while (login == 0) {//WHILE LOOP FOR LOGGING IN PURPOSES
                try {
                    System.out.println("Enter Username");
                    f = innew.nextLine();
                    System.out.println("Enter Password");
                    g = innew.nextLine();
                    login = q.login(f, g);//LOGIN IN METHOD HANDLED BY VERIFICATION CLASS
                } catch (NullPointerException ex) {
                    System.out.println("User or password incorrect, try again.");
                }
            }
            switch (login) {//RETURNED VARIABLE DECIDES WHETHER MANAGER OR CUSTOMER MENU IS DISPLAYED
                case 1:
                    System.out.println("Welcome Manager");//MANAGER MENU
                    while (!h.matches("exit")) {
                        System.out.println("Please enter 1-3\n1.Create Account\n2.Delete Account\n3.LogOut\n");//MENU OPTIONS
                        int input1=0;
                        switch (input1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            default://OPTION TO LOG OUT OF MANAGER MENU, RESETS TO ASK WHETHER OR NOT TO CONTINUE PROGRAM
                                System.out.println("You logged out Manager");
                                h = "exit";//Exit into Real forever menu
                                break;
                        }
                    }
                    break;
                case 2://Customer Menu              
                    System.out.println(
                            "Welcome Customer");
                    while (!h.matches("exit")) {
                        System.out.println("Please enter 1-5\n1.View chequing\n2.View savings\n3.transfer cheq to savings\n4.savings to chequing\n5.logout\n");
                        int input2 = in2.nextInt();//CHOOSING CUSTOMER MENU OPTOINS
                        int test1;
                        switch (input2) {
                            case 1:
                                //View chequing
                                for (Customer x : manager.getClients()) {
                                    if (f.equals(x.getName())) {
                                        System.out.println("Chequing account has $" + x.getA().toString());//RETRIEVES BALANCE FROM CUSTOMER ACCOUNT
                                    }
                                }
                                break;
                            case 2:
                                //view savings
                                for (Customer x : manager.getClients()) {
                                    if (f.equals(x.getName())) {
                                        if (x.getB() != null) {
                                            System.out.println("Savings account has $" + x.getB().toString());//RETRIEVES BALANCE FROM CUSTOMER ACCOUNT
                                        } else {
                                            System.out.println("Client doesn't have savings account");
                                        }
                                    }
                                }
                                break;
                            case 3:
                                //exchange cheq->sav
                                for (Customer x : manager.getClients()) {
                                    if (f.equals(x.getName())) {//FINDS CUSTOMER IN ARRAYLIST
                                        if (x.hasSavings() == true) {//CHECKS IF CUSTOMER HAS SAVINGS
                                            System.out.println("enter how much you want to subtract from chequing and into saving");
                                            test1 = innew.nextInt();
                                            if (test1 <= x.getA().getValue() && test1 > 0) {//PERFORMS TRANSACTION ON CUSTOMER ACCOUNT
                                                x.getA().sub(test1);
                                                x.getB().add(test1);
                                            } else {
                                                System.out.println("Your value exceeds your money in chequings account");
                                            }
                                        } else {
                                            System.out.println("Customer does not have savings account, so no transaction");
                                        }
                                    }
                                }
                                break;
                            case 4:
                                //exchange sav->cheq
                                for (Customer x : manager.getClients()) {
                                    if (f.equals(x.getName())) {//FINDS CUSTOMER IN ARRAYLIST
                                        if (x.hasSavings() == true) {//CHECKS IF CUSTOMER HAS SAVINGS
                                            System.out.println("enter how much you want to subtract from savings and into chequing");
                                            test1 = innew.nextInt();
                                            if (test1 <= x.getB().getValue() && test1 > 0) {//PERFORMS TRANSACTION ON CUSTOMER ACCOUNT
                                                x.getB().sub(test1);
                                                x.getA().add(test1);
                                            } else {
                                                System.out.println("Your value exceeds your money in savings account");
                                            }
                                        } else {
                                            System.out.println("Customer does not have savings account, so no transaction");
                                        }
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println(
                            "You entered random choice, you will now exit program.");
                    d = "exit";//Exit into program

                    break;
            }
        }

    }
    
}
