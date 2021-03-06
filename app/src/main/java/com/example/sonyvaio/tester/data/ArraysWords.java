package com.example.sonyvaio.tester.data;

import com.example.sonyvaio.tester.R;
import com.example.sonyvaio.tester.model.Word;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;

/**
 * Created by SonyVaio on 09.11.2017.
 */

public class ArraysWords {

    public final static HashMap<String, ArrayList<Word>> mThemesMap = new HashMap<>();

    final static ArrayList<ArrayList<Word>> themesList = new ArrayList<ArrayList<Word>>();
    public final static ArrayList<Map.Entry<String, ArrayList<Word>>> themesList2 = new ArrayList<>();


    public ArraysWords() {
        mThemesMap.put("Глаголы", actions);
        mThemesMap.put("Алфавит", alphabet);
        mThemesMap.put("Части тела животных", animalBodyParts);
        mThemesMap.put("Животные", animals);
        mThemesMap.put("Птицы", birds);
        mThemesMap.put("Насекомые", bugs);
        mThemesMap.put("Школьные предметы", classroomObjects);
        mThemesMap.put("Одежда", clothes);
        mThemesMap.put("Цвета", colours);
        mThemesMap.put("Прилагательные", describing);
        mThemesMap.put("Повседневные предметы", everydayObjects);
        mThemesMap.put("Сказка", fairyStories);
        mThemesMap.put("Семья", family);
        mThemesMap.put("Чувства", feelings);
        mThemesMap.put("Еда", food);
        mThemesMap.put("Мебель", furniture);
        mThemesMap.put("Дом", home);
        mThemesMap.put("Домашние предметы", homeObjects);
        mThemesMap.put("Части тела человека", humanBody);
        mThemesMap.put("Природа", nature);
        mThemesMap.put("Числа", numbers);
        mThemesMap.put("Места", places);
        mThemesMap.put("Предлоги", prepositionsOfPlace);
        mThemesMap.put("Фигуры", shapes);
        mThemesMap.put("Транспорт", transport);
        mThemesMap.put("Погода", weather);

        themesList.add(actions);
        themesList.add(alphabet);
        themesList.add(animalBodyParts);
        themesList.add(animals);
        themesList.add(birds);
        themesList.add(bugs);
        themesList.add(classroomObjects);
        themesList.add(clothes);
        themesList.add(colours);
        themesList.add(describing);
        themesList.add(everydayObjects);
        themesList.add(fairyStories);
        themesList.add(family);
        themesList.add(feelings);
        themesList.add(food);
        themesList.add(furniture);
        themesList.add(home);
        themesList.add(homeObjects);
        themesList.add(humanBody);
        themesList.add(nature);
        themesList.add(numbers);
        themesList.add(places);
        themesList.add(prepositionsOfPlace);
        themesList.add(shapes);
        themesList.add(transport);
        themesList.add(weather);

        for (Map.Entry<String, ArrayList<Word>> entry : mThemesMap.entrySet()) {
            themesList2.add(entry);
        }
    }

    //Из массивов в списки


    public final static ArrayList<Word> actions = new ArrayList<Word>() {{
        add(new Word("blow", "дуть", "[ bləʊ ]", R.drawable.blow, R.raw.blow));
        add(new Word("catch", "ловить", "[ kætʃ ]", R.drawable.catchmy, R.raw.catchmy));
        add(new Word("clap", "хлопать", "[ klæp ]", R.drawable.clap, R.raw.clap));
        add(new Word("cut", "резать", "[ kʌt ]", R.drawable.cut, R.raw.cut));
        add(new Word("dance", "танцевать", "[ dɑːns ]", R.drawable.dance, R.raw.dance));
        add(new Word("dig", "копать", "[ dɪɡ ]", R.drawable.dig, R.raw.dig));
        add(new Word("drink", "пить", "[ drɪŋk ]", R.drawable.drink, R.raw.drink));
        add(new Word("eat", "кушать", "[ iːt ]", R.drawable.eat, R.raw.eat));
        add(new Word("follow", "следовать", "[ ˈfɒləʊ ]", R.drawable.follow, R.raw.follow));
        add(new Word("go", "идти", "[ ɡəʊ ]", R.drawable.go, R.raw.go));
        add(new Word("hide", "прятать(ся)", "[ haɪd ]", R.drawable.hide, R.raw.hide));
        add(new Word("hug", "обниматься", "[ hʌɡ ]", R.drawable.hug, R.raw.hug));
        add(new Word("jump", "прыгать", "[ dʒʌmp ]", R.drawable.jump, R.raw.jump));
        add(new Word("listen", "слушать", "[ ˈlɪsn̩ ]", R.drawable.listen, R.raw.listen));
        add(new Word("look", "смотреть", "[ lʊk ]", R.drawable.look, R.raw.look));
        add(new Word("point", "указывать", "[ pɔɪnt ]", R.drawable.point, R.raw.point));
        add(new Word("pull", "тянуть", "[ pʊl ]", R.drawable.pull, R.raw.pull));
        add(new Word("read", "читать", "[ riːd ]", R.drawable.read, R.raw.read));
        add(new Word("run", "бежать", "[ rʌn ]", R.drawable.run, R.raw.run));
        add(new Word("share", "делиться", "[ ʃeə ]", R.drawable.share, R.raw.share));
        add(new Word("shout", "кричать", "[ ʃaʊt ]", R.drawable.shout, R.raw.shout));
        add(new Word("sing", "петь", "[ sɪŋ ]", R.drawable.sing, R.raw.sing));
        add(new Word("smell", "пахнуть", "[ smel ]", R.drawable.smell, R.raw.smell));
        add(new Word("smile", "улыбаться", "[ smaɪl ]", R.drawable.smile, R.raw.smile));
        add(new Word("talk", "разговаривать", "[ ˈtɔːk ]", R.drawable.talk, R.raw.talk));
        add(new Word("taste", "пробовать", "[ teɪst ]", R.drawable.taste, R.raw.taste));
        add(new Word("touch", "касаться", "[ tʌtʃ ]", R.drawable.touch,R.raw.touch));
        add(new Word("underline", "подчеркивать", "[ ˌʌndəˈlaɪn ]", R.drawable.underline, R.raw.underline));
        add(new Word("wait", "ждать", "[ weɪt ]", R.drawable.wait, R.raw.wait));
        add(new Word("whisper", "шептать", "[ ˈwɪspə ]", R.drawable.whisper, R.raw.whisper));
        add(new Word("write", "писать", "[ ˈraɪt ]", R.drawable.write, R.raw.write));
    }};

