package com.example.slpfinal;

public class CurrencyValues {
    int increment=1;
    int passiveIncrement=0;
    int money=1;
    int chest=0;
    int legs=0;
    int weapon=0;
    public int getMoney(){
        return money;
    }
    public int getChest(){
        return money;
    }public int getLegs(){
        return money;
    }public int getWeapon(){
        return money;
    }
    public void setMoney(int x){
        money+=x;
    }
    public void setChest(int x){
        chest=x;
    }
    public void setLegs(int x){
        legs=x;
    }
    public void setWeapon(int x){
        weapon=x;
    }
    public int getIncrement(){
        return increment;
    }
    public void setIncrement(int x) {
        increment=x;
    }
    public int getPassiveIncrement(){
        return passiveIncrement;
    }
    public void setPassiveIncrement(int x) {
        passiveIncrement=x;
    }
}
