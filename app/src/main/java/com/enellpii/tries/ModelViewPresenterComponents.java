package com.enellpii.tries;

/**
 * Created by melissa on 6/27/17.
 */

public interface ModelViewPresenterComponents {

    //View
    interface View{
        void notifyGridUpdated();
    }

    /** TriePresenter operations are meant for the views that deal with presenting game grid information.
     *  This interface contains a "contract" of the functions that will be implemented by any
     *  Presenters that can work with grid/trie data.
     */
    interface TriePresenterContract{
        void refresh();
        void notifyModelUpdated();
        Trie getTrie();
    }

    /** Model Operations
     *  Interface for Models that presenters will need to use to acquire and set data about the model.
     *  In this case, the model is our [tbd]
     */
    interface Model{
        Trie getTrie();
        void refresh();
    }
}
