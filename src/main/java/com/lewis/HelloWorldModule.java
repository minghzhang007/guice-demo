package com.lewis;

import com.google.inject.AbstractModule;

import java.io.PrintStream;

/**
 * Created by Administrator on 2018/1/4.
 */
public class HelloWorldModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MyApplet.class).to(StringWriteApplet.class);
        bind(MyDestination.class).to(PrintStreamWriter.class);
        bind(PrintStream.class).toInstance(System.out);
        bind(String.class).annotatedWith(Output.class).toInstance("Hello world");

    }
}
