public class Triangle extends Shape{
        private double width;
        private double base;

        public Triangle(double width , double base){
            this.width = width;
            this.base = base;
        }

        public double getHeight() {
            return base;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width){
            this.width = width;
        }

        public void setHeight(double base){
            this.base = base;
        }


        @Override
        public double calculateArea() {
            return 0.5 * width * base;
        }

        @Override
        public double calculateCircumference() {
            return (base + 2) * width;
        }

    @Override
    public String toString() {
        return "The area for Tringle = " + calculateArea() + " , and perimeter = " + calculateCircumference();
    }
}


