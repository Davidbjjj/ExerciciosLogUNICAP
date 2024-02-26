package main.java;

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        int volume;
        Scanner sc= new Scanner(System.in);
        System.out.println("digite o valor do volume, a entraga deve conter um valor inteiro");
        volume=sc.nextInt();

        if (volume<=0){
            System.out.println("Min Volume");
        }

        else if (volume>0 && volume<=25){
            System.out.println("Low Volume");
        }
        else if(volume>25 && volume<=75){
            System.out.println("Medium Volume");
        }
        else if (volume>75 && volume<100){
            System.out.println("High Volume");
        }
        else if(volume>=100){
            System.out.println("Max Volume");
        }
    }
}
