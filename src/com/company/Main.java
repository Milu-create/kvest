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
        System.out.println(story.start.situation+"\n"+story.start.value);
        while (true){
            int num = a.nextInt();
            System.out.println(story.start.many_situation[num-1].situation+"\n"+story.start.many_situation[num-1].value);
            role.plus(story.start.many_situation[num-1].dCareer,
                    story.start.many_situation[num-1].dMoney,
                    story.start.many_situation[num-1].dReputation);
            System.out.println("Ваши подписчики: "+role.career+"; ваша репутация: "+role.reputation+
                    "; ваши сбережения: "+role.money+".");
            if(role.money>=100000 && role.reputation>=100){
                System.out.println(role.ret_name()+", вы достигли ошеломительного успеха!\nПродолжайте в том же духе!");
                break;
            }
        }
    }
}