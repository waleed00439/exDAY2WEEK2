import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {


            Scanner in = new Scanner(System.in);
            System.out.println("Enter your first number");
            int num1 = (in.nextInt());
            System.out.println("Enter your second number");
            int num2 = (in.nextInt());
            System.out.println("Choose your operation");
            String operation = (in.next());
            if (operation.equals("+")) {
                System.out.println(num1 + num2);
            } else if (operation.equals("-")) {
                System.out.println(num1 - num2);
            } else if (operation.equals("*")) {
                System.out.println(num1 * num2);
            } else if (operation.equals("/")) {
                System.out.println(num1 / num2);
            } else if (operation.equals("%")) {
                System.out.println(num1 & num2);

            } else System.out.println("worng");


        } catch (Exception e) {
            System.out.println("erorr");
        }

    }}