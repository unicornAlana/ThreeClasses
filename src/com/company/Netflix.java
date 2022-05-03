package com.company;

public class Netflix {
    int hoursAllocated;
    int hourOfDay;

    public int howManyPoptarts()
    {
        return hoursAllocated * 3 + 1;
    }
    public String whatToWatch(boolean otherActivity)
    {
        if (otherActivity)
        {
            if (hourOfDay > 21)
            {
                return "Horribly great 2000's movie about High School";
            }
            else
            {
                return "Grey's Anatomy";
            }
        }
        else if(hourOfDay < 12)
        {
            return "Disney princess movie";
        }
        else if (hourOfDay < 5 && hoursAllocated <= 2)
        {
            return "Criminal Minds";
        }
        else if (hourOfDay < 7)
        {
            return "Sweet pixar movie";
        }
        return "Marvel movies";
    }
}
