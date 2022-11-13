package es.marcos.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogin = findViewById(R.id.button);
        EditText email = findViewById(R.id.editTextTextEmailAddressLogin);
        EditText pass = findViewById(R.id.editTextTextPasswordLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Usuario user = new Usuario(email.getText().toString(), pass.getText().toString());

                if (MainActivity.usuarios.contains(user)) {
                    Intent intent = new Intent(login.this, sesionIniciada.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(login.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}