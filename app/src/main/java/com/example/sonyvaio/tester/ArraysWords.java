package com.example.sonyvaio.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;

/**
 * Created by SonyVaio on 09.11.2017.
 */

public class ArraysWords {

    final static HashMap<String, Word[]> themesMap = new HashMap<>();

    public ArraysWords() {
        themesMap.put("Глаголы", actions);
        themesMap.put("Алфавит", alphabet);
        themesMap.put("Части тела животных", animalBodyParts);
        themesMap.put("Животные", animals);
        themesMap.put("Птицы", birds);
        themesMap.put("Насекомые", bugs);
        themesMap.put("Школьные предметы", classroomObjects);
        themesMap.put("Одежда", clothes);
        themesMap.put("Цвета", colours);
        themesMap.put("Описание", describing);
        themesMap.put("Ежедневные предметы", everydayObjects);
        themesMap.put("Сказка", fairyStories);
        themesMap.put("Семья", family);
        themesMap.put("Чувства", feelings);
        themesMap.put("Еда", food);
        themesMap.put("Мебель", furniture);
        themesMap.put("Дом", home);
        themesMap.put("Домашние предметы", homeObjects);
        themesMap.put("Части тела человека", humanBody);
        themesMap.put("Природа", nature);
        themesMap.put("Числа", numbers);
        themesMap.put("Места", places);
        themesMap.put("Предлоги", prepositionsOfPlace);
        themesMap.put("Фигуры", shapes);
        themesMap.put("Транспорт", transport);
        themesMap.put("Погода", weather);
    }


    final static Word[] actions = {new Word("blow", "дуть", "[ bləʊ ]", R.drawable.blow), new Word("catch", "ловить", "[ kætʃ ]", R.drawable.catchmy),
            new Word("clap", "хлопать", "[ klæp ]", R.drawable.clap), new Word("cut", "резать", "[ kʌt ]", R.drawable.cut),
            new Word("dance", "танцевать", "[ dɑːns ]", R.drawable.dance), new Word("dig", "копать", "[ dɪɡ ]", R.drawable.dig),
            new Word("drink", "пить", "[ drɪŋk ]", R.drawable.drink), new Word("eat", "кушать", "[ iːt ]", R.drawable.eat),
            new Word("follow", "следовать", "[ ˈfɒləʊ ]", R.drawable.follow), new Word("go", "идти", "[ ɡəʊ ]", R.drawable.go),
            new Word("hide", "прятать(ся)", "[ haɪd ]", R.drawable.hide), new Word("hug", "обниматься", "[ hʌɡ ]", R.drawable.hug),
            new Word("jump", "прыгать", "[ dʒʌmp ]", R.drawable.jump), new Word("listen", "слушать", "[ ˈlɪsn̩ ]", R.drawable.listen),
            new Word("look", "смотреть", "[ lʊk ]", R.drawable.look), new Word("point", "указывать", "[ pɔɪnt ]", R.drawable.point),
            new Word("pull", "тянуть", "[ pʊl ]", R.drawable.pull), new Word("read", "читать", "[ riːd ]", R.drawable.read),
            new Word("run", "бежать", "[ rʌn ]", R.drawable.run), new Word("share", "делиться", "[ ʃeə ]", R.drawable.share),
            new Word("shout", "кричать", "[ ʃaʊt ]", R.drawable.shout), new Word("sing", "петь", "[ sɪŋ ]", R.drawable.sing),
            new Word("smell", "пахнуть", "[ smel ]", R.drawable.smell), new Word("smile", "улыбаться", "[ smaɪl ]", R.drawable.smile),
            new Word("talk", "разговаривать", "[ ˈtɔːk ]", R.drawable.talk), new Word("taste", "пробовать", "[ teɪst ]", R.drawable.taste),
            new Word("touch", "касаться", "[ tʌtʃ ]", R.drawable.touch), new Word("underline", "подчеркивать", "[ ˌʌndəˈlaɪn ]", R.drawable.underline),
            new Word("wait", "ждать", "[ weɪt ]", R.drawable.wait), new Word("whisper", "шептать", "[ ˈwɪspə ]", R.drawable.whisper),
            new Word("write", "писать", "[ ˈraɪt ]", R.drawable.write)};

