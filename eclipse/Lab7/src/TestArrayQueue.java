

import static org.junit.Assert.*;
import org.junit.Test;

public class TestArrayQueue {

    @Test
	public void test() {
	ArrayQueue<Integer> A = new ArrayQueue<Integer>(1000);
	int i1 = A.size();
	assertEquals(0,i1);	    
	A.enqueue(5);
	A.enqueue(3);
	int i2 = A.front();
	assertEquals(5,i2);
	int i3 = A.dequeue();
	assertEquals(5,i3);
    }


    @Test(expected=QueueFullException.class)
	public void testFull() {
	ArrayQueue<Integer> B = new ArrayQueue<Integer>(10);
	for (int i=0;i<=20;i++){
	    B.enqueue(i);
	}
    }

	
    @Test(expected=QueueEmptyException.class)
	public void testEmpty() {
	ArrayQueue<Integer> C	= new ArrayQueue<Integer>(5);
	int b1 = C.size();
	assertEquals(0, b1);
	C.enqueue(15);
	C.enqueue(30);
	int b2 = C.dequeue();
	assertEquals(15, b2);
	int b3 = C.dequeue();
	assertEquals(30, b3);
	int b4 = C.dequeue();
	assertEquals(0, b4);
    }

}
