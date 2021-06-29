import java.util.*;

public class Model {

    private int min_boundry = 0;
    private int max_boundry = 100;
    private int win_value;
    private Vector<Integer> user_tries = new Vector<>();


    public Model() {
        Random random = new Random();
        int bound = get_max_boundry() - get_min_boundry();
        this.win_value = random.nextInt(bound + 1) + get_min_boundry();
    }

    public boolean is_guess_number(int user_value) {
        return win_value == user_value;
    }

    public int get_min_boundry() {
        return min_boundry;
    }

    public int get_max_boundry() {
        return max_boundry;
    }

    public int get_win_value() {
        return win_value;
    }

    public void set_max_boundry(int user_attempt) {
        this.max_boundry = user_attempt;
        add_user_tries(user_attempt);
    }

    public void set_min_boundry(int user_attempt) {
        this.min_boundry = user_attempt;
        add_user_tries(user_attempt);
    }

    public void add_user_tries(int user_try) {
        user_tries.add(user_try);
    }

    public Vector<Integer> get_User_tries() {
        return user_tries;
    }

}
