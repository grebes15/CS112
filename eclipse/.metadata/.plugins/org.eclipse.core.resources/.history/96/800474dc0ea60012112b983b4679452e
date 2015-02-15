

public class ArrayQueue<E> {

    private E storage[];
    private int N;
    private int f;
    private int r;
	  
    public ArrayQueue(int size) {
	N=size;
	storage = (E[]) new Object[size]; // compiler may give warning, but this is ok
    }
	  
    public int size() {
	return (N - f + r) % N;
    }
	  
    public Boolean isEmpty() {
	return (f == r);
    }
	  
    public E front() {
	if (isEmpty()) {
	    throw new QueueEmptyException("Queue is empty");
	}
	return storage[f];
    }
	  
    public E dequeue() {
	if (isEmpty()) {
	    throw new QueueEmptyException("Queue is empty");
	}
	E temp = storage[f];
	storage[f] = null;
	f=(f+1) % N;
	return temp;
    }
    public void enqueue(E e){
	if(size() == N - 1){
			  
	    throw new QueueFullException("Queue is full");
	}
	storage[r] = e;
	r = (r+1) % N;
    }

}
