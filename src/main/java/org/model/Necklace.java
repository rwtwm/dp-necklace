package org.model;

import java.util.ArrayList;
import java.util.List;

public class Necklace
{
    //compare is a reasonable name, as it must be called as Necklace.compare()
    public static boolean compare(Necklace necklace1, Necklace necklace2)
    {
        String neckTwoOriginal = necklace2.getOriginalString();

        for(String arrangement: necklace1.getPossibleStrings()){
            if(arrangement.equals(neckTwoOriginal)){
                return true;
            }
        }

        return false;
    }

    protected String originalString;
    protected List<String> possibleStrings;
    protected int endIndex;

    public Necklace(String startString)
    {
        originalString = startString;
        endIndex = originalString.length() -1;
        createPossibleStrings();
    }

    public String iterateString(String string)
    {
        return string.substring(endIndex) + string.substring(0,endIndex);
    }

    private void createPossibleStrings()
    {
        possibleStrings = new ArrayList<>();
        possibleStrings.add(originalString);

        boolean reachedStart = false;
        String currentString = originalString;
        String newString = "";

        while (!reachedStart)
        {
            newString = iterateString(currentString);
            if (newString.equals(originalString))
            {
                reachedStart = true;
            }
            else
            {
                possibleStrings.add(newString);
                currentString = newString;
            }
        }
    }

    public List<String> getPossibleStrings() {return possibleStrings;}

    public String getOriginalString(){return originalString;}
}
