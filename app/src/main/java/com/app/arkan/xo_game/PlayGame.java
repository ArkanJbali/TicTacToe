package com.app.arkan.xo_game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class PlayGame extends Activity {
    int playerMode = 0; // firstPlayer=0 & secondPlayer=1
    int fone=0,ftwo=0,fthree=0,ffour=0,ffive=0,fsix=0,fseven=0,feight=0,fnine=0;
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
    }
    public void onClickMatrix (View v) {
        switch (v.getId()) {
            case R.id.one: {
                ImageButton one = findViewById(R.id.one);
                ImageView turn = findViewById(R.id.imgTurn);
                if(fone == 0) {
                    if (playerMode == 0) {
                        one.setBackgroundResource(R.drawable.x);
                        turn.setBackgroundResource(R.drawable.o);
                        playerMode = 1;
                    } else {
                        one.setBackgroundResource(R.drawable.o);
                        turn.setBackgroundResource(R.drawable.x);
                        playerMode = 0;
                    }
                    fone = 1;
                }
                break;
            }
            case R.id.two: {
                ImageButton two = findViewById(R.id.two);
                ImageView turn = findViewById(R.id.imgTurn);
                if(ftwo == 0) {
                    if (playerMode == 0) {
                        two.setBackgroundResource(R.drawable.x);
                        turn.setBackgroundResource(R.drawable.o);
                        playerMode = 1;
                    } else {
                        two.setBackgroundResource(R.drawable.o);
                        turn.setBackgroundResource(R.drawable.x);
                        playerMode = 0;
                    }
                    ftwo = 1;
                }
                break;
            }
            case R.id.three: {
                ImageButton three = findViewById(R.id.three);
                ImageView turn = findViewById(R.id.imgTurn);
                if(fthree == 0) {
                    if (playerMode == 0) {
                        three.setBackgroundResource(R.drawable.x);
                        turn.setBackgroundResource(R.drawable.o);
                        playerMode = 1;
                    } else {
                        three.setBackgroundResource(R.drawable.o);
                        turn.setBackgroundResource(R.drawable.x);
                        playerMode = 0;
                    }
                    fthree = 1;
                }
                break;
            }
            case R.id.four: {
                ImageButton four = findViewById(R.id.four);
                ImageView turn = findViewById(R.id.imgTurn);
                if(ffour == 0) {
                    if (playerMode == 0) {
                        four.setBackgroundResource(R.drawable.x);
                        turn.setBackgroundResource(R.drawable.o);
                        playerMode = 1;
                    } else {
                        four.setBackgroundResource(R.drawable.o);
                        turn.setBackgroundResource(R.drawable.x);
                        playerMode = 0;
                    }
                    ffour = 1;
                }
                break;
            }
            case R.id.five: {
                ImageButton five = findViewById(R.id.five);
                ImageView turn = findViewById(R.id.imgTurn);
                if(ffive == 0) {
                    if (playerMode == 0) {
                        five.setBackgroundResource(R.drawable.x);
                        turn.setBackgroundResource(R.drawable.o);
                        playerMode = 1;
                    } else {
                        five.setBackgroundResource(R.drawable.o);
                        turn.setBackgroundResource(R.drawable.x);
                        playerMode = 0;
                    }
                    ffive = 1;
                }
                break;
            }
            case R.id.six: {
                ImageButton six = findViewById(R.id.six);
                ImageView turn = findViewById(R.id.imgTurn);
                if(fsix == 0) {
                    if (playerMode == 0) {
                        six.setBackgroundResource(R.drawable.x);
                        turn.setBackgroundResource(R.drawable.o);
                        playerMode = 1;
                    } else {
                        six.setBackgroundResource(R.drawable.o);
                        turn.setBackgroundResource(R.drawable.x);
                        playerMode = 0;
                    }
                    fsix = 1;
                }
                break;
            }
            case R.id.seven: {
                ImageButton seven = findViewById(R.id.seven);
                ImageView turn = findViewById(R.id.imgTurn);
                if(fseven == 0) {
                    if (playerMode == 0) {
                        seven.setBackgroundResource(R.drawable.x);
                        turn.setBackgroundResource(R.drawable.o);
                        playerMode = 1;
                    } else {
                        seven.setBackgroundResource(R.drawable.o);
                        turn.setBackgroundResource(R.drawable.x);
                        playerMode = 0;
                    }
                    fseven = 1;
                }
                break;
            }
            case R.id.eight: {
                ImageButton eight = findViewById(R.id.eight);
                ImageView turn = findViewById(R.id.imgTurn);
                if(feight == 0) {
                    if (playerMode == 0) {
                        eight.setBackgroundResource(R.drawable.x);
                        turn.setBackgroundResource(R.drawable.o);
                        playerMode = 1;
                    } else {
                        eight.setBackgroundResource(R.drawable.o);
                        turn.setBackgroundResource(R.drawable.x);
                        playerMode = 0;
                    }
                    feight = 1;
                }
                break;
            }
            case R.id.nine: {
                ImageButton nine = findViewById(R.id.nine);
                ImageView turn = findViewById(R.id.imgTurn);
                if(fnine == 0) {
                    if (playerMode == 0) {
                        nine.setBackgroundResource(R.drawable.x);
                        turn.setBackgroundResource(R.drawable.o);
                        playerMode = 1;
                    } else {
                        nine.setBackgroundResource(R.drawable.o);
                        turn.setBackgroundResource(R.drawable.x);
                        playerMode = 0;
                    }
                    fnine = 1;
                }
                break;
            }
        }
    }
}
