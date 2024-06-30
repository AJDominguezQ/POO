import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendaciones;
import com.aluracursos.screenmatch.modelos.Episodios;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula= new Pelicula(); // nuestro tipo de dato que acabamos de crear.
        miPelicula.setNombre("Encanto"); // aqui le atribuimos valores a ese objeto.
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);


        miPelicula.muestaFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones()); // ya no estamos accediendo directamente a un atributro pero si a un metodo al cual estamos dando al usuario un permiso.
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestaFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre(" Matrix");
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(180);


        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();  //polimorfismo es que podemos hacer referencia de la misma cosa pero de diferente manera
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos estas vacaciones " +calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendaciones filtroRecomendacion = new FiltroRecomendaciones();
        filtroRecomendacion.filtra(miPelicula);

        Episodios episodio = new Episodios();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);

        filtroRecomendacion.filtra(episodio);

        var peliculaDeArmando = new Pelicula(); // el var hace una inferencia del tipo de dato del objeto del lado derecho.
        peliculaDeArmando.setNombre("El señor de los anillos");
        peliculaDeArmando.setDuracionEnMinutos(180);
        peliculaDeArmando.setFechaDeLanzamiento(2001);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeArmando);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("tamaño de la lista: " + listaDePeliculas.size()); // te da el tamaño de la lista.
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre()); // te da los items de la lista y el parentesis pones que el numero del items que quieres imprimir.
        System.out.println(listaDePeliculas.toString());

        System.out.println("toString de la pelicula: " +listaDePeliculas.get(0).toString());







    }
}
