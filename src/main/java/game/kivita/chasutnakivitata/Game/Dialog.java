package game.kivita.chasutnakivitata.Game;

public class Dialog {

    public String text;
    public String[] options;
    public int[] nextDialog;
    public int[] bonusPoints;
    public String leftPic;
    public String rightPic;
    public String background;

    public int choice;

    public Dialog(String text, String[] options, int[] nextDialog, int[] bonusPoints, String leftPic, String rightPic, String background) {
        this.text = text;
        this.options = options;
        this.nextDialog = nextDialog;
        this.bonusPoints = bonusPoints;
        this.leftPic = leftPic;
        this.rightPic = rightPic;
        this.background = background;
    }

}
