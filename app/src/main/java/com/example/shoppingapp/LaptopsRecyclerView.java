package com.example.shoppingapp;

public class LaptopsRecyclerView {

    private int mImageResource;
    private String mText1, mText2,mText3,mText4;

    public String getmText3() {
        return mText3;
    }

    public String getmText4() {
        return mText4;
    }

    public LaptopsRecyclerView(int mImageResource, String text1, String text2, String text3, String text4){
         mText1=text1;
         mText2=text2;
         mText3=text3;
         mText4=text4;
         this.mImageResource=mImageResource;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getText1(){
        return mText1;
    }
    public String getText2(){
        return mText2;
    }
}