    final static Word[] alphabet = {new Word("A a", "эй", "[ eɪ ]", R.drawable.a), new Word("B b", "би", "[ biː ]", R.drawable.a),
            new Word("C c", "си", "[ siː ]", R.drawable.a), new Word("D d", "ди", "[ diː ]", R.drawable.a),
            new Word("E e", "и", "[ iː ]", R.drawable.a), new Word("F f", "эф", "[ ef ]", R.drawable.a),
            new Word("G g", "джи", "[ dʒiː ]", R.drawable.a), new Word("H h", "эйч", "[ eɪtʃ ]", R.drawable.a),
            new Word("I i", "ай", "[ ˈaɪ ]", R.drawable.a), new Word("J j", "джей", "[ dʒeɪ ]", R.drawable.a),
            new Word("K k", "кей", "[ keɪ ]", R.drawable.a), new Word("L l", "эл", "[ el ]", R.drawable.a),
            new Word("M m", "эм", "[ em ]", R.drawable.a), new Word("N n", "эн", "[ en ]", R.drawable.a),
            new Word("O o", "оу", "[ əʊ ]", R.drawable.a), new Word("P p", "пи", "[ ˈpiː ]", R.drawable.a),
            new Word("Q q", "кью", "[ kjuː ]", R.drawable.a), new Word("R r", "а:, ар", "[ ɑː ]", R.drawable.a),
            new Word("S s", "эс", "[ ˈes ]", R.drawable.a), new Word("T t", "ти", "[ tiː ]", R.drawable.a),
            new Word("U u", "ю", "[ juː ]", R.drawable.a), new Word("V v", "ви", "[ viː ]", R.drawable.a),
            new Word("W w", "дабл-ю", "[ ˈdʌbljuː ]", R.drawable.a), new Word("X x", "экс", "[ eks ]", R.drawable.a),
            new Word("Y y", "уай", "[ waɪ ]", R.drawable.a), new Word("Z z", "зед", "[ zed ]", R.drawable.a)};

    final static Word[] animalBodyParts = {new Word("beak", "клюв", "[ biːk ]", R.drawable.claw), new Word("claw", "коготь", "[ klɔː ]", R.drawable.claw),
            new Word("feather", "перо", "[ ˈfeðə ]", R.drawable.claw), new Word("horn", "рог", "[ hɔːn ]", R.drawable.claw),
            new Word("jaw", "пасть, челюсть", "[ dʒɔː ]", R.drawable.claw), new Word("paw", "лапа", "[ pɔː ]", R.drawable.claw),
            new Word("tail", "хвост", "[ teɪl ]", R.drawable.claw), new Word("whisker", "ус", "[ ˈwɪskə ]", R.drawable.claw),
            new Word("wing", "крыло", "[ wɪŋ ]", R.drawable.claw)};

    final static Word[] animals = {new Word("bear", "медведь", "[ beə(r) ]", R.drawable.bear), new Word("camel", "верблюд", "[ ˈkæm.əl ]", R.drawable.bear),
            new Word("cat", "кошка", "[ kæt ]", R.drawable.bear), new Word("chicken", "курица", "[ ˈtʃɪkɪn ]", R.drawable.bear),
            new Word("cow", "корова", "[ kaʊ ]", R.drawable.bear), new Word("deer", "олень", "[ dɪər ]", R.drawable.bear),
            new Word("dog", "собака", "[ dɒɡ ]  ", R.drawable.bear), new Word("elephant", "слон", "[ ˈel.ɪ.fənt ]", R.drawable.bear),
            new Word("fox", "лиса", "[ fɒks ]", R.drawable.bear), new Word("horse", "лошадь", "[ hɔːs ]", R.drawable.bear),
            new Word("lamb", "ягненок", "[ læm ]", R.drawable.bear), new Word("lion", "лев", "[ ˈlaɪ.ən ]", R.drawable.bear),
            new Word("monkey", "обезьяна", "[ ˈmʌŋ.ki ]", R.drawable.bear), new Word("mouse", "мышь", "[ maʊs ]", R.drawable.bear),
            new Word("parrot", "попугай", "[ ˈpær.ət ]", R.drawable.bear), new Word("pig", "свинья", "[ pɪɡ ]", R.drawable.bear),
            new Word("rabbit", "кролик", "[ ˈræb.ɪt ]", R.drawable.bear), new Word("sheep", "овца", "[ ʃiːp ]", R.drawable.bear),
            new Word("snake", "змея", "[ sneɪk ]", R.drawable.bear), new Word("turkey", "индейка", "[ ˈtɜː.ki ]", R.drawable.bear),
            new Word("turtle", "черепаха", "[ ˈtɜː.tl̩ ]", R.drawable.bear), new Word("wolf", "волк", "[ wʊlf ]", R.drawable.bear)};

    final static Word[] birds = {new Word("dove", "голубь", "[ dʌv ]", R.drawable.duck), new Word("duck", "утка", "[ dʌk ]", R.drawable.duck),
            new Word("eagle", "орел", "[ ˈiː.ɡl̩ ]", R.drawable.duck), new Word("flamingo", "фламинго", "[ fləˈmɪŋ.ɡəʊ ]", R.drawable.duck),
            new Word("owl", "сова", "[ aʊl ]", R.drawable.duck)};

