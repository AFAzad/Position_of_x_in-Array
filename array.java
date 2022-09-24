/* Problem Statement
Given an integer array arr[] of size N and an element X. The task is to find and print the indices of the given element if it is present in array if not then print “Not found” without quotes.  */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
        Scanner inputTaker = new Scanner(System.in);
        int t = inputTaker.nextInt();
        while(t > 0){
            
            int n = inputTaker.nextInt();
            int x = inputTaker.nextInt();
            int[] arr = new int[n];

            for(int i =0;i<n;i++){
                arr[i] = inputTaker.nextInt();
            }

            boolean found = false;
            for(int i =0;i<n;i++){
                if(arr[i] == x){
                    System.out.print(i + " ");
                    found = true;
                }
            }
            if(!found){
                System.out.print("Not found");
            }
            System.out.println("");

            t--;
        }
	}
}