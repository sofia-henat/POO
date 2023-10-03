public class Maximal extends Transformer{

    @Override
    public int ataquesEspeciales(){
        System.out.println("Se gano un ataque especial");
        int combo = (golpeAlto * 2) + patada; //Daño de los tres golpes basicos
        return combo;
    }

    public Maximal(){ //Metodo constructor de la clase hija
        setResistencia(1400); //Se inicializa la resistencia
        resistenciaInicial = 1400;
        this.nombre = "Optimus primal";
        //Se escoge un arma en base a su raza
        Arma arma = new Armas(nombre);
    } 

    public Maximal(String Lider){
        setResistencia(1400); //Se inicializa la resistencia
        resistenciaInicial = 1400;//Se guarda la resistencia inicial
        this.nombre = "Optimus Primal Lider";
        //Se escoge un arma en base a su raza
        Arma arma = new Armas(nombre);
    }
}
