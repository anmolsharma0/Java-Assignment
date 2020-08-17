import java.util.Scanner;

class Rectangle{
    int width;
    int height;

    Rectangle(int a,int b)
    {
        width = a;
        height = b;
    }

    void display()
    {
        System.out.println(width + " " + height);
    }
}
class RectangleArea extends Rectangle
{
    RectangleArea(int a, int b) {
        super(a,b);
    }

    void read_input()
    {
        Scanner sc = new Scanner(System.in);

        super.width = sc.nextInt();
        super.height = sc.nextInt();
    }

    void display()
    {
        super.display();
        System.out.println(super.width*super.height);
    }


}


public class Area {


    public static void main(String [] args) {

        RectangleArea obj = new RectangleArea(0,0);

        obj.read_input();
        obj.display();
    }


}
