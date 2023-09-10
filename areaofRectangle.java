import java.util.Scanner;

class areaofRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int var1 = scanner.nextInt();
        System.out.print("Enter the breadth: ");
        int var2 = scanner.nextInt();
       int area=var1*var2;
       System.out.println("the area of rect is"+area);
    }
}
