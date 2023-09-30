public class Autobot extends Transformer{ //Raza
    
    int EspadaPrime = 8; //Unidades de ataque
    int HachaEnergón = 10; //Unidades de ataque
    
    @Override
    void ataquesEspeciales(){
    }

    public Autobot(){ //Metodo constructor de la clase hija
        this.resistencia = 1200; //Se inicializa la resistencia
        this.nombre = "Optimus Prime";
    } 
}
