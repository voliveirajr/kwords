package com.kwords.heap;

import org.junit.Assert;
import org.junit.Test;

public class MinHeapTest {
    
    @Test
    public void testHeap(){
        
        WordSet heap = new WordSet(3);
        
        WordNode node;
        
        node = new WordNode("t4", 4);
        heap.add(node);
        node = new WordNode("t5", 5);
        heap.add(node);
        node = new WordNode("t2", 2);        
        heap.add(node);
        node = new WordNode("t6", 6);        
        heap.add(node);
        node = new WordNode("t10", 10);
        heap.add(node);
        node = new WordNode("t3", 3);
        heap.add(node);
        node = new WordNode("t1", 1);
        heap.add(node);
        
        WordNode n;
        n = heap.pollFirst();
        Assert.assertTrue(n.getCount() == 10);
        n = heap.pollFirst();
        Assert.assertTrue(n.getCount() == 6);
        n = heap.pollFirst();
        Assert.assertTrue(n.getCount() == 5);
    }
}
