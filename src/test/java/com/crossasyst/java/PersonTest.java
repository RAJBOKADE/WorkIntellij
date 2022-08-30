package com.crossasyst.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    public void helloworld()
    {
        Person p = new Person();
        assertEquals("Hello World", p.helloWorld() );
    }

}
