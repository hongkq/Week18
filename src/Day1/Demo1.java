package Day1;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		//ctrl+shift+o
		Scanner sc=new Scanner(System .in);
		
		//ctrl+Alt+об
		//sc.next();
		int a=sc.nextInt();
		int []arr= new int[a];
		//a[0]=1;
		//a[1]=3;
		//a[2]=6;
		
		add(a);
	}


public static add(int []arr){
	for(int i=0;i<=arr.length;i++){
		System.out.println(i);
	}
}