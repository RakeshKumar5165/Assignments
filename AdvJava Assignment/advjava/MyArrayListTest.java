package advjava;


public class MyArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList<Integer> A =  new MyArrayList<Integer>();
		A.insert(100);
		A.insert(167);
		A.insert(1);
		A.insert(110);
		A.remove(1);
		System.out.println(A.get(0)+" "+A.get(1)+" "+A.get(2));
	}

	}


