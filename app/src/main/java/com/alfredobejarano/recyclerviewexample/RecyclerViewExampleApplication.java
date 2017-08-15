package com.alfredobejarano.recyclerviewexample;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * This class defines the global application settings.
 *
 * @author @AlfredoBejarano
 * @version 1.0
 * @since 15/08/2017.
 */

public class RecyclerViewExampleApplication extends Application {

    /**
     * Initializes Fresco.
     */
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
