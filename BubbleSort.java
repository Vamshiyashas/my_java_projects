import java.util.Scanner;

class BubbleSort {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        if (n == 0 || n == 1) {
            System.out.println("it should be a valid number from 2 onwards");

        } else {
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            System.out.println("Sorted Array:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

        }

    }
}

