/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bubblesort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author BM
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int diziElemanSayisi, c, d, swap, swapSayisi=0, comSayisi=0;
    Scanner in = new Scanner(System.in);
    Random rnd = new Random();
 
    System.out.println("Dizi kaç elemanlı olsun?");
    diziElemanSayisi = in.nextInt();
 
    int dizi[] = new int[diziElemanSayisi];
      System.out.println("Dizi:");
 
  for (int i = 0; i <diziElemanSayisi; i++) {
            dizi[i] = rnd.nextInt(10001);
           
            System.out.print(dizi[i] + "-");
        }
 
    for (c = 0; c < ( diziElemanSayisi - 1 ); c++) {
      for (d = 0; d < diziElemanSayisi - c - 1; d++) {
          comSayisi=comSayisi+1;
        if (dizi[d] > dizi[d+1]) /* For descending order use < */
        {
          swap       = dizi[d];
          dizi[d]   = dizi[d+1];
          dizi[d+1] = swap;
          swapSayisi=swapSayisi+1;
        }
      }
    }
 
      System.out.println("\nSıralı diziniz:");
 
    for (c = 0; c < diziElemanSayisi; c++) 
      System.out.println(dizi[c]);
      System.out.println("swap sayiniz:" +swapSayisi);
      System.out.println("comparison sayiniz:" +comSayisi);
  }
    }
    
 
