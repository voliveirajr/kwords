package com.kwords.heap;

import org.junit.Test;

public class MinHeapTest {
	
	@Test
	public void testHeap(){
		
		MinHeap heap = new MinHeap(3);
		
		HeapNode node;
		
		node = new HeapNode("t4", 4);
		heap.add(node);
		node = new HeapNode("t5", 5);
		heap.add(node);
		node = new HeapNode("t2", 2);		
		heap.add(node);
		node = new HeapNode("t6", 6);		
		heap.add(node);
		node = new HeapNode("t10", 10);
		heap.add(node);
		node = new HeapNode("t3", 3);
		heap.add(node);
		node = new HeapNode("t1", 1);
		heap.add(node);
		
		//TODO: assertions missing
	}

}
