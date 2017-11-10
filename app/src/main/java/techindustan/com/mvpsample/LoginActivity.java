package techindustan.com.mvpsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import techindustan.com.mvpsample.Login.LoginInterface;
import techindustan.com.mvpsample.Login.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, LoginInterface.View {
    // An implementation of the View.

    EditText etFirstName, etLastName;
    TextView tvMsg;
    LoginInterface.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
        // Creates presenter
        presenter = new LoginPresenter(this);
    }


    private void initViews() {

        etFirstName = (EditText) findViewById(R.id.etFirstName);
        etLastName = (EditText) findViewById(R.id.etLastName);
        tvMsg = (TextView) findViewById(R.id.tvMsg);
        findViewById(R.id.update).setOnClickListener(this);
        findViewById(R.id.showMessage).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.update:
                presenter.saveName(etFirstName.getText().toString(), etLastName.getText().toString());
                break;
            case R.id.showMessage:
                presenter.loadMessage();
                break;
        }
    }

    @Override
    public void showMessage(String message) {
        tvMsg.setText(message);
    }

    @Override
    public void showError(String error) {
        Toast.makeText(getApplicationContext(), error, Toast.LENGTH_SHORT).show();
    }
}
