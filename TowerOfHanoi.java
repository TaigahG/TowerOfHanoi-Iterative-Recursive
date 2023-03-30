package com.JavaCal;

import java.util.Scanner;

public class TowerOfHanoi {
    //recursive
    public static String recursiveTOH(int n, char startPeg, char destPeg, char tempPeg){
        if(n ==  1){
            return "Move disk 1 from peg " + startPeg + " to peg " +  destPeg + "\n";
        }
        else{
            return recursiveTOH(n-1, startPeg, tempPeg, destPeg) + "move disk " + n + " from peg " +
                    startPeg + " to peg " + destPeg + "\n" +
                    recursiveTOH(n-1, tempPeg, destPeg, startPeg);
        }
    }



    public static void iterativeTOH(int n, Stack<Integer> s, Stack<Integer> a, Stack<Integer> d) {


        for (int i = n; i >= 1; i--) {
            s.push(i);
        }
        //calculate the required steps
        int moves = (int) Math.pow(2, n) - 1;


        for (int i = 1; i <= moves; i++) {//iterate through all the moves
            if (i % 3 == 1) {
                if (!s.isEmpty() && (d.isEmpty() || s.peek() < d.peek())) {
                    movement(s, d, 'A', 'C');
                }
                else if (!d.isEmpty() && (s.isEmpty() || d.peek() < s.peek())) {
                    movement(d, s, 'C', 'A');
                }
            }
            else if (i % 3 == 2) {
                if(!s.isEmpty() && (a.isEmpty() || s.peek() < a.peek())){
                    movement(s, a, 'A', 'B');
                }
                else if(!a.isEmpty() && (s.isEmpty() || a.peek() < s.peek())){
                    movement(a, s, 'B', 'A');
                }
            } else {
                if (!a.isEmpty() && (d.isEmpty() || a.peek() < d.peek())) {
                    movement(a, d, 'B', 'C');
                } else if (!d.isEmpty() && (a.isEmpty() || d.peek() < a.peek())) {
                    movement(d, a, 'C', 'B');
                }
            }
        }
    }

public static void movement(Stack<Integer> sourceStack, Stack<Integer> destinationStack,char source, char dest) {
    int disk = sourceStack.pop();
    destinationStack.push(disk);
    System.out.println("Move disk " + disk + " from " + source + " to " + dest);





}



}
