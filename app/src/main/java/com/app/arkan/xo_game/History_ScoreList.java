package com.app.arkan.xo_game;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class History_ScoreList extends Activity {
    private Context context = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score_list);
        createHistoryList();
        Button goBack = findViewById(R.id.goBack);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(Score.this,StartActivity.class));
                Intent i = new Intent(History_ScoreList.this,Score.class);
                i.putExtra("firstPlayer",getIntent().getStringExtra("firstPlayer"));
                i.putExtra("secondPlayer",getIntent().getStringExtra("secondPlayer"));
                i.putExtra("lastGameScore",getIntent().getStringArrayExtra("lastGameScore"));
                StartActivity.ACTIVITY_SCORE=2;
                startActivity(i);
            }
        });
    }
    public void createHistoryList(){
        TableLayout tableLayout = findViewById(R.id.table_ly);
        context = getApplicationContext();


        for(int i=StartActivity.lines.size()-1;i>=0;i--){
            TableRow tableRow = new TableRow(this);
            TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT);
            tableRow.setLayoutParams(layoutParams);
            TextView row = new TextView(this);
            row.setText(StartActivity.lines.get(i));
            row.setTextColor(getResources().getColor(R.color.whiteBTN));
            row.setTextSize(20);
            row.setPadding(5,5,5,5);
            tableRow.addView(row);
            tableLayout.addView(tableRow);
        }
    }
}
