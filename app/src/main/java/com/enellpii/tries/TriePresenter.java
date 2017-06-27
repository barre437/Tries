package com.enellpii.tries;

/**
 * Created by melissa on 6/27/17.
 */

public class TriePresenter implements ModelViewPresenterComponents.TriePresenterContract {
    // presenter needs to talk with her model
    private ModelViewPresenterComponents.Model mModel;
    private ModelViewPresenterComponents.View mView;

    public TriePresenter(ModelViewPresenterComponents.View trieView){
        mView = trieView;
        mModel = new TrieModel(this);
    }

    @Override
    public void refresh() {
        mModel.refresh();
    }

    @Override
    public void notifyModelUpdated() {
        mView.notifyGridUpdated();
    }
}
