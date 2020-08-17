import java.util.Scanner;
import java.util.SortedMap;

class Complex{
    int real = 0;
    int img =0 ;
    Complex(){};

    Complex(int r,int i)
    {
        real = r;
        img =i;
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type real and img part");
        real = sc.nextInt();
        img = sc.nextInt();
    }

    void printComplex()
    {
        if(img > 0)
            System.out.println(real+"+"+img+"i");
        else if(img == 0)
            System.out.println(real);
        else
            System.out.println(real+""+img+"i");
    }

    void get(int r , int i) 
    {
        if(i > 0)
            System.out.println(r+"+"+i+"i");
        else if(i == 0)
            System.out.println(r);
        else
            System.out.println(r+""+i+"i");
    }

    void Sum(Complex z)
    {
        int tempReal = real + z.real;
        int tempimg = img + z.img;
        get(tempReal,tempimg);

    }

    void Diff(Complex z)
    {
        int tempReal = real - z.real;
        int tempimg = img - z.img;
        get(tempReal,tempimg);
    }


    void Product(Complex z)
    {
        int tempReal = (real*z.real) - (img*z.img);
        int tempimg = (real*z.img) + (img*z.real);
        get(tempReal,tempimg);
    }
}


public class solution {
    public static void main(String[] args) {
        Complex obj1 = new Complex();
        Complex obj2 = new Complex();

        System.out.println("Type 1st no");
        obj1.input();
        System.out.println("Type 2nd no ");
        obj2.input();

        System.out.println("Sum ");
        obj1.Sum(obj2);
        System.out.println("Difference ");
        obj1.Diff(obj2);
        System.out.println("Product ");
        obj1.Product(obj2);
    }

}
