package com.company;

public class Story extends Еpisode {
    public Еpisode now_episode;
    public final Еpisode start = new Еpisode("Первый шаг к популярности",
            """
                    Вы вспомнили про свой старый канал на YuTube.Что вы сделаете?
                    (1)Вы купите новую камеру и микофон и начнёте снимать новые видео.
                    (2)Удалите канал и больше о нём не вспомните.
                    (3)Будите снимать видео на старую камеру""", 3);

    public Story() {
        start.many_situation[0] = new Еpisode("Успех!",
                "Вы потратили много денег, но ваш канал вырос в 5 раз и заработали столько же, сколько вы потратили.",
                4000, 0, 20);
        start.many_situation[2] = new Еpisode("Большой успех!",
                "Вы не опустили руки ваш канал вырос в 5 раз благодаря вашему усердию.",
                4000, 20000, 100);
        start.many_situation[1] = new Еpisode("Вы упустили свою популярность.",
                "Вам нужно искать другие способы заработка.", -1000, 0, -2);
        now_episode = start;
    }

    public void play(int num) {
        if(num<=now_episode.many_situation.length) now_episode=now_episode.many_situation[num-1];
        else System.out.println("Введите число от 1 до " + now_episode.many_situation.length);
    }

    public boolean isEnd() {
        return now_episode.many_situation.length==0;
    }
}
