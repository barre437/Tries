package com.enellpii.tries;

/**
 * Created by melissa on 6/27/17.
 */

public class TrieModel implements ModelViewPresenterComponents.Model {
    // Models need a reference to the TriePresenter they interact with
    private ModelViewPresenterComponents.TriePresenterContract mPresenter;

    public TrieModel(ModelViewPresenterComponents.TriePresenterContract presenter){
        this.mPresenter = presenter;

        // would need to initialize any thing in this model that might
        // be considered internal data
    }

    @Override
    public Trie getTrie() {
        return null;
    }

    @Override
    public void refresh() {

    }
}
