package com.example.flordelotus;
/**
 * RECEBER AS POSTAGENS FEITAS PELO ADMIN
 * PODER SELECIONARA POSTAGEM E ABRIR ELA EM UM TAMANHO MAIOR
 * FAVORITAR POSTAGENS
 * COMPARTILHAR POSTAGENS
 * MODO DE VISUALIZAÇÃO INFINITO [ROLAGEM]
 **/
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ArticlesActivity extends AppCompatActivity {

    CardView card;
    RecyclerView recycler_user;
    Button voltar;
    TextView posts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);

        /*
        voltar = findViewById(R.id.btn_voltar);
        posts = findViewById(R.id.textView_post1);
        card = findViewById(R.id.cardview);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), CalendarActivity.class));
            }

        });*/
    }
}