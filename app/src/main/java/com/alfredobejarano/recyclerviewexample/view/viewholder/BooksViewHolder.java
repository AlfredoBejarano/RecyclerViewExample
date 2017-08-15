package com.alfredobejarano.recyclerviewexample.view.viewholder;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.alfredobejarano.recyclerviewexample.R;
import com.alfredobejarano.recyclerviewexample.model.Book;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * This class defines the child view layout in the {@link com.alfredobejarano.recyclerviewexample.view.activity.MainActivity#mBooksRecyclerView RecyclerView}
 *
 * @author @AlfredoBejarano
 * @version 1.0
 * @since 15/08/2017.
 */

public class BooksViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.book_cover)
    SimpleDraweeView mBookCoverView;
    @BindView(R.id.book_title)
    TextView mBookTitleView;
    @BindView(R.id.book_rating)
    TextView mBookRatingView;

    public BooksViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView); // Binds this layout views.
    }

    /**
     * This method displays the book data into the RecyclerView child.
     */
    public void Render(Book book) {
        mBookCoverView.setImageURI(Uri.parse(book.getCover()));
        mBookTitleView.setText(book.getName());
        mBookRatingView.setText(String.format(itemView.getContext().getString(R.string.book_rating), book.getRating()));
    }
}
