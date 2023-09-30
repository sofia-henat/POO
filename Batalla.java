import java.util.ArrayList;

public class Batalla{
    public static void main(String[] args){

        //Se crean los transformers que iran en ambos bandos
        Autobot a1 = new Autobot();
        Autobot a2 = new Autobot();
        Decepticon d1 = new Decepticon();
        Decepticon d2 = new Decepticon();
        Maximal m1 = new Maximal();
        Maximal m2 = new Maximal();
        Predacon p1 = new Predacon(); 
        Predacon p2 = new Predacon(); 

        //Los Array List nos serviran para guardar los objetos de tipo Transformer en cada uno de los bandos
        ArrayList<Transformer> Bando1 = new ArrayList<>();
        Bando1.add(a1);
        Bando1.add(d1);
        Bando1.add(m1);
        Bando1.add(p1);

        ArrayList<Transformer> Bando2 = new ArrayList<>();
        Bando2.add(a2);
        Bando2.add(d2);
        Bando2.add(m2);
        Bando2.add(p2);

    }
}
