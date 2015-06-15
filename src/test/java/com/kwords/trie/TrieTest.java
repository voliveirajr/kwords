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
		
		Map<String, Integer> m = t.getWords();
		
		Assert.assertTrue(m.get("abc") == 2);
		Assert.assertTrue(m.get("abcde") == 3);
		Assert.assertTrue(m.get("fghij") == 1);
				
	}

}
