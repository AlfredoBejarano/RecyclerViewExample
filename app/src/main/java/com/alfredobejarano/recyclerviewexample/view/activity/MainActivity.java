package com.alfredobejarano.recyclerviewexample.view.activity;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.alfredobejarano.recyclerviewexample.R;
import com.alfredobejarano.recyclerviewexample.model.Book;
import com.alfredobejarano.recyclerviewexample.presenter.MainPresenter;
import com.alfredobejarano.recyclerviewexample.presenter.adapter.BooksAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * This Activity contains the RecyclerView.
 */
public class MainActivity extends AppCompatActivity {
    /**
     * Reference the  RecyclerView using {@link butterknife.ButterKnife}
     */
    @BindView(R.id.main_recycler_view)
    RecyclerView mBooksRecyclerView;
    @BindView(R.id.loading_view)
    ConstraintLayout mLoadingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this); // Bind the views annotated with @BindView.
        new MainPresenter(this); // Initializes this view presenter.
    }

    /**
     * This method receives the data retrieved by the presenter and draws it
     * the respective widgets.
     *
     * @param data List<Book> - A list of {@link Book Books}.
     */
    public void setup(List<Book> data) {
        // Defines how the child views are going to be drawn into the RecyclerView.
        mBooksRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Sets the adapter that will define the behaviour of the RecyclerView data display.
        mBooksRecyclerView.setAdapter(new BooksAdapter(data));

        // Hide the loading view and display the books list.
        mLoadingView.setVisibility(View.GONE);
        mBooksRecyclerView.setVisibility(View.VISIBLE);
    }
}
