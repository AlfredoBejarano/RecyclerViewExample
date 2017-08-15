package com.alfredobejarano.recyclerviewexample.presenter;

import android.os.Handler;

import com.alfredobejarano.recyclerviewexample.model.Book;
import com.alfredobejarano.recyclerviewexample.view.activity.MainActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * This class handles the construction and initialization of Models to be shown to the view.
 *
 * @author @AlfredoBejarano
 * @version 1.0
 * @since 15/08/2017.
 */

public class MainPresenter {
    private static int DELAY_FIVE_SECONDS = 5000;

    public MainPresenter(final MainActivity view) {
        // Simulate an API call by delaying the code execution by 5 seconds.
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                view.setup(createBooks());
            }
        }, DELAY_FIVE_SECONDS);
    }

    /**
     * This method is a simulation of an API retrieving a list of books.
     */
    private List<Book> createBooks() {
        ArrayList<Book> books = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            books.add(new Book("Harry Potter and the Philosopher Stone", "http://ecx.images-amazon.com/images/I/51szYPO-G7L.jpg", 4));
            books.add(new Book("The Hunger Games Catching Fire", "https://images-na.ssl-images-amazon.com/images/I/51sdYzYGOuL._SX334_BO1,204,203,200_.jpg", 3));
            books.add(new Book("The Last Wish", "https://upload.wikimedia.org/wikipedia/en/1/14/Andrzej_Sapkowski_-_The_Last_Wish.jpg", 5));
        }
        return books;
    }
}
