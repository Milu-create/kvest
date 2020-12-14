package com.company;

import java.util.Scanner;

public class Main {
    protected static Character role;
    protected static Story story;

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        role = new Character(a.next());
        story = new Story();
        while (true){
            role.reputation += story.dReputation;
            role.money += story.dMoney;
            role.career += story.dCareer;
            System.out.println("Ваши подписчики: "+role.career+"; ваша репутация: "+role.reputation+
                    "; ваши сбережения: "+role.money+".");
            System.out.println(story.start.situation+"\n"+story.start.value);
            if(story.isEnd()){
                System.out.println("Конец!");
                return;
            }
            story.play(a.nextInt());
        }
    }
}
