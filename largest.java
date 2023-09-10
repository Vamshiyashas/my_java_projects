import java.util.Scanner;

class largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int var1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int var2 = scanner.nextInt();
        if (var1 == var2) {
            System.out.println("both the numbers are same");
        } else {
            if (var1 > var2) {
                System.out.println("The largest number is: " + var1);
            } else {
                System.out.println("The largest number is: " + var2);
            }
        }

    }
}

