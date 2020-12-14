package com.company;

public class Character {
    public int career;
    public int money;
    public int reputation;
    public String role;

    public Character(String role) {
        career = 1000;
        money = 20000;
        reputation = 2;
        this.role = role;
    }

    public Character(String role, int career, int money, int reputation) {
        this.career = career;
        this.money = money;
        this.reputation = reputation;
        this.role = role;
    }
}
