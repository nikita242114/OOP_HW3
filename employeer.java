import java.util.Comparator;
 
public class Employee implements Comparable<Employee> {
 
    private int id;
    private String name;
    private int age;
    private long salary;
 
    public int getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
 
    public long getSalary() {
        return salary;
    }
 
    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
 
    @Override
    public int compareTo(Employee emp) {
        return (this.id - emp.id);
    }
 
    @Override
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" + this.salary + "]";
    }
 
    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {
 
        @Override
        public int compare(Employee e1, Employee e2) {
            return (int) (e1.getSalary() - e2.getSalary());
        }
    };
 
    public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {
 
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getAge() - e2.getAge();
        }
    };
   
    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
 
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
}