public class Predacon extends Transformer implements Predaconi{ //Raza

    @Override
    public int ataquesEspeciales(){
        System.out.println("Se gano un ataque especial");
        int combo = (golpeAlto * 2) + patada; //Daño de los tres golpes basicos
        return combo;
    }

    public Predacon(){ //Metodo constructor de la clase hija
        setResistencia(1000); //Se inicializa la resistencia
        resistenciaInicial = 1000;
        this.nombre = "Razorclaw";
        //Se escoge un arma en base a su raza
        Arma arma = new Armas(nombre);
    } 

    public Predacon(String Lider){
        setResistencia(1000); //Se inicializa la resistencia
        resistenciaInicial = 1000;//Se guarda la resistencia inicial
        this.nombre = "Razorclaw Lider";
        //Se escoge un arma en base a su raza
        Arma arma = new Armas(nombre);
    }
}
