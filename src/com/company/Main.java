package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] array = {5,9,7,3,45,5,2,56,45};
	    int low = array[0];
	    int high = array[0];
	    for(int i = 0; i < array.length; i++){
	        if(array[i]<low){
	            low = array[i];
            }
	        if(array[i]>high){
	            high = array[i];
            }
        }
        System.out.println("The lowest number is " + low);
        System.out.println("The highest number is " + high);
    }
}
