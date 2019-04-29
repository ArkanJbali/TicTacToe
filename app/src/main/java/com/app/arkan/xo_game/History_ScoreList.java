package com.app.arkan.xo_game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

public class History_ScoreList extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score_list);
        Button goBack = findViewById(R.id.goBack);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(Score.this,StartActivity.class));
                Intent i = new Intent(History_ScoreList.this,Score.class);
                i.putExtra("firstPlayer",getIntent().getStringExtra("firstPlayer"));
                i.putExtra("secondPlayer",getIntent().getStringExtra("secondPlayer"));
                startActivity(i);
            }
        });
    }
}