    final static Word[] bugs = {new Word("ant", "муравей", "[ ænt ]", R.drawable.bee), new Word("bee", "пчела", "[ biː ]", R.drawable.bee),
            new Word("beetle", "жук", "[ ˈbiː.tl̩ ]", R.drawable.bee), new Word("butterfly", "бабочка", "[ ˈbʌt.ə.flaɪ ]", R.drawable.bee),
            new Word("caterpillar", "гусеница", "[ ˈkæt.ə.pɪl.ər ]", R.drawable.bee), new Word("fly", "муха", "[ flaɪ ]", R.drawable.bee),
            new Word("grasshopper", "кузнечик", "[ ˈɡrɑːsˌhɒp.ər ]", R.drawable.bee), new Word("ladybird", "божья коровка", "[ ˈleɪ.di.bɜːd ]", R.drawable.bee),
            new Word("mosquito", "комар", "[ məˈskiː.təʊ ]", R.drawable.bee), new Word("spider", "паук", "[ ˈspaɪdə(r) ]", R.drawable.bee)};

    final static Word[] classroomObjects = {new Word("bag", "сумка", "[ bæɡ ]", R.drawable.calculator), new Word("calculator", "калькулятор", "[ ˈkæl.kjʊ.leɪ.tər ]", R.drawable.calculator),
            new Word("desk", "парта, стол", "[ desk ]", R.drawable.calculator), new Word("eraser", "ластик, резинка", "[ ɪˈreɪ.zər ]", R.drawable.calculator),
            new Word("folder", "папка", "[ ˈfəʊl.dər ]", R.drawable.calculator), new Word("glue", "клей", "[ ɡluː ]", R.drawable.calculator),
            new Word("notebook", "блокнот, тетрадь", "[ ˈnəʊt.bʊk ]", R.drawable.calculator), new Word("pen", "ручка", "[ pen ]", R.drawable.calculator),
            new Word("pencil", "карандаш", "[ ˈpensl ]", R.drawable.calculator), new Word("ruler", "линейка", "[ ˈruːlə(r) ]", R.drawable.calculator),
            new Word("scissors", "ножницы", "[ ˈsɪzəz ]", R.drawable.calculator)};

    final static Word[] clothes = {new Word("belt", "ремень", "[ belt ]", R.drawable.trousers), new Word("blouse", "блузка", "[ blaʊz ]", R.drawable.trousers),
            new Word("bracelet", "браслет", "[ ˈbreɪ.slət ]", R.drawable.trousers), new Word("cap", "кепка", "[ kæp ]", R.drawable.trousers),
            new Word("coat", "пальто", "[ kəʊt ]", R.drawable.trousers), new Word("dress", "платье", "[ dres ]", R.drawable.trousers),
            new Word("glasses", "очки", "[ ɡlɑːs ]", R.drawable.trousers), new Word("glove", "перчатка", "[ ɡlʌv ]", R.drawable.trousers),
            new Word("hat", "шляпа", "[ hæt ]", R.drawable.trousers), new Word("jacket", "куртка, пиджак", "[ ˈdʒækɪt ]", R.drawable.trousers),
            new Word("jumper", "свитер", "[ ˈdʒʌm.pər ]", R.drawable.trousers), new Word("necklace", "бусы, ожерелье", "[ ˈnek.ləs ]", R.drawable.trousers),
            new Word("ring", "кольцо", "[ rɪŋ ]", R.drawable.trousers), new Word("scarf", "шарф", "[ skɑːf ]", R.drawable.trousers),
            new Word("shirt", "рубашка", "[ ʃɜːt ]", R.drawable.trousers), new Word("shorts", "шорты", "[ ʃɔːts ]", R.drawable.trousers),
            new Word("skirt", "юбка", "[ skɜːt ]", R.drawable.trousers), new Word("sock", "носок", "[ sɒk ]", R.drawable.trousers),
            new Word("sunglasses", "солнечные очки", "[ ˈsʌŋˌɡlɑː.sɪz ]", R.drawable.trousers), new Word("trousers", "брюки", "[ ˈtraʊzəz ]", R.drawable.trousers),
            new Word("t-shirt", "футболка", "[ tʃɜːt ]  ", R.drawable.trousers), new Word("watch", "часы", "[ wɒtʃ ]", R.drawable.trousers)};

    final static Word[] colours = {new Word("black", "черный", "[ blæk ]", R.drawable.red), new Word("blue", "синий", "[ bluː ]", R.drawable.red),
            new Word("brown", "коричневый", "[ braʊn ]", R.drawable.red), new Word("green", "зеленый", "[ ɡriːn ]", R.drawable.red),
            new Word("grey", "серый", "[ ɡreɪ ]", R.drawable.red), new Word("orange", "оранжевый", "[ ˈɒrɪndʒ ]", R.drawable.red),
            new Word("pink", "розовый", "[ pɪŋk ]", R.drawable.red), new Word("purple", "фиолетовый", "[ ˈpɜːpl ]", R.drawable.red),
            new Word("red", "красный", "[ red ]", R.drawable.red), new Word("white", "белый", "[ waɪt ]", R.drawable.red),
            new Word("yellow", "желтый", "[ ˈjeləʊ ]", R.drawable.red)};

