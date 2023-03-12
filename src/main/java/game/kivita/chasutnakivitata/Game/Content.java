package game.kivita.chasutnakivitata.Game;

import java.util.ArrayList;

public class Content {
    public static Dialog[] dialogs = {
            //WEEK 1
            //0
            new Dialog("Събуждаш се в общежитието(имаш махмурлук от предната вечер), отиваш ли на час?",
                    new String[]{"", "Да", "Не", ""},
                    new int[]{0,1,99999,0},//-
                    new int[]{0,0,-10,0},
                    "null.png",
                    "null.png",
                    "morning"
            ),

            //1
            new Dialog("Даваш ли си зор да отидеш на час или ше бегаш?",
                    new String[]{"Да, отивам на час", "Да, ама Краси ще почака", "От къв зор, да не ми е длъжен", ""},
                    new int[]{5,2,99999,0},//-
                    new int[]{4,0,-4,0},
                    "Character.png",
                    "null.png",
                    "morning"),

            //2
            new Dialog("Закъсняваш за час, кво смяташ да направиш по този въпрос?",
                    new String[]{"", "Бале го, нищо", "Взимам му кафенце", ""},
                    new int[]{0,4,3,0},//-
                    new int[]{0,-6,3,0},
                    "Character.png",
                    "null.png",
                    "morning"),

            //3
            new Dialog("Закъснял си за часа, но носиш кафенце на Краси.\n" +
                    "Краси: Къде ми е цигарката?",
                    new String[]{"", "Следващия път", "Нещо за голям се взехте", ""},
                    new int[]{0,5,5,0},//-
                    new int[]{0,0,-1,0},
                    "Character.png",
                    "Krasi.gif",
                    "room"),

            //4
            new Dialog("Закъснял си за часа.\n" +
                    "Краси: Къде ми е кафенцето?",
                    new String[]{"ЕЕЕЕ вече го изпих", "Нямате ли си???", "Нещо за голям се взехте", ""},
                    new int[]{5,5,5,0},//-
                    new int[]{0,1,-2,0},
                    "Character.png",
                    "Krasi.gif",
                    ""),

            //5
            new Dialog("Краси задава проект, който трябва да е готов в рамките на три седмици, избери проект:",
                    new String[]{"Gay in shape (Фитнес сайт)", "KyrsExchange (Black Market за курсови работи)", "Часът на джойстиците (Симулатор на час при Томов)", "Калкулатор на swing (за три)"},
                    new int[]{6,6,6,6},//-
                    new int[]{75,85,99,50},
                    "Character.png",
                    "Krasi.png",
                    "room"),

            //6
            randomDialogStart(),
/*
            //7
            new Dialog("",
                    new String[]{"", "", "", ""},
                    new int[]{,,,},//-
                    new int[]{,,,},
                    "",
                    "",
                    ""
            ),
*/
            //RANDOM DIALOG 1 CHOICE 1
            new Dialog("Краси: Какво си драпаш косматите кивита? Я почвай да работиш!!!",
                    new String[]{"Добре", "Добре", "Добре", "Добре"},
                    new int[]{8,8,8,8},//-
                    new int[]{-3,-1,-7,2},
                    "Character.png",
                    "KrasiAngry.gif",
                    "room"
            ),
/*
            //RANDOM DIALOG 1 CHOICE 2
            new Dialog("",
                    new String[]{"", "", "", ""},
                    new int[]{,,,},//-
                    new int[]{0,0,0,0},
                    "",
                    "",
                    ""
            ),

            //RANDOM DIALOG 1 CHOICE 3
            new Dialog("",
                    new String[]{"", "", "", ""},
                    new int[]{,,,},//-
                    new int[]{,,,},
                    "",
                    "",
                    ""
            ),

            //RANDOM DIALOG 1 CHOICE 4
            new Dialog("",
                    new String[]{"", "", "", ""},
                    new int[]{,,,},//-
                    new int[]{,,,},
                    "",
                    "",
                    ""
            ),
*/
/*
            new Dialog("",
                    new String[]{"", "", "", ""},
                    new int[]{,,,},//-
                    new int[]{,,,},
                    "",
                    "",
                    ""
            ),


            new Dialog("",
                    new String[]{"", "", "", ""},
                    new int[]{,,,},//-
                    new int[]{,,,},
                    "",
                    "",
                    ""
            ),


            new Dialog("",
                    new String[]{"", "", "", ""},
                    new int[]{,,,},//-
                    new int[]{,,,},
                    "",
                    "",
                    ""
            ),
*/

    };

    static Dialog randomDialogStart(){

        ArrayList<Dialog> randomDialogs = new ArrayList();
        randomDialogs.add(
                new Dialog(
                        "Краси тупурка из стаята и минава покрай теб. Какво правиш?",
                    new String[]{"Чешеш кивитата","Разказваш вица за човека с каса бира вместо гъз","Питаш го ти за виц","Работиш по проекта (Краси ще го има предвид)"},
                    new int[]{dialogs.length-1,,,},//-
                    new int[]{-2,,,},
                    "Character.png",
                    "Krasi.png",
                    "room"));
//dialogs.lenght - broq na random dialozite ^^^

        return randomDialogs.get(0);
    }



    public static int sceneNum = 0;

    public static int points = 0;

    public static String firstName;
    public static String lastName;
    public static int userID;

    public static String character;

}
