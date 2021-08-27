package com.kosho.ssql.core.spi;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

class SpiLoaderTest {
    @Test
    void loadInstance() {
        Foo foo = SpiLoader.of(Foo.class).loadInstance("foo3");
        Assert.assertTrue(foo instanceof FooImpl3);
    }

    @Test
    void loadDefaultInstance() {
        Foo foo = SpiLoader.of(Foo.class).loadDefaultInstance();
        Assert.assertTrue(foo instanceof FooImpl2);
    }

    @Test
    void loadInstanceByPriority() {
        Foo foo = SpiLoader.of(Foo.class).loadInstanceByPriority();
        Assert.assertTrue(foo instanceof FooImpl1);
    }

    @Test
    void loadAllInstances() {
        List<Foo> foos = SpiLoader.of(Foo.class).loadAllInstances();
        Assert.assertEquals(3, foos.size());
    }

    @Test
    void loadSingleton() {
        Foo foo = SpiLoader.of(Foo.class).loadInstanceByPriority();
        Foo foo2 = SpiLoader.of(Foo.class).loadInstanceByPriority();
        Assert.assertEquals(foo, foo2);
    }

    @Test
    void loadNotSingleton() {
        Foo foo3 = SpiLoader.of(Foo.class).loadInstance("foo3");
        Foo foo32 = SpiLoader.of(Foo.class).loadInstance("foo3");
        Assert.assertNotEquals(foo3, foo32);
    }
}