    public final static ArrayList<Word> alphabet = new ArrayList<Word>() {{
        add(new Word("A a", "эй", "[ eɪ ]", R.drawable.a, R.raw.a));
        add(new Word("B b", "би", "[ biː ]", R.drawable.a, R.raw.b));
        add(new Word("C c", "си", "[ siː ]", R.drawable.a, R.raw.c));
        add(new Word("D d", "ди", "[ diː ]", R.drawable.a, R.raw.d));
        add(new Word("E e", "и", "[ iː ]", R.drawable.a, R.raw.e));
        add(new Word("F f", "эф", "[ ef ]", R.drawable.a, R.raw.f));
        add(new Word("G g", "джи", "[ dʒiː ]", R.drawable.a, R.raw.g));
        add(new Word("H h", "эйч", "[ eɪtʃ ]", R.drawable.a, R.raw.h));
        add(new Word("I i", "ай", "[ ˈaɪ ]", R.drawable.a, R.raw.i));
        add(new Word("J j", "джей", "[ dʒeɪ ]", R.drawable.a, R.raw.j));
        add(new Word("K k", "кей", "[ keɪ ]", R.drawable.a, R.raw.k));
        add(new Word("L l", "эл", "[ el ]", R.drawable.a, R.raw.l));
        add(new Word("M m", "эм", "[ em ]", R.drawable.a, R.raw.m));
        add(new Word("N n", "эн", "[ en ]", R.drawable.a, R.raw.n));
        add(new Word("O o", "оу", "[ əʊ ]", R.drawable.a, R.raw.o));
        add(new Word("P p", "пи", "[ ˈpiː ]", R.drawable.a, R.raw.p));
        add(new Word("Q q", "кью", "[ kjuː ]", R.drawable.a, R.raw.q));
        add(new Word("R r", "а:, ар", "[ ɑː ]", R.drawable.a, R.raw.r));
        add(new Word("S s", "эс", "[ ˈes ]", R.drawable.a, R.raw.s));
        add(new Word("T t", "ти", "[ tiː ]", R.drawable.a, R.raw.t));
        add(new Word("U u", "ю", "[ juː ]", R.drawable.a, R.raw.u));
        add(new Word("V v", "ви", "[ viː ]", R.drawable.a, R.raw.v));
        add(new Word("W w", "дабл-ю", "[ ˈdʌbljuː ]", R.drawable.a, R.raw.w));
        add(new Word("X x", "экс", "[ eks ]", R.drawable.a, R.raw.x));
        add(new Word("Y y", "уай", "[ waɪ ]", R.drawable.a, R.raw.y));
        add(new Word("Z z", "зед", "[ zed ]", R.drawable.a,R.raw.z));
    }};

    public final static ArrayList<Word> animalBodyParts = new ArrayList<Word>() {{
        add(new Word("beak", "клюв", "[ biːk ]", R.drawable.claw, R.raw.beak));
        add(new Word("claw", "коготь", "[ klɔː ]", R.drawable.claw, R.raw.claw));
        add(new Word("feather", "перо", "[ ˈfeðə ]", R.drawable.claw, R.raw.feather));
        add(new Word("horn", "рог", "[ hɔːn ]", R.drawable.claw, R.raw.horn));
        add(new Word("jaw", "пасть, челюсть", "[ dʒɔː ]", R.drawable.claw, R.raw.jaw));
        add(new Word("paw", "лапа", "[ pɔː ]", R.drawable.claw, R.raw.paw));
        add(new Word("tail", "хвост", "[ teɪl ]", R.drawable.claw,R.raw.tail));
        add(new Word("whisker", "ус", "[ ˈwɪskə ]", R.drawable.claw, R.raw.whisker));
        add(new Word("wing", "крыло", "[ wɪŋ ]", R.drawable.claw, R.raw.wing));
    }};

    public final static ArrayList<Word> animals = new ArrayList<Word>() {{
        add(new Word("bear", "медведь", "[ beə(r) ]", R.drawable.bear, R.raw.bear));
        add(new Word("camel", "верблюд", "[ ˈkæm.əl ]", R.drawable.bear, R.raw.camel));
        add(new Word("cat", "кошка", "[ kæt ]", R.drawable.bear, R.raw.cat));
        add(new Word("chicken", "курица", "[ ˈtʃɪkɪn ]", R.drawable.bear, R.raw.chicken));
        add(new Word("cow", "корова", "[ kaʊ ]", R.drawable.bear, R.raw.cow));
        add(new Word("deer", "олень", "[ dɪər ]", R.drawable.bear, R.raw.deer));
        add(new Word("dog", "собака", "[ dɒɡ ]  ", R.drawable.bear, R.raw.dog));
        add(new Word("elephant", "слон", "[ ˈel.ɪ.fənt ]", R.drawable.bear, R.raw.elephant));
        add(new Word("fox", "лиса", "[ fɒks ]", R.drawable.bear, R.raw.fox));
        add(new Word("horse", "лошадь", "[ hɔːs ]", R.drawable.bear, R.raw.horse));
        add(new Word("lamb", "ягненок", "[ læm ]", R.drawable.bear, R.raw.lamb));
        add(new Word("lion", "лев", "[ ˈlaɪ.ən ]", R.drawable.bear, R.raw.lion));
        add(new Word("monkey", "обезьяна", "[ ˈmʌŋ.ki ]", R.drawable.bear, R.raw.monkey));
        add(new Word("mouse", "мышь", "[ maʊs ]", R.drawable.bear, R.raw.mouse));
        add(new Word("parrot", "попугай", "[ ˈpær.ət ]", R.drawable.bear, R.raw.parrot));
        add(new Word("pig", "свинья", "[ pɪɡ ]", R.drawable.bear, R.raw.pig));
        add(new Word("rabbit", "кролик", "[ ˈræb.ɪt ]", R.drawable.bear, R.raw.rabbit));
        add(new Word("sheep", "овца", "[ ʃiːp ]", R.drawable.bear, R.raw.sheep));
        add(new Word("snake", "змея", "[ sneɪk ]", R.drawable.bear, R.raw.snake));
        add(new Word("turkey", "индейка", "[ ˈtɜː.ki ]", R.drawable.bear, R.raw.turkey));
        add(new Word("turtle", "черепаха", "[ ˈtɜː.tl̩ ]", R.drawable.bear, R.raw.turtle));
        add(new Word("wolf", "волк", "[ wʊlf ]", R.drawable.bear, R.raw.wolf));
    }};

