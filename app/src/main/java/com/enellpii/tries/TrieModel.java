package com.enellpii.tries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by melissa on 6/27/17.
 */

public class TrieModel implements ModelViewPresenterComponents.Model {

    // Models need a reference to the TriePresenter they interact with
    private ModelViewPresenterComponents.TriePresenterContract mPresenter;

    Trie trie;

    public TrieModel(ModelViewPresenterComponents.TriePresenterContract presenter){
        this.mPresenter = presenter;

        // would need to initialize any thing in this model that might
        // be considered internal data
        trie = new Trie();
        try{
            makeDictTrie(trie);
        }catch (IOException e){
            System.out.println("File not found");
        }

    }

    public void makeDictTrie(Trie trie) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(MainActivity.assetManager.open("usa.txt")));
        String str;
        while((str = in.readLine()) != null){
            str = str.replaceAll("\'","");
            trie.insert(str);
        }

    }

    @Override
    public Trie getTrie() {
        return trie;
    }

    @Override
    public void refresh() {

    }
}
