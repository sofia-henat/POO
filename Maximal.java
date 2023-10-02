public class Maximal extends Transformer{
    
    int ArcoFlechas = 5; //Unidades de ataque
    int BlasterIones = 8; //Unidades de ataque

    @Override
    public int ataquesEspeciales(){
        System.out.println("Se gano un ataque especial");
        int combo = (golpeAlto * 2) + patada; //Daño de los tres golpes basicos
        return combo;
    }

    public Maximal(){ //Metodo constructor de la clase hija
        this.resistencia = 1400; //Se inicializa la resistencia
        this.nombre = "Optimus primal";
    } 
}
