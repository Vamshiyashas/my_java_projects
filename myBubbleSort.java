import java.io.*;
import java.util.*;

class myBubbleSort{
	public static void main(String args[]){
		int e[]={45,12,75,63,78};
		int temp;
		int n;
		System.out.println("before bubble sort");
		System.out.println("\n---------------------------------------------------------");
		for(int i=0;i<e.length;i++){
			System.out.print(e[i]+"\t");
			
			}
		System.out.println("\n---------------------------------------------------------");
		
		//logic for bubble sort
		n=e.length;
		for(int i=0;i<n;i++){
			for(int j=1;j<(n-i);j++){
				if(e[j-1]>e[j]){
					temp=e[j-1];
					e[j-1]=e[j];
					e[j]=temp;
					}
				}
			}
		System.out.println("after bubble sort");
		System.out.println("\n---------------------------------------------------------");
		for(int i=0;i<e.length;i++){
			System.out.print(e[i]+"\t");
			
			}
		System.out.println("\n---------------------------------------------------------");
		
		
			
		
		}
	}



