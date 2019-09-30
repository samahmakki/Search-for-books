package com.samahmakki.seacrhforbooks;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(Context context, List<Book> books) {
        super(context, 0, books);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.book_list_item, parent, false);
        }

        Book currentBook = getItem(position);

        TextView bookNameView = listItemView.findViewById(R.id.book_name);
        bookNameView.setText(currentBook.getBookName());

        ImageView bookImageView = listItemView.findViewById(R.id.book_image);
        bookImageView.setImageBitmap(currentBook.getBitmap());


        TextView authorNameView = listItemView.findViewById(R.id.author_name);
        authorNameView.setText(currentBook.getAuthorName());

       TextView publishedDateView = listItemView.findViewById(R.id.published_date);
       publishedDateView.setText(currentBook.getPublishedDate());

        return listItemView;
    }

}
