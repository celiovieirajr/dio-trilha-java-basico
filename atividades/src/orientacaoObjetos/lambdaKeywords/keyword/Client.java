package orientacaoObjetos.lambdaKeywords.keyword;

public class Client {

    private String name;

    private int age;

//    private Address address = new Address();


    protected String getName() {
//        System.out.println(address.getDescription());
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }
}
