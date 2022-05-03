package com.company;

public class TrackMeet {

    String location;
    double dismissal;
    int numberOfSnacks;
    boolean willStop;
    int numberOfSchools;

    public TrackMeet(String location, int numberOfSchools, double dismissal)
    {
        this.dismissal = dismissal;
        this.location = location;
        this.numberOfSchools = numberOfSchools;
    }

    public boolean needLunchBox(boolean willStop, boolean phoebe)
    {
        if (phoebe)
        {
            return true;
        }
        return willStop;
    }
    public String whichJacket(int temp, boolean isRaining)
    {
        if (isRaining)
        {
            return "Wear a rain jacket.";
        }
        else if (temp <= 45)
        {
            return "Wear a puffer.";
        }
        else if (temp <= 60)
        {
            return "Wear a sweatshirt.";
        }
        return "Wear a white sun jacket.";
    }
}
