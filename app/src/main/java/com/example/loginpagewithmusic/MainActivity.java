package com.example.loginpagewithmusic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    String username, password;

    public void makeText (String string) {

        Toast.makeText(MainActivity.this, string, Toast.LENGTH_LONG).show();

    }

    public void login (View view) {

        EditText usernameText = (EditText) findViewById(R.id.usernameText);
        EditText passwordText = (EditText) findViewById(R.id.passwordText);

        username = usernameText.getText().toString();
        password = passwordText.getText().toString();

        if (username.isEmpty()) {

            makeText("Please enter a username");

        } else if (username.equals(username) != username.equals("username")) {

            makeText("Please enter a valid username");

        } else if (password.isEmpty()) {

            makeText("Please enter a password");

        } else if (password.equals(password) != password.equals("password")) {

            makeText("Please enter a valid password");

        } else {

            ImageView imageView = (ImageView) findViewById(R.id.damiBackground);

            makeText("Login Successful");

            usernameText.getText().clear();
            passwordText.getText().clear();

            mediaPlayer.pause();

        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mediaPlayer = MediaPlayer.create(this, R.raw.azaman);

        mediaPlayer.start();

    }
}
