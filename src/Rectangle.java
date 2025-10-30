public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width , double height){
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }


    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculateCircumference() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "The area for rectangle = " + calculateArea() + ", and the calculate Circumference = " + calculateCircumference();
    }
}
