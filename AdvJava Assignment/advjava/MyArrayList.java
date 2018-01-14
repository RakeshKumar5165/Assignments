package advjava;



public class MyArrayList<E>
 {
public Object[] array;
private int default_size=10;
private int max_size=0;
public int current_size=0;
public MyArrayList(int size){
    array = new Object[size];
    max_size=size;
}
public MyArrayList()
{ max_size=default_size;
	array=new Object[default_size];
}

public void insert(E e) {
	if(current_size<max_size)
	{	
		array[current_size]=e;
		current_size++;
	}
}
public E remove(int index){
    if(index>=current_size || index < 0 ){throw new RuntimeException("Invalid index");}
    E element = (E) array[index];
    array[index] = null;
    --current_size;
    compress();
    return element;
}

private void compress(){
    int skipCount =0;
    for(int i=0;i < current_size ; i++){
        if(array[i]==null){
            ++skipCount;                
        }
        array[i]=array[i+skipCount];
    }
}

public E get(int index){
    if(index > current_size){throw new RuntimeException("Invalid index");}
    E element = (E) array[index];
    return element;
}

public void set(int index,E e){
//    if(index > current_size){throw new RuntimeException("Invalid index");}
    
    array[index]=e;
   // return e;
}
}