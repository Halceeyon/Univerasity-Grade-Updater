import java.util.Scanner;

public class UserInteraction {

    public static void main(String[] args) {

        // Created Scanner object for user input
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = userInput.next(); // Gets whatever the user inputted and sets it to the variable firstName

        System.out.println("Enter your last name:");
        String lastName = userInput.next();

        System.out.println("What course are you studying?");
        userInput.nextLine();
        String studyProgramme = userInput.nextLine();

        System.out.println("How many modules are you studying?");
        int numberOfModules = userInput.nextInt();

        // Created a new student object to be able to access the code in that class
        Student student = new Student(firstName, lastName, studyProgramme, numberOfModules);

        System.out.println("Adding Modules details...\n");

        // For loop that gets the user to input their module code, name and grade
        for (int i = 0; i < numberOfModules; i++) {

            System.out.println("Please enter module code:");
            String moduleCode = userInput.next();

            System.out.println("Please enter module name");
            userInput.nextLine();
            String moduleName = userInput.nextLine();

            System.out.println("Please enter module grade (or 0 if no grade has been set):");
            double moduleGrade = userInput.nextDouble();

            student.addModule(moduleCode, moduleName, moduleGrade); // Obtains the users inputted information and adds it to the array list in the student class
        }

        System.out.println(""); // Puts a space between the inputted grades and the toString
        System.out.println(student.toString()); // Prints the users inputted information in the terminal using a layout made in a toString in the student class

        // For loop that gets the user to update their grades
        // and asks the user if they want to update any other grades
        // for a total of the amount of modules that they have
        for (int i = 0; i < numberOfModules; i++) {

            System.out.println("Please enter module code to update grade:");
            String theModuleCode = userInput.next();

            System.out.println("Please enter new grade:");
            double newGrade = userInput.nextDouble();

            student.updateGrade(theModuleCode, newGrade); // Obtains the users inputted information and updates the information in the array list

            if (i == numberOfModules - 1) {
                student.updateGrade(theModuleCode, newGrade);
                break; // Breaks the loop if the loop has run for the total amount of modules that the user has
            }

            System.out.println("Do you want to update another grade");
            String input = userInput.next();

            if (input.equals("no")) {
                student.updateGrade(theModuleCode, newGrade);
                break; // Breaks the loop if the user inputs "no" when asked if they want to update any other grades
            }
        }

        userInput.close();

        System.out.println(student.toString()); // Prints the users updated inputted information in the terminal using a layout made in a toString in the student class
    }
} // End of program
