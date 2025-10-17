 
public class CallConstructor {
    int age;
    String name;

    public CallConstructor(String name){
        this(2002, name);
    }

    public CallConstructor(int age, String name) {
       this.age=age;
       this.name=name;
    }

    public void printInfo(){
        System.out.println(age+ " " + name);
    }

    public static void main(String[] args) {
        CallConstructor c1 = new CallConstructor("Rabbi");
        CallConstructor c2 = new CallConstructor(2003,"r");

        c1.printInfo();
        c2.printInfo();
    }
}
