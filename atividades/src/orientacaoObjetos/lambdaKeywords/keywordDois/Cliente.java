package orientacaoObjetos.lambdaKeywords.keywordDois;

public class Cliente {

    private static String staticName;
    private String name;

    public String getStaticName() {
        return staticName;
    }

    public static void setStaticName(String staticName) {
        Cliente.staticName = staticName;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
