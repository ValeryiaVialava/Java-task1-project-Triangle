public class Triangle {
    private final double a, b, c ;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perimeter() {
        return a+b+c;
    }

    public double area() {
        double s = perimeter()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public String typeOfTriangle() {
        if (a == b && b == c) return "equilateral";
        else if (a == b || b == c || c == a) return "isosceles";
        else return "scalene";
    }
}