    public final static ArrayList<Word> birds = new ArrayList<Word>() {{
        add(new Word("dove", "голубь", "[ dʌv ]", R.drawable.duck, R.raw.dove));
        add(new Word("duck", "утка", "[ dʌk ]", R.drawable.duck, R.raw.duck));
        add(new Word("eagle", "орел", "[ ˈiː.ɡl̩ ]", R.drawable.duck, R.raw.eagle));
        add(new Word("flamingo", "фламинго", "[ fləˈmɪŋ.ɡəʊ ]", R.drawable.duck, R.raw.flamingo));
        add(new Word("owl", "сова", "[ aʊl ]", R.drawable.duck, R.raw.owl));
    }};

    public final static ArrayList<Word> bugs = new ArrayList<Word>() {{
        add(new Word("ant", "муравей", "[ ænt ]", R.drawable.bee, R.raw.ant));
        add(new Word("bee", "пчела", "[ biː ]", R.drawable.bee, R.raw.bee));
        add(new Word("beetle", "жук", "[ ˈbiː.tl̩ ]", R.drawable.bee, R.raw.beetle));
        add(new Word("butterfly", "бабочка", "[ ˈbʌt.ə.flaɪ ]", R.drawable.bee, R.raw.butterfly));
        add(new Word("caterpillar", "гусеница", "[ ˈkæt.ə.pɪl.ər ]", R.drawable.bee, R.raw.caterpillar));
        add(new Word("fly", "муха", "[ flaɪ ]", R.drawable.bee, R.raw.fly));
        add(new Word("grasshopper", "кузнечик", "[ ˈɡrɑːsˌhɒp.ər ]", R.drawable.bee, R.raw.grasshopper));
        add(new Word("ladybird", "божья коровка", "[ ˈleɪ.di.bɜːd ]", R.drawable.bee, R.raw.ladybird));
        add(new Word("mosquito", "комар", "[ məˈskiː.təʊ ]", R.drawable.bee, R.raw.mosquito));
        add(new Word("spider", "паук", "[ ˈspaɪdə(r) ]", R.drawable.bee,R.raw.spider));
    }};

    public final static ArrayList<Word> classroomObjects = new ArrayList<Word>() {{
        add(new Word("bag", "сумка", "[ bæɡ ]", R.drawable.calculator, R.raw.bag));
        add(new Word("calculator", "калькулятор", "[ ˈkæl.kjʊ.leɪ.tər ]", R.drawable.calculator, R.raw.calculator));
        add(new Word("desk", "парта, стол", "[ desk ]", R.drawable.calculator, R.raw.desk));
        add(new Word("eraser", "ластик, резинка", "[ ɪˈreɪ.zər ]", R.drawable.calculator,R.raw.eraser));
        add(new Word("folder", "папка", "[ ˈfəʊl.dər ]", R.drawable.calculator, R.raw.folder));
        add(new Word("glue", "клей", "[ ɡluː ]", R.drawable.calculator, R.raw.glue));
        add(new Word("notebook", "блокнот, тетрадь", "[ ˈnəʊt.bʊk ]", R.drawable.calculator, R.raw.notebook));
        add(new Word("pen", "ручка", "[ pen ]", R.drawable.calculator, R.raw.pen));
        add(new Word("pencil", "карандаш", "[ ˈpensl ]", R.drawable.calculator, R.raw.pencil));
        add(new Word("ruler", "линейка", "[ ˈruːlə(r) ]", R.drawable.calculator, R.raw.ruler));
        add(new Word("scissors", "ножницы", "[ ˈsɪzəz ]", R.drawable.calculator, R.raw.scissors));
    }};

    public final static ArrayList<Word> clothes = new ArrayList<Word>() {{
        add(new Word("belt", "ремень", "[ belt ]", R.drawable.trousers, R.raw.belt));
        add(new Word("blouse", "блузка", "[ blaʊz ]", R.drawable.trousers, R.raw.blouse));
        add(new Word("bracelet", "браслет", "[ ˈbreɪ.slət ]", R.drawable.trousers, R.raw.bracelet));
        add(new Word("cap", "кепка", "[ kæp ]", R.drawable.trousers, R.raw.cap));
        add(new Word("coat", "пальто", "[ kəʊt ]", R.drawable.trousers, R.raw.coat));
        add(new Word("dress", "платье", "[ dres ]", R.drawable.trousers, R.raw.dress));
        add(new Word("glasses", "очки", "[ ɡlɑːs ]", R.drawable.trousers, R.raw.glasses));
        add(new Word("glove", "перчатка", "[ ɡlʌv ]", R.drawable.trousers, R.raw.glove));
        add(new Word("hat", "шляпа", "[ hæt ]", R.drawable.trousers, R.raw.hat));
        add(new Word("jacket", "куртка, пиджак", "[ ˈdʒækɪt ]", R.drawable.trousers, R.raw.jacket));
        add(new Word("jumper", "свитер", "[ ˈdʒʌm.pər ]", R.drawable.trousers, R.raw.jumper));
        add(new Word("necklace", "бусы, ожерелье", "[ ˈnek.ləs ]", R.drawable.trousers, R.raw.necklace));
        add(new Word("ring", "кольцо", "[ rɪŋ ]", R.drawable.trousers, R.raw.ring));
        add(new Word("scarf", "шарф", "[ skɑːf ]", R.drawable.trousers, R.raw.scarf));
        add(new Word("shirt", "рубашка", "[ ʃɜːt ]", R.drawable.trousers, R.raw.shirt));
        add(new Word("shorts", "шорты", "[ ʃɔːts ]", R.drawable.trousers, R.raw.shorts));
        add(new Word("skirt", "юбка", "[ skɜːt ]", R.drawable.trousers, R.raw.skirt));
        add(new Word("sock", "носок", "[ sɒk ]", R.drawable.trousers, R.raw.sock));
        add(new Word("sunglasses", "солнечные очки", "[ ˈsʌŋˌɡlɑː.sɪz ]", R.drawable.trousers, R.raw.sunglasses));
        add(new Word("trousers", "брюки", "[ ˈtraʊzəz ]", R.drawable.trousers, R.raw.trousers));
        add(new Word("t-shirt", "футболка", "[ tʃɜːt ]  ", R.drawable.trousers, R.raw.t_shirt));
        add(new Word("watch", "часы", "[ wɒtʃ ]", R.drawable.trousers, R.raw.watch));
    }};

