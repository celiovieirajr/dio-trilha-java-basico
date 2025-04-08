package orientacaoObjetos.heranca;

public class Home {
    public static void main(String[] args) {

//        Employee employee = new Employee();
        printEmployee(new Manager());
        printEmployee(new Salesman());

//        Salesman salesman = new Salesman();
//        Manager manager = new Manager();
//        Employee employee = new Employee();

//        String resultado = salesman.getClass() == manager.getClass() ? "Do mesmo tipo." : "Não é do mesmo tipo";
//        String resultado = salesman.getClass().equals(manager.getClass()) ? "Do mesmo tipo." : "Não é do mesmo tipo";
//
//        System.out.println(resultado);
    }


    public static void printEmployee(Employee employee) {

        System.out.println("================================================");
        switch (employee) {
            case Manager manager -> {
                    manager.setCode("1234");
                    manager.setName("Célio");
                    manager.setSalary(5000);
                    manager.setLogin("usuario");
                    manager.setPassword("1234");
                    manager.setComission(1200);


                System.out.println(manager.getCode());
                System.out.println(manager.getName());
                System.out.println(manager.getSalary());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getComission());
            }
            case Salesman salesman -> {
                salesman.setCode("5678");
                salesman.setName("João");
                salesman.setSalary(1500);
                salesman.setPercentPerSold(10);

                System.out.println(salesman.getCode());
                System.out.println(salesman.getName());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getPercentPerSold());

            }
            default -> throw new IllegalStateException("Unexpected value: " + employee);
        }
        System.out.println("================================================");

    }
}
