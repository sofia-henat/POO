public class Maximal extends Transformer{

    @Override
    public int ataquesEspeciales(){
        System.out.println("Se gano un ataque especial");
        int combo = (golpeAlto * 2) + patada; //Daño de los tres golpes basicos
        return combo;
    }

    public Maximal(){ //Metodo constructor de la clase hija
        setResistencia(1400); //Se inicializa la resistencia
        this.nombre = "Optimus primal";
        //Se escoge un arma en base a su raza
        Arma arma = new Armas(nombre);
    } 
}
