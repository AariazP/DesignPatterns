package org.alejandroArias.model;

public class Cine {

    //Componentes genericos de un cine
    private Pelicula pelicula;
    private Sala sala;
    private SistemaProyeccion sistemaProyeccion;
    private SistemaSonido sistemaSonido;
    private SistemaLuces sistemaLuces;



    public Cine(Pelicula pelicula, Sala sala, SistemaProyeccion sistemaProyeccion, SistemaSonido sistemaSonido,
                SistemaLuces sistemaLuces) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.sistemaProyeccion = sistemaProyeccion;
        this.sistemaSonido = sistemaSonido;
        this.sistemaLuces = sistemaLuces;
    }

    /*
      En este punto es donde se implementa el patron de diseño Facade
     */
    public void encenderCine(){
        sistemaLuces.encender();
        sistemaProyeccion.encender();
        sistemaSonido.encender();
        sistemaLuces.ajustarBrillo();
    }



    public void reproducirPelicula() {
        sistemaProyeccion.reproducirPelicula(pelicula);
        sistemaSonido.ajustarVolumen();
    }

    public void detenerPelicula() {
        sistemaSonido.apagar();
        sistemaProyeccion.apagar();
    }


    //geters and seters

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public SistemaProyeccion getSistemaProyeccion() {
        return sistemaProyeccion;
    }

    public void setSistemaProyeccion(SistemaProyeccion sistemaProyeccion) {
        this.sistemaProyeccion = sistemaProyeccion;
    }

    public SistemaSonido getSistemaSonido() {
        return sistemaSonido;
    }

    public void setSistemaSonido(SistemaSonido sistemaSonido) {
        this.sistemaSonido = sistemaSonido;
    }

    public SistemaLuces getSistemaLuces() {
        return sistemaLuces;
    }

    public void setSistemaLuces(SistemaLuces sistemaLuces) {
        this.sistemaLuces = sistemaLuces;
    }
}
