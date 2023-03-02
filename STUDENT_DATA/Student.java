package example;
import java.util.logging.Logger;
class Student{
    private static final Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    String name;
    char grade;
    float gpa;

    Student(String name,char grade,float gpa)
    {
        this.name=name;
        this.grade=grade;
        this.gpa=gpa;
    }
    public void updategpa(char grade)
    {
        this.grade=grade;
        if(this.grade=='D')
        {
            gpa=6;
        }
        else if(this.grade=='C')
        {
            gpa=7;
        }
        else if(this.grade=='B')
        {
            gpa=8;
        }
        else if(this.grade=='A')
        {
            gpa=9;
        }
        else if(this.grade=='O')
        {
            gpa=10;
        }
    }
    public String studentdetails()
    {
        return this.name+" has a "+this.gpa+" GPA";
    }

}
