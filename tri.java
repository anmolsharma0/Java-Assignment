import java.util.Scanner;

class Triangle{
    int a , b, c;

    void input()
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type the sides");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

    }

    int area()
    {
        return a*b*c;
    }
}

public class tri {
    public static void main(String[] args) {
        Triangle obj = new Triangle();
        obj.input();
        System.out.println("Area - " + obj.area());
    }
}
