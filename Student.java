/**
 * Contains all variables and setter/getter functions for the Student class.
 * Constructor initialized variables based on user input.
 */
public class Student {

    private String firstName;
    private String lastName;
    private int pantherId;
    private double gpa;

    public Student(String firstName, String lastName, int pantherId, double gpa){
        this.firstName = firstName;
        this.lastName = lastName;
        this.pantherId = pantherId;
        this.gpa = gpa;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public void setPantherId(int pantherId){
        this.pantherId = pantherId;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getPantherId(){
        return pantherId;
    }

    public double getGpa(){
        return gpa;
    }

    @Override
    public String toString(){
        return ("First Name: " + firstName + ",Last Name: " + lastName + ",Panther ID: " + pantherId + "" +
                ",GPA: " + gpa);
    }
}
