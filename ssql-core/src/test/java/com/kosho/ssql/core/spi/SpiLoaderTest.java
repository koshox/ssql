package com.kosho.ssql.core.spi;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

class SpiLoaderTest {
    @Test
    void loadInstance() {
        Foo foo = SpiLoader.of(Foo.class).load("foo3");
        Assert.assertTrue(foo instanceof FooImpl3);
    }

    @Test
    void loadDefaultInstance() {
        Foo foo = SpiLoader.of(Foo.class).loadDefault();
        Assert.assertTrue(foo instanceof FooImpl2);
    }

    @Test
    void loadInstanceByPriority() {
        Foo foo = SpiLoader.of(Foo.class).loadHighestPriority();
        Assert.assertTrue(foo instanceof FooImpl1);
    }

    @Test
    void loadAllInstances() {
        List<Foo> foos = SpiLoader.of(Foo.class).loadAll();
        Assert.assertEquals(3, foos.size());
    }

    @Test
    void loadSingleton() {
        Foo foo = SpiLoader.of(Foo.class).loadHighestPriority();
        Foo foo2 = SpiLoader.of(Foo.class).loadHighestPriority();
        Assert.assertEquals(foo, foo2);
    }

    @Test
    void loadNotSingleton() {
        Foo foo3 = SpiLoader.of(Foo.class).load("foo3");
        Foo foo32 = SpiLoader.of(Foo.class).load("foo3");
        Assert.assertNotEquals(foo3, foo32);
    }
}