package example;

import java.util.logging.Level;
import java.util.logging.Logger;

class Basic implements Operation
{
    Logger logger=Logger.getLogger("com-api-jar");
    double num1;
    double num2;
    char symbol;
    char sign;
    double number;
    double result;

    public void check1() {
        if (symbol == '+') {
            result = num1 + num2;
        } else if (symbol == '-') {
            result = num1 - num2;
        } else if (symbol == '*') {
            result = num1 * num2;
        } else if (symbol == '/') {
            result = num1 / num2;
        }
    }
    public void display1()
    {
        logger.log(Level.INFO,()->"Result is "+this.result);
    }
    public void check2()
    {
        if(sign=='+')
        {
            result=result+number;
        }
        else if(sign=='-')
        {
            result=result-number;

        }
        else if(sign=='*')
        {
            result=result*number;
        }
        else if(sign=='/')
        {
            result=result/number;
        }
    }
    public  void display2()
    {
        logger.log(Level.INFO,()->"Result is "+this.result);
    }
}