    public final static ArrayList<Word> colours = new ArrayList<Word>() {{
        add(new Word("black", "черный", "[ blæk ]", R.drawable.red, R.raw.black));
        add(new Word("blue", "синий", "[ bluː ]", R.drawable.red, R.raw.blue));
        add(new Word("brown", "коричневый", "[ braʊn ]", R.drawable.red, R.raw.brown));
        add(new Word("green", "зеленый", "[ ɡriːn ]", R.drawable.red, R.raw.green));
        add(new Word("grey", "серый", "[ ɡreɪ ]", R.drawable.red, R.raw.grey));
        add(new Word("orange", "оранжевый", "[ ˈɒrɪndʒ ]", R.drawable.red, R.raw.orange));
        add(new Word("pink", "розовый", "[ pɪŋk ]", R.drawable.red, R.raw.pink));
        add(new Word("purple", "фиолетовый", "[ ˈpɜːpl ]", R.drawable.red, R.raw.purple));
        add(new Word("red", "красный", "[ red ]", R.drawable.red, R.raw.red));
        add(new Word("white", "белый", "[ waɪt ]", R.drawable.red, R.raw.white));
        add(new Word("yellow", "желтый", "[ ˈjeləʊ ]", R.drawable.red, R.raw.yellow));
    }};

    public final static ArrayList<Word> describing = new ArrayList<Word>() {{
        add(new Word("beautiful", "красивый(ая)", "[ ˈbjuːtɪfl ]", R.drawable.fat, R.raw.beautiful));
        add(new Word("big", "большой", "[ bɪɡ ]", R.drawable.fat, R.raw.big));
        add(new Word("dirty", "грязный", "[ ˈdɜːti ]", R.drawable.fat, R.raw.dirty));
        add(new Word("far", "дальний", "[ fɑː(r) ]  ", R.drawable.fat, R.raw.far));
        add(new Word("fat", "жирный", "[ fæt ]", R.drawable.fat, R.raw.fat));
        add(new Word("long", "длинный", "[ lɒŋ ]", R.drawable.fat, R.raw.longmy));
        add(new Word("near", "ближайший, рядом", "[ nɪə(r) ]", R.drawable.fat, R.raw.near));
        add(new Word("old", "старый", "[ əʊld ]", R.drawable.fat, R.raw.old));
        add(new Word("short", "короткий", "[ ʃɔːt ]", R.drawable.fat, R.raw.shortmy));
        add(new Word("small", "маленький", "[ smɔːl ]", R.drawable.fat, R.raw.small));
        add(new Word("strong", "сильный", "[ strɒŋ ]", R.drawable.fat, R.raw.strong));
        add(new Word("tall", "высокий", "[ tɔːl ]", R.drawable.fat, R.raw.tall));
        add(new Word("thick", "толстый", "[ θɪk ]", R.drawable.fat, R.raw.thick));
        add(new Word("thin", "тонкий", "[ θɪn ]", R.drawable.fat, R.raw.thin));
        add(new Word("weak", "слабый", "[ wiːk ]", R.drawable.fat, R.raw.weak));
        add(new Word("young", "молодой(ая)", "[ jʌŋ ]", R.drawable.fat, R.raw.young));
    }};

    public final static ArrayList<Word> everydayObjects = new ArrayList<Word>() {{
        add(new Word("balloon", "воздушный шар", "[ bəˈluːn ]", R.drawable.calendar, R.raw.balloon));
        add(new Word("box", "коробка, ящик", "[ bɒks ]", R.drawable.calendar, R.raw.box));
        add(new Word("bucket", "ведро", "[ ˈbʌk.ɪt ]", R.drawable.calendar, R.raw.bucket));
        add(new Word("calendar", "календарь", "[ ˈkæl.ɪn.dər ]", R.drawable.calendar, R.raw.calendar));
        add(new Word("comb", "расческа", "[ kəʊm ]", R.drawable.calendar, R.raw.comb));
        add(new Word("flag", "флаг", "[ flæɡ ]", R.drawable.calendar, R.raw.flag));
        add(new Word("hammer", "молоток", "[ ˈhæmə(r) ]", R.drawable.calendar, R.raw.hammer));
        add(new Word("ladder", "лестница, стремянка", "[ ˈlæd.ər ]", R.drawable.calendar, R.raw.ladder));
        add(new Word("letter", "письмо", "[ ˈletə(r) ]", R.drawable.calendar, R.raw.letter));
        add(new Word("lightbulb", "лампочка", "[ laɪt bʌlb]", R.drawable.calendar, R.raw.lightbulb));
        add(new Word("map", "карта", "[ mæp ]", R.drawable.calendar, R.raw.map));
        add(new Word("pin", "булавка, шпилька", "[ pɪn ]", R.drawable.calendar, R.raw.pin));
        add(new Word("present", "подарок", "[ ˈpreznt ]", R.drawable.calendar, R.raw.present));
        add(new Word("rope", "веревка", "[ rəʊp ]", R.drawable.calendar, R.raw.rope));
        add(new Word("saw", "пила", "[ sɔː ]", R.drawable.calendar, R.raw.saw));
        add(new Word("snowflake", "снежинка", "[ ˈsnəʊ.fleɪk ]", R.drawable.calendar, R.raw.snowflake));
        add(new Word("snowman", "снеговик", "[ ˈsnəʊ.mæn ]", R.drawable.calendar, R.raw.snowman));
        add(new Word("soap", "мыло", "[ səʊp ]", R.drawable.calendar, R.raw.soap));
        add(new Word("toothbrush", "зубная щетка", "[ ˈtuːθ.brʌʃ ]", R.drawable.calendar, R.raw.toothbrush));
        add(new Word("toothpaste", "зубная паста", "[ ˈtuːθ.peɪst ]", R.drawable.calendar, R.raw.toothpaste));
        add(new Word("towel", "полотенце", "[ taʊəl ]", R.drawable.calendar, R.raw.towel));
        add(new Word("umbrella", "зонт", "[ ʌmˈbrelə ]", R.drawable.calendar, R.raw.umbrella));
    }};

    public final static ArrayList<Word> fairyStories = new ArrayList<Word>() {{
        add(new Word("castle", "замок", "[ ˈkɑːsl ]  ", R.drawable.castle, R.raw.castle));
        add(new Word("crown", "корона", "[ kraʊn ]", R.drawable.castle,R.raw.crown));
        add(new Word("dragon", "дракон", "[ ˈdræɡ.ən ]", R.drawable.castle, R.raw.dragon));
        add(new Word("giant", "гигант, великан", "[ ˈdʒaɪənt ]", R.drawable.castle, R.raw.giant));
        add(new Word("gold", "золото", "[ ɡəʊld ]", R.drawable.castle, R.raw.gold));
        add(new Word("king", "король", "[ kɪŋ ]", R.drawable.castle, R.raw.king));
        add(new Word("knight", "рыцарь", "[ naɪt ]", R.drawable.castle, R.raw.knight));
        add(new Word("prince", "принц", "[ prɪns ]", R.drawable.castle, R.raw.prince));
        add(new Word("princess", "принцесса", "[ ˌprɪnˈses ]", R.drawable.castle, R.raw.princess));
        add(new Word("queen", "королева", "[ kwiːn ]", R.drawable.castle, R.raw.queen));
        add(new Word("shield", "щит", "[ ʃiːld ]", R.drawable.castle, R.raw.shield));
        add(new Word("sword", "меч", "[ sɔːd ]", R.drawable.castle, R.raw.sword));
        add(new Word("throne", "трон", "[ θrəʊn ]", R.drawable.castle, R.raw.throne));
        add(new Word("tower", "башня", "[ ˈtaʊə(r) ]", R.drawable.castle, R.raw.tower));
    }};

