/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class MyQueue {
   private int maxSize;
   private long[] queArray;
   private int front;
   private int rear;
   private int Items;
   public MyQueue(int s)      
      {
      maxSize = s;
      queArray = new long[maxSize];
      front = 0;
      rear = -1;
      Items = 0;
      }
   public void insert(long j)   
      {
      if(rear == maxSize-1)         
         rear = -1;
      queArray[++rear] = j;         
      Items++;                    
      }
   public long remove()       
      {
      long temp = queArray[front++]; 
      if(front == maxSize)           
         front = 0;
      Items--;                     
      return temp;
      }
   public long peekFront()      
      {
      return queArray[front];
      }
   public boolean isEmpty()    
      {
      return (Items==0);
      }
   public boolean isFull()     
      {
      return (Items==maxSize);
      }

   public int size()        
      {
      return Items;
      }
}  

