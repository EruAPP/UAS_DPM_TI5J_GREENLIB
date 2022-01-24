package ac.id.atmaluhur.mhs.GREENLIB;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Akun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.akun);
    }
    public void login (View a){
        startActivity(new Intent(Akun.this, Login.class));
    }
}