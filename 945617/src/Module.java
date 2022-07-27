

public class Module {

    private String moduleCode;
    private String moduleName;
    private double grade;

    @Override
    public String toString() {
        return "Module Code: " + moduleCode + ", " + "Module Name: " +  moduleName + ", " + "Grade: " + grade + "\n";
    }

    public Module(String moduleCode, String moduleName, double grade) {
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
        this.grade = grade;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
