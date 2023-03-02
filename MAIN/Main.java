package example;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;
public class Main {
    private static final Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) throws IOException{
        int choice;
        Scanner sc=new Scanner(System.in);
            while (true) {
                try
                {
                LOGGER.info("\n)Bank\n2)shape\n3)student\n4)singleton\n5)coordinates\n6)credit card\n7)BankException\n8)Studentdata\n9)Array,Arraylist,Linkedlist\n10)hashset,treeset,hashmap\n11)calculator\n12)studentcontacts using Linkedlist\n13)file operation \n14)Tictactoe game\n15)Exit");
                LOGGER.info("Choose any one of the option in the above ");
                choice = sc.nextInt();
                if (choice == 1) {
                    Bank.execute();

                } else if (choice == 2) {
                    Shape.execute();

                } else if (choice == 3) {
                    StudentTest.execute();
                } else if (choice == 4) {
                    Singleton.execute();
                } else if (choice == 5) {
                    Coordinates.execute();

                } else if (choice == 6) {
                    Creditcard.execute();
                } else if (choice == 7) {
                    BankException.execute();

                } else if (choice == 8) {
                    Students.execute();
                } else if (choice == 9) {
                    LinkedList.execute();
                } else if (choice == 10) {
                    Hashset.excute();

                } else if (choice == 11) {
                    Calculator1.execute();

                } else if (choice == 12) {
                    Contact.execute();
                } else if (choice == 13) {
                    Fileopds.execute();

                } else if (choice == 14) {
                    Games.execute();

                } else if(choice == 15) {
                    LOGGER.info("Thank you ");
                    break;
                }
                else{
                    LOGGER.info("please choose correct choice in the above");
                }
            }
                catch (InputMismatchException e)
                {
                   LOGGER.info("Please enter the  valid input only");
                }
        }
    }
}

