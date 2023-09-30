public class Decepticon extends Transformer{ //Raza
    int CañonFusion = 6; //Unidades de ataque
    int EspadaMegatron = 6; // 6 unidades de ataque

    @Override
    void ataquesEspeciales(){        
    }
    
    public Decepticon(){ //Metodo constructor de la clase hija
        this.resistencia = 1200; //Se inicializa la resistencia
        this.nombre = "Megatron";
    } 
}
