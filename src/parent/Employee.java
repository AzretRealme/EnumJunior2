package parent;

public abstract class Employee {

    private Rank rank;
    private Sphere sphere;
    private String name;
    private int age;
    private double salary;

    public Sphere getSphere() {
        return sphere;
    }

    public void setSphere(Sphere sphere) {
        this.sphere = sphere;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee() {

    }

    public Employee(Rank rank, Sphere sphere, String name, int age, double salary) {
        this.rank = rank;
        this.sphere = sphere;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Rank getRank() {
        return rank;
    }

    public void Work(){
        System.out.println(" Emloyee - awesome writing.  ---" + getName() + ", ЗАРПЛАТА: " + getSalary() + ", ВОЗРАСТ: " + getAge());
    }

   public void goToVacation(){
       System.out.println(" parent.Employee say: I am going to Sochi ");
   }

    abstract public void goToDayOff();
    abstract public void printDeveloperGrade();

}
