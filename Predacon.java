public class Predacon extends Transformer implements Predaconi{ //Raza
    int Taladro = 6; //Unidades de ataque

    @Override
    public int ataquesEspeciales(){
        System.out.println("Se gano un ataque especial");
        int combo = (golpeAlto * 2) + patada; //Daño de los tres golpes basicos
        return combo;
    }

    public Predacon(){ //Metodo constructor de la clase hija
        this.resistencia = 1000; //Se inicializa la resistencia
        this.nombre = "Razorclaw";
    } 
}
