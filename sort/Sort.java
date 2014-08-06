package sort;

public interface Sort<T extends Comparable<T>> {
	
	/**
	 * 
	 * @param data: precondition: no empty or null data in the parameter
	 */
	public void sort(T[] data);
	
}
