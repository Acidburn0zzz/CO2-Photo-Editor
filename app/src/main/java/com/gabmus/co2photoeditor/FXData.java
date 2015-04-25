package com.gabmus.co2photoeditor;

/**
 * Created by gabmus on 19/04/15.
 */
public class FXData {

    public final String name;
    public final int icon;
    public final int parCount;
    public int [] parValues;
    public final int [] parValuesDefault;
    public final String [] parNames;
    public boolean fxActive;

    public FXData (String name_, int icon_, int parCount_, int[] parValues_, String [] parNames_) {
        name=name_; icon=icon_; parCount=parCount_;
        parValues=parValues_; parValuesDefault=parValues_;
        parNames=parNames_; fxActive = false;
    }
}
