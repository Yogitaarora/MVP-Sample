package techindustan.com.mvpsample.Login;

/**
 * An implementation of the Presenter.
 * Created by android on 10/11/17.
 */

public class LoginPresenter implements LoginInterface.Presenter {
    LoginInterface.View view;
    LoginModel model;

    public LoginPresenter(LoginInterface.View view) {
        this.model = new LoginModel();
        this.view = view;
    }

    @Override
    public void loadMessage() {
        if (model.getFirstName() == null && model.getLastName() == null) {
            view.showError("No person name found.");
            return;
        }

        String message = model.getName() + "!";
        view.showMessage(message);
    }

    @Override
    public void saveName(String firstName, String lastName) {
        model.setFirstName(firstName);
        model.setLastName(lastName);
    }
}
