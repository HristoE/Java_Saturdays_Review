package week11_review;

public class Tester extends Employee {
    public Tester(String name, int age, char gender, String employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void smokeTesting(){
        System.out.println( getJobTitle() + getName()+ "is working");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " +getName() +" is testing ");
    }
}
