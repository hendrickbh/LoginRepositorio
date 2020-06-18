package com.example.primerapractica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etn, etp;
    private Button Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn = (EditText) findViewById(R.id.txt_nombre);
        etp = (EditText) findViewById(R.id.txt_password);
        Btn = (Button) findViewById(R.id.Limpiar);


Btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        etn.setText("");
        etp.setText("");
    }
});
    }


    public void Validar(View view) {

        String nombre = etn.getText().toString();
        String password = etp.getText().toString();

        if (nombre.length() == 0){
            Toast.makeText(  this,  "Debes introducir un nombre", Toast.LENGTH_LONG) .show();



        }


        if (password.length() == 0){

            Toast.makeText(  this,  "Debes introducir un password", Toast.LENGTH_LONG) .show();
        }


        if (nombre.equals ("Hendrick") && password.equals("123456")  ) {
Intent validar = new Intent(this, Main2Activity.class);
 startActivity(validar);
        }else{
        Toast.makeText(this,"Favor verificar los datos suministrados",Toast.LENGTH_LONG).show();
    }

    }



}