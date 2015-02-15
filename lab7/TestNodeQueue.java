

import static org.junit.Assert.*;
import org.junit.Test;


public class TestNodeQueue {

	@Test
	public void test() {
		NodeQueue<String> B = new NodeQueue<String>();
		int s1 = B.size();
		assertEquals(0,s1);
		B.enqueue("Computer");
		B.enqueue("Science");
		B.enqueue("is");
		B.enqueue("interesting");
		String s2 = B.front();
		assertEquals("Computer", s2);
		String s3 = B.dequeue();
		assertEquals("Computer", s3);
	
		
		
	}

	@Test (expected=QueueEmptyException.class)
	public void emptyQueueTest () {
		NodeQueue<String> B = new NodeQueue<String>();
		int s1 = B.size();
		assertEquals(0,s1);
		B.enqueue("Computer");
		B.enqueue("Science");
		B.enqueue("is");
		B.enqueue("interesting");
		String s3 = B.dequeue();
		s3 = B.dequeue();
		s3 = B.dequeue();		
		s3 = B.dequeue();		
		s3 = B.dequeue();				
	}
	
}
