package exececoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExececoes {
    public static void main(String[] args) throws ParseException {
//        Number valor = Double.valueOf("a1.75");
        try {
            Number valor = NumberFormat.getInstance().parse("a1.75");
        } catch (ParseException e) {
            e.printStackTrace();
        }


//        System.out.println(valor);


    }
}
