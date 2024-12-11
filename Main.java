import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dlugosc boku a: ");
        double a = scanner.nextDouble();
        System.out.print("Podaj dlugosc boku b: ");
        double b = scanner.nextDouble();
        System.out.print("Podaj dlugosc boku c: ");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            Triangle triangle = new Triangle(a, b, c);
            int variable;
            do {
                System.out.println("1.perimeter, 2.area, 3.type, 4.exit ");
                variable = scanner.nextInt();
                switch (variable) {
                    case 1 -> System.out.println("perimeter: " + triangle.perimeter());
                    case 2 -> {
                        System.out.print("area: ");
                        System.out.printf("%.2f\n", triangle.area()); // reduce double to 2 decimal places
                    }
                    case 3 -> System.out.println("type: " + triangle.typeOfTriangle());
                    default -> System.out.println("invalid number");
                }
            } while (variable != 4);
            System.out.print("the program is complete");
        } else System.err.println("impossible to create a triangle");
    }
}
