package com.alfredobejarano.recyclerviewexample.presenter.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.alfredobejarano.recyclerviewexample.R;
import com.alfredobejarano.recyclerviewexample.model.Book;
import com.alfredobejarano.recyclerviewexample.view.viewholder.BooksViewHolder;

import java.util.List;

/**
 * This class extends the {@link RecyclerView.Adapter class} to handle to content of the {@link com.alfredobejarano.recyclerviewexample.view.activity.MainActivity#mRecyclerView RecyclerView} widget.
 *
 * @author @AlfredoBejarano
 * @version 1.0
 * @since 15/08/2017.
 */

public class BooksAdapter extends RecyclerView.Adapter<BooksViewHolder> {
    List<Book> mBooks;

    public BooksAdapter(List<Book> books) {
        mBooks = books;
    }

    /**
     * This method creates a ViewHolder instance and returns it.
     * <p>
     * At this point, no widget inside the ViewHolder has being initialized.
     */
    @Override
    public BooksViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BooksViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book, parent, false));
    }

    /**
     * Attaches the created ViewHolder with the RecyclerView.
     * <p>
     * The widgets inside the recyclerView has been created.
     */
    @Override
    public void onBindViewHolder(BooksViewHolder holder, int position) {
        holder.Render(mBooks.get(position));
    }


    /**
     * This method returns how many child views the RecyclerVie has.
     *
     * @return The quantity of elements in the mBooks field, returns 0 if it is null;
     */
    @Override
    public int getItemCount() {
        return mBooks == null ? 0 : mBooks.size();
    }
}
