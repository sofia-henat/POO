public class Maximal extends Transformer{
    
    int ArcoFlechas = 5; //Unidades de ataque
    int BlasterIones = 8; //Unidades de ataque

    @Override
    void ataquesEspeciales(){
    }

    public Maximal(){ //Metodo constructor de la clase hija
        this.resistencia = 1400; //Se inicializa la resistencia
        this.nombre = "Optimus primal";
    } 
}