    final static Word[] describing = {new Word("beautiful", "красивый(ая)", "[ ˈbjuːtɪfl ]", R.drawable.fat), new Word("big", "большой", "[ bɪɡ ]", R.drawable.fat),
            new Word("dirty", "грязный", "[ ˈdɜːti ]", R.drawable.fat), new Word("far", "дальний", "[ fɑː(r) ]  ", R.drawable.fat),
            new Word("fat", "жирный", "[ fæt ]", R.drawable.fat), new Word("long", "длинный", "[ lɒŋ ]", R.drawable.fat),
            new Word("near", "ближайший, рядом", "[ nɪə(r) ]", R.drawable.fat), new Word("old", "старый", "[ əʊld ]", R.drawable.fat),
            new Word("short", "короткий", "[ ʃɔːt ]", R.drawable.fat), new Word("small", "маленький", "[ smɔːl ]", R.drawable.fat),
            new Word("strong", "сильный", "[ strɒŋ ]", R.drawable.fat), new Word("tall", "высокий", "[ tɔːl ]", R.drawable.fat),
            new Word("thick", "толстый", "[ θɪk ]", R.drawable.fat), new Word("thin", "тонкий", "[ θɪn ]", R.drawable.fat),
            new Word("weak", "слабый", "[ wiːk ]", R.drawable.fat), new Word("young", "молодой(ая)", "[ jʌŋ ]", R.drawable.fat)};

    final static Word[] everydayObjects = {new Word("balloon", "воздушный шар", "[ bəˈluːn ]", R.drawable.calendar), new Word("box", "коробка, ящик", "[ bɒks ]", R.drawable.calendar),
            new Word("bucket", "ведро", "[ ˈbʌk.ɪt ]", R.drawable.calendar), new Word("calendar", "календарь", "[ ˈkæl.ɪn.dər ]", R.drawable.calendar),
            new Word("comb", "расческа", "[ kəʊm ]", R.drawable.calendar), new Word("flag", "флаг", "[ flæɡ ]", R.drawable.calendar),
            new Word("hammer", "молоток", "[ ˈhæmə(r) ]", R.drawable.calendar), new Word("ladder", "лестница, стремянка", "[ ˈlæd.ər ]", R.drawable.calendar),
            new Word("letter", "письмо", "[ ˈletə(r) ]", R.drawable.calendar), new Word("lightbulb", "лампочка", "[ laɪt bʌlb]", R.drawable.calendar),
            new Word("map", "карта", "[ mæp ]", R.drawable.calendar), new Word("pin", "булавка, шпилька", "[ pɪn ]", R.drawable.calendar),
            new Word("present", "подарок", "[ ˈpreznt ]", R.drawable.calendar), new Word("rope", "веревка", "[ rəʊp ]", R.drawable.calendar),
            new Word("saw", "пила", "[ sɔː ]", R.drawable.calendar), new Word("snowflake", "снежинка", "[ ˈsnəʊ.fleɪk ]", R.drawable.calendar),
            new Word("snowman", "снеговик", "[ ˈsnəʊ.mæn ]", R.drawable.calendar), new Word("soap", "мыло", "[ səʊp ]", R.drawable.calendar),
            new Word("toothbrush", "зубная щетка", "[ ˈtuːθ.brʌʃ ]", R.drawable.calendar), new Word("toothpaste", "зубная паста", "[ ˈtuːθ.peɪst ]", R.drawable.calendar),
            new Word("towel", "полотенце", "[ taʊəl ]", R.drawable.calendar), new Word("umbrella", "зонт", "[ ʌmˈbrelə ]", R.drawable.calendar)};

    final static Word[] fairyStories = {new Word("castle", "замок", "[ ˈkɑːsl ]  ", R.drawable.castle), new Word("crown", "корона", "[ kraʊn ]", R.drawable.castle),
            new Word("dragon", "дракон", "[ ˈdræɡ.ən ]", R.drawable.castle), new Word("giant", "гигант, великан", "[ ˈdʒaɪənt ]", R.drawable.castle),
            new Word("gold", "золото", "[ ɡəʊld ]", R.drawable.castle), new Word("king", "король", "[ kɪŋ ]", R.drawable.castle),
            new Word("knight", "рыцарь", "[ naɪt ]", R.drawable.castle), new Word("prince", "принц", "[ prɪns ]", R.drawable.castle),
            new Word("princess", "принцесса", "[ ˌprɪnˈses ]", R.drawable.castle), new Word("queen", "королека", "[ kwiːn ]", R.drawable.castle),
            new Word("shield", "щит", "[ ʃiːld ]", R.drawable.castle), new Word("sword", "меч", "[ sɔːd ]", R.drawable.castle),
            new Word("throne", "трон", "[ θrəʊn ]", R.drawable.castle), new Word("tower", "башня", "[ ˈtaʊə(r) ]", R.drawable.castle)};

