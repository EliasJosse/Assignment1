package vecka1;


import static org.junit.Assert.*;

import org.junit.Test;


public class StackTest {

	@Test
	public void test1() {
		Stack a = new Stack(5);
		a.Push(6);
		int b = a.Pop();
		assertEquals(6, b);
	}
	
	@Test
	public void test2() {
		Stack a = new Stack(10);
		int[] x = {1, 2, 3, 4, 5};
		a.Push(5, x);
		int[] b = a.Pop(3);
		assertEquals(b[0], 3);
		assertEquals(b[1], 4);
		assertEquals(b[2], 5);
	}
	
	@Test
	public void test3() {
		StackMessage a = new StackMessage(5);
		Message x = new Message();
		a.Push(x);
		Message y = a.Pop();
		assertEquals(x, y);
	}
	
	@Test
	public void test4() {
		StackMessage s = new StackMessage(10);
		Message a = new Message();
		Message b = new Message();
		Message c = new Message();
		Message[] x = {a, b, c};
		s.Push(3, x);
		Message[] y = s.Pop(2);
		assertEquals(y[0], b);
		assertEquals(y[1], c);
	}
	
	@Test
	public void test5() {
		StackMessage s = new StackMessage(5);
		Message a = new Message();
		Message b = new Message();
		Message c = new Message();
		Message[] x = {a, b, c};
		s.Push(3, x);
		assertEquals(3, s.size());
	}

}
