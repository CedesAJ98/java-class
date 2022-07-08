import java.util.Scanner;

public class App {

    public static void main(String[]args)
    {
        System.out.println("SIMPLE CALCULATOR ");
        System.out.println("=================");
        SimpleCalculator calc;
        Scanner sc = new Scanner(System.in);
        int operation;
        loop:do
        {
            printMenu();
            operation = sc.nextInt();
            switch(operation)
            {
                case 1:
                    System.out.print("\nEnter the 1st number: ");
                    double add1 = sc.nextDouble();
                    System.out.print("Enter the 2nd number: ");
                    double add2 = sc.nextDouble();
                    calc = new SimpleCalculator(add1, add2);
                    System.out.println(calc.add());
                    break;

                case 2:
                    System.out.print("\nEnter the 1st number: ");
                    double sub1 = sc.nextDouble();
                    System.out.print("Enter the 2nd number: ");
                    double sub2 = sc.nextDouble();
                    calc = new SimpleCalculator(sub1, sub2);
                    System.out.println(calc.subtract());
                    break;

                case 3:
                    System.out.print("\nEnter the 1st number: ");
                    double mul1 = sc.nextDouble();
                    System.out.print("Enter the 2nd number: ");
                    double mul2 = sc.nextDouble();
                    calc = new SimpleCalculator(mul1, mul2);
                    System.out.println(calc.multiply());
                    break;

                case 4:
                    System.out.print("\nEnter the 1st number: ");
                    double div1 = sc.nextDouble();
                    System.out.print("Enter the 2nd number: ");
                    double div2 = sc.nextDouble();
                    if(div2 == 0)
                    {
                        System.out.println("The quotient is Undefined\n");
                        break;
                    }
                    calc = new SimpleCalculator(div1, div2);
                    System.out.println(calc.divide());
                    break;

                case 5:
                    System.out.println("\nThank you! Have a good day!");
                    System.exit(0);

                default:
                    System.out.println("\nInvalid selection. Please try again...\n");
            }
        }while(operation != 5);
    }

    public static void printMenu()
    {
        System.out.print("1. Add"
                + "\n2. Subtract"
                + "\n3. Multiply"
                + "\n4. Divide"
                + "\n5. Exit"
                + "\nEnter your choice: ");
    }
}