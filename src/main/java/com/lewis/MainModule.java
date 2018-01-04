package com.lewis;

import com.google.inject.AbstractModule;

/**
 * Created by Administrator on 2018/1/4.
 */
public class MainModule extends AbstractModule {
    @Override
    protected void configure() {
        install(new HelloWorldModule());
    }

}
