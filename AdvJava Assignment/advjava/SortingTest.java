package advjava;

public class SortingTest {

	public static void main(String[] args) {
		MyArrayList<Integer> x= new MyArrayList(15);
		x.insert(1);
		x.insert(5000);
		x.insert(50);
		x.insert(500);
		//System.out.println(x.current_size);
		//System.out.println(x.get(3));
		Sorting.selectionSort(x);
		for(int i=0;i<x.current_size;i++)
		System.out.println(x.get(i));
	}

}
