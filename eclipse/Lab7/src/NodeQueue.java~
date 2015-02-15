

public class NodeQueue<E> {

    private int size;
    private Node<E> head;
    private Node<E> tail;

	//will return how many elements are in the NodeQueue.
    public int size() {
	return size;
    }
	//will return ture if the size of the NodeQueue is 0.
    public Boolean isEmpty() {
	if (size == 0) {
	    return true;
	} else {
	    return false;
	}
    }
	//will return the top of NodeQueue as long as the queue is not empty.
    public E front() {
	if (size == 0){
	    throw new QueueEmptyException("Queue is empty.");
	}
	E tmp = head.getElement();
	return tmp;
    }

	//will return the top of the NodeQueue and remove it as long as it is not empty
    public E dequeue() throws QueueEmptyException {
	if (size == 0){
	    throw new QueueEmptyException("Queue is empty.");
	}
	E tmp = head.getElement();
	head = head.getNext();
	size--;
	if (size == 0)
	    tail = null; // the queue is now empty
	return tmp;
    }

	//will add an element at the NodeQueue.
    public void enqueue(E elem){
	Node<E> node = new Node<E>();
	node.setElement(elem);
	node.setNext(null); // node will be new tail node

	if (size == 0){
	    head = node; // special case of a previously empty queue
	}else{
	    tail.setNext(node); // add node at the tail of the list
	}
	tail = node; // update the reference to the tail node
	size++;
    }

	//toString method to return the elements of NodeQueue instead of returning the postiion of the elements in the NodeQueue    
    public String toString() {
        String s;
        Node<E> tail = null;
        s = "[";
        int n = size();
        if (n > 0) {
          tail = head;
          s += tail.getElement();
        }
        if (n > 1)
          for (int i = 1; i <= n-1; i++) {
    	tail = tail.getNext();
    	s += ", " + tail.getElement();
          }
        s += "]";
        return s;
      }
}
