package com.alfredobejarano.recyclerviewexample.model;

/**
 * This class acts as the DTO for filling the {@link com.alfredobejarano.recyclerviewexample.view.activity.MainActivity#mBooksRecyclerView RecyclerView}.
 *
 * @author @AlfredoBejarano
 * @version 1.0
 * @since 15/08/2017.
 */

public class Book {
    /**
     * The name of a book.
     */
    private String name;
    /**
     * The cover image of the book cover.
     */
    private String cover;
    /**
     * The rating of the book.
     */
    private int rating;

    public Book() {
        // Empty Constructor.
    }

    public Book(String name, String cover, int rating) {
        this.name = name;
        this.cover = cover;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
