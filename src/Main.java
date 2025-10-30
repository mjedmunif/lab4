import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        while (true){
            System.out.println();
            System.out.println("--------------- to calculate area and circumference  ------------------\nif you want Circle press 1 :\nif you want tringle press 2 :\nif you want rectangle press 3 :");
            int userChoice = input.nextInt();
            switch (userChoice){
                case 1:
                    System.out.println("Enter a radius:");
                    double choice = input.nextDouble();
                    Circle circle2 = new Circle(choice);
                    System.out.println(circle2);
                    break;
                case 2:
                    System.out.println("Enter a width:");
                    double width = input.nextDouble();
                    System.out.println("Enter a base:");
                    double base = input.nextDouble();
                    Triangle triangle1 = new Triangle(width , base);
                    System.out.println(triangle1);
                    break;
                case 3:
                    System.out.println("Enter a width:");
                    double width1 = input.nextDouble();
                    System.out.println("Enter a base:");
                    double height = input.nextDouble();
                    Rectangle rectangle1 = new Rectangle(width1 , height);
                    System.out.println(rectangle1);
                    break;
                default:
                    break;

            }
        }
            }
        }

