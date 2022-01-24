package ac.id.atmaluhur.mhs.GREENLIB;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

    }
    public void registrasi (View a){
        startActivity(new Intent (Login.this, Register.class));
    }

    public void login (View b) {
        startActivity(new Intent(Login.this, dashboard.class));
    }
}