package com.company;

public class Еpisode {
    protected Еpisode[] many_situation;
    protected String situation;
    protected String value;
    protected int dCareer;
    protected int dMoney;
    protected int dReputation;

    protected Еpisode(String situation, String value, int dcareer, int dmoney, int dreputation) {
        this.situation = situation;
        this.value = value;
        dCareer = dcareer;
        dMoney = dmoney;
        dReputation = dreputation;
    }

    protected Еpisode(String situation, String value, int variants) {
        this.situation = situation;
        this.value = value;
        many_situation = new Еpisode[variants];
    }

    Еpisode(){}
}
