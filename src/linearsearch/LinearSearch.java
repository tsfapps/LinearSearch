/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;


public class LinearSearch {
 public static void main(String[] args) {
        
        boolean isGet = false;
        int x = 25;
        int i = 0;
        int arr[] = {23, 43, 45, 56, 47, 29, 19, 20, 41, 80, 10, 73, 11, 25, 63, 28};
        for(i = 0; i<arr.length; i++){
            if(arr[i] == x){
               System.out.println(x + " Found at index "+ i);
               isGet = true;
            }
              
        } if (isGet == false){
             System.out.println(x+" is not in array.");
        }
        
    }
    
}
