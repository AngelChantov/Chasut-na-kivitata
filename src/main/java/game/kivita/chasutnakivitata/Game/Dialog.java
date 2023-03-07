package game.kivita.chasutnakivitata.Game;

public class Dialog {

    public String text;
    public String[] options;
    public int[] nextDialog;
    public int[] bonusPoints;

    public int choice;

    public Dialog(String text, String[] options, int[] nextDialog, int[] bonusPoints) {
        this.text = text;
        this.options = options;
        this.nextDialog = nextDialog;
        this.bonusPoints = bonusPoints;
    }

}
