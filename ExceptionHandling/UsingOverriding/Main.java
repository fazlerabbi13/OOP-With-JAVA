

class SuperClass {

    // SuperClass doesn't declare any exception
    void method()
    {
        System.out.println("SuperClass");
    }
}

// SuperClass inherited by the SubClass
// class SubClass extends SuperClass {

//     // method() declaring Unchecked  Exception ArithmeticException
//     void method() throws ArithmeticException
//     {

//         // ArithmeticException is of type Unchecked Exception
//         System.out.println("SubClass");
//     }

   
// }
public class Main {
     public static void main(String args[])
    {
        SuperClass s = new SubClass();
        s.method();
    }
}
