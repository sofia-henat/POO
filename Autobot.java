public class Autobot extends Transformer{ //Raza//
    
    @Override
    public int ataquesEspeciales(){
        System.out.println("Se gano un ataque especial");
        int combo = (golpeAlto * 2) + patada; //Daño de los tres golpes basicos
        return combo;
    }

    public Autobot(){ //Metodo constructor de la clase hija
        setResistencia(1200); //Se inicializa la resistencia
        this.raza = "Autobot";
        this.nombre = "Optimus Prime";
        //Se escoge un arma en base a su raza
        Arma arma = new Armas(this.raza);
    } 

    public Autobot(String Lider){
        setResistencia(1200); //Se inicializa la resistencia
        resistenciaInicial = 1200;//Se guarda la resistencia inicial
        this.raza = "Autobot";
        this.nombre = "Optimus Prime Lider";
        //Se escoge un arma en base a su raza
        Arma arma = new Armas(this.raza);
    }
}
