package com.samahmakki.seacrhforbooks;

import android.graphics.Bitmap;
import android.widget.ImageView;

public class Book {
    private String mBookName;
    private String mAuthorName;
    private Bitmap mImage;
    private String mPublishedDate;
    private String mLink;

    public Book(String bookName, Bitmap image, String authorName, String publishedDate, String link){
        mBookName = bookName;
        mAuthorName = authorName;
        mPublishedDate = publishedDate;
        mLink = link;
        mImage = image;
    }

    public String getBookName(){
        return mBookName;
    }

    public String getAuthorName(){
        return mAuthorName;
    }

    public Bitmap getBitmap(){
        return mImage;
    }

    public String getPublishedDate(){
        return mPublishedDate;
    }

    public String getLink(){
        return mLink;
    }
}
