import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        ArrayList<Shape>search = new ArrayList<>();

            try {
        boolean t = true;
        while (t){
            System.out.println();
            System.out.println("--------------- to calculate area and circumference ---------------\n1-if you want Circle press 1 :\n2-if you want Tringle press 2 :\n3-if you want Rectangle press 3 :\n* if you want Exit Enter any number Large than 3 *");
            System.out.print("- Enter here Please -> :");
            int userChoice = input.nextInt();
            switch (userChoice){
                case 1:
                    System.out.println();
                    System.out.println("- Enter a radius:");
                    double choice = input.nextDouble();
                    Circle circle = new Circle(choice);
                    System.out.println(circle);
                    break;
                case 2:
                    System.out.println("- Enter a width:");
                    double width = input.nextDouble();
                    System.out.println("- Enter a base:");
                    double base = input.nextDouble();
                    Triangle triangle1 = new Triangle(width , base);
                    System.out.println(triangle1);
                    break;
                case 3:
                    System.out.println("- Enter a width:");
                    width = input.nextDouble();
                    System.out.println("- Enter a base:");
                    double height = input.nextDouble();
                    Rectangle rectangle1 = new Rectangle(width , height);
                    System.out.println(rectangle1);
                    break;
                default:
                    t = false;
                    break;

            }
        }
            }catch (InputMismatchException e){
                System.out.println("Please enter just numbers !");
            }
            }
        }

