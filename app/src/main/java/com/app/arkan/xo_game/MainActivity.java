package com.app.arkan.xo_game;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final Context c = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        Button onePlayer = findViewById(R.id.oneplayer);
        onePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflaterAndroid = LayoutInflater.from(c);
                View mView = layoutInflaterAndroid.inflate(R.layout.one_user_input_dialog_box, null);
                AlertDialog.Builder alertDialogBuilderUserInput = new AlertDialog.Builder(c);
                alertDialogBuilderUserInput.setView(mView);

                final EditText userInputDialogEditText = (EditText) mView.findViewById(R.id.userInputDialog);
                alertDialogBuilderUserInput
                        .setCancelable(false)
                        .setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogBox, int id) {
                                if(checkIsEmpty(userInputDialogEditText)){
                                    // userInputDialogEditText.setError("Fill it");
                                    Toast.makeText(getApplicationContext(),"Error, Please fill all the fields !!",Toast.LENGTH_LONG).show();
                                }else {
                                    Intent i = new Intent(MainActivity.this, StartActivity.class);
                                    i.putExtra("firstPlayer", userInputDialogEditText.getText().toString()); //input from dialog
                                    i.putExtra("secondPlayer", "Computer");
                                    startActivity(i);
                                }
                            }
                        })

                        .setNegativeButton("Cancel",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogBox, int id) {
                                        dialogBox.cancel();
                                    }
                                });

                AlertDialog alertDialogAndroid = alertDialogBuilderUserInput.create();
                alertDialogAndroid.show();



            }
        });
        Button twoPlayers = findViewById(R.id.twoplayer);
        twoPlayers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflaterAndroid = LayoutInflater.from(c);
                View mView = layoutInflaterAndroid.inflate(R.layout.two_users_input_dialog_box, null);
                AlertDialog.Builder alertDialogBuilderUserInput = new AlertDialog.Builder(c);
                alertDialogBuilderUserInput.setView(mView);

                final EditText firstUserInputDialogEditText = (EditText) mView.findViewById(R.id.firstUserInputDialog);
                final EditText secondUserInputDialogEditText = (EditText) mView.findViewById(R.id.secondUserInputDialog);

                alertDialogBuilderUserInput
                        .setCancelable(false)
                        .setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogBox, int id) {
                                if(checkIsEmpty(firstUserInputDialogEditText) || checkIsEmpty(secondUserInputDialogEditText)){
                                    // firstUserInputDialogEditText.setError("Fill it");
                                    Toast.makeText(getApplicationContext(),"Error, Please fill all the fields !!",Toast.LENGTH_LONG).show();
                                }else {
                                    Intent i = new Intent(MainActivity.this, StartActivity.class);
                                    i.putExtra("firstPlayer", firstUserInputDialogEditText.getText().toString()); //input from dialog
                                    i.putExtra("secondPlayer", secondUserInputDialogEditText.getText().toString());
                                    startActivity(i);
                                }
                            }
                        })

                        .setNegativeButton("Cancel",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogBox, int id) {
                                        dialogBox.cancel();
                                    }
                                });

                AlertDialog alertDialogAndroid = alertDialogBuilderUserInput.create();
                alertDialogAndroid.show();
            }
        });
    }

    boolean checkIsEmpty(EditText text){
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }
}
