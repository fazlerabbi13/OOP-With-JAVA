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

public class Main{
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle.calculateArea());
    }
}