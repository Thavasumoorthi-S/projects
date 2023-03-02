package example;

import java.util.Scanner;
import java.util.logging.Logger;

public class Calculator1
{
    private  Calculator1()
    {

    }
public static void execute()
{
    Scanner sc=new Scanner(System.in);
    int choice;
    Logger logger = Logger.getLogger("com-api-jar");
    Basic b = new Basic();
    String get;
    logger.info("Enter num1 ");
    b.num1 = sc.nextDouble();
    logger.info("Enter num2 ");
    b.num2 = sc.nextDouble();
    logger.info("Enter symbol like +-*/");
    b.symbol = sc.next().charAt(0);
    b.check1();
    logger.info("Are you sure want display output?type (yes):(no)");
    get = sc.next();
    if (get.equals("yes")) {
        b.display1();
    }
    while (true) {
        logger.info("\n1)Enter sign and number \n2)display \n3)Exit");
        logger.info("choose any one of the option in the above ");
        choice = sc.nextInt();
        if (choice == 1) {
            logger.info("Enter symbol like +-*/ ");
            b.sign = sc.next().charAt(0);
            logger.info("Enter number ");
            b.number = sc.nextDouble();
            b.check2();
        } else if (choice == 2) {
            b.display2();
        } else if (choice == 3) {
            logger.info("Thank you ");
            break;
        }
        else{
            logger.info("please choose the correct choice in the above");
        }
    }
}
}
