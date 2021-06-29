
public class Controller {

    View terminal_UI;
    Model data_BD = new Model();

    public int get_user_input() {
        int user_input = -1;

        while (true) {
            user_input = terminal_UI.user_try();
            if (user_input < data_BD.get_min_boundry()) {
                terminal_UI.show_message("You are out of boundaries, please input number between " + data_BD.get_min_boundry() + " and " + data_BD.get_max_boundry() + ":");
            } else if (user_input > data_BD.get_max_boundry()) {
                terminal_UI.show_message("You are out of boundaries, please input number between " + data_BD.get_min_boundry() + " and " + data_BD.get_max_boundry() + ":");
            } else {
                break;
            }
        }
        return user_input;
    }


    public void override_boundry(int user_iput) {
        if (user_iput > data_BD.get_win_value()) {
            data_BD.set_max_boundry(user_iput);
        } else {
            data_BD.set_min_boundry(user_iput);
        }

    }

    public void run_game() {
        terminal_UI.show_message("Hello =) Guess a number between 0 and 100: ");
        int user_input = get_user_input();

        while (!(data_BD.is_guess_number(user_input))) {
            override_boundry(user_input);
            terminal_UI.show_message("Your guess is " + user_input + " - close but not yet. Try again between these new boundaries " + data_BD.get_min_boundry() + " and " + data_BD.get_max_boundry() + ": ");
            user_input = get_user_input();
        }
        data_BD.add_user_tries(user_input);
        terminal_UI.show_message("Congratulations! You've guessed correctly! The secret number was \"" + data_BD.get_win_value() + "\" ");
        show_statistics();

    }

    public void show_statistics(){
        terminal_UI.show_message("You guessed with " + data_BD.get_User_tries().size() + " number of attempts. Your attenpts were: ");
        terminal_UI.show_attempts(data_BD.get_User_tries());
    }
}
/**
 * if (data_BD.is_guess_number(user_input)) {
 * terminal_UI.show_message("Congratulations! You've guessed correctly!");
 * } else {
 * <p>
 * <p>
 * //terminal_UI.show_message("You are wronk! The number was " + data_BD.get_win_value());
 * }
 */