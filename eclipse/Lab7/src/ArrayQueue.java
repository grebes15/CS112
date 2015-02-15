

public class ArrayQueue<E> {

    private E storage[];
    private int N;
    private int f;
    private int r;
	
	//declare the size of the Array	  
    public ArrayQueue(int size) {
	N=size;
	storage = (E[]) new Object[size]; // compiler may give warning, but this is ok
    }
	//will return the size of the Array
    public int size() {
	return (N - f + r) % N;//from page 222 of the textbook of psuedo code
    }
	//will return if the ArrayQueue is empty.
	  
    public Boolean isEmpty() {
	return (f == r);//from page 222 of the textbook of psuedo code
    }
	//will reutrn the front of the ArrayQueue as long as it is not empty.
    public E front() {
	if (isEmpty()) {
	    throw new QueueEmptyException("Queue is empty");
	}
	return storage[f];
    }
	//will show the top of the ArrayQueue and remove it as long as it is not empty
    public E dequeue() {
	if (isEmpty()) {
	    throw new QueueEmptyException("Queue is empty");
	}
	E temp = storage[f];//from page 222 of the textbook of psuedo code
	storage[f] = null;
	f=(f+1) % N;
	return temp;
    }
	//will add an element on the ArrayQueue as long as it is not full
    public void enqueue(E e){
	if(size() == N - 1){
			  
	    throw new QueueFullException("Queue is full");
	}
	storage[r] = e;//from page 222 of the textbook of psuedo code
	r = (r+1) % N;
    }
	//toString method to return the elements of ArrayQueue instead of returning the postiion of the elements in the ArrayQueue 
	public String toString(){
		String str = "";
		for(int i = 0; i < r; i++){
			str = str + storage[i].toString() + " ";
		}
		return str;
	}	

}
