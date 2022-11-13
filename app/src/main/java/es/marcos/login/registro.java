package es.marcos.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Button registrar = findViewById(R.id.registrar_reg);
        EditText email = findViewById(R.id.editTextTextEmailAddress);
        EditText pass = findViewById(R.id.editTextTextPassword);

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().isEmpty() || pass.getText().toString().isEmpty()) {
                    email.setError("No puede estar vacío");
                    pass.setError("No puede estar vacío");
                } else {
                    Usuario usuario = new Usuario(email.getText().toString(), pass.getText().toString());
                    MainActivity.usuarios.add(usuario);
                    finish();
                }
            }
        });
    }
}