import org.example.HW.student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentTesting {
    private  static student s1;




    @BeforeEach

    public void createObject(){

        s1=new student("wijdan",24,"ksa",111111,"java");
        System.out.println("Creat");
    }


    @Test
    public void setname(){
        String actual=s1.getName();
        String expected ="wijdan";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setcourse(){
        String actual=s1.getCourse();
        String expected ="java";
        Assertions.assertEquals(expected,actual);
    }
}
