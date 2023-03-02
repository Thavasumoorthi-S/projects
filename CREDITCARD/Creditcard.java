package example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
class Creditcard
{
    private static final Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    String holdername;
    Long cardnumber;
    String expiredate;
    Creditcard(String holdername,Long cardnumber,String expiredate)
    {
        this.holdername=holdername;
        this.cardnumber=cardnumber;
        this.expiredate=expiredate;
    }
    Creditcard(Creditcard obj)
    {
        holdername=obj.holdername;
        cardnumber=obj.cardnumber;
        expiredate=obj.expiredate;
    }

    public String equals(Creditcard a)
    {
        if(cardnumber.equals(a.cardnumber))
        {
            return "true";
        }
        return "false";
    }
    public static void execute()
    {
        Scanner sc=new Scanner(System.in);
        String holdername;
        long cardnumber;
        String expiredate;
        String result;
        LOGGER.log(Level.INFO, "Enter the Name: ");
        holdername = sc.nextLine();
        LOGGER.log(Level.INFO, "Enter the cardnumber:  ");
        cardnumber = sc.nextLong();
        sc.nextLine();
        LOGGER.log(Level.INFO, "Enter the expiredate dd-mm-yyyy:");
        expiredate = sc.nextLine();
        Creditcard cc = new Creditcard(holdername, cardnumber, expiredate);
        Creditcard cc1 = new Creditcard(cc);
        result = "current object creditcardnumber and clonnable object creditcard numbers are same? :" + cc.equals(cc1);
        LOGGER.info(result);
        LOGGER.log(Level.INFO, "Enter the Name: ");
        holdername = sc.nextLine();
        LOGGER.log(Level.INFO, "Enter the cardnumber:  ");
        cardnumber = sc.nextLong();
        sc.nextLine();
        LOGGER.log(Level.INFO, "Enter the expiredate:");
        expiredate = sc.nextLine();
        Creditcard cc2 = new Creditcard(holdername, cardnumber, expiredate);
        result = "current object creditcardnumber and new object creditcard numbers are same? :" + cc.equals(cc2);
        LOGGER.info(result);
    }
}
