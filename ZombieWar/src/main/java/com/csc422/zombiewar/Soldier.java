package com.csc422.zombiewar;

public class Soldier extends Survivor
{
    private int objID = 0;
    
    public Soldier(int ID)
    {
        super(/*health*/100,/*attack*/ 10);
        this.objID = ID;
    }

    @Override
    public String toString()
    {
        return "Soldier " + objID;
    }

}