    public final static ArrayList<Word> family = new ArrayList<Word>() {{
        add(new Word("baby", "младенец", "[ ˈbeɪbi ]", R.drawable.baby, R.raw.baby));
        add(new Word("brother", "брат", "[ ˈbrʌðə(r) ]", R.drawable.baby, R.raw.brother));
        add(new Word("family", "семья", "[ ˈfæməli ]", R.drawable.baby, R.raw.family));
        add(new Word("father", "папа", "[ ˈfɑːðə(r) ]", R.drawable.baby, R.raw.father));
        add(new Word("grandfather", "дедушка", "[ ˈɡrænfɑːðə(r) ]", R.drawable.baby, R.raw.grandfather));
        add(new Word("grandmother", "бабушка", "[ ˈɡrænmʌðə(r) ]", R.drawable.baby, R.raw.grandmother));
        add(new Word("mother", "мама", "[ ˈmʌðə(r) ]", R.drawable.baby, R.raw.mother));
        add(new Word("sister", "сестра", "[ ˈsɪstə(r) ]", R.drawable.baby, R.raw.sister));
    }};

    public final static ArrayList<Word> feelings = new ArrayList<Word>() {{
        add(new Word("angry", "сердитый, злой", "[ ˈæŋɡri ]", R.drawable.angry, R.raw.angry));
        add(new Word("bored", "скучающий", "[ bɔːd ]", R.drawable.angry, R.raw.bored));
        add(new Word("confused", "смущенный, растерянный", "[ kənˈfjuːzd ]", R.drawable.angry, R.raw.confused));
        add(new Word("excited", "возбужденный, воодушевленный", "[ ɪkˈsaɪtɪd ]", R.drawable.angry, R.raw.excited));
        add(new Word("happy", "счастливый", "[ ˈhæpi ]", R.drawable.angry, R.raw.happy));
        add(new Word("hungry", "голодный", "[ ˈhʌŋɡri ]", R.drawable.angry, R.raw.hungry));
        add(new Word("sad", "грустный", "[ sæd ]", R.drawable.angry, R.raw.sad));
        add(new Word("surprised", "удивленный", "[ səˈpraɪzd ]", R.drawable.angry, R.raw.surprised));
        add(new Word("upset", "расстроенный", "[ ʌpˈset ]", R.drawable.angry, R.raw.upset));
        add(new Word("worried", "обеспокоенный, встревоженный", "[ ˈwʌrid ]", R.drawable.angry, R.raw.worried));
    }};

    public final static ArrayList<Word> food = new ArrayList<Word>() {{
        add(new Word("apple", "яблоко", "[ ˈæp.l̩ ]", R.drawable.chocolate, R.raw.apple));
        add(new Word("banana", "банан", "[ bəˈnɑː.nə ]", R.drawable.chocolate, R.raw.banana));
        add(new Word("biscuits", "печенье", "[ ˈbɪs.kɪt ]", R.drawable.chocolate, R.raw.biscuits));
        add(new Word("bread", "хлеб", "[ bred ]", R.drawable.chocolate, R.raw.bread));
        add(new Word("cake", "торт", "[ keɪk ]", R.drawable.chocolate, R.raw.cake));
        add(new Word("carrot", "морковь", "[ ˈkærət ]", R.drawable.chocolate, R.raw.carrot));
        add(new Word("cheese", "сыр", "[ tʃiːz ]", R.drawable.chocolate, R.raw.cheese));
        add(new Word("cherry", "вишня", "[ ˈtʃer.i ]", R.drawable.chocolate, R.raw.cherry));
        add(new Word("chicken", "цыпленок", "[ ˈtʃɪkɪn ]", R.drawable.chocolate, R.raw.chicken));
        add(new Word("chocolate", "шоколад", "[ ˈtʃɒklət ]", R.drawable.chocolate, R.raw.chocolate));
        add(new Word("cucumber", "огурец", "[ ˈkjuː.kʌm.bər ]", R.drawable.chocolate, R.raw.cucumber));
        add(new Word("egg", "яйцо", "[ eɡ ]", R.drawable.chocolate, R.raw.egg));
        add(new Word("fish", "рыба", "[ fɪʃ ]", R.drawable.chocolate, R.raw.fish));
        add(new Word("grapes", "виноград", "[ ɡreɪp ]", R.drawable.chocolate, R.raw.grapes));
        add(new Word("ice cream", "мороженое", "[ aɪs kriːm ]", R.drawable.chocolate, R.raw.ice_cream));
        add(new Word("lemonade", "лимонад", "[ ˌlem.əˈneɪd ]", R.drawable.chocolate, R.raw.lemonade));
        add(new Word("meat", "мясо", "[ miːt ]", R.drawable.chocolate, R.raw.meat));
        add(new Word("milk", "молоко", "[ mɪlk ]", R.drawable.chocolate, R.raw.milk));
        add(new Word("orange", "апельсин", "[ ˈɒrɪndʒ ]", R.drawable.chocolate, R.raw.orange));
        add(new Word("pasta", "макароны", "[ ˈpæs.tə ]", R.drawable.chocolate, R.raw.pasta));
        add(new Word("pear", "груша", "[ peər ]", R.drawable.chocolate, R.raw.pear));
        add(new Word("pepper", "перец", "[ ˈpepə(r) ]", R.drawable.chocolate, R.raw.pepper));
        add(new Word("pie", "пирог", "[ paɪ ]", R.drawable.chocolate, R.raw.pie));
        add(new Word("pineapple", "ананас", "[ ˈpaɪnˌæp.l̩ ]", R.drawable.chocolate, R.raw.pineapple));
        add(new Word("potato", "картофель", "[ pəˈteɪtəʊ ]", R.drawable.chocolate, R.raw.potato));
        add(new Word("rice", "рис", "[ raɪs ]", R.drawable.chocolate, R.raw.rice));
        add(new Word("sandwich", "бутерброд", "[ ˈsæn.wɪdʒ ]", R.drawable.chocolate, R.raw.sandwich));
        add(new Word("sausage", "сосиска, колбаска", "[ ˈsɒs.ɪdʒ ]", R.drawable.chocolate, R.raw.sausage));
        add(new Word("strawberry", "клубника", "[ ˈstrɔː.bər.i ]", R.drawable.chocolate, R.raw.strawberry));
        add(new Word("tea", "чай", "[ tiː ]", R.drawable.chocolate, R.raw.tea));
        add(new Word("water", "вода", "[ ˈwɔːtə(r) ]", R.drawable.chocolate, R.raw.water));
    }};

