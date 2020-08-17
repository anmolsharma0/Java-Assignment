interface  calculator
{
    int calculate(int a ,int b);

}

class cal{
    Operation add = (int a,int b) -> a+b;
    Operation difference = (int a , int b) -> a-b;
    Operation product = (int a, int b) -> a*b;
    Operation division = (int a , int b) -> b==0?0:a/b ;
}


public class calculation {
    public static void main(String[] args) {
        cal c = new cal();
        System.out.println(c.add.cal(2,3));
        System.out.println(c.difference.cal(4,2));
        System.out.println(c.product.cal(2,2));
        System.out.println(c.division.cal(4,2));
    }
