package br.com.up.enviarmsg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText numero;
    private  TextInputEditText mensagem;
    private Button enviar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero = findViewById(R.id.txt_telefone);
        mensagem = findViewById(R.id.txt_mensagem);
        enviar = findViewById(R.id.button);

        enviar.setOnClickListener(view ->
                {
                    String numeroStr = numero.getText().toString();
                    String mensagemStr = mensagem.getText().toString();

                    Uri webpage = Uri.parse(
                            "https://wa.me/"+numeroStr+"?text="+mensagemStr);

                    Intent webintent = new Intent(Intent.ACTION_VIEW, webpage);
                    startActivity(webintent);
                }

                );



    }
}