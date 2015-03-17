/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package selectionsort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author BM
 */
public class SelectionSort {

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
           
            System.out.print(dizi[i] + "-");
        }


for(int i=0;i<=diziElemanSayisi-1;i++){
    min=i;
    for (int k=i+1;k<diziElemanSayisi;k++){
        comSayisi=comSayisi+1;
        if(dizi[k]<dizi[i]){
            temp=dizi[i];
            dizi[i]=dizi[k];
            dizi[k]=temp;
            swapSayisi=swapSayisi+1;
        }
    }
}
 System.out.println("\nSıralı diziniz:");
for (int j=0;j<=diziElemanSayisi-1;j++)
    System.out.println(dizi[j]+" ");
    System.out.println("swap sayiniz:" +swapSayisi);
      System.out.println("comparison sayiniz:" +comSayisi);

}
    }
    
