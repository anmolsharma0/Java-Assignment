class Circle{
    private double radius = 1.0;
    private String  color = "red";
    Circle(){};
    Circle(Double r)
    {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea()
    {
        return radius*radius;
    }
}

public class circ {
    public static void main(String[] args) {
        Circle obj = new Circle(5.00);
        System.out.println("Radius - " +obj.getRadius() );
        System.out.println("Area - " +obj.getArea());
    }

}
