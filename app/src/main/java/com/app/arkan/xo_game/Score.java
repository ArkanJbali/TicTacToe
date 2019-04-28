package com.app.arkan.xo_game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;
public class Score extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score_activity);
        showLastGameScore();
        Button goBack = findViewById(R.id.goBack);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(Score.this,StartActivity.class));
                Intent i = new Intent(Score.this,StartActivity.class);
                i.putExtra("firstPlayer",getIntent().getStringExtra("firstPlayer"));
                i.putExtra("secondPlayer",getIntent().getStringExtra("secondPlayer"));
                startActivity(i);
            }
        });
    }
    //add if not null
    public void showLastGameScore(){
        TextView fp = findViewById(R.id.pone);
        fp.setText(getIntent().getStringExtra("firstPlayer"));
        TextView sp = findViewById(R.id.ptwo);
        sp.setText(getIntent().getStringExtra("secondPlayer"));
        String gameScore [] = getIntent().getStringArrayExtra("lastGameScore");
        Log.d("CODEEEEE",gameScore[0]);
        TextView date = findViewById(R.id.date);
        date.setText(gameScore[0]+" "+gameScore[1]);
        TextView xwin = findViewById(R.id.xwin);
        xwin.setText(gameScore[3]);
        TextView xloss = findViewById(R.id.xloss);
        xloss.setText(gameScore[4]);
        TextView owin = findViewById(R.id.owin);
        owin.setText(gameScore[6]);
        TextView oloss = findViewById(R.id.oloss);
        oloss.setText(gameScore[7]);
    }
}
