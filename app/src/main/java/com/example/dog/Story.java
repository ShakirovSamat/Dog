package com.example.dog;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Story {
    public String[] text = new String[100];

    Story(){
        text[0] = "На дворе 26 августа 2018 года. В этот день проходил конкурс \"Золотое пианино\". Конкурс проводила музыкальная школа \"Роза\", единственная музыкальная школа посёлка Юдино.";
        text[1] = "В конкурсе участвовало 10 человек. Одним из них была 12 летняя Даша Никулина, талантливая девочка, имеющая четырёхлетний опыт игры на пианино.";
        text[2] = "На конкурсе она исполнила \"К Элизе\"  Людвига ван Бетховена. Это было замечательное исполнение: весь зал аплодировал ей. От таких громких оваций девочка покраснела. Уходя со сцены, на её лице была улыбка. Это " +
                "была заявка на победу.";
        text[3] = "Конкурус закончился. Наступили сумерки. Люди начали расходиться по домам.";
        text[4] = "Родители Даши уехали в командировку и не смогли посетить её выступление. Ей пришлось возаращаться домой одной. Даша живёт в своём доме на окраине посёлка. Путь предстоял немаленький.";
        text[5] = "После конкураса девочка собиралась пойти к своему другу в гости.";
        text[6] = "Они хотели посмотреть фильм \"Милые кости\", о котором Даша узнала буквально сегодня.";
        text[7] = "На одной из перемен в школе она с одноклассниками обсуждала прочитанные книжки. Все делелись своими впечатлениями и рекомендовали те или иные книги.";

        text[8] = "Одна из одноклассниц Даши порекомендовала посмотреть фильм \"Милые кости\", который снять на основе одноимённой книге.";
        text[8] = "Перед походом в гости Даша по просьбе матери должна пообедать у себя дома. Но на гарнир ничего не было. К счастью, на такой случай у неё были деньги.";
        text[9] = "\"Что же купить? Денег хватает только на сосиски.\" - спросила себя Даша.";
        text[10] = "\"Бээ. Гадость\" - думает Даша.";
        text[11] = "\"Может купить сладкого на эти деньги. Будет чем угостить Андрея. Поужинаю у него. Что же выбрать?\" -  рассуждает девочка.";

        text[12] = "choose";
        text[13] = "ch1 1! Сосиски";
        text[14] = "ch2 1! Сладости";
        text[15] = "ch3 1! ";

        text[16] = "ChooseFood";
        text[17] = "Девочка вышла из магазина.";
        text[18] = "Идя по улице, она взглянула в небо.";
        text[19] = "\"Вот там летить пассажирский самолёт, оставляя за собой пушистое облако газа.\" - указывая на железную птицу, говорит Даша.";
        text[20] = "\"Вот это облако похоже на пианино. Белое, лёгкое пианино. Ооо. А вот это облако напоминает Бетховена\" - Думает девочка.";
        text[21] = "\"Какой же великий композитор Людвиг ван Бетховен. Я обезательно стану такой же как и он. Буду сочинять великие мелодии, которые будут любить во всём мире и маленькие, и взрослые\n" +
                "\" - говорит сама с собой Даша.";
        text[22] = "Вдруг, в дали Даша замечает силуэт собаки.";
        text[23] = "\"Может мне показалось: в этом районе никогда не было бездомных собак.\" - думает Даша.";
        text[24] = "\"В идеале обойти эту улицу стороной, но обход \n" +
                "очень долгий около 20 минут. Хотелось бы прийти домой как можно быстрее. - говорит девочка";
        text[25] = "\"Блин. Обойти никак не получиться: мне ещё к другу надо пойти и уроки делать\" - продолжает Даша.";
        text[26] = "Пройдя по этой улице, Даша не заметила никакой собаки.";
        text[27] = "\"Фуф, - сказада Даша. - Пронесло\".";
        text[28] = "Даша подходит к повороту на свою улицу.";
        text[29] = "Вдруг, из-за поворота выходит чёрная собака среднего размера. Шерсть у неё грязная, уши высокие. Хвост весь в грязи. Собака обнухивала всё вокруг: видимо искала еду.";
        text[30] = "Даша испугалась. \"Нужно было обойти эту улицу\" - думала про себя девочка. Назад дороги не было.";
        text[31] = "Была не была! Пройду и через собаку.";
        text[32] = "Она продолжала идти не обращая внимания на собаку.";
        text[33] = "Даша старалась идти бесшумно. Но, к сожалению, оступилась об камень.";
        text[34] = "Пёс заметил Дашу и внимательно смотрел на девочку.";
        text[35] = "Даша продолжала идти.";
        text[36] = "\"ОООООВВВВВФФФ.\" -  Раздался громкий рёв собаки. - \"РРРРААА.\". Собака была настроена серёзно.";
        text[37] = "Сердце Даши ушло в пятка. Пульс усилился. Ей было страшно. \"Что делать? Что делать?\" - Нервно думала Даша.";

        text[38] = "choose";
        text[39] = "ch1 1! Стоять и не двигаться";
        text[40] = "ch2 1! Идти дальше";
        text[41] = "ch3 1! ";

            text[42] = "ch1 1";
            text[44] = "Даша замерла на месте";
            text[43] = "Собака продолжала лаять. Громкость лая усиливалась с каждой секундой. Собака начала приближаться к Даше.";
            text[44] = "\"Если я продолжу стоят на месте, то я точно почувтсвую в себе зубы этого проклятого пса. Нужно действовать.\" - сделала вывод Даша. ";

            text[45] = "choose";
            text[46] = "ch1 2! Бежать изо всех сил прочь от собаки";
            text[47] = "ch2 2! Попробовать залесть на дерево";
            text[48] = "ch3 2! ";

                text[48] = "ch1 2";
                text[49] = "С испуга Даша рванула прочь от собаки. Собака рванула в след за ней.";
                text[50] = "\"Мама. Мама. Мамочка\" - визжа, кричала Даша.";
                text[51] = "Собака догоняла Дашу. Шансов на спасение не было.";
                text[52] = "Собака повалила девочку и укусила ногу. Плача, девочка пыталась отбиться от собаки. У неё не получалось.";
                text[53] = "На душераздерающие крики девочки выбежал врозлый мужчина из ближайшего дома.";
                text[54] = "\"Уйди. Уйди. Грязная шавка. Пошла прочь. Я тебе сейчас таких люлей надаю. Пожалеешь, что на свет родилась.\" - произнёс мужской голос.";
                text[55] = "Собака замирает на секунду и начинает медленно пятиться назад. А потом и вовсе уходит.";
                text[56] = "Даша лежала без сознания.";
                text[57] = "Мужчина вызвал скорую.";
                text[58] = "Даша была спасена";
                text[59] = "end";

                text[60] = "ch2 2";
                text[61] = "Даша рванула к ближайшему дереву.";
                text[62] = "Под действием адреналина она забралась.";
                text[63] = "Опасность была позади. Вскоре собака успокоилась и ушла.";
                text[64] = "Девочка благополучно доходит до домой.";
                text[65] = "end";

            text[66] = "ch2 1";
            text[67] = "Даша продолжала идти";
            text[68] = "Собака не перестовала лаят. Ноги Даши начали дрожать, дыхание усложнялось.";
            text[69] = "Собака лает всё громче и громче.";
            text[70] = "\"Мама. Мамочка\" - кричит про себя Даша.";
            text[71] = "Собака медленно подходит к Даше.";
            text[72] = "\"Что делать? Что делать?\" - в истерике думает девочка.";

            text[73] = "choose";
            text[74] = "ch1 2! Крикнуть \"Помогите\"";
            text[75] = "ch2 2! Бежать изо всех сил прочь от собаки";
            text[76] = "";

                text[77] = "ch1 2";
                text[78] = "\"Помогите. Помогите. Убивают\" - кричит изо всех сила Даша.";
                text[79] = "Собака на миг замолчала.";
                text[80] = "Ноги Даши дрожат.";
                text[81] = "Показывая свои зубы, пёс подходил к девочке.";
                text[82] = "\"Это конец\" - Думает Даша.";
                text[83] = "Вдруг из-за её спины произносится крик - \"Уйди. Уйди. Грязная шавка. Пошла прочь. Я тебе сейчас таких люлей надаю. Пожалеешь, что на свет родилась.\" - произнёс мужской голос.";
                text[84] = "Собака замерла на месте.";
                text[85] = "\"Пошла вон. Пошла вон. Убью\" - ещё громче закричал мужчина.";
                text[86] = "Собака убежала.";
                text[87] = "Даша не могла пошевелиться.";
                text[88] = "Опасность была позади. Мужчина привёл девочку в чувство и отвёл до её дома.";
                text[89] = "end";

                text[90] = "ch2 2";
                text[91] = "back";

            text[92] = "ch3 1";
            text[93] = "\"Кину-ка я ей сосиски\" - сказала Даша.";
            text[94] = "Она кинула собаке всю пачку.";
            text[95] = "Собака дёрнулась, оскалила клыки и зарычала ещё громче.";
            text[96] = "\"Это конец\" - думала Даша.";
            text[97] = "Но вдруг собака учуяла запах сосисок. Прекратила рычать. Схватила сосиски и убежала.";
            text[98] = "Ноги Даши дрожали ещё пару минут. Вскоре девочка благополучно добралась до домой.";
            text[99] = "end";



    }


    int step = 0;
    public void next(TextView container, View contin){
        container.setText(text[step]);
        step++;
        if(text[step].equals("end")){
            container.setText("-----The end-----");
            contin.setClickable(false);
        }
    }
    public void chose(Button b1, Button b2 , Button b3){
        b1.setText(text[step + 1].split("! ")[1]);
        b2.setText(text[step + 2].split("! ")[1]);
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
        if(text[step + 3].length() > 7){
            b3.setText(text[step + 3].split("! ")[1]);
            b3.setVisibility(View.VISIBLE);
        }
    }

}
