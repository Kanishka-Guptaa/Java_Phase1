package Assisted_Practice_L3;

import java.util.Scanner;

public class Synchronization
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter 1st number : ");
    	int number1 = sc.nextInt();
    	System.out.println("Enter 2nd number : ");
        int number2 = sc.nextInt();
        int range = 10;

        MultiplicationTable task1 = new MultiplicationTable(number1, range);
        MultiplicationTable task2 = new MultiplicationTable(number2, range);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}

