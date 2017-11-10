package techindustan.com.mvpsample.Login;

/**
 * Helps us track the relationship between the View and the Presenter in a central place.
 * Created by android on 10/11/17.
 */

public interface LoginInterface {
    /** Represents the View in MVP. */
    interface View {
        void showMessage(String message);
        void showError(String error);
    }

    /** Represents the Presenter in MVP. */
    interface Presenter {
        void loadMessage();
        void saveName(String firstName, String lastName);
    }
}
