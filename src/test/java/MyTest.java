import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.CDATASection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
class MyTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void myTest(){
        System.out.println("first test of method");
        String actual = new MyClass().myMethod();
        String expected = "Hello";
        assertEquals(expected,actual);



    }

}