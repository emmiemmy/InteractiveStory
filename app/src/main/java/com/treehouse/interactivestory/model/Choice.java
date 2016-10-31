package com.treehouse.interactivestory.model;

/**
 * Created by emmashakespeare on 2016-10-21.
 */

public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(String text, int nextPage){
        this.mText = text;
        mNextPage = nextPage;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

}
