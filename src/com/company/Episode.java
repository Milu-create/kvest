package com.company;

public class Episode {
    protected Episode[] many_situation;
    protected String situation;
    protected String value;
    protected int dCareer;
    protected int dMoney;
    protected int dReputation;

    protected Episode(String situation, String value, int dcareer, int dmoney, int dreputation) {
        this.situation = situation;
        this.value = value;
        dCareer = dcareer;
        dMoney = dmoney;
        dReputation = dreputation;
    }

    protected Episode(String situation, String value, int variants) {
        this.situation = situation;
        this.value = value;
        many_situation = new Episode[variants];
    }

    Episode(){}
}
