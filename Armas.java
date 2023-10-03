import java.util.Scanner;
import java.util.Random;

abstract class Arma{
    static String armamento;
    static String tipo;
    static int usos;
    static int dano;
}

public class Armas extends Arma{
    
    public void Tipo(){
        Scanner s = new Scanner (System.in);
        System.out.println("Que tipo de arma quieres?");
        System.out.println("1) Ofensiva \t 2) Defensiva");
        int a = s.nextInt();
        if(a == 1){
            tipo = "Ofensiva";
        } else {
            tipo = "Defensiva";
        }
    }

    public void Armamento(String raza){ //Se le manda la raza del transformer
        Scanner s2 = new Scanner (System.in);
        System.out.println("Que arma quieres?");
        if (tipo == "Ofensiva" && raza == "Decepticon"){
            System.out.println("1)Canon de fusion (6 unidades de uso)");
            System.out.println("2)Espada megatron (6 unidades de uso)");
            int a = s2.nextInt();
            if(a == 1){
                armamento = "Canon de fusion";
            } else {
                armamento = "Espada megatron";
            }
        } else if (tipo == "Ofensiva" && raza == "Autobot"){
            System.out.println("1)Espada de los prime (8 unidades de uso)");
            System.out.println("2)Hacha Energón (10 unidades de uso)");
            int a = s2.nextInt();
            if(a == 1){
                armamento = "Espada de los prime";
            } else {
                armamento = "Hacha Energón";
            }
        } else if (tipo == "Ofensiva" && raza == "Maximal"){
            System.out.println("1)Arco de flechas (5 unidades de uso)");
            System.out.println("2)Blaster de iones (8 unidades de uso)");
            int a = s2.nextInt();
            if(a == 1){
                armamento = "Arco de flechas";
            } else {
                armamento = "Blaster de iones";
            }
        } else if (tipo == "Ofensiva" && raza == "Predacon"){
            System.out.println("1)Taladro cybertroniano (5 unidades de uso)");
            armamento = "Taladro cybertroniano";
        } else {
            System.out.println("1)Escudo Aegis");
            System.out.println("2)Dron-T");
            int a = s2.nextInt();
            if(a == 1){
                armamento = "Escudo Aegis";
            } else {
                armamento = "Dron-T";
            }
        }
    }

    public void Usos(){
        if (armamento == "Canon de fusion"){
            usos = 6;
        } else if (armamento == "Espada megatron"){
            usos = 6;
        } else if (armamento == "Espada de los prime"){
            usos = 8;
        } else if (armamento == "Hacha Energón"){
            usos = 10;
        } else if (armamento == "Arco de flechas"){
            usos = 5;
        } else if (armamento == "Blaster de iones"){
            usos = 8;
        } else if (armamento == "Taladro cybertroniano"){
            usos = 5;
        } else {
            usos = 10000;
        }
    }

    public void dano(){
        Random r = new Random();
        if(tipo.equals("Ofensiva")){
            this.dano = r.nextInt(300)+1;
        }
        else{
            this.dano = 0;
        }
    }

    public void MenosUsos(){
      this.usos = this.usos - 1;
    }

    public Armas(String nombre){ //Metodo constructor de Armas, se le asigna un tipo, un armamento y un uso
        Tipo();
        Armamento(nombre);
        Usos();
        dano();
    }
}
