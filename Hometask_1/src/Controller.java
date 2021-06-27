
public class Controller {

    private Model modelData;
    private TerminalView viewUi;

    public void processText() {
        String firstUserWord = viewUi.requestString(modelData.getFirst());
        String secondUserWord = viewUi.requestString(modelData.getSecond());

        if (firstUserWord.equals(modelData.getFirst()) && secondUserWord.equals(modelData.getSecond())) {
            modelData.setText(firstUserWord + " " + secondUserWord);
        }

        viewUi.displayText(modelData.getText());
    }
}