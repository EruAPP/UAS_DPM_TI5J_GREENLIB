package ac.id.atmaluhur.mhs.GREENLIB;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Register extends AppCompatActivity {

    private RadioGroup list_jk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        list_jk = findViewById(R.id.opsi);
        Button btn_daftar = findViewById(R.id.button8);
        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent register = new Intent(Register.this, Login.class);
                startActivity(register);
            }
        });
    }
    public void punya (View b) {
        startActivity(new Intent(Register.this, Login.class));
    }
}