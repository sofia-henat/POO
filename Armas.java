import java.util.Scanner;
import java.util.Random;

abstract class Arma{
    static String armamento;
    static String tipo;
    static int usos;
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

    public void Armamento(String nombre){ //Se le manda el nombre del transformer
        Scanner s2 = new Scanner (System.in);
        System.out.println("Que arma quieres?");
        if (tipo == "Ofensiva" && nombre == "Megatron"){
            System.out.println("1)Canon de fusion (6 unidades de uso)");
            System.out.println("2)Espada megatron (6 unidades de uso)");
            int a = s2.nextInt();
            if(a == 1){
                armamento = "Canon de fusion";
            } else {
                armamento = "Espada megatron";
            }
        } else if (tipo == "Ofensiva" && nombre == "Optimus Prime"){
            System.out.println("1)Espada de los prime (8 unidades de uso)");
            System.out.println("2)Hacha Energón (10 unidades de uso)");
            int a = s2.nextInt();
            if(a == 1){
                armamento = "Espada de los prime";
            } else {
                armamento = "Hacha Energón";
            }
        } else if (tipo == "Ofensiva" && nombre == "Optimus Primal"){
            System.out.println("1)Arco de flechas (5 unidades de uso)");
            System.out.println("2)Blaster de iones (8 unidades de uso)");
            int a = s2.nextInt();
            if(a == 1){
                armamento = "Arco de flechas";
            } else {
                armamento = "Blaster de iones";
            }
        } else if (tipo == "Ofensiva" && nombre == "Razorclaw"){
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

    public int Usos(){
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
        return usos;
    }

    public Armas(String nombre){ //Metodo constructor de Armas, se le asigna un tipo, un armamento y un uso
        Tipo();
        Armamento(nombre);
        Usos();
    }
}
