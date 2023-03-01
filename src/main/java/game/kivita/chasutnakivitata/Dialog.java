package game.kivita.chasutnakivitata;

public class Dialog {

    String text;
    String[] options;
    int[] nextDialog;
    int[] bonusPoints;

    int choice;

    public Dialog(String text, String[] options, int[] nextDialog, int[] bonusPoints) {
        this.text = text;
        this.options = options;
        this.nextDialog = nextDialog;
        this.bonusPoints = bonusPoints;
    }

}
