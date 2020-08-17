import java.util.ArrayList;

class Employee
{
    String empname, empYearOfJoin , empAddress;

    Employee(){};
    Employee(String name, String year , String address)
    {
        empname = name;
        empYearOfJoin = year;
        empAddress = address;
    }



}

class contain{

    void output(ArrayList<Employee> s)
    {
        System.out.printf("%-10s %-12s %-10s\n","Name","Year of joining","Address");
        for(Employee i : s)
        {
            System.out.printf("%-10s %-12s %-10s\n",i.empname,i.empYearOfJoining,i.empAddress);
        }
    }
}

public class detail {
    public static void main(String[] args) {
        contain obj = new contain();
        ArrayList<Employee> lis = new ArrayList<>();
        lis.add(new Employee("Robert","1994","64C- WallStreet"));
        lis.add(new Employee("Sam","2000","68D- WallStreet"));
        lis.add(new Employee("john","1999","26B- WallStreet"));
        obj.output(lis);
    }
}