    public final static ArrayList<Word> furniture = new ArrayList<Word>() {{
        add(new Word("armchair", "кресло", "[ ˈɑːm.tʃeər ]", R.drawable.fridge, R.raw.armchair));
        add(new Word("bath", "ванна", "[ bɑːθ ]", R.drawable.fridge, R.raw.bath));
        add(new Word("bed", "кровать", "[ bed ]", R.drawable.fridge, R.raw.bed));
        add(new Word("chair", "стул", "[ tʃeə(r) ]", R.drawable.fridge, R.raw.chair));
        add(new Word("fridge", "холодильник", "[ frɪdʒ ]", R.drawable.fridge, R.raw.fridge));
        add(new Word("lamp", "лампа", "[ læmp ]", R.drawable.fridge, R.raw.lamp));
        add(new Word("oven", "духовка", "[ ˈʌvn ]", R.drawable.fridge, R.raw.oven));
        add(new Word("shelf", "полка", "[ ʃelf ]", R.drawable.fridge, R.raw.shelf));
        add(new Word("sink", "раковина", "[ sɪŋk ]", R.drawable.fridge, R.raw.sink));
        add(new Word("sofa", "диван", "[ ˈsəʊ.fə ]", R.drawable.fridge, R.raw.sofa));
        add(new Word("table", "стол", "[ ˈteɪbl ]", R.drawable.fridge, R.raw.table));
        add(new Word("toilet", "туалет, унитаз", "[ ˈtɔɪlət ]", R.drawable.fridge, R.raw.toilet));
        add(new Word("wardrobe", "гардероб, шкаф", "[ ˈwɔː.drəʊb ]", R.drawable.fridge,R.raw.wardrobe));
    }};

    public final static ArrayList<Word> home = new ArrayList<Word>() {{
        add(new Word("balcony", "балкон", "[ ˈbæl.kə.ni ]", R.drawable.bathroom, R.raw.balcony));
        add(new Word("bathroom", "ванная комната", "[ ˈbɑːθruːm ]", R.drawable.bathroom, R.raw.bathroom));
        add(new Word("bedroom", "спальня", "[ ˈbedruːm ]", R.drawable.bathroom, R.raw.bedroom));
        add(new Word("door", "дверь", "[ dɔː(r) ]", R.drawable.bathroom, R.raw.door));
        add(new Word("floor", "пол, этаж", "[ flɔː(r) ]", R.drawable.bathroom,R.raw.floor));
        add(new Word("garden", "сад", "[ ˈɡɑːdn ]", R.drawable.bathroom, R.raw.garden));
        add(new Word("hall", "зал, коридор", "[ hɔːl ]", R.drawable.bathroom, R.raw.hall));
        add(new Word("house", "дом", "[ haʊs ]", R.drawable.bathroom, R.raw.house));
        add(new Word("kitchen", "кухня", "[ ˈkɪtʃɪn ]", R.drawable.bathroom, R.raw.kitchen));
        add(new Word("roof", "крыша", "[ ruːf ]", R.drawable.bathroom, R.raw.roof));
        add(new Word("stairs", "лестница, ступеньки", "[ steər ]", R.drawable.bathroom, R.raw.stairs));
        add(new Word("window", "окно", "[ ˈwɪndəʊ ]", R.drawable.bathroom, R.raw.window));
    }};

    public final static ArrayList<Word> homeObjects = new ArrayList<Word>() {{
        add(new Word("bottle", "бутылка", "[ ˈbɒtl ]", R.drawable.knife, R.raw.bottle));
        add(new Word("bowl", "чаша, миска", "[ bəʊl ]", R.drawable.knife, R.raw.bowl));
        add(new Word("clock", "часы", "[ klɒk ]", R.drawable.knife, R.raw.clock));
        add(new Word("cup", "кружка", "[ kʌp ]", R.drawable.knife, R.raw.cup));
        add(new Word("fork", "вилка", "[ fɔːk ]", R.drawable.knife, R.raw.fork));
        add(new Word("glass", "стакан, стекло", "[ ɡlɑːs ]", R.drawable.knife, R.raw.glass));
        add(new Word("knife", "нож", "[ naɪf ]", R.drawable.knife, R.raw.knife));
        add(new Word("mirror", "зеркало", "[ ˈmɪrə(r) ]", R.drawable.knife, R.raw.mirror));
        add(new Word("pan", "сковородка", "[ pæn ]", R.drawable.knife,R.raw.pan));
        add(new Word("picture", "картина", "[ ˈpɪktʃə(r) ]", R.drawable.knife, R.raw.picture));
        add(new Word("pillow", "подушка", "[ ˈpɪl.əʊ ]", R.drawable.knife, R.raw.pillow));
        add(new Word("plate", "тарелка", "[ pleɪt ]", R.drawable.knife, R.raw.plate));
        add(new Word("rug", "ковер", "[ rʌɡ ]", R.drawable.knife, R.raw.rug));
        add(new Word("spoon", "ложка", "[ spuːn ]", R.drawable.knife, R.raw.spoon));
        add(new Word("tap", "кран", "[ tæp ]", R.drawable.knife, R.raw.tap));
        add(new Word("telephone", "телефон", "[ ˈtelɪfəʊn ]", R.drawable.knife, R.raw.telephone));
        add(new Word("tv", "телевизор", "[ ˌtiː ˈviː ]", R.drawable.knife, R.raw.tv));
    }};

