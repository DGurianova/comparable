import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTwo {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee employeeOne = new Employee(11, "Maria", "Ivanova", 12000);
        Employee employeeTwo = new Employee(25, "Anna", "Nikolaeva", 14000);
        Employee employeeThree = new Employee(3, "Alex", "Ivanov", 16000);
        Employee employeeFour = new Employee(4, "Olga", "Alexandrova", 10700);

        list.add(employeeOne);
        list.add(employeeTwo);
        list.add(employeeThree);
        list.add(employeeFour);

        System.out.println("Before sorting \n" + list);
        Collections.sort(list);
        System.out.println("After sorting \n" + list);

    }
}

class Employee implements Comparable<Employee> { // zum Vergleich von Objekten anhang der natürlichen Ordnung int CompareTo(Element e)
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
   /* public int compareTo(Employee anotherEmployee) { //return this.id-anotherEmployee.id // return this.id.compareTo(anotherEmployee.id) (if Integer) - natural order
        if (this.id == anotherEmployee.id) {
            return 0;
        }
        if (this.id < anotherEmployee.id) {
            return -1;
        } else {
            return 1;
        }
    }*/

  /*  public int compareTo(Employee anotherEmployee) {
        return this.id-anotherEmployee.id;
}*/

    public int compareTo(Employee anotherEmployee) {
        return this.name.compareTo(anotherEmployee.name);
    }
}
