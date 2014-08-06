package common;

public class CommonUtils {
	
	public static void swap(Object[] a, int index1, int index2){
		Object temp = a[index1];		
		a[index1] = a[index2];
		a[index2] = temp;
	}

	public static void print(Object[] c){
		for(Object o : c){
			System.out.print(o.toString() + "  ");
		}
	}
	
}
