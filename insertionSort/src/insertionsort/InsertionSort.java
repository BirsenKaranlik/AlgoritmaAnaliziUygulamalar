/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package insertionsort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author BM
 */
public class InsertionSort {
     public static int swap = 0;
    public static int comparation = 0;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int min=0; int temp;
      int diziElemanSayisi, swapSayisi=0, comSayisi=0;
    Scanner in = new Scanner(System.in);
    Random rnd = new Random();
    
      System.out.println("Diziniz kaç elemanlı olsun?");
    diziElemanSayisi = in.nextInt();
 
    int dizi[] = new int[diziElemanSayisi];
      System.out.println("Dizininiz:");
 
       
  for (int i = 0; i <diziElemanSayisi; i++) {
            dizi[i] = rnd.nextInt(10001);
           
            System.out.println(dizi[i] + "-");
        }
InsertionSort(dizi); 
        //SelectionSort(dizi);
       // ShellSort(dizi);
      //  SelectionSort(dizi);
        
        System.out.println("swap:" + swap + " Comparation : " + comparation);

      
    }
      public static void InsertionSort(int[] num) {
        int j;                     // the number of items sorted so far
        int key;                // the item to be inserted
        int i;
        for (j = 1; j < num.length; j++) // Start with 1 (not 0)
        {
            key = num[ j];
            comparation++;
            
            for (i = j - 1; (i >= 0) && (num[ i] < key); i--) // Smaller values are moving up
            {
                num[ i + 1] = num[ i];
                comparation++;
                swap++;
            }
            num[ i + 1] = key;    // Put the key in its proper location
        }
         System.out.println("\nSıralı diziniz:");
 
    for ( int c = 0; c < num.length; c++) 
      System.out.println(num[c]);
    }
        
    }

    
    