    public final static ArrayList<Word> humanBody = new ArrayList<Word>() {{
        add(new Word("arm", "рука", "[ ɑːm ]", R.drawable.eye, R.raw.arm));
        add(new Word("back", "спина", "[ bæk ]", R.drawable.eye, R.raw.back));
        add(new Word("body", "тело", "[ ˈbɒdi ]", R.drawable.eye, R.raw.body));
        add(new Word("ear", "ухо", "[ ɪə(r) ]", R.drawable.eye, R.raw.ear));
        add(new Word("eye", "глаз", "[ aɪ ]", R.drawable.eye, R.raw.eye));
        add(new Word("face", "лицо", "[ feɪs ]", R.drawable.eye, R.raw.face));
        add(new Word("finger", "палец", "[ ˈfɪŋɡə(r) ]", R.drawable.eye, R.raw.finger));
        add(new Word("hair", "волосы", "[ heə(r) ]", R.drawable.eye, R.raw.hair));
        add(new Word("hand", "ладонь, кисть руки", "[ hænd ]", R.drawable.eye, R.raw.hand));
        add(new Word("head", "голова", "[ hed ]", R.drawable.eye, R.raw.head));
        add(new Word("leg", "нога", "[ leɡ ]", R.drawable.eye, R.raw.leg));
        add(new Word("mouth", "рот", "[ maʊθ ]", R.drawable.eye, R.raw.mouth));
        add(new Word("nose", "нос", "[ nəʊz ]", R.drawable.eye, R.raw.nose));
        add(new Word("shoulder", "плечо", "[ ˈʃəʊldə(r) ]", R.drawable.eye, R.raw.shoulder));
        add(new Word("teeth", "зубы", "[ tiːθ ]", R.drawable.eye, R.raw.teeth));
    }};

    public final static ArrayList<Word> nature = new ArrayList<Word>() {{
        add(new Word("beach", "пляж", "[ biːtʃ ]", R.drawable.island, R.raw.beach));
        add(new Word("field", "поле", "[ fiːld ]", R.drawable.island, R.raw.field));
        add(new Word("forest", "лес", "[ ˈfɒrɪst ]", R.drawable.island, R.raw.forest));
        add(new Word("island", "остров", "[ ˈaɪlənd ]", R.drawable.island, R.raw.island));
        add(new Word("lake", "озеро", "[ leɪk ]", R.drawable.island, R.raw.lake));
        add(new Word("leaf", "лист", "[ liːf ]", R.drawable.island, R.raw.leaf));
        add(new Word("log", "бревно", "[ lɒɡ ]", R.drawable.island, R.raw.log));
        add(new Word("mountain", "гора", "[ ˈmaʊntən ]", R.drawable.island, R.raw.mountain));
        add(new Word("rainbow", "радуга", "[ ˈreɪn.bəʊ ]", R.drawable.island, R.raw.rainbow));
        add(new Word("river", "река", "[ ˈrɪvə(r) ]", R.drawable.island, R.raw.river));
        add(new Word("rock", "скала", "[ rɒk ]", R.drawable.island, R.raw.rock));
        add(new Word("sea", "море", "[ siː ]", R.drawable.island, R.raw.sea));
        add(new Word("stone", "камень", "[ stəʊn ]", R.drawable.island, R.raw.stone));
        add(new Word("tree", "дерево", "[ triː ]", R.drawable.island, R.raw.tree));
        add(new Word("wave", "волна", "[ weɪv ]", R.drawable.island, R.raw.wave));
    }};

    public final static ArrayList<Word> numbers = new ArrayList<Word>() {{
        add(new Word("one", "один", "[ wʌn ]", R.drawable.one, R.raw.one));
        add(new Word("two", "два", "[ tuː ]", R.drawable.one, R.raw.two));
        add(new Word("three", "три", "[ θriː ]", R.drawable.one, R.raw.three));
        add(new Word("four", "четыре", "[ fɔː(r) ]", R.drawable.one, R.raw.four));
        add(new Word("five", "пять", "[ faɪv ]", R.drawable.one, R.raw.five));
        add(new Word("six", "шесть", "[ sɪks ]", R.drawable.one, R.raw.six));
        add(new Word("seven", "семь", "[ ˈsevn ]", R.drawable.one, R.raw.seven));
        add(new Word("eight", "восемь", "[ eɪt ]", R.drawable.one, R.raw.eight));
        add(new Word("nine", "девять", "[ naɪn ]", R.drawable.one, R.raw.nine));
        add(new Word("ten", "десять", "[ ten ]", R.drawable.one, R.raw.ten));
        add(new Word("eleven", "одиннадцать", "[ ɪˈlevn ]", R.drawable.one, R.raw.eleven));
        add(new Word("twelve", "двенадцать", "[ twelv ]", R.drawable.one, R.raw.twelve));
        add(new Word("thirteen", "тринадцать", "[ ˌθɜːˈtiːn ]", R.drawable.one, R.raw.thirteen));
        add(new Word("fourteen", "четырнадцать", "[ ˌfɔːˈtiːn ]", R.drawable.one, R.raw.fourteen));
        add(new Word("fifteen", "пятнадцать", "[ ˌfɪfˈtiːn ]", R.drawable.one, R.raw.fifteen));
        add(new Word("sixteen", "шестнадцать", "[ ˌsɪksˈtiːn ]", R.drawable.one, R.raw.sixteen));
        add(new Word("seventeen", "семнадцать", "[ ˌsevnˈtiːn ]", R.drawable.one, R.raw.seventeen));
        add(new Word("eighteen", "восемнадцать", "[ ˌeɪˈtiːn ]", R.drawable.one, R.raw.eighteen));
        add(new Word("nineteen", "девятнадцать", "[ ˌnaɪnˈtiːn ]", R.drawable.one, R.raw.nineteen));
        add(new Word("twenty", "двадцать", "[ ˈtwenti ]", R.drawable.one, R.raw.twenty));
        add(new Word("thirty", "тридцать", "[ ˈθɜːti ]", R.drawable.one, R.raw.thirty));
        add(new Word("forty", "сорок", "[ ˈfɔːti ]", R.drawable.one, R.raw.forty));
        add(new Word("fifty", "пятьдесят", "[ ˈfɪfti ]", R.drawable.one, R.raw.fifty));
        add(new Word("sixty", "шестьдесят", "[ ˈsɪksti ]", R.drawable.one, R.raw.sixty));
        add(new Word("seventy", "семьдесят", "[ ˈsevnti ]", R.drawable.one, R.raw.seventy));
        add(new Word("eighty", "восемьдесят", "[ ˈeɪti ]", R.drawable.one, R.raw.eighty));
        add(new Word("ninety", "девяносто", "[ ˈnaɪnti ]", R.drawable.one, R.raw.ninety));
        add(new Word("hundred", "сто", "[ ˈhʌndrəd ]", R.drawable.one, R.raw.hundred));
        add(new Word("thousand", "тысяча", "[ ˈθaʊznd ]", R.drawable.one, R.raw.thousand));
    }};

