public class Megatransformer extends Maximal implements Predaconi{
    //El megatransformer solo puede formarse entre Maximal y Predacon
    //Por ello se hace uso de una herencia multiple a partir de una interfaz y una clase
    private int resistencia = 0;

    public int ataquesEspeciales(){
        return resistencia;
    } //Metodo para los ataques especiales compartidos
  
}