    final static Word[] family = {new Word("baby", "младенец", "[ ˈbeɪbi ]", R.drawable.baby), new Word("brother", "брат", "[ ˈbrʌðə(r) ]", R.drawable.baby),
            new Word("family", "семья", "[ ˈfæməli ]", R.drawable.baby), new Word("father", "папа", "[ ˈfɑːðə(r) ]", R.drawable.baby),
            new Word("grandfather", "дедушка", "[ ˈɡrænfɑːðə(r) ]", R.drawable.baby), new Word("grandmother", "бабушка", "[ ˈɡrænmʌðə(r) ]", R.drawable.baby),
            new Word("mother", "мама", "[ ˈmʌðə(r) ]", R.drawable.baby), new Word("sister", "сестра", "[ ˈsɪstə(r) ]", R.drawable.baby)};

    final static Word[] feelings = {new Word("angry", "сердитый, злой", "[ ˈæŋɡri ]", R.drawable.angry), new Word("bored", "скучающий", "[ bɔːd ]", R.drawable.angry),
            new Word("confused", "смущенный, растерянный", "[ kənˈfjuːzd ]", R.drawable.angry), new Word("excited", "возбужденный, воодушевленный", "[ ɪkˈsaɪtɪd ]", R.drawable.angry),
            new Word("happy", "счастливый", "[ ˈhæpi ]", R.drawable.angry), new Word("hungry", "голодный", "[ ˈhʌŋɡri ]", R.drawable.angry),
            new Word("sad", "грустный", "[ sæd ]", R.drawable.angry), new Word("surprised", "удивленный", "[ səˈpraɪzd ]", R.drawable.angry),
            new Word("upset", "расстроенный", "[ ʌpˈset ]", R.drawable.angry), new Word("worried", "обеспокоенный, встревоженный", "[ ˈwʌrid ]", R.drawable.angry)};

    final static Word[] food = {new Word("apple", "яблоко", "[ ˈæp.l̩ ", R.drawable.chocolate), new Word("banana", "банан", "[ bəˈnɑː.nə ]", R.drawable.chocolate),
            new Word("biscuits", "печенье", "[ ˈbɪs.kɪt ]", R.drawable.chocolate), new Word("bread", "хлеб", "[ bred ]", R.drawable.chocolate),
            new Word("cake", "торт", "[ keɪk ]", R.drawable.chocolate), new Word("carrot", "морковь", "[ ˈkærət ]", R.drawable.chocolate),
            new Word("cheese", "сыр", "[ tʃiːz ]", R.drawable.chocolate), new Word("cherry", "вишня", "[ ˈtʃer.i ]", R.drawable.chocolate),
            new Word("chicken", "цыпленок", "[ ˈtʃɪkɪn ]", R.drawable.chocolate), new Word("chocolate", "шоколад", "[ ˈtʃɒklət ]", R.drawable.chocolate),
            new Word("cucumber", "огурец", "[ ˈkjuː.kʌm.bər ]", R.drawable.chocolate), new Word("egg", "яйцо", "[ eɡ ]", R.drawable.chocolate),
            new Word("fish", "рыба", "[ fɪʃ ]", R.drawable.chocolate), new Word("grapes", "виноград", "[ ɡreɪp ]", R.drawable.chocolate),
            new Word("ice cream", "мороженое", "[ aɪs kriːm ]", R.drawable.chocolate), new Word("lemonade", "лимонад", "[ ˌlem.əˈneɪd ]", R.drawable.chocolate),
            new Word("meat", "мясо", "[ miːt ]", R.drawable.chocolate), new Word("milk", "молоко", "[ mɪlk ]", R.drawable.chocolate),
            new Word("orange", "апельсин", "[ ˈɒrɪndʒ ]", R.drawable.chocolate), new Word("pasta", "макароны", "[ ˈpæs.tə ]", R.drawable.chocolate),
            new Word("pear", "груша", "[ peər ]", R.drawable.chocolate), new Word("pepper", "перец", "[ ˈpepə(r) ]", R.drawable.chocolate),
            new Word("pie", "пирог", "[ paɪ ]", R.drawable.chocolate), new Word("pineapple", "ананас", "[ ˈpaɪnˌæp.l̩ ]", R.drawable.chocolate),
            new Word("potato", "картофель", "[ pəˈteɪtəʊ ]", R.drawable.chocolate), new Word("rice", "рис", "[ raɪs ]", R.drawable.chocolate),
            new Word("sandwich", "бутерброд", "[ ˈsæn.wɪdʒ ]", R.drawable.chocolate), new Word("sausage", "сосиска, колбаска", "[ ˈsɒs.ɪdʒ ]", R.drawable.chocolate),
            new Word("strawberry", "клубника", "clap", R.drawable.chocolate), new Word("tea", "чай", "cut", R.drawable.chocolate),
            new Word("water", "вода", "[ ˈwɔːtə(r) ]", R.drawable.chocolate)};

