package orientacaoObjetos.locadora.locacao;

public class LocationMovie implements Movie{


    public LocationMovie() {
    }

    @Override
    public void reseveMovie(Movies movies) {
        System.out.println(movies.getName() + " reservado");
        System.out.println(movies.getPrice() + " preço a ser pago.");
    }

    @Override
    public void releaseMovie(Movies movies) {
        System.out.println("Filme liberado reserva");
    }

}
