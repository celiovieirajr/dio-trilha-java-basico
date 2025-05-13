package orientacaoObjetos.generics;

public class Box<T> {
    // T representa "Type"
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
