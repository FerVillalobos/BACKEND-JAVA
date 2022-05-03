package Personajes;

public class Personaje {
    private String casa, genero, nombre, boggart, patronus;

    public Personaje(String casa, String genero,String nombre, String boggart, String patronus){
        this.casa = casa;
        this.genero = genero;
        this.nombre = nombre;
        this.boggart = boggart;
        this.patronus = patronus;
        System.out.println(casa +"\n"+genero + "\n"+nombre + "\n"+patronus+"\n");
    }

}

