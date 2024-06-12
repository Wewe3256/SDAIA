package org.example.Exercises_During_Training;

public class Employee_OOP_MAIN {
    public static void main(String[] args){
        Employee_OOP_CLASS x = new Employee_OOP_CLASS("sara",100,2021);
        Employee_OOP_CLASS y= new Employee_OOP_CLASS("mona",120,2021);

        System.out.println(x.name);
        System.out.println(x.salary);
        System.out.println(x.hireYear);
        System.out.println(x.salary1());
        System.out.println(x.period());

        System.out.println(y.name);
        System.out.println(y.salary);
        System.out.println(y.hireYear);
        System.out.println(y.salary1());
        System.out.println(y.period());

    //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a name salary hireyeare:");
          //String n = sc.nextLine();
          //Double s= sc.nextDouble();
          //int   a = sc.nextInt();
        //employee z = new employee(n,s,a);
        //  دخل المستخدم القيم بعد ذلك استدعي الميثود الموجودة با استخدام جملة طباعة

      //  System.out.println(z.name);
      //  System.out.println(z.salary);
       // System.out.println(z.hireYear);
       // System.out.println(z.salary1());
       // System.out.println(z.period());

    }
}
