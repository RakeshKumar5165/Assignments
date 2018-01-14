package advjava;

public final class Sorting<E> {
	
	
	private Sorting()
	{}
		 private static <E> void swap(MyArrayList<E> a, int i, int j) {
		        if (i != j) {
		            E temp = a.get(i);
		            a.set(i, a.get(j));
		            a.set(j, temp);		        }
		    }

		    public static <E extends Comparable<E>> void selectionSort(MyArrayList<E> a) {
		        for (int i = 0; i < a.current_size -1; i++) {
		           
		            int smallest = i;
		            for (int j = i + 1; j < a.current_size; j++) {
		                if ((a.get(j)).compareTo(a.get(smallest))<=0) {
		                    smallest = j;
		                    
		                }
		               
		            }
		          //  System.out.println(a.get(0)+","+a.get(1)+","+a.get(2)+","+a.get(3));
		            
		            swap(a, i, smallest);  // swap smallest to front
		        }
		        
		    }
}
