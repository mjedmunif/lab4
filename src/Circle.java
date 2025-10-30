public class Circle extends Shape{

     private double radius;


     public Circle(double radius){
         this.radius = radius;
     }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

//    todo 3.14 * radius * radius
    double pi = 3.14;
    @Override
    public double calculateArea() {
         return pi * radius * radius;
    }


//    todo 3.14 * 2 * radius
    @Override
    public double calculateCircumference() {
     return pi * 2 * radius;
    }


    @Override
    public String toString() {
        return "The ares for circle = " + calculateArea() + ", and Circumference = " + calculateCircumference();
    }
}
