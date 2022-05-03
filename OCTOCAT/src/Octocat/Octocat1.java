package Octocat;

class Octo {
    void actividad(){
        System.out.println("Estoy activo...");
    }
}
class jetpack extends Octo {

    @Override
    void actividad() {
        System.out.println("Estoy volando con mi JetPack");
    }
}

class yoga extends Octo {
    @Override
    void actividad() {
        System.out.println("Estoy haciendo Yoga");
    }
}

class Manufacture extends Octo{
    @Override
    void actividad() {
        System.out.println("Estoy en la maquila esperando las utilidades");
    }
}

class Topgun extends Octo{
    @Override
    void actividad() {
        System.out.println("Estoy volando en mi Kawasaki Ninja");
    }
}

class Luchador extends Octo{
    @Override
    void actividad() {
        System.out.println("Estoy peleando en la AAA");
    }
}

class Surf extends Octo{
    @Override
    void actividad() {
        System.out.println("Estoy Surfeando");
    }
}

public class Octocat1 {
    public static void main(String[] args) {
       Octo Octogato;
       Octogato = new Octo();
       Octogato.actividad();
       Octogato = new jetpack();
       Octogato.actividad();
       Octogato = new yoga();
       Octogato.actividad();
       Octogato= new Manufacture();
       Octogato.actividad();
       Octogato= new Topgun();
       Octogato.actividad();
       Octogato= new Luchador();
       Octogato.actividad();
       Octogato= new Surf();
       Octogato.actividad();

    }
}


