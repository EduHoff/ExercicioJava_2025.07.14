package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		int lim = 0;
		//int count=0;
		Set<Integer> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("How many students for course A?");
		lim = sc.nextInt();
		
		for(int i=1; i<=lim; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.println("How many students for course B?");
		lim = sc.nextInt();
		
		for(int i=1; i<=lim; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.println("How many students for course C?");
		lim = sc.nextInt();
		
		for(int i=1; i<=lim; i++) {
			set.add(sc.nextInt());
		}
		
		//for(Integer s : set) {
		//	count++;	
		//}
		
		System.out.println("Total students: " + set.size());
	

	}

}
