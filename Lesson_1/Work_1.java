import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        int triangleNumber = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            triangleNumber += i;
            factorial *= i;
        }
        System.out.println("n-ое треугольное число: " + triangleNumber);
        System.out.println("n! = " + factorial);
    }
}