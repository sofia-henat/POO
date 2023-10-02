abstract class Transformer{
    final String mundOrigen = "Cybertron";//Mundo de origen
    String nombre; //Nombre
    int resistencia; //Resistencia

    //////////Ataques Basicos////////
    int golpeAlto = 2; //Golpe alto
    int patada = 3; //Patada

    //Metodo del combo de ataques basicos
    abstract int ataquesEspeciales();
}
