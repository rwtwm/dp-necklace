package org.launcher;

import org.model.Necklace;
import org.model.ReverseNecklace;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ReverseNecklace necklace = new ReverseNecklace("waine");

        List<String> necklaceStrings = necklace.getPossibleStrings();
        for(String string: necklaceStrings){
            System.out.println(string);
        }



    }
}
