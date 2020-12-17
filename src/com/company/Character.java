package com.company;

public class Character {
    public int career = 1000;
    public int money = 20000;
    public int reputation = 2;
    public String role;

    public Character(String role) {
        this.role = role;
    }

    public String ret_name(){
        return role;
    }

    public void plus(int career, int money, int reputation) {
        this.career += career;
        this.money += money;
        this.reputation += reputation;
    }
}
