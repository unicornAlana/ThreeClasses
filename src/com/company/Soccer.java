package com.company;

public class Soccer {
    String opponent;
    int subs;
    String location;
    boolean injury;


    public Soccer (String opponent, String location, int subs)
    {
        this.subs = subs;
        this.opponent = opponent;
        this.location = location;
    }
    public String smell(int minutes, int temperature)
    {
        if (minutes < 30 || temperature < 40)
        {
            return "minimal";
        }
        else if (minutes < 60 || temperature < 55)
        {
            return "stinky";
        }
        return "very bad";
    }
    public String pain(int trainingDifficulty)
    {
        if (injury && trainingDifficulty > 7)
        {
            return "Dead";
        }
        else if (trainingDifficulty >= 9)
        {
            return "Sucky but not awful";
        }
        else if (injury)
        {
            return "Miserable";
        }
        else if (trainingDifficulty > 5)
        {
            return "Tired but okay";
        }
        return "Meh, it's whatever";
    }


}