    final static Word[] furniture = {new Word("armchair", "кресло", "[ ˈɑːm.tʃeər ]", R.drawable.fridge), new Word("bath", "ванна", "[ bɑːθ ]", R.drawable.fridge),
            new Word("bed", "кровать", "[ bed ]", R.drawable.fridge), new Word("chair", "стул", "[ tʃeə(r) ]", R.drawable.fridge),
            new Word("fridge", "холодильник", "[ frɪdʒ ]", R.drawable.fridge), new Word("lamp", "лампа", "[ læmp ]", R.drawable.fridge),
            new Word("oven", "духовка", "[ ˈʌvn ]", R.drawable.fridge), new Word("shelf", "полка", "[ ʃelf ]", R.drawable.fridge),
            new Word("sink", "раковина", "[ sɪŋk ]", R.drawable.fridge), new Word("sofa", "диван", "[ ˈsəʊ.fə ]", R.drawable.fridge),
            new Word("table", "стол", "[ ˈteɪbl ]", R.drawable.fridge), new Word("toilet", "туалет, унитаз", "[ ˈtɔɪlət ]", R.drawable.fridge),
            new Word("wardrobe", "гардероб, шкаф", "[ ˈwɔː.drəʊb ]", R.drawable.fridge)};

    final static Word[] home = {new Word("balcony", "балкон", "[ ˈbæl.kə.ni ]", R.drawable.bathroom), new Word("bathroom", "ванная комната", "[ ˈbɑːθruːm ]", R.drawable.bathroom),
            new Word("bedroom", "спальня", "[ ˈbedruːm ]", R.drawable.bathroom), new Word("door", "дверь", "[ dɔː(r) ]", R.drawable.bathroom),
            new Word("floor", "пол, этаж", "clap", R.drawable.bathroom), new Word("garden", "сад", "cut", R.drawable.bathroom),
            new Word("hall", "зал, коридор", "[ hɔːl ]", R.drawable.bathroom), new Word("house", "дом", "[ haʊs ]", R.drawable.bathroom),
            new Word("kitchen", "кухня", "[ ˈkɪtʃɪn ]", R.drawable.bathroom), new Word("roof", "крыша", "[ ruːf ]", R.drawable.bathroom),
            new Word("stairs", "лестница, ступеньки", "[ steər ]", R.drawable.bathroom), new Word("window", "окно", "[ ˈwɪndəʊ ]", R.drawable.bathroom)};

    final static Word[] homeObjects = {new Word("bottle", "бутылка", "[ ˈbɒtl ]", R.drawable.knife), new Word("bowl", "чаша, миска", "[ bəʊl ]", R.drawable.knife),
            new Word("clock", "часы", "[ klɒk ]", R.drawable.knife), new Word("cup", "кружка", "[ kʌp ]", R.drawable.knife),
            new Word("fork", "вилка", "[ fɔːk ]", R.drawable.knife), new Word("glass", "стакан, стекло", "[ ɡlɑːs ]", R.drawable.knife),
            new Word("knife", "нож", "[ naɪf ]", R.drawable.knife), new Word("mirror", "зеркало", "[ ˈmɪrə(r) ]", R.drawable.knife),
            new Word("pan", "сковородка", "[ pæn ]", R.drawable.knife), new Word("picture", "картина", "[ ˈpɪktʃə(r) ]", R.drawable.knife),
            new Word("pillow", "подушка", "[ ˈpɪl.əʊ ]", R.drawable.knife), new Word("plate", "тарелка", "[ pleɪt ]", R.drawable.knife),
            new Word("rug", "ковер", "[ rʌɡ ]", R.drawable.knife), new Word("spoon", "ложка", "[ spuːn ]", R.drawable.knife),
            new Word("tap", "кран", "[ tæp ]", R.drawable.knife), new Word("telephone", "телефон", "[ ˈtelɪfəʊn ]", R.drawable.knife),
            new Word("tv", "телевизор", "[ ˌtiː ˈviː ]", R.drawable.knife)};

