interface Shape{
    double calculateArea();
}

class Circle implements Shape{
    private double radius;

    // constructor
    public Circle(double radius){
        this.radius=radius;
    }
    // Implementing the abstract method from the Shape interface
    
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}

class Ractangle implements Shape{
    private double length;
    private double width;

    public Ractangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    
    public double calculateArea(){
        return length*width;
    }
}
public class Main{
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle.calculateArea());

        Ractangle ractangle = new Ractangle(5.0,6.0);
        System.out.println(ractangle.calculateArea());
    }
}