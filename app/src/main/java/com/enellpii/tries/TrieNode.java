package com.enellpii.tries;

/**
 * Created by melissa on 6/20/17.
 */

public class TrieNode {
    TrieNode[] children;
    boolean isWord;
    public TrieNode(){
        this.children = new TrieNode[26];
    }
}
