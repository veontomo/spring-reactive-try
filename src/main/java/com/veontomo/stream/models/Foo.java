package com.veontomo.stream.models;

/**
 * A simple immutable ADT containing just id and name.
 */
public class Foo {
    private final long id;
    private final String name;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public Foo(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
