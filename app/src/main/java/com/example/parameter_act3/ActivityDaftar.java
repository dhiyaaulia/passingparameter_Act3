package com.example.parameter_act3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class ActivityDaftar extends AppCompatActivity {

    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtRepass;

    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formdaftar);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtNama.getText().toString().isEmpty() ||
                        edtAlamat.getText().toString().isEmpty() ||
                        edtPassword.getText().toString().isEmpty() ||
                        edtRepass.getText().toString().isEmpty()) {
                    Snackbar.make(view, "Wajib isi seluruh data", Snackbar.LENGTH_LONG).show();
                } else {
                    if (edtPassword.getText().toString().equals(edtRepass.getText().toString())) {
                        Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil!", Toast.LENGTH_LONG).show();
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    } else {
                        Snackbar.make(view, "Password dan Re Password harus sama!", Snackbar.LENGTH_LONG).show();
                    }
                }
            }


        });
    }
}


