import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void greet() {
        String name = "Miho";
        String expected = "Hello, " + name;
        String actual = Greetings.greet(name);
        assertEquals(expected, actual);
    }
    @Test
    void greetNull() {

        String expected = "Hello, my friend.";
        String actual = Greetings.greet(null);
        assertEquals(expected, actual);
    }

    @Test
    void greetCaps() {

        String expected = "HELLO, MIHO.";
        String actual = Greetings.greet("MIHO");
        assertEquals(expected, actual);
    }

    @Test
    void greetMultiple() {

        String expected = "HELLO, Miho and Maho.";
        String [] names = {"Miho", "Maho"};
        String actual = Greetings.greet(names);
        assertEquals(expected, actual);
    }




}