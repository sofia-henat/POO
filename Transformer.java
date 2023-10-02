import java.util.Random;
import java.util.Scanner;

abstract class Transformer{
    final String mundOrigen = "Cybertron";//Mundo de origen
    public String nombre; //Nombre
    private int resistencia; //Resistencia
    Armas arma; //Composicion

    //////////Ataques Basicos////////
    int golpeAlto = 2; //Golpe alto
    int patada = 3; //Patada

    //Metodo del combo de ataques basicos
    abstract int ataquesEspeciales();

    public int Ofensa(){
        Scanner s = new Scanner (System.in);
        Random r = new Random();
        int dano = 0, eleccion  = 0;
        int numeroRandom = r.nextInt(100)+1;
        if (arma.tipo.equals("ofensa")){ //Si hay un arma de ofensa

            if (numeroRandom < 61){
                System.out.println("Atque basico\n1)Golpe alto 2)Patada");
                eleccion = s.nextInt();
                if(eleccion == 1){
                    dano = golpeAlto;
                }
                else{
                    dano = patada;
                }
            }
            else if(numeroRandom > 60 && numeroRandom < 96){
                dano = arma.dano;
            }
            else{
                dano = ataquesEspeciales();
            }
        }
        else{ //Si no hay un arma de ofensa
            dano = 0;
        }
        return dano;
    }

    public void Defensa(int danoinflingido){ //Se obtiene el dato de dano inflingido
        Random r = new Random();
        int numeroRandom = r.nextInt(100)+1;

        if (arma.tipo.equals("defensa")){ //Si existe un arma de defensa
            if (numeroRandom < 11){
                System.out.println("Arma especial de defensa");
                //La resistencia se resignara despues de hacer una diferencia entre el dano inflingido y la regeneracion del arma de defensa
                resistencia = resistencia - (danoinflingido - arma.usos); 
            }
            else if(numeroRandom > 10 && numeroRandom < 13){
                System.out.println("Unidades de Energon");
                //Con las unidades de energon el dano se reduce a la mitad
                resistencia = resistencia - (danoinflingido / 2);
            }
            else{
                //Los 88 numeros restantes no hacen nada, por lo que se resta el dano inflingido a la resistencia
                resistencia = danoinflingido;
            }
        }
        else{ //Si no hay armas de defensa
            resistencia = danoinflingido;
        }
    }

    //Getters and setters de la variable privada resistencia
    public void setResistencia(int resistencia){this.resistencia = resistencia;}
    public int getResistencia(){return resistencia;}
}
