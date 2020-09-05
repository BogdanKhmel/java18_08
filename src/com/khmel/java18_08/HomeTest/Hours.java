package com.khmel.java18_08.HomeTest;

/**
 * Created by ффлсутжд on 29.08.20.
 */
import java.util.Scanner;
public class Hours {
    public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Введите количество суток:");
        int d = s.nextInt();
        System.out.println("В "+d+" сутках "+(d*24)+" часов(-а), "+(d*24*60)+" минут, "+(d*24*60*60)+" секунд.");
    }
}
