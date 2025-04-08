package orientacaoObjetos.heranca;

public sealed class Employee permits Manager, Salesman {

    protected String code;
    protected String name;
    protected int age;
    protected double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public Employee() {
    }

    public Employee(String code, String name, int age, double salary) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setCode(String code) {
        this.code = code;
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
}
