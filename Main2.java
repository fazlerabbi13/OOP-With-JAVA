abstract class Man {
    abstract void walking();
    abstract void running();
}

class Man1 extends Man{
    @Override
    void walking(){
        System.out.println("man is walking");
    }

    @Override
    void running(){
        System.out.println("man is running");
    }
}

public class Main2{
    public static void main(String[] args) {
        Man man = new Man1();
        man.walking();
        
    }
}