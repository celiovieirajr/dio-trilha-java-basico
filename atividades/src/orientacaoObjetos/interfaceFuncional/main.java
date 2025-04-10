package orientacaoObjetos.interfaceFuncional;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class main {

    public static void main(String[] args) {

        List<User> users = List.of(new User("Célio", 29),
                new User("Lucas", 18),
                new User("Eduardo", 21));

//        users.forEach(user -> System.out.println(user));   // Lambda
        printStringValue(User::name, users);
        printStringValue(user -> String.valueOf(user.age()), users);

    }

    private static void printStringValue(Function<User, String> callback, List<User> users) {
        users.forEach(u -> System.out.println(callback.apply(u)));
    }
}
