interface Shape{
    double calculateArea();
}

class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }
}