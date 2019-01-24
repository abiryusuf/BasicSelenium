package selenium_practice;

public class EncapsulationConcept {

    private int ssn;
    private String name;
    private int age;

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        EncapsulationConcept encon = new EncapsulationConcept();
        encon.setSsn(123456);
        encon.setName("Kartick");
        encon.setAge(32);

        System.out.println("Employee ssn is-->"+encon.getSsn());
        System.out.println("Employee name is-->"+encon.getName());
        System.out.println("Employee ssn is-->"+encon.getAge());

    }
}
