package com.enellpii.tries;

/**
 * Created by melissa on 6/20/17.
 */

public class Trie {

    TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    public void insert(String word){
        TrieNode p = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            int index = c-'a';
            if(p.children[index] == null){
                TrieNode temp = new TrieNode();
                p.children[index]=temp;
                p = temp;
            }else{
                p=p.children[index];
            }
        }
        p.isWord = true;
    }

    public boolean search(String word){
        TrieNode p = searchNode(word);
        if(p == null){
            return false;
        }else if(p.isWord){
            return true;
        }

        return false;
    }

    public boolean startsWith(String prefix) {
        TrieNode p = searchNode(prefix);
        if(p == null){
            return false;
        }else{
            return true;
        }
    }

    public TrieNode searchNode(String s){
        TrieNode p = root;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int index = c-'a';
            if(p.children[index]!=null){
                p = p.children[index];
            }else{
                return null;
            }
        }

        if(p == root)
            return null;

        return p;
    }
}
