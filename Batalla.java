import java.util.ArrayList;

public class Batalla{
    public static void main(String[] args){

        //Se crean los transformers que iran en ambos bandos
        System.out.println("||||| Autobot bando 1 |||||");
        Autobot a1 = new Autobot();
        System.out.println("||||| Autobot bando 2 |||||");
        Autobot a2 = new Autobot();
        System.out.println("||||| Decepticon bando 1 |||||");
        Decepticon d1 = new Decepticon();
        System.out.println("||||| Decepticon bando 2 |||||");
        Decepticon d2 = new Decepticon();
        System.out.println("||||| Maximal bando 1 |||||");
        Maximal m1 = new Maximal();
        System.out.println("||||| Maximal bando 2 |||||");
        Maximal m2 = new Maximal();
        System.out.println("||||| Predacon bando 1 |||||");
        Predacon p1 = new Predacon(); 
        System.out.println("||||| Predacon bando 2 |||||");
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
