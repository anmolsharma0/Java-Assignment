import java.util.ArrayList;

class Employee{

    int empid,empSalary;
    String empName,empDesignation,empLocation;

    Employee( int id , int salary, String name ,String designation, String location)
    {
        empid = id;
        empSalary = salary;
        empName = name;
        empDesignation = designation;
        empLocation = location;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public int getEmpid() {
        return empid;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public String getEmpLocation() {
        return empLocation;
    }

    public String getEmpName() {
        return empName;
    }
}

public class empp {

    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee(954466 ,"Mark","CEO","Jal"));
        emp.add(new Employee(654458 ,"Henry","Manager","Pune"));
        emp.add(new Employee(555445 ,"Tom","Worker","NewYork"));
        emp.add(new Employee(750455 ,"Jeff","Analyst","Mumbai"));
        emp.add(new Employee(845457 ,"Ron","Painter","Pkl"));
        emp.add(new Employee(458507 ,"Kim","Businessman","Dhm"));
        emp.add(new Employee(778259 ,"Wisley","Plumber","Haryana"));
        emp.add(new Employee(356876 ,"Gim","Marketer","Banglore"));
        emp.add(new Employee(754215 ,"Wiliam","Athlete","Ranchi"));
        emp.add(new Employee(212578,"Jerry","Cartoon","Washington"));

        emp.stream().forEach((c) -> System.out.print(c.empName+", "));
        System.out.println("");
        emp.stream().filter(i -> i.empSalary >50000).forEach(c -> System.out.print(c.empSalary+", "));
        System.out.println("");
        emp.stream().filter(i -> (i.empLocation.charAt(0) == 'M' || i.empLocation.charAt(0) == 'm')).forEach(c-> System.out.print(c.empLocation +", "));
        System.out.println("");
        emp.stream().filter(i -> (i.empDesignation.charAt(i.empDesignation.length()-1) == 'e' || i.empDesignation.charAt(i.empDesignation.length()-1) == 'E')).forEach(c-> System.out.print(c.empDesignation +", "));

    }
}
