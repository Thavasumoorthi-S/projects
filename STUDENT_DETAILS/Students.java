package example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class Students {
        private  String name;
        private  int age;
        private  double gpa;
        Students()
        {
            this.name="";
            this.age=0;
            this.gpa=0.0;
        }
        public void setname(String name)
        {
            this.name=name;
        }
        public void setage(int age)
        {
            this.age=age;
        }
        public void setgpa(Double gpa)
        {
            this.gpa=gpa;
        }
        public String getname()
        {
            return this.name;
        }
        public int getage()
        {
            return this.age;
        }
        public double getgpa()
        {
            return this.gpa;
        }

        public static void execute()
        {
            Scanner sc=new Scanner(System.in);
            String name;
            int choice;
            int age;
            double gpa;
            ArrayList<Students> list = new ArrayList<>();
            Logger logger = Logger.getLogger("com.api.jar");
            while (true) {
                logger.info("\n1)GET NAME,AGE,GPA FROM STUDENT \n2)SORT OPERATION ON GPA\n3) DISPLAY STUDENT DETAILS \n4)EXIT");
                logger.info("Choose any one of the option in the above: ");
                choice = sc.nextInt();
                if (choice == 1) {
                    logger.info("ENTER THE NAME:");
                    name = sc.next();
                    logger.info("ENTER THE AGE: ");
                    age = sc.nextInt();
                    logger.info("ENTER THE GPA 1 TO 10: ");
                    gpa = sc.nextDouble();
                    Students st = new Students();
                    st.setname(name);
                    st.setage(age);
                    st.setgpa(gpa);
                    list.add(st);
                } else if (choice == 2) {
                    list.sort((o1, o2) -> Double.compare(o2.getgpa(), o1.getgpa()));
                } else if (choice == 3) {
                    for (Students studentData : list) {
                        logger.info(studentData.getname() + " " + studentData.getage() + " " + studentData.getgpa());
                    }
                } else if (choice == 4) {
                    break;
                }
                else{
                    logger.info("please choose the correct choice in the above");
                }
            }
        }
}
