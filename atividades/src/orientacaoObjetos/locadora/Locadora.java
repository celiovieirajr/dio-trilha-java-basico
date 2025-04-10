package orientacaoObjetos.locadora;

import orientacaoObjetos.locadora.locacao.LocationMovie;
import orientacaoObjetos.locadora.locacao.Movies;

import java.util.List;

public class Locadora {

    public static void main(String[] args) {

        Movies movies = new Movies();
        movies.setName("O poço");
        movies.setGender("Terror");
        movies.setPrice(22.20);

        LocationMovie location = new LocationMovie();

//        System.out.println(location.releaseMovie(movies));
    }
}
