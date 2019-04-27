package com.app.arkan.xo_game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class StartActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);
        Intent i = getIntent();
        TextView firstPlayerName = findViewById(R.id.firstPlayerName);
        firstPlayerName.setText(i.getStringExtra("firstPlayer"));
        TextView secondPlayerName = findViewById(R.id.secondPlayerName);
        secondPlayerName.setText(i.getStringExtra("secondPlayer"));
    } // add onRestoreSavedInstance to restore the names -------------------------------------
    public void onClick(View v){
        switch (v.getId()){
            case R.id.start:{
                startActivity(new Intent(StartActivity.this,PlayGame.class));
                break;
            }
            case R.id.score:{
                startActivity(new Intent(StartActivity.this,Score.class));
                break;
            }
            case R.id.clear:{
                Toast.makeText(getApplicationContext(),"Cleared All", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.quite:{
                startActivity(new Intent(StartActivity.this,MainActivity.class));
                break;
            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("FirstPlayer",getIntent().getStringExtra("firstPlayer"));
        outState.putString("SecondPlayer",getIntent().getStringExtra("secondPlayer"));
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        TextView firstPlayerName = findViewById(R.id.firstPlayerName);
        firstPlayerName.setText(savedInstanceState.getString("FirstPlayer"));
        TextView secondPlayerName = findViewById(R.id.secondPlayerName);
        secondPlayerName.setText(savedInstanceState.getString("SecondPlayer"));
    }
}
