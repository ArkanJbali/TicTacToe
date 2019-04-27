package com.app.arkan.xo_game;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class PlayGame extends Activity {
    int playerMode = 0; // firstPlayer=0 & secondPlayer=1
    int matrixFlag[][]  = { {0,0,0},
                            {0,0,0},
                            {0,0,0}}; //flags and for winning cases
    char Winner = 'D';
    int XWins=0,OWins=0,DRAW=0,counter=0;
   ImageView turn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_activity);
        ImageView returnBTN = findViewById(R.id.goBack);
        returnBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlayGame.this,StartActivity.class));
            }
        });
        turn = findViewById(R.id.imgTurn);
        ImageView restart = findViewById(R.id.newGame);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Restarting The Game",Toast.LENGTH_LONG).show();
                NewGame();
            }
        });
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void onClickMatrix (View v) {
       // Log.d("Mat",""+CheckEnd());

            switch (v.getId()) {
                case R.id.btn_1: {
                    ImageButton one = findViewById(R.id.btn_1);
                    if(!CheckEnd()){
                    if (matrixFlag[0][0] == 0) {
                        if (playerMode == 0) {
                            one.setBackgroundResource(R.drawable.x);
                            turn.setBackgroundResource(R.drawable.o);
                            playerMode = 1;
                            matrixFlag[0][0] = 1;
                        } else {
                            one.setBackgroundResource(R.drawable.o);
                            turn.setBackgroundResource(R.drawable.x);
                            playerMode = 0;
                            matrixFlag[0][0] = 2;
                        }
                    }}else GameEnded();
                    counter++;
                    break;
                }
                case R.id.btn_2: {
                    ImageButton two = findViewById(R.id.btn_2);
                    if(!CheckEnd()){
                    if (matrixFlag[0][1] == 0) {
                        if (playerMode == 0) {
                            two.setBackgroundResource(R.drawable.x);
                            turn.setBackgroundResource(R.drawable.o);
                            playerMode = 1;
                            matrixFlag[0][1] = 1;
                        } else {
                            two.setBackgroundResource(R.drawable.o);
                            turn.setBackgroundResource(R.drawable.x);
                            playerMode = 0;
                            matrixFlag[0][1] = 2;
                        }
                    }}else GameEnded();
                    counter++;
                    break;
                }
                case R.id.btn_3: {
                    ImageButton three = findViewById(R.id.btn_3);
                    if(!CheckEnd()){
                    if (matrixFlag[0][2] == 0) {
                        if (playerMode == 0) {
                            three.setBackgroundResource(R.drawable.x);
                            turn.setBackgroundResource(R.drawable.o);
                            playerMode = 1;
                            matrixFlag[0][2] = 1;
                        } else {
                            three.setBackgroundResource(R.drawable.o);
                            turn.setBackgroundResource(R.drawable.x);
                            playerMode = 0;
                            matrixFlag[0][2] = 2;
                        }
                    }}else GameEnded();
                    counter++;
                    break;
                }
                case R.id.btn_4: {
                    ImageButton four = findViewById(R.id.btn_4);
                    if(!CheckEnd()){
                    if (matrixFlag[1][0] == 0) {
                        if (playerMode == 0) {
                            four.setBackgroundResource(R.drawable.x);
                            turn.setBackgroundResource(R.drawable.o);
                            playerMode = 1;
                            matrixFlag[1][0] = 1;
                        } else {
                            four.setBackgroundResource(R.drawable.o);
                            turn.setBackgroundResource(R.drawable.x);
                            playerMode = 0;
                            matrixFlag[1][0] = 2;
                        }
                    }}else GameEnded();
                    counter++;
                    break;
                }
                case R.id.btn_5: {
                    ImageButton five = findViewById(R.id.btn_5);
                    if(!CheckEnd()){
                    if (matrixFlag[1][1] == 0) {
                        if (playerMode == 0) {
                            five.setBackgroundResource(R.drawable.x);
                            turn.setBackgroundResource(R.drawable.o);
                            playerMode = 1;
                            matrixFlag[1][1] = 1;
                        } else {
                            five.setBackgroundResource(R.drawable.o);
                            turn.setBackgroundResource(R.drawable.x);
                            playerMode = 0;
                            matrixFlag[1][1] = 2;
                        }
                    }}else GameEnded();
                    counter++;
                    break;
                }
                case R.id.btn_6: {
                    ImageButton six = findViewById(R.id.btn_6);
                    if(!CheckEnd()){
                    if (matrixFlag[1][2] == 0) {
                        if (playerMode == 0) {
                            six.setBackgroundResource(R.drawable.x);
                            turn.setBackgroundResource(R.drawable.o);
                            playerMode = 1;
                            matrixFlag[1][2] = 1;
                        } else {
                            six.setBackgroundResource(R.drawable.o);
                            turn.setBackgroundResource(R.drawable.x);
                            playerMode = 0;
                            matrixFlag[1][2] = 2;
                        }
                    }}else GameEnded();
                    counter++;
                    break;
                }
                case R.id.btn_7: {
                    ImageButton seven = findViewById(R.id.btn_7);
                    if(!CheckEnd()){
                    if (matrixFlag[2][0] == 0) {
                        if (playerMode == 0) {
                            seven.setBackgroundResource(R.drawable.x);
                            turn.setBackgroundResource(R.drawable.o);
                            playerMode = 1;
                            matrixFlag[2][0] = 1;
                        } else {
                            seven.setBackgroundResource(R.drawable.o);
                            turn.setBackgroundResource(R.drawable.x);
                            playerMode = 0;
                            matrixFlag[2][0] = 2;
                        }
                    }}else GameEnded();
                    counter++;
                    break;
                }
                case R.id.btn_8: {
                    ImageButton eight = findViewById(R.id.btn_8);
                    if(!CheckEnd()){
                    if (matrixFlag[2][1] == 0) {
                        if (playerMode == 0) {
                            eight.setBackgroundResource(R.drawable.x);
                            turn.setBackgroundResource(R.drawable.o);
                            playerMode = 1;
                            matrixFlag[2][1] = 1;
                        } else {
                            eight.setBackgroundResource(R.drawable.o);
                            turn.setBackgroundResource(R.drawable.x);
                            playerMode = 0;
                            matrixFlag[2][1] = 2;
                        }
                    }}else GameEnded();
                    counter++;
                    break;
                }
                case R.id.btn_9: {
                    ImageButton nine = findViewById(R.id.btn_9);
                    if(!CheckEnd()){
                    if (matrixFlag[2][2] == 0) {
                        if (playerMode == 0) {
                            nine.setBackgroundResource(R.drawable.x);
                            turn.setBackgroundResource(R.drawable.o);
                            playerMode = 1;
                            matrixFlag[2][2] = 1;
                        } else {
                            nine.setBackgroundResource(R.drawable.o);
                            turn.setBackgroundResource(R.drawable.x);
                            playerMode = 0;
                            matrixFlag[2][2] = 2;
                        }
                    }}else GameEnded();
                    counter++;
                    break;
                }
            }
            if(counter == 9 && !CheckEnd()){
                DRAW++;
                GameEnded();
            }
    }
    public void NewGame(){
        playerMode = 0;
        counter=0;
        Winner='D';
        turn.setBackgroundResource(R.drawable.x);
        for (int i = 0; i < matrixFlag.length; ++i) {
            for (int j = 0; j < matrixFlag[i].length; ++j) {
             matrixFlag[i][j]=0;
            }
        }
        ImageButton buttons [] = new ImageButton[9];
        for (int i = 0; i <9; i++) {
            String buttonID = "btn_" + (i+1);
            int id = getResources().getIdentifier(buttonID, "id", getPackageName());
            //Log.d("Mat",id+""+i);
            buttons[i] =  (ImageButton)findViewById(id);
            buttons[i].setBackgroundResource(R.drawable.null_back);
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void GameEnded(){
        String msg = (Winner == 'D') ? "Game Ended. DRAW" : "Game Ended. " + Winner + " win";

        new AlertDialog.Builder(this).setTitle("Congratulations").
                setMessage(msg).setIcon(R.drawable.trophy).
                setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialogInterface) {
                        NewGame();
                    }
                }).show();

        TextView xwins = findViewById(R.id.XWins);
        xwins.setText(XWins+"");
        TextView owins = findViewById(R.id.OWins);
        owins.setText(OWins+"");
        TextView draw = findViewById(R.id.DrawNo);
        draw.setText(DRAW+"");
    }
    public boolean CheckEnd(){
        for(int i = 0; i < 3 ; i++){
            if(matrixFlag[i][0] != 0 && matrixFlag[i][0]==matrixFlag[i][1] && matrixFlag[i][1]==matrixFlag[i][2]){
                if(matrixFlag[i][0] == 1){
                    Winner = 'X';
                    XWins++;
                }
                if(matrixFlag[i][0] == 2){
                    Winner = 'O';
                    OWins++;
                }
                return true;
            }
            if(matrixFlag[0][i] != 0 && matrixFlag[0][i]==matrixFlag[1][i] && matrixFlag[1][i]==matrixFlag[2][i]){
                if(matrixFlag[0][i] == 1){
                    Winner = 'X';
                    XWins++;
                }
                if(matrixFlag[0][i] == 2){
                    Winner = 'O';
                    OWins++;
                }
                return true;
            }
        }
        if(matrixFlag[0][0] != 0 && matrixFlag[0][0]==matrixFlag[1][1] && matrixFlag[1][1]==matrixFlag[2][2]) {
            if(matrixFlag[0][0] == 1){
                Winner = 'X';
                XWins++;
            }
            if(matrixFlag[0][0] == 2){
                Winner = 'O';
                OWins++;
            }
            return true;
        }
        if(matrixFlag[2][0] != 0 && matrixFlag[2][0]==matrixFlag[1][1] && matrixFlag[1][1]==matrixFlag[0][2]) {
            if(matrixFlag[2][0] == 1){
                Winner = 'X';
                XWins++;
            }
            if(matrixFlag[2][0] == 2){
                Winner = 'O';
                OWins++;
            }
            return true;
        }
//        for (int i = 0; i < matrixFlag.length; ++i) {
//            for (int j = 0; j < matrixFlag[i].length; ++j) {
//                matrixFlag[i][j]=0;
//            }
//        }
        Winner = 'D';
        return false;
    }

}
