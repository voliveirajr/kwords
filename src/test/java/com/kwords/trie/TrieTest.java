package com.kwords.trie;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class TrieTest {
	
	@Test
	public void testCount(){
		Trie t = new Trie();
		
		t.addWord("abc");
		t.addWord("abc");
		t.addWord("abcde");
		t.addWord("abcde");
		t.addWord("abcde");
		t.addWord("fghij");
		
		WordSet m = t.getWords();
		
		Assert.assertTrue(m.pollLast().getCount() == 3);
		Assert.assertTrue(m.pollLast().getCount() == 2);
		Assert.assertTrue(m.pollLast().getCount() == 1);
	}
}
