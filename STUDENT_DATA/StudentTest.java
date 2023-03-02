package example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentTest {
    private static final Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    private StudentTest()
    {

    }
    public static void execute()
    {
        Scanner sc=new Scanner(System.in);
        String name;
        char grade;
        float gpa;
        char upgrade;
        String result;
        LOGGER.log(Level.INFO, "Enter the Name: ");
        name = sc.nextLine();
        LOGGER.log(Level.INFO, "Enter the Grade: ");
        grade = sc.next().charAt(0);
        LOGGER.log(Level.INFO, "Enter the GPA: ");
        gpa = sc.nextFloat();
        Student s = new Student(name, grade, gpa);
        while (true) {
            LOGGER.log(Level.INFO, "\n1)Update GPA \n2)Student details \n3)exit");
            LOGGER.log(Level.INFO, "Student choose any one the option in the above ");
            int select = sc.nextInt();
            if (select == 1) {
                LOGGER.info("Enter your latest grade: ");
                upgrade = sc.next().charAt(0);
                s.updategpa(upgrade);
            } else if (select == 2) {
                result = "" + s.studentdetails();
                LOGGER.info(result);
            } else if (select == 3) {
                break;
            }
            else{
                LOGGER.info("please choose the correct choice in the above");
            }
        }
    }
}
