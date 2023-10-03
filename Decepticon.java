public class Decepticon extends Transformer{ //Raza

    @Override
    public int ataquesEspeciales(){
        System.out.println("Se gano un ataque especial");
        int combo = (golpeAlto * 2) + patada; //Daño de los tres golpes basicos
        return combo;
    }
    
    public Decepticon(){ //Metodo constructor de la clase hija
        setResistencia(1200); //Se inicializa la resistencia
        this.raza = "Decepticon";
        this.nombre = "Megatron";
        //Se escoge un arma en base a su raza
        Arma arma = new Armas(this.raza);
    } 

    public Decepticon(String Lider){
        setResistencia(1200); //Se inicializa la resistencia
        resistenciaInicial = 1200;//Se guarda la resistencia inicial
        this.raza = "Decepticon";
        this.nombre = "Megatron Lider";
        //Se escoge un arma en base a su raza
        Arma arma = new Armas(this.raza);
    }
}
