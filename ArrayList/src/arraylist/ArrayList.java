/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylist;

import static java.lang.Math.random;
import java.lang.reflect.Array;
import java.util.Random;

/**
 *
 * @author BM
 */
public class ArrayList {
   
 
    private int capacity = 2;
    int queueArr[];
    int front = 0;
    int rear = -1;
    int currentSize = 0;

    public ArrayList(){
     queueArr = new int[this.capacity];
    }
    
    public void enqueue(int item) {
         
        if (isQueueFull()) {
            System.out.println("kuyruk doldu kapasiteyi arttırıyoruz.");
            increaseCapacity();
        }
        rear++;
        if(rear >= queueArr.length && currentSize != queueArr.length){
            rear = 0;
        }
        queueArr[rear] = item;
        currentSize++;
        System.out.println("Eklendi: " + item);
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            front++;
            if(front > queueArr.length-1){
                System.out.println("Silindi: "+queueArr[front-1]);
                front = 0;
            } else {
                System.out.println("Silindi: "+queueArr[front-1]);
            }
            currentSize--;
        }
    }

    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize == queueArr.length){
            status = true;
        }
        return status;
    }
     
    /**
     * This method checks whether the queue is empty or not
     * @return
     */
    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;
        }
        return status;
    }
    private void increaseCapacity(){
         
        //create new array with double size as the current one.
        int newCapacity = this.queueArr.length*2;
        int[] newArr = new int[newCapacity];
        //copy elements to new array, copy from rear to front
        int tmpFront = front;
        int index = -1;
        while(true){
            newArr[++index] = this.queueArr[tmpFront];
            tmpFront++;
            if(tmpFront == this.queueArr.length){
                tmpFront = 0;
            }
            if(currentSize == index+1){
                break;
            }
        }
        //make new array as queue
        this.queueArr = newArr;
        System.out.println("Yeni Kapasite: "+this.queueArr.length);
        //reset front & rear values
        this.front = 0;
        this.rear = index;
    }
 
    public static void main(String[] args) {
        ArrayList queue = new ArrayList();
        Random rnd = new Random();
//        for(int i=0; i<20; i++){
//        queue.enqueue(rnd.nextInt(100));
//    
//}
      
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.enqueue(24);
        queue.enqueue(98);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(435);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(6);
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(9);

    }
    
}