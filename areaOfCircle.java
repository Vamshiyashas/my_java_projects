import java.util.Scanner;

class areaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
		double pi=22/7;

        double area;
        area=pi*radius*radius;


            System.out.println("The area of the circle with radius " + radius + " is: " + area);
        }
    }


