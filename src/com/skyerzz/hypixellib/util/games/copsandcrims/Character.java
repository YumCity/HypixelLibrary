package com.skyerzz.hypixellib.util.games.copsandcrims;

import com.skyerzz.hypixellib.util.CURRENCY;

/**
 * Created by sky on 23-8-2016.
 */
public class Character {

    private int pocketChange, strengthTraining, bountyHunter;

    public Character(int pocketChange, int strengthTraining, int bountyHunter){
        this.pocketChange = pocketChange;
        this.strengthTraining = strengthTraining;
        this.bountyHunter = bountyHunter;
    }

    public int getCost(int level){
        double multiplier = 2;
        switch(level){
            case 1:
                return (int) (50*multiplier);
            case 2:
                return (int) (100*multiplier);
            case 3:
                return (int) (250*multiplier);
            case 4:
                return (int) (625*multiplier);
            case 5:
                return (int) (1550*multiplier);
            case 6:
                return (int) (4000*multiplier);
            case 7:
                return (int) (10000*multiplier);
            case 8:
                return (int) (25000*multiplier);
            case 9:
                return (int) (90000*multiplier);
            default: return 0;
        }
    }

    public CURRENCY getCurrencyType(){
        return CURRENCY.COINS;
    }

    public int getPocketChange() {
        return pocketChange;
    }

    public int getStrengthTraining() {
        return strengthTraining;
    }

    public int getBountyHunter() {
        return bountyHunter;
    }
}