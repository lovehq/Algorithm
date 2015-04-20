package io.github.lovehq.common;

import java.util.Arrays;

public class Utils {
	
	public static void swap(Object[] a, int index1, int index2){
		Object temp = a[index1];		
		a[index1] = a[index2];
		a[index2] = temp;
	}

	public static void print(Object[] c){
		System.out.println(Arrays.toString(c));
	}

	public static void print(Object[] c, String msg){
		System.out.println(msg + ": " + Arrays.toString(c));
	}
	
}
