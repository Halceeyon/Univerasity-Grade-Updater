import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    private String studyProgramme;
    private int numberOfModules;

    private ArrayList<Module> modules;

    public Student(String firstName, String lastName, String studyProgramme, int numberOfModules) {

        modules = new ArrayList<Module>();

        this.firstName = firstName;
        this.lastName = lastName;
        this.studyProgramme = studyProgramme;
        this.numberOfModules = numberOfModules;

    }

    public void addModule(String code, String name, double grade) {

        Module m = new Module(code, name, grade);
        modules.add(m);
    }

    public void updateGrade(String moduleCode, double newGrade) {

        for (Module m : modules) {
            String codeOfModule = m.getModuleCode();

            if (codeOfModule.equals(moduleCode)) {
                m.setGrade(newGrade);
            }
        }
    }

    @Override
    public String toString() {

        String moduleInfo = "";

        for (Module m: modules) {
            moduleInfo += m.toString();
        }

        return "Student Name - " + firstName + " " + lastName + '\n'
                + "Course - " + studyProgramme + '\n' + moduleInfo + '\n';

    }
}

