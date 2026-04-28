package pl.zajecia.app1;

import org.junit.Test;

import static org.junit.Assert.*;

public class App1ApplicationTest {

    @Test
    public void add() {
        App1Application app1 = new App1Application();
        assertEquals(10, app1.add(5, 5));
    }
}