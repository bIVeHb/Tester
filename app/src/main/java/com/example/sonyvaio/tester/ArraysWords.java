package com.example.sonyvaio.tester;

import java.util.HashSet;
import java.util.Random;

/**
 * Created by SonyVaio on 09.11.2017.
 */

public class ArraysWords {



    final static Word[] actions = {new Word("blow", "дуть", "blow", R.drawable.blow), new Word("catch", "ловить", "catch", R.drawable.catchmy),
            new Word("clap", "хлопать", "clap", R.drawable.clap), new Word("cut", "резать", "cut", R.drawable.cut),
            new Word("dance", "танцевать", "dance", R.drawable.dance), new Word("dig", "копать", "dig", R.drawable.dig),
            new Word("drink", "пить", "drink", R.drawable.drink), new Word("eat", "кушать", "eat", R.drawable.eat),
            new Word("follow", "следовать", "follow", R.drawable.follow), new Word("go", "идти", "go", R.drawable.go),
            new Word("hide", "прятать(ся)", "hide", R.drawable.hide), new Word("hug", "обниматься", "hug", R.drawable.hug),
            new Word("jump", "прыгать", "jump", R.drawable.jump), new Word("listen", "слушать", "listen", R.drawable.listen),
            new Word("look", "смотреть", "look", R.drawable.look), new Word("point", "указывать", "point", R.drawable.point),
            new Word("pull", "тянуть", "pull", R.drawable.pull), new Word("read", "читать", "read", R.drawable.read),
            new Word("run", "бежать", "run", R.drawable.run), new Word("share", "делиться", "share", R.drawable.share),
            new Word("shout", "кричать", "shout", R.drawable.shout), new Word("sing", "петь", "sing", R.drawable.sing),
            new Word("smell", "пахнуть", "smell", R.drawable.smell), new Word("smile", "улыбаться", "smile", R.drawable.smile),
            new Word("talk", "разговаривать", "talk", R.drawable.talk), new Word("taste", "пробовать", "taste", R.drawable.taste),
            new Word("touch", "касаться", "touch", R.drawable.touch), new Word("underline", "подчеркивать", "underline", R.drawable.underline),
            new Word("wait", "ждать", "wait", R.drawable.wait), new Word("whisper", "шептать", "whisper", R.drawable.whisper),
            new Word("write", "писать", "write", R.drawable.write), };

    public static int randomInt(int length) {
        Random r = new Random();
        int rnd = r.nextInt(length); // вернет случайное число от 0 до длины массива
        return rnd;
    }

    public static void fillHashSet(HashSet<Integer> trainerSet, int size)
    {
        Random random = new Random();
        //int size = array.length;
        while (trainerSet.size() != 4) {
            trainerSet.add(random.nextInt(size));
        }
    }
}
