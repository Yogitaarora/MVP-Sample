package techindustan.com.mvpsample.Login;

/**
 * Represents the Model in MVP architecture.
 * Created by android on 10/11/17.
 */

public class LoginModel {
    private String firstName;
    private String lastName;

    public LoginModel() {
    }

    public LoginModel(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }
}


