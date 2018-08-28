package com.soft.slk.training.inheritance;

public class MountainBike extends Bicycle 
{
     
    // subclass adds one more field
    public int seatHeight;
 
    // the MountainBike subclass has one constructor
    public MountainBike(int gear,int speed,
                        int seatHeight)
    {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        this.seatHeight = seatHeight;
    } 
         
    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        this.seatHeight = newValue;
    } 
     
    // overriding toString() method
    // of Bicycle to print more info
    @Override
    public String toString()
    {
        return (super.toString()+
                "\n seat height is "+ this.seatHeight);
    }
     
}