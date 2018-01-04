package com.lewis;

import javax.inject.Inject;
import java.io.PrintStream;

/**
 * Created by Administrator on 2018/1/4.
 */
public class PrintStreamWriter implements MyDestination {

    private PrintStream destination;

    @Inject
    public PrintStreamWriter(PrintStream destination) {
        this.destination = destination;
    }

    public void write(String str) {
        destination.println(str);
    }
}
