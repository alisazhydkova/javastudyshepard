
public class Main {
    public static void main(String[] args) {
        Model mainModel = new Model();
        TerminalView mainView = new TerminalView();
        Controller userController = new Controller(mainModel, mainView);
        userController.processText();
    }
}