    final static Word[] humanBody = {new Word("arm", "рука", "[ ɑːm ]", R.drawable.eye), new Word("back", "спина", "[ bæk ]", R.drawable.eye),
            new Word("body", "тело", "[ ˈbɒdi ]", R.drawable.eye), new Word("ear", "ухо", "[ ɪə(r) ]", R.drawable.eye),
            new Word("eye", "глаз", "[ aɪ ]", R.drawable.eye), new Word("face", "лицо", "[ feɪs ]", R.drawable.eye),
            new Word("finger", "палец", "[ ˈfɪŋɡə(r) ]", R.drawable.eye), new Word("hair", "волосы", "[ heə(r) ]", R.drawable.eye),
            new Word("hand", "ладонь, кисть руки", "clap", R.drawable.eye), new Word("head", "голова", "cut", R.drawable.eye),
            new Word("leg", "нога", "[ leɡ ]", R.drawable.eye), new Word("mouth", "рот", "[ maʊθ ]", R.drawable.eye),
            new Word("nose", "нос", "[ nəʊz ]", R.drawable.eye), new Word("shoulder", "плечо", "[ ˈʃəʊldə(r) ]", R.drawable.eye),
            new Word("teeth", "зубы", "[ tiːθ ]", R.drawable.eye)};

    final static Word[] nature = {new Word("beach", "пляж", "[ biːtʃ ]", R.drawable.island), new Word("field", "поле", "[ fiːld ]", R.drawable.island),
            new Word("forest", "лес", "[ ˈfɒrɪst ]", R.drawable.island), new Word("island", "остров", "[ ˈaɪlənd ]", R.drawable.island),
            new Word("lake", "озеро", "[ leɪk ]", R.drawable.island), new Word("leaf", "лист", "[ liːf ]", R.drawable.island),
            new Word("log", "бревно", "[ lɒɡ ]", R.drawable.island), new Word("mountain", "гора", "[ ˈmaʊntən ]", R.drawable.island),
            new Word("rainbow", "радуга", "[ ˈreɪn.bəʊ ]", R.drawable.island), new Word("river", "река", "[ ˈrɪvə(r) ]", R.drawable.island),
            new Word("rock", "скала", "[ rɒk ]", R.drawable.island), new Word("sea", "море", "[ siː ]", R.drawable.island),
            new Word("stone", "камень", "[ stəʊn ]", R.drawable.island), new Word("tree", "дерево", "[ triː ]", R.drawable.island),
            new Word("wave", "волна", "[ weɪv ]", R.drawable.island)};

    final static Word[] numbers = {new Word("one", "один", "[ wʌn ]", R.drawable.one), new Word("two", "два", "[ tuː ]", R.drawable.one),
            new Word("three", "три", "[ θriː ]", R.drawable.one), new Word("four", "четыре", "[ fɔː(r) ]", R.drawable.one),
            new Word("five", "пять", "[ faɪv ]", R.drawable.one), new Word("six", "шесть", "[ sɪks ]", R.drawable.one),
            new Word("seven", "семь", "[ ˈsevn ]", R.drawable.one), new Word("eight", "восемь", "[ eɪt ]", R.drawable.one),
            new Word("nine", "девять", "[ naɪn ]", R.drawable.one), new Word("ten", "десять", "[ ten ]", R.drawable.one),
            new Word("eleven", "одиннадцать", "[ ɪˈlevn ]", R.drawable.one), new Word("twelve", "двенадцать", "[ twelv ]", R.drawable.one),
            new Word("thirteen", "тринадцать", "[ ˌθɜːˈtiːn ]", R.drawable.one), new Word("fourteen", "четырнадцать", "[ ˌfɔːˈtiːn ]", R.drawable.one),
            new Word("fifteen", "пятнадцать", "[ ˌfɪfˈtiːn ]", R.drawable.one), new Word("sixteen", "шестнадцать", "[ ˌsɪksˈtiːn ]", R.drawable.one),
            new Word("seventeen", "семнадцать", "[ ˌsevnˈtiːn ]", R.drawable.one), new Word("eighteen", "восемнадцать", "[ ˌeɪˈtiːn ]", R.drawable.one),
            new Word("nineteen", "девятнадцать", "[ ˌnaɪnˈtiːn ]", R.drawable.one), new Word("twenty", "двадцать", "[ ˈtwenti ]", R.drawable.one),
            new Word("thirty", "тридцать", "[ ˈθɜːti ]", R.drawable.one), new Word("forty", "сорок", "[ ˈfɔːti ]", R.drawable.one),
            new Word("fifty", "пятьдесят", "[ ˈfɪfti ]", R.drawable.one), new Word("sixty", "шестьдесят", "[ ˈsɪksti ]", R.drawable.one),
            new Word("seventy", "семьдесят", "[ ˈsevnti ]", R.drawable.one), new Word("eighty", "восемьдесят", "[ ˈeɪti ]", R.drawable.one),
            new Word("ninety", "девяносто", "[ ˈnaɪnti ]", R.drawable.one), new Word("hundred", "сто", "[ ˈhʌndrəd ]", R.drawable.one),
            new Word("thousand", "тысяча", "[ ˈθaʊznd ]", R.drawable.one)};

