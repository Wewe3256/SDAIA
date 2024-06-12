import org.example.HW.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTesting {


    private Person p;

    @BeforeEach

    public void createObject(){

        p=new Person("wijdan",24,"ksa");
        System.out.println("Creat");
    }

    @Test
    public void setAge(){
        int actual=p.getAge();
        int expected =24;
        Assertions.assertEquals(expected,actual);
    }

}
