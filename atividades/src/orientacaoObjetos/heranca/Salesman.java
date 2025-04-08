package orientacaoObjetos.heranca;

public non-sealed class Salesman extends Employee{

    public Salesman(String code, String name, int age, double salary, double percentPerSold) {
        super(code, name, age, salary);
        this.percentPerSold = percentPerSold;
    }

    public Salesman() {

    }

    @Override
    public String getCode() {
        return "SL" + this.code;
    }

    private double percentPerSold;

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }
}
