package sort;

import java.util.ArrayList;
import java.util.List;

import common.CommonUtils;

public class Test {

	private Sort<Integer> sort;
	
	public Test(){}
	
	public Test(Sort<Integer> sort){
		this.sort = sort;
	}
	
	public static void main(String[] args){
		Test test = new Test(new InsertionSort<Integer>());
		test = new Test(new BubbleSort<Integer>());
		
		List<Integer[]> testData = new ArrayList<Integer[]>();
		Integer[] data1 = new Integer[] {1};
		Integer[] data2 = new Integer[] {1,1,1,1,1,1,1};
		Integer[] data3 = new Integer[] {1,2,3,4,5,6};
		Integer[] data4 = new Integer[] {6,5,4,3,2,1};
		Integer[] data5 = new Integer[] {6,15,24,23,23,11,2,5,8};
		Integer[] data6 = new Integer[] {6,15,24,23,23,11,2,8};
		testData.add(data1);
		testData.add(data2);
		testData.add(data3);
		testData.add(data4);
		testData.add(data5);
		testData.add(data6);
		int count = 0;
		for(Integer[] data : testData){
			System.out.print(count+". Before Sort: ");
			CommonUtils.print(data);
			System.out.println();
			System.out.print(count+". After Sort : ");
			test.getSort().sort(data);
			CommonUtils.print(data);
			System.out.println();
			System.out.println();
			count++;			
		}
	}

	public Sort<Integer> getSort() {
		return sort;
	}

	public void setSort(Sort<Integer> sort) {
		this.sort = sort;
	}
	
	

}
