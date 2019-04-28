package com.app.arkan.xo_game;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Date;
import android.util.Log;
public class StartActivity extends Activity {
static int ACTIVITY_CODE = 1;
static int ACTIVITY_SCORE = 1;
    final Context c = this;
    String lastGameScore [];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);
        Intent i = getIntent();
        TextView firstPlayerName = findViewById(R.id.firstPlayerName);
        firstPlayerName.setText(i.getStringExtra("firstPlayer"));
        TextView secondPlayerName = findViewById(R.id.secondPlayerName);
        secondPlayerName.setText(i.getStringExtra("secondPlayer"));
       if(ACTIVITY_CODE == 2){
           Log.d("CODEEEEE","Done ACTIVITY_CODE");
           storeObjectData();
           ACTIVITY_CODE = 1;
       }
    } // add onRestoreSavedInstance to restore the names -------------------------------------

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start: {
                Intent i = new Intent(StartActivity.this, PlayGame.class);
                i.putExtra("firstPlayer", getIntent().getStringExtra("firstPlayer"));
                i.putExtra("secondPlayer", getIntent().getStringExtra("secondPlayer"));
                startActivity(i);
                break;
            }
            case R.id.score: {
                showScores();
                Intent i = new Intent(StartActivity.this, Score.class);
                i.putExtra("firstPlayer", getIntent().getStringExtra("firstPlayer"));
                i.putExtra("secondPlayer", getIntent().getStringExtra("secondPlayer"));
                i.putExtra("lastGameScore",lastGameScore);
                startActivity(i);
                break;
            }
            case R.id.clear: {
                new android.app.AlertDialog.Builder(this).setTitle("Warning").
                        setMessage("Are you sure to clear history data?").setIcon(R.drawable.warnp).setCancelable(false)
                        .setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogBox, int id) {
                                ClearFileData(StartActivity.this);
                            }
                        })
                        .setNegativeButton("Cancel",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogBox, int id) {
                                        dialogBox.cancel();
                                    }
                                }).show();
                break;
            }
            case R.id.quite: {
                startActivity(new Intent(StartActivity.this, MainActivity.class));
                break;
            }
        }
    }

    public void storeObjectData() {
        Intent i = getIntent();
        Players players = (Players) i.getSerializableExtra("PlayersObject");
        String data = players.getDate() + " " + players.getFirstPlayer_name() + " " + players.getFirstPlayer_wins() + " "+
                players.getFirstPlayer_losses()+ " " + players.getSecondPlayer_name() + " "+ players.getSecondPlayer_wins() + " "+
                players.getSecondPlayer_losses();
        storeDataToFile(StartActivity.this,data);
    }

    public void storeDataToFile(Context context,String data) {
        OutputStreamWriter outputStreamWriter = null;
        try {
            outputStreamWriter = new OutputStreamWriter(context.openFileOutput("score_board.txt", Context.MODE_APPEND));
            outputStreamWriter.write(data);
            outputStreamWriter.write("\n");

            Toast.makeText(this,"Saved Data to ScoreBoard",Toast.LENGTH_LONG).show();
            Log.d("CODEEEEE",getFilesDir()+"/");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }finally {
            try {
                outputStreamWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public void ClearFileData(Context context){
        OutputStreamWriter outputStreamWriter = null;
        try {
             outputStreamWriter = new OutputStreamWriter(context.openFileOutput("score_board.txt", Context.MODE_PRIVATE));
            outputStreamWriter.write("");

            Toast.makeText(this,"History are cleared",Toast.LENGTH_LONG).show();
            Log.d("CODEEEEE",getFilesDir()+"\nCleared");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }finally {
            try {
                outputStreamWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
    public void showScores(){
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String lastLine = "";
        try {
            fis = openFileInput("score_board.txt");
            isr = new InputStreamReader(fis);
             br = new BufferedReader(isr);
            String text;
            while ((text = br.readLine()) != null)
            {
                lastLine = text;
            }
             lastGameScore = lastLine.split(" ");
            Log.d("CODEEEEE",lastGameScore+"");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                isr.close();
                br.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public void showHistoryScores(){

    }
}
