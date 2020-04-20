package domain;
/**
 * Class that represent a manager
 * @author asus
 */
public class Manager extends Employee {
    /**
     * 
     * @param employees all employees
     * @param name manager's name
     * @param jobTitle manager's job title
     * @param level manager's level
     * @param dept manager's department name
     */

    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }
/**
 * Method that returns manager's information
 * @return manager's information
 */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }
/**
 * Constructor that accepts all employees
 * @param employees employees array
 */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;
/**
 * Method that returns all employee's names
 * @return all employee's names
 */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }
/**
 * Method that sets employees to the manager's employee's list
 * @param employees employee's array
 */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
    /**
     * Method that returns employee's list
     * @return employee's list
     */

    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
