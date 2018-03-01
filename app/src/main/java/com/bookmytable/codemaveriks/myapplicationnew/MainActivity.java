package com.bookmytable.codemaveriks.myapplicationnew;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etName);
        Info = (TextView) findViewById(R.id.tvInfo);
        Login = (Button) findViewById(R.id.btnLogin);
        Log.d("myTag","here1");

        Login.setOnClickListener(new View.OnClickListener() {
//            System.out.println("here");
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(),Password.getText().toString());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void validate (String UserName, String UserPassword){
        Log.d("myTag","here1");

        if ((UserName.equals("Admin")) && (UserPassword.equals("1234"))){
            Log.d("myTag","here2");
            Intent intent = new Intent(MainActivity.this, secondActivity.class);
            startActivity(intent);
        }else{
            counter--;
            Info.setText("No of attempts remaining"+String.valueOf(counter));
            if (counter ==0){
                Login.setEnabled(false);
            }
        }
    }
}
