package main.java.com.dkcody;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        System.out.println(a1+""+a2);
        ArrtoStr(new int[]{1,2,3,4,5,9});
    }
    public static void ArrtoStr(int[] arr){
        System.out.println(Arrays.toString(arr));
        
        
        
    }

}
