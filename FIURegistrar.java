import javax.swing.JOptionPane;
/**
 * Description: Creates an array of Student objects and sorts through to find the lowest/highest gpa, and students over the average gpa.
 */
public class FIURegistrar {

    /**
     * Description: Calls 2 methods in order to record student data, and print out the students with the highest/lowest gpa, and students with an above average gpa.
     */
    public static void main(String[] args){

        Student[] studentList = createArrayOfStudents();

        processArrayOfStudents(studentList);
    }

    /**
     * Description: Asks user how many students they'd like to add info for, and creates Student class objects based on their inputs for the student's data.
     * @return students
     * Precondition: The user has started the program.
     * Postcondition: An array of Student objects is created and student info is stored within.
     */
    public static Student[] createArrayOfStudents(){

        String firstName, lastName;
        int pantherId, j=1;
        double gpa;
        int size = Integer.parseInt(JOptionPane.showInputDialog("How many students would you like to create?"));
        Student[] students = new Student[size];

        for(int i = 0; i < size; i++){
            firstName = JOptionPane.showInputDialog("What is student " + j + "'s first name?");
            lastName = JOptionPane.showInputDialog("What is student " + j + "'s last name?");
            pantherId = Integer.parseInt(JOptionPane.showInputDialog("What is student " + j + "'s panther id?"));
            gpa = Double.parseDouble(JOptionPane.showInputDialog("What is student " + j + "'s gpa?"));

            students[i] = new Student(firstName, lastName, pantherId, gpa);
            j++;
        }
        return students;
    }

    /**
     * Description: Displays the students with the lowest/highest gpa, and the students with a gpa above the average
     * @param ar1, array of student objects
     * Precondition: An array of Student objects was created
     * Postcondition: For loop sorts through the array, and displays the students with the lowest/highest gpa, and students with an above average gpa.
     */
    public static void processArrayOfStudents(Student[] ar1){

        int size = ar1.length, j=1;
        double min = ar1[0].getGpa();
        double max = ar1[0].getGpa();
        int lowestGpa = 0;
        int highestGpa = 0;
        double sumGpa = 0;
        for(int i = 0; i < size; i++){
            JOptionPane.showMessageDialog(null,"Student " + j + "'s Info: " + ar1[i].toString());
            if(ar1[i].getGpa() > max){
                max = ar1[i].getGpa();
                highestGpa = i;
            }
            if(ar1[i].getGpa() < min){
                min = ar1[i].getGpa();
                lowestGpa = i;
            }
            sumGpa += ar1[i].getGpa();
            j++;
        }
        double average = sumGpa/size;

        JOptionPane.showMessageDialog(null, "The average GPA was: " + average);
        JOptionPane.showMessageDialog(null, "The student with the highest GPA was " + ar1[highestGpa].getFirstName() + " " + ar1[highestGpa].getLastName());
        JOptionPane.showMessageDialog(null, "The student with the lowest GPA was " + ar1[lowestGpa].getFirstName() + " " + ar1[lowestGpa].getLastName());

        String aboveAverage = "The students with a GPA above the average are: \n";

        for(int n = 0; n < size; n++){
            if(ar1[n].getGpa() > average){
                aboveAverage += (ar1[n].getFirstName() + " " + ar1[n].getLastName() + "\n");
            }
        }
        JOptionPane.showMessageDialog(null, aboveAverage);
    }
}
