package com.lewis;

import com.google.inject.Provider;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/1/4.
 */
public class StringWriteApplet implements MyApplet {

    private MyDestination destination;

    private Provider<String> stringProvider;

    @Inject
    public StringWriteApplet(MyDestination destination,@Output Provider<String> stringProvider) {
        this.destination = destination;
        this.stringProvider = stringProvider;
    }

    private void writeString() {
        destination.write(stringProvider.get());
    }

    public void run() {
        writeString();
    }
}
