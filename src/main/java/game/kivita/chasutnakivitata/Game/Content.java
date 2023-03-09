package game.kivita.chasutnakivitata.Game;

public class Content {
    static Dialog dialog1 = new Dialog(
            "Otivash na daskalo?",
            new String[]{"da", "ne", "", ""},
            new int[]{1,0},
            new int[]{0,0},
            "Character.png",
            "null.png",
            "morning"
            );


    static Dialog dialog2 = new Dialog(
            "nesho2",
            new String[]{"da", "ne", "moje bi", "ne znam"},
            new int[]{2,2,2,2},
            new int[]{0,0,12,3},
            "null.png",
            "Krasi.png",
            "room"
            );


    static Dialog dialog3 = new Dialog(
            "nesho3",
            new String[]{"da", "ne", "mhm", ""},
            new int[]{0,0,99999,0},
            new int[]{17,30,0,0},
            "null.png",
            "null.png",
            "night"
            );


    public static Dialog[] dialogs = {dialog1,dialog2,dialog3};
    public static int sceneNum = 0;

    public static int points = 0;

    public static String firstName;
    public static String lastName;
    public static int userID;

    public static String character;

}
