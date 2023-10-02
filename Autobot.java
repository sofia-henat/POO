public class Autobot extends Transformer{ //Raza
    
    int EspadaPrime = 8; //Unidades de ataque
    int HachaEnergón = 10; //Unidades de ataque
    
    @Override
    public int ataquesEspeciales(){
        System.out.println("Se gano un ataque especial");
        int combo = (golpeAlto * 2) + patada; //Daño de los tres golpes basicos
        return combo;
    }

    public Autobot(){ //Metodo constructor de la clase hija
        this.resistencia = 1200; //Se inicializa la resistencia
        this.nombre = "Optimus Prime";
    } 
}
