package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stackQueue_demo {

	public static void main(String[] args)
	{
		Stack<Integer>s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s);
		int ele = s.pop();
		System.out.println(s+"element removed "+ele);
		// Last element which ever get into the stack(4) will bethe first to go out(4)
		// LIFO --> Last In First Out
		
		Queue<Integer>q= new LinkedList<>();// we can use ArrayList also
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		int eleQu = q.poll();
		System.out.println("After poll "+q+",Got polled: "+eleQu);
		// The element whichever got added to the queue on the first time it got removed by savingpoll
		// FIFO -->First in First out
	}

}