    final static Word[] places = {new Word("airport", "аэропорт", "[ ˈeəpɔːt ]", R.drawable.library), new Word("bridge", "мост", "[ brɪdʒ ]", R.drawable.library),
            new Word("factory", "завод, фабрика", "[ ˈfæktri ]", R.drawable.library), new Word("hotel", "гостиница", "[ həʊˈtel ]", R.drawable.library),
            new Word("library", "библиотека", "[ ˈlaɪbrəri ]", R.drawable.library), new Word("park", "парк", "[ pɑːk ]", R.drawable.library),
            new Word("school", "школа", "[ skuːl ]", R.drawable.library), new Word("stadium", "стадион", "[ ˈsteɪ.di.əm ]", R.drawable.library),
            new Word("street", "улица", "[ striːt ]", R.drawable.library), new Word("theatre", "театр", "[ ˈθɪətə(r) ]", R.drawable.library)};

    final static Word[] prepositionsOfPlace = {new Word("behind", "за, позади", "[ bɪˈhaɪnd ]", R.drawable.on), new Word("between", "между", "[ bɪˈtwiːn ]", R.drawable.on),
            new Word("in front of", "впереди", "[ ɪn frʌnt əv ]", R.drawable.on), new Word("in", "в, внутри", "[ ɪn ]", R.drawable.on),
            new Word("next", "следующий", "[ nekst ]", R.drawable.on), new Word("on", "на", "[ ɒn ]", R.drawable.on),
            new Word("opposite", "напротив", "[ ˈɒpəzɪt ]", R.drawable.on), new Word("under", "под", "[ ˈʌndə(r) ]", R.drawable.on)};

    final static Word[] shapes = {new Word("circle", "круг", "[ ˈsɜːkl ]", R.drawable.heart), new Word("cube", "куб", "[ kjuːb ]", R.drawable.heart),
            new Word("diamond", "ромб", "[ ˈdaɪəmənd ]", R.drawable.heart), new Word("heart", "сердце", "[ hɑːt ]", R.drawable.heart),
            new Word("hexagon", "шестиугольник", "[ ˈhek.sə.ɡən ]", R.drawable.heart), new Word("oval", "овал", "[ ˈəʊ.vəl ]", R.drawable.heart),
            new Word("pentagon", "пятиугольник", "[ ˈpen.tə.ɡən ]", R.drawable.heart), new Word("rectangle", "прямоугольник", "[ ˈrek.tæŋ.ɡl̩ ]", R.drawable.heart),
            new Word("sphere", "сфера, шар", "[ sfɪər ]", R.drawable.heart), new Word("square", "квадрат, площадь", "[ skweə(r) ]", R.drawable.heart),
            new Word("star", "звезда", "[ stɑː(r) ]", R.drawable.heart), new Word("triangle", "треугольник", "[ ˈtraɪæŋɡl ]", R.drawable.heart)};

    final static Word[] transport = {new Word("bike", "велосипед", "[ baɪk ]", R.drawable.car), new Word("boat", "лодка", "[ bəʊt ]", R.drawable.car),
            new Word("bus", "автобус", "[ bʌs ]", R.drawable.car), new Word("car", "машина", "[ kɑː(r) ]", R.drawable.car),
            new Word("helicopter", "вертолет", "[ ˈhel.ɪˌkɒp.tər ]", R.drawable.car), new Word("lorry", "грузовик", "[ ˈlɒri ]", R.drawable.car),
            new Word("plane", "самолет", "[ pleɪn ]", R.drawable.car), new Word("ship", "корабль", "[ ʃɪp ]", R.drawable.car),
            new Word("train", "поезд", "[ treɪn ]", R.drawable.car)};

    final static Word[] weather = {new Word("autumn", "осень", "[ ˈɔːtəm ]", R.drawable.spring), new Word("cloudy", "облачно", "[ ˈklaʊ.di ]", R.drawable.spring),
            new Word("rainy", "дождливо", "[ ˈreɪ.ni ]", R.drawable.spring), new Word("snowy", "снежно", "[ ˈsnəʊ.i ]", R.drawable.spring),
            new Word("spring", "весна", "[ sprɪŋ ]", R.drawable.spring), new Word("summer", "лето", "[ ˈsʌmə(r) ]", R.drawable.spring),
            new Word("sunny", "солнечно", "[ ˈsʌn.i ]", R.drawable.spring), new Word("windy", "ветрено", "[ ˈwɪn.di ]", R.drawable.spring),
            new Word("winter", "зима", "[ ˈwɪntə(r) ]", R.drawable.spring)};

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
