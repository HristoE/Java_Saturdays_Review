package week11_review;

public class Developer extends Employee {
    public Developer(String name, int age, char gender, String employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+ " " +getName() + " is coding " );
    }

    public void unittesting (){
        System.out.println( getName()+ " is unit testing ");
    }
}
