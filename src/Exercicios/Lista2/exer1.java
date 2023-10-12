package Exercicios.Lista2;

import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        String id;
        float n1,n2,n3=0;
        float ma=0;
        float me=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o numero de indentificação");
        id = sc.next();
        System.out.println("Escreva as notas(1 , 2 e 3) do aluno");
        n1=sc.nextFloat();
        n2=sc.nextFloat();
        n3=sc.nextFloat();
        System.out.println("escreva a media do estudante nos exercicios");
        me=sc.nextFloat();
        ma=((n1+2*n2+3*n3+me)/7);
        System.out.println(ma);
        if (ma>=9 && ma>=10){
            System.out.println( id+" notas 1,2 e 3"+" "+n1+" "+n2+" "+n3+"media nos exercicios:"+me+" media de aproveitamento"+ma+"Aprovado--Conceito A");
        }else if(ma>=7.5 && ma<9){
            System.out.println( id+" notas 1,2 e 3"+" "+n1+" "+n2+" "+n3+"media nos exercicios:"+me+" media de aproveitamento"+ma+"Aprovado--Conceito B");
        }else if (ma>=6 && ma<7.5){
            System.out.println( id+" notas 1,2 e 3"+" "+n1+" "+n2+" "+n3+"media nos exercicios:"+me+" media de aproveitamento"+ma+"Aprovado--Conceito C");
        }else if(ma>=4 && ma<6){
            System.out.println( id+" notas 1,2 e 3"+" "+n1+" "+n2+" "+n3+"media nos exercicios:"+me+" media de aproveitamento"+ma+"Aprovado--Conceito D");
        }else if(ma<4){
            System.out.println( id+" notas 1,2 e 3"+" "+n1+" "+n2+" "+n3+"media nos exercicios:"+me+" media de aproveitamento"+ma+"Aprovado--Conceito E");

        }
    }


}
