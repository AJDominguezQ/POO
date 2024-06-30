package com.aluracursos.screenmatch.modelos;

// Es la clase base  que cintiene los atributos y metodos comunes a las peliculas y series.
public class Titulo {

    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    public String getNombre(){
        return nombre;
    }
    public int getFechaDeLanzamiento (){
        return  fechaDeLanzamiento;
    }
    public int getDuracionEnMinutos(){
        return  duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan(){
        return incluidoEnElPlan;
    }


    public void setNombre(String nombre) {  //Se hace el metodo para el atributo "nombre"
        this.nombre = nombre;
    }
    // el this nos hace referencia al atributo de la clase y no al valor que ingresara el usuario mas adelante
    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int  getTotalDeLasEvaluaciones(){

        return totalDeLasEvaluaciones;
    }      // una convension de codigo para cuando queremos obtemer algo "get"

    public void muestaFichaTecnica(){
        System.out.println("El nombre de la pelucula es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
    }

    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota ;
        totalDeLasEvaluaciones++; //cada vez que realicemos una evaluacion este nos va a sumar ese total de las evaluaciones

    }
    public double calculaMedia(){

        return sumaDeLasEvaluaciones/ totalDeLasEvaluaciones;
    }
}
