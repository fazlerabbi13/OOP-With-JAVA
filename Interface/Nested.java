interface Parent {
    interface Test {
        void show();
    }
}

class Child implements Parent.Test {
    public void show() {
        System.out.println("show method of interface");
    }
}


// Main Class
class Nested
{
    public static void main(String[] args)
    {
        Parent.Test obj;
        Child t = new Child();
        obj = t;
        obj.show();
    }
}
