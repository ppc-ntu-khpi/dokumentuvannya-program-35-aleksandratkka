package domain;
/**
 * Class that represents an employee
 * @author asus
 */
public class Employee {
    /**
     * Method that returns an information about employee
     * @return employee's information
     */

    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;
/**
 * Constructor that accepts information about employee
 * @param name employee's name
 * @param jobTitle employee's job title
 * @param level employee's level
 * @param dept department name
 */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }
/**
 * Method that returns employee's job title
 * @param job employee's job title
 */
    public void setJobTitle(String job) {
        jobTitle = job;
    }
/**
 * Method that returns employee's job title
 * @return employee's job title
 */
    public String getJobTitle() {
        return jobTitle;
    }
 /**
     * Method that returns employee's name
     * @return string with employee's name
  */
    public String getName() {
        return name;
    }
/**
 * Method that sets the employee's level
 * @param level int with level for employee
 */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
/**
 * Method that returns employee's level
 * @return employee's level
 */
    public int getLevel() {
        return level;
    }
/**
 * Method that returns employee's department name
 * @return employee's department name
 */
    public String getDept() {
        return dept;
    }
/**
 * Method that sets department name for the employee
 * @param dept depaartment name
 */
    public void setDept(String dept) {
        this.dept = dept;
    }
/**
 * Method that sets employee's name
 * @param name employee's name
 */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