    public final static ArrayList<Word> places = new ArrayList<Word>() {{
        add(new Word("airport", "аэропорт", "[ ˈeəpɔːt ]", R.drawable.library, R.raw.airport));
        add(new Word("bridge", "мост", "[ brɪdʒ ]", R.drawable.library, R.raw.bridge));
        add(new Word("factory", "завод, фабрика", "[ ˈfæktri ]", R.drawable.library, R.raw.factory));
        add(new Word("hotel", "гостиница", "[ həʊˈtel ]", R.drawable.library, R.raw.hotel));
        add(new Word("library", "библиотека", "[ ˈlaɪbrəri ]", R.drawable.library, R.raw.library));
        add(new Word("park", "парк", "[ pɑːk ]", R.drawable.library, R.raw.park));
        add(new Word("school", "школа", "[ skuːl ]", R.drawable.library, R.raw.school));
        add(new Word("stadium", "стадион", "[ ˈsteɪ.di.əm ]", R.drawable.library, R.raw.stadium));
        add(new Word("street", "улица", "[ striːt ]", R.drawable.library, R.raw.street));
        add(new Word("theatre", "театр", "[ ˈθɪətə(r) ]", R.drawable.library, R.raw.theatre));
    }};

    public final static ArrayList<Word> prepositionsOfPlace = new ArrayList<Word>() {{
        add(new Word("behind", "за, позади", "[ bɪˈhaɪnd ]", R.drawable.on, R.raw.behind));
        add(new Word("between", "между", "[ bɪˈtwiːn ]", R.drawable.on, R.raw.between));
        add(new Word("in front of", "впереди", "[ ɪn frʌnt əv ]", R.drawable.on, R.raw.in_front_of));
        add(new Word("in", "в, внутри", "[ ɪn ]", R.drawable.on, R.raw.in));
        add(new Word("next", "следующий", "[ nekst ]", R.drawable.on, R.raw.next));
        add(new Word("on", "на", "[ ɒn ]", R.drawable.on, R.raw.on));
        add(new Word("opposite", "напротив", "[ ˈɒpəzɪt ]", R.drawable.on, R.raw.opposite));
        add(new Word("under", "под", "[ ˈʌndə(r) ]", R.drawable.on, R.raw.under));
    }};

    public final static ArrayList<Word> shapes = new ArrayList<Word>() {{
        add(new Word("circle", "круг", "[ ˈsɜːkl ]", R.drawable.heart, R.raw.circle));
        add(new Word("cube", "куб", "[ kjuːb ]", R.drawable.heart, R.raw.cube));
        add(new Word("diamond", "ромб", "[ ˈdaɪəmənd ]", R.drawable.heart, R.raw.diamond));
        add(new Word("heart", "сердце", "[ hɑːt ]", R.drawable.heart, R.raw.heart));
        add(new Word("hexagon", "шестиугольник", "[ ˈhek.sə.ɡən ]", R.drawable.heart, R.raw.hexagon));
        add(new Word("oval", "овал", "[ ˈəʊ.vəl ]", R.drawable.heart, R.raw.oval));
        add(new Word("pentagon", "пятиугольник", "[ ˈpen.tə.ɡən ]", R.drawable.heart, R.raw.pentagon));
        add(new Word("rectangle", "прямоугольник", "[ ˈrek.tæŋ.ɡl̩ ]", R.drawable.heart, R.raw.rectangle));
        add(new Word("sphere", "сфера, шар", "[ sfɪər ]", R.drawable.heart, R.raw.sphere));
        add(new Word("square", "квадрат, площадь", "[ skweə(r) ]", R.drawable.heart, R.raw.square));
        add(new Word("star", "звезда", "[ stɑː(r) ]", R.drawable.heart, R.raw.star));
        add(new Word("triangle", "треугольник", "[ ˈtraɪæŋɡl ]", R.drawable.heart, R.raw.triangle));
    }};

    public final static ArrayList<Word> transport = new ArrayList<Word>() {{
        add(new Word("bike", "велосипед", "[ baɪk ]", R.drawable.car, R.raw.bike));
        add(new Word("boat", "лодка", "[ bəʊt ]", R.drawable.car, R.raw.boat));
        add(new Word("bus", "автобус", "[ bʌs ]", R.drawable.car, R.raw.bus));
        add(new Word("car", "машина", "[ kɑː(r) ]", R.drawable.car, R.raw.car));
        add(new Word("helicopter", "вертолет", "[ ˈhel.ɪˌkɒp.tər ]", R.drawable.car, R.raw.helicopter));
        add(new Word("lorry", "грузовик", "[ ˈlɒri ]", R.drawable.car, R.raw.lorry));
        add(new Word("plane", "самолет", "[ pleɪn ]", R.drawable.car, R.raw.plane));
        add(new Word("ship", "корабль", "[ ʃɪp ]", R.drawable.car, R.raw.ship));
        add(new Word("train", "поезд", "[ treɪn ]", R.drawable.car, R.raw.train));
    }};

    public final static ArrayList<Word> weather = new ArrayList<Word>() {{
        add(new Word("autumn", "осень", "[ ˈɔːtəm ]", R.drawable.spring, R.raw.autumn));
        add(new Word("cloudy", "облачно", "[ ˈklaʊ.di ]", R.drawable.spring, R.raw.cloudy));
        add(new Word("rainy", "дождливо", "[ ˈreɪ.ni ]", R.drawable.spring, R.raw.rainy));
        add(new Word("snowy", "снежно", "[ ˈsnəʊ.i ]", R.drawable.spring, R.raw.snowy));
        add(new Word("spring", "весна", "[ sprɪŋ ]", R.drawable.spring, R.raw.spring));
        add(new Word("summer", "лето", "[ ˈsʌmə(r) ]", R.drawable.spring, R.raw.summer));
        add(new Word("sunny", "солнечно", "[ ˈsʌn.i ]", R.drawable.spring, R.raw.sunny));
        add(new Word("windy", "ветрено", "[ ˈwɪn.di ]", R.drawable.spring, R.raw.windy));
        add(new Word("winter", "зима", "[ ˈwɪntə(r) ]", R.drawable.spring, R.raw.winter));
    }};


    public static int randomInt(int length) {
        Random r = new Random();
        int rnd = r.nextInt(length); // вернет случайное число от 0 до длины массива
        return rnd;
    }

    public static void fillHashSet(HashSet<Integer> testerSet, int size) {
        Random random = new Random();
        //int size = array.length;
        while (testerSet.size() != 4) {
            testerSet.add(random.nextInt(size));
        }
    }
}
