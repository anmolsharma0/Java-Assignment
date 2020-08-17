class strr extends Exception{
    strr(String s){
        super(s);
    }
}

class generics{

    <T>T method( T element) throws strr
    {
        if(element.getClass().getName() == "java.lang.String")
            throw new strr("String entred");
        else
            return element;
    }
}


public class gen {
    public static void main(String[] args) {
       generics test = new generics();

        try{
            System.out.println(test.method("z"));
        }
        catch (Exception a){
            System.out.println("Exception Occured : " + a);
        }

        try{
            System.out.println(test.method(30));
        }
        catch (Exception b){
            System.out.println("Exception Occured : " + b );
        }


    }

}
