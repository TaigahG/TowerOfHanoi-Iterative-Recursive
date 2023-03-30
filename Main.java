package com.JavaCal;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collection;
import java.util.* ;
public class Main {



    public static void main(String[] args) {

        TowerOfHanoi TOH = new TowerOfHanoi();
        Stack<Integer> src = new Stack<>();
        Stack<Integer> aux = new Stack<>();
        Stack<Integer> dest = new Stack<>();
        Scanner sc = new Scanner(System.in);
        boolean play = true;
        while(play){
            System.out.println("Tower of Hanoi \n 1. Iterative \n 2. Recursive \n 3. Quit");
            int nm = sc.nextInt();

            if(nm == 1){
                System.out.println("Enter number of disks: ");
                int n = sc.nextInt();
                System.out.println("Iterative: ");
                TOH.iterativeTOH(n, src, aux, dest);
            }
            else if(nm == 2){
                System.out.println("Enter number of disks: ");
                int n = sc.nextInt();
                String m = TOH.recursiveTOH(n, 'A', 'C', 'B');
                System.out.println("Recursive: ");
                System.out.println(m);

            }
            else if(nm == 3){
                break;
            }

            System.out.println("Continue? (Y/N) ");
            String opt = sc.next().toUpperCase();
            if(opt.equals("N")){
                play = false;
                break;
            }

        }







    }
}
