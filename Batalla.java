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

        /* 

        Armas a = new Armas();
        String R1 = "Optimus Prime";
        String R2 = "Megatron";
        String R3 = "Optimus Primal";
        String R4 = "Optimus Prime";
        
        a.Tipo();
        String armamento = a.Armamento(R3);
        int usos = a.Usos(armamento);
        System.out.println("El tranformer " + R3 + " esta equipado con el arma " + armamento + " y le quedan " + usos + " usos");
        */
        
    }
}
