package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo  implements Clasificacion {

    private  String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {   // solo llamando al metodo que se implemento en la clase es como se puede utilizar la misma clase.
        return (int) (calculaMedia()/2); // casteo para pasar de un tipo de dato a otro.


    }

    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + " (" + getFechaDeLanzamiento() + ") ";
    }
}




