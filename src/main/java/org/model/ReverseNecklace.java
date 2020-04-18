package org.model;

public class ReverseNecklace extends Necklace
{
    public ReverseNecklace(String startString) {
        super(startString);
    }

    //End index can be accessed from the superclass as it is a protected variable.
    @Override
    public String iterateString(String string) {
        return string.substring(1,endIndex+1) + string.substring(0,1);
    }
}
