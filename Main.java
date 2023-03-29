package com.JavaCal;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collection;
import java.util.* ;
public class Main {



    public static void main(String[] args) {
	// write your code here

//        int[] arr = new int[2];
//
//        arr[0] = 10;
//
//        arr[1] = 20;
//
//
//
//        for (int i = 0; i <= arr.length; i++){
//
//            System.out.println(arr[i]);
//
//    }

//            System.out.print("enter a sentence: ");
//            String a = sc.nextLine();
//            a = a.toLowerCase();
//            char ch[] = a.toCharArray();
//            char temp = ch[1];
//            ch[1] = ch[2];
//            ch[2] = temp;
//
//            for(int i = 3; i<a.length(); i++){
//                ch[i] = (char) ((a.charAt(i) + a.charAt(i-1))-96);
//                if(ch[i] > 'z'){
//                    ch[i]-=26;
//                }
//
//
//            }
//
////            System.out.print(ch);
//        int arr[] = {0,1,2,3,4,5,6,7};
////        for(int i = 3; i<arr.length-1; i++){
////            arr[i+1] = arr[i];
////        }
////        System.out.println(Arrays.toString(arr));
//
//            for(int i = arr.length-1; i>3; i--){
//               arr[i] = arr[i-1];
//            }
//        System.out.println(Arrays.toString(arr));


//        LinkedList db = new LinkedList<>();
//
//        db.add("Tom");
//        db.add("Dick");
//        db.add("Harry");
//        db.add("Sam");
//        db.addFirst("Bill");
//        System.out.println(db.toString());
//        db.add(db.getSize()-1, "Sue");
//        System.out.println(db.toString());
//        db.remove(0);
//        db.remove(db.getSize()-1);
//        System.out.println(db.toString());
        //java api
//        LList lk = new LList<>();
//        lk.add("gita", "asdasd", "0123");
//        lk.add("bw", "ad", "0123");
//        lk.EmailSearch("ads");
//        lk.EmailSearch("ad");
//        lk.Delete(0);
//        System.out.println(lk.toString());

//        Stack<String> st = new Stack<>();
//        Stack<Integer> sts = new Stack<>();
//        st.push("A");
//        sts.push(1);
//        int pp = sts.pop();
//        System.out.println(st.toString());
//        Deque dq = new ArrayDeque<>();
//        dq.addFirst(1);
//        dq.addLast(2);
//        int f = (int)dq.removeFirst();
//        int l = (int) dq.removeLast();
//        System.out.println("first: " + f + " Last: " + l);

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
