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
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class PlayWithComputer extends Activity {
    private static final Random RANDOM = new Random();
    int playerMode = 0; // firstPlayer=0 & secondPlayer=1
    int matrixFlag[][] = {{0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}}; //flags and for winning cases
    ImageView[][] imageViews = {{}, {}, {}};
    int x = -1, y = -1;
    char Winner = 'D';
    int XWins = 0, OWins = 0, DRAW = 0, counter = 0;
    ImageView turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_activity);
        imageViews = new ImageButton[][]{{findViewById(R.id.btn_1), findViewById(R.id.btn_2), findViewById(R.id.btn_3)}, {findViewById(R.id.btn_4),
                findViewById(R.id.btn_5), findViewById(R.id.btn_6)}, {findViewById(R.id.btn_7), findViewById(R.id.btn_8), findViewById(R.id.btn_9)}};
        ImageView returnBTN = findViewById(R.id.goBack);

        returnBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlayWithComputer.this, StartActivity.class);
                i.putExtra("firstPlayer", getIntent().getStringExtra("firstPlayer"));
                i.putExtra("secondPlayer", getIntent().getStringExtra("secondPlayer"));
                Players players = new Players(getCurrentTimeUsingCalendar(), getIntent().getStringExtra("firstPlayer"),
                        getIntent().getStringExtra("secondPlayer"), XWins, OWins, OWins, XWins);
                i.putExtra("PlayersObject", players);
                StartActivity.ACTIVITY_CODE = 2;
                startActivity(i);

            }
        });
        turn = findViewById(R.id.imgTurn);
        ImageView restart = findViewById(R.id.newGame);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Restarting The Game", Toast.LENGTH_LONG).show();
                RestartGame();
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void onClickMatrix(View v) {
        // Log.d("Mat",""+CheckEnd());

        switch (v.getId()) {
            case R.id.btn_1: {
                ImageButton one = findViewById(R.id.btn_1);
                if (!CheckEnd()) {
                    if (matrixFlag[0][0] == 0) {
                        if (playerMode == 0) {
                            one.setBackgroundResource(R.drawable.x);
                            turn.setBackgroundResource(R.drawable.o);
                            playerMode = 1;
                            matrixFlag[0][0] = 1;
                            ComputerTurn();
                        }
                    }
                } else GameEnded();
                counter++;
                if(CheckEnd()){
                    GameEnded();
                }
                break;
            }
            case R.id.btn_2: {
                ImageButton two = findViewById(R.id.btn_2);
                if (!CheckEnd()) {
                    if (matrixFlag[0][1] == 0) {
                        if (playerMode == 0) {
                            two.setBackgroundResource(R.drawable.x);
                            turn.setBackgroundResource(R.drawable.o);
                            playerMode = 1;
                            matrixFlag[0][1] = 1;

                            ComputerTurn();
                        }
                    }
                } else GameEnded();
                counter++;
                if(CheckEnd()){
                    GameEnded();
                }
                break;
            }
            case R.id.btn_3: {
                ImageButton three = findViewById(R.id.btn_3);
                if (!CheckEnd()) {
                    if (matrixFlag[0][2] == 0) {
                        if (playerMode == 0) {
                            three.setBackgroundResource(R.drawable.x);
                            turn.setBackgroundResource(R.drawable.o);
                            playerMode = 1;
                            matrixFlag[0][2] = 1;

                            ComputerTurn();
                        }
                    }
                } else GameEnded();
                counter++;
                if(CheckEnd()){
                    GameEnded();
                }
                break;
            }
            case R.id.btn_4: {
                ImageButton four = findViewById(R.id.btn_4);
                if (!CheckEnd()) {
                    if (matrixFlag[1][0] == 0) {
                        if (playerMode == 0) {
                            four.setBackgroundResource(R.drawable.x);
                            turn.setBackgroundResource(R.drawable.o);
                            playerMode = 1;
                            matrixFlag[1][0] = 1;

                            ComputerTurn();
                        }
                    }
                } else GameEnded();
                counter++;
                if(CheckEnd()){
                    GameEnded();
                }
                break;
            }
            case R.id.btn_5: {
                ImageButton five = findViewById(R.id.btn_5);
                if (!CheckEnd()) {
                    if (matrixFlag[1][1] == 0) {
                        if (playerMode == 0) {
                            five.setBackgroundResource(R.drawable.x);
                            turn.setBackgroundResource(R.drawable.o);
                            playerMode = 1;
                            matrixFlag[1][1] = 1;

                            ComputerTurn();
                        }
                    }
                } else GameEnded();
                counter++;
                if(CheckEnd()){
                    GameEnded();
                }
                break;
            }
            case R.id.btn_6: {
                ImageButton six = findViewById(R.id.btn_6);
                if (!CheckEnd()) {
                    if (matrixFlag[1][2] == 0) {
                        if (playerMode == 0) {
                            six.setBackgroundResource(R.drawable.x);
                            turn.setBackgroundResource(R.drawable.o);
                            playerMode = 1;
                            matrixFlag[1][2] = 1;

                            ComputerTurn();
                        }
                    }
                } else GameEnded();
                counter++;
                if(CheckEnd()){
                    GameEnded();
                }
                break;
            }
            case R.id.btn_7: {
                ImageButton seven = findViewById(R.id.btn_7);
                if (!CheckEnd()) {
                    if (matrixFlag[2][0] == 0) {
                        if (playerMode == 0) {
                            seven.setBackgroundResource(R.drawable.x);
                            turn.setBackgroundResource(R.drawable.o);
                            playerMode = 1;
                            matrixFlag[2][0] = 1;

                            ComputerTurn();
                        }
                    }
                } else GameEnded();
                counter++;
                if(CheckEnd()){
                    GameEnded();
                }
                break;
            }
            case R.id.btn_8: {
                ImageButton eight = findViewById(R.id.btn_8);
                if (!CheckEnd()) {
                    if (matrixFlag[2][1] == 0) {
                        if (playerMode == 0) {
                            eight.setBackgroundResource(R.drawable.x);
                            turn.setBackgroundResource(R.drawable.o);
                            playerMode = 1;
                            matrixFlag[2][1] = 1;

                            ComputerTurn();
                        }
                    }
                } else GameEnded();
                counter++;
                if(CheckEnd()){
                    GameEnded();
                }
                break;
            }
            case R.id.btn_9: {
                ImageButton nine = findViewById(R.id.btn_9);
                if (!CheckEnd()) {
                    if (matrixFlag[2][2] == 0) {
                        if (playerMode == 0) {
                            nine.setBackgroundResource(R.drawable.x);
                            turn.setBackgroundResource(R.drawable.o);
                            playerMode = 1;
                            matrixFlag[2][2] = 1;

                            ComputerTurn();
                        }
                    }
                } else GameEnded();
                counter++;
                if(CheckEnd()){
                    GameEnded();
                }
                break;
            }
        }
        if (counter == 9 && !CheckEnd()) {
            DRAW++;
            GameEnded();
        }
    }

    public void RestartGame() {
        playerMode = 0;
        counter = 0;
        Winner = 'D';
        XWins = OWins = DRAW = 0;
        TextView xwins = findViewById(R.id.XWins);
        xwins.setText(XWins + "");
        TextView owins = findViewById(R.id.OWins);
        owins.setText(OWins + "");
        TextView draw = findViewById(R.id.DrawNo);
        draw.setText(DRAW + "");
        turn.setBackgroundResource(R.drawable.x);
        for (int i = 0; i < matrixFlag.length; ++i) {
            for (int j = 0; j < matrixFlag[i].length; ++j) {
                matrixFlag[i][j] = 0;
            }
        }
        ImageButton buttons[] = new ImageButton[9];
        for (int i = 0; i < 9; i++) {
            String buttonID = "btn_" + (i + 1);
            int id = getResources().getIdentifier(buttonID, "id", getPackageName());
            //Log.d("Mat",id+""+i);
            buttons[i] = (ImageButton) findViewById(id);
            buttons[i].setBackgroundResource(R.drawable.null_back);
        }
    }

    public void NewGame() {
        playerMode = 0;
        counter = 0;
        Winner = 'D';
        turn.setBackgroundResource(R.drawable.x);
        for (int i = 0; i < matrixFlag.length; ++i) {
            for (int j = 0; j < matrixFlag[i].length; ++j) {
                matrixFlag[i][j] = 0;
            }
        }
        ImageButton buttons[] = new ImageButton[9];
        for (int i = 0; i < 9; i++) {
            String buttonID = "btn_" + (i + 1);
            int id = getResources().getIdentifier(buttonID, "id", getPackageName());
            //Log.d("Mat",id+""+i);
            buttons[i] = (ImageButton) findViewById(id);
            buttons[i].setBackgroundResource(R.drawable.null_back);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void GameEnded() {
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
        xwins.setText(XWins + "");
        TextView owins = findViewById(R.id.OWins);
        owins.setText(OWins + "");
        TextView draw = findViewById(R.id.DrawNo);
        draw.setText(DRAW + "");
    }

    public boolean CheckEnd() {
        for (int i = 0; i < 3; i++) {
            if (matrixFlag[i][0] != 0 && matrixFlag[i][0] == matrixFlag[i][1] && matrixFlag[i][1] == matrixFlag[i][2]) {
                if (matrixFlag[i][0] == 1) {
                    Winner = 'X';
                    XWins++;
                }
                if (matrixFlag[i][0] == 2) {
                    Winner = 'O';
                    OWins++;
                }
                return true;
            }
            if (matrixFlag[0][i] != 0 && matrixFlag[0][i] == matrixFlag[1][i] && matrixFlag[1][i] == matrixFlag[2][i]) {
                if (matrixFlag[0][i] == 1) {
                    Winner = 'X';
                    XWins++;
                }
                if (matrixFlag[0][i] == 2) {
                    Winner = 'O';
                    OWins++;
                }
                return true;
            }
        }
        if (matrixFlag[0][0] != 0 && matrixFlag[0][0] == matrixFlag[1][1] && matrixFlag[1][1] == matrixFlag[2][2]) {
            if (matrixFlag[0][0] == 1) {
                Winner = 'X';
                XWins++;
            }
            if (matrixFlag[0][0] == 2) {
                Winner = 'O';
                OWins++;
            }
            return true;
        }
        if (matrixFlag[2][0] != 0 && matrixFlag[2][0] == matrixFlag[1][1] && matrixFlag[1][1] == matrixFlag[0][2]) {
            if (matrixFlag[2][0] == 1) {
                Winner = 'X';
                XWins++;
            }
            if (matrixFlag[2][0] == 2) {
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

    public static String getCurrentTimeUsingCalendar() {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd/M/yy HH:mm");
        String formattedDate = dateFormat.format(date);
        // System.out.println("Current time of the day using Calendar - 24 hour format: "+ formattedDate);
        return formattedDate;
    }

    public void ComputerTurn() {

        if (playerMode == 1) {
//            do {
//                x = RANDOM.nextInt(2);
//                y = RANDOM.nextInt(2);
//            } while (matrixFlag[x][y] != 0);
//            // if(matrixFlag[x][y] != 0 && matrixFlag[x][y] != 1 &&  matrixFlag[x][y] != 2) {
//
            int[] index = getPossibleIndex();
            if(index.length > 0) {
                x = index[0];
                y = index[1];
                imageViews[x][y].setBackgroundResource(R.drawable.o);
                turn.setBackgroundResource(R.drawable.x);
                playerMode = 0;
                matrixFlag[x][y] = 2;

            }
            else{
                return;
            }
        }

    }
    public int[] getPossibleIndex(){
        ArrayList<int[]> indices = new ArrayList<int[]>();
        int[] index = new int[0];
//Find indices of element with 0 value
        for (int i = 0; i < matrixFlag.length; i++)
        {
            for (int j = 0; j < matrixFlag[i].length; j++)
            {
                if (matrixFlag[i][j] == 0)
                {
                    indices.add(new int[] { i, j });
                }
            }
        }



//Select a random index and print the result
        if(indices.size()>0) {
            Random rand = new Random();
            int ri = rand.nextInt(indices.size());
            index = indices.get(ri);


        }
        return index;
    }
    public void makeDelay(){
        try {


            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
