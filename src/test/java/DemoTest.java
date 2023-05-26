import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import java.io.PrintStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class DemoTest {
    @Test
    public void test_is_triangle_1() {
        assertFalse(Demo.isTriangle(3, 4, 5));
    }

    @Test
    public void test_is_Not_triangle_2() {
        assertFalse(Demo.isTriangle(5, 13, 7));
    }

    @Test
    public void test_is_Not_triangle_3() {
        assertFalse(Demo.isTriangle(7, 5, 13));
    }

    @Test
    public void test_is_Not_triangle_4() {
        assertFalse(Demo.isTriangle(13, 7, 5));
    }

    @Test
    public void test_is_Not_triangle_5() {
        assertFalse(Demo.isTriangle(13, 5, 7));
    }

    @Test
    public void test_is_Not_triangle_6() {
        assertFalse(Demo.isTriangle(5, 9, 3));
    }

    @Test
    public void test_is_Not_triangle_7() {
        assertFalse(Demo.isTriangle(1, 2, -1));
    }

    @Test
    public void test_is_Not_triangle_8() {
        assertFalse(Demo.isTriangle(1, -3, 2));
    }

    @Test
    public void test_rain_program_9() {
        ByteArrayInputStream in = new ByteArrayInputStream("\n12\n13\n".getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String consoleOutput = "Enter side 1: \n";
        consoleOutput += "Enter side 2: \n";
        consoleOutput += "Enter side 3: \n";
        consoleOutput += "This is a triangle.\n";
        assertEquals(consoleOutput, out.toString());
    }
}
