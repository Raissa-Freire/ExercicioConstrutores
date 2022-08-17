package Modulo3.Exercio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Qual a marca do seu primeiro PC?");
        String marca = input.nextLine();
        //Scanner marca= new Scanner(System.in);
        System.out.println("Qual o modelo do seu primeiro PC?");
        String modelo =input.nextLine();
        //Scanner modelo= new Scanner(System.in);
        System.out.println("Qual a memoria ram do seu primeiro PC?");
        int ram=input.nextInt();
        //Scanner ram= new Scanner(System.in);
        System.out.println("Qual o HD do seu primeiro PC?");
        int hd=input.nextInt();
        //Scanner hd= new Scanner(System.in);
        PC pc1= new PC(marca,modelo, ram, hd);
        System.out.println("A configuração do seu primeiro PC é: " + pc1.marca +"   "+ pc1.modelo +"   "+ pc1.ram +"   "+ pc1.hd);


        System.out.println("Qual a marca do seu segundo PC?");
        //Scanner marca= new Scanner(System.in);
        marca = input.next();
        System.out.println("Qual a modelo do seu segundo PC?");
        modelo =input.next();
        //Scanner modelo= new Scanner(System.in);
        System.out.println("Qual a memoria ram do seu segundo PC?");
        ram = input.nextInt();
        //Scanner ram= new Scanner(System.in);
        System.out.println("Qual o HD do seu segundo PC?");
         hd=input.nextInt();
        //Scanner hd= new Scanner(System.in);
        PC pc2= new PC(marca,modelo, ram, hd);
        System.out.println("A configuração do seu segundo PC é: " +"   "+ pc2.marca +"   "+ pc2.modelo +"   "+ pc2.ram +"   "+ pc2.hd);
    }
}
