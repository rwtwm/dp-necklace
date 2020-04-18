package org.model;
import org.junit.Test;
import static org.junit.Assert.*;

public class NecklaceTest
{
    @Test
    public void testIterator()
    {
        Necklace necklace = new Necklace("necklace");
        String newString = necklace.iterateString(necklace.getOriginalString());
        assertEquals(newString, "enecklac");
    }

    @Test
    public void testReverse()
    {
        ReverseNecklace necklace = new ReverseNecklace("necklace");
        String newString = necklace.iterateString(necklace.getOriginalString());
        assertEquals(newString, "ecklacen");
    }

    @Test
    public void testCompare()
    {
        Necklace first = new Necklace("abcde");
        Necklace second = new Necklace("bcdea");
        assertTrue(Necklace.compare(first, second));
    }
}
