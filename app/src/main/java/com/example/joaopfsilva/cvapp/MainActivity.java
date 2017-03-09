package com.example.joaopfsilva.cvapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("mailto:");
                Intent myActivity2 = new Intent(Intent.ACTION_SENDTO, uri);
                myActivity2.putExtra(Intent.EXTRA_SUBJECT,
                        "Tech Startup Job Fair Amsterdam 2017 - João Silva - Developer");
                myActivity2.putExtra(Intent.EXTRA_TEXT,
                        "Hi :)\n My name is João Silva.\n I talked with you in the Tech Startup Job Fair Amsterdam 2017.\n" +
                                "I was the guy that used an ugly android app to share the CV :) \n\n" +
                                "===== Available to work as a developer in Amsterdam =====\n\n\n " +
                                "Some information about me:\n" +
                                "   > BSc. Computer Science;\n" +
                                "   > Programming languages: \n" +
                                "      > C\n" +
                                "      > JAVA\n" +
                                "      > Python\n" +
                                "      > PLSQL\n" +
                                "      > RUBY\n" +
                                "      > Android\n" +
                                "      > Javascript\n\n" +
                                "   > Contacts:\n" +
                                "      > mail: easy to know!\n" +
                                "      > phone: +351 919598325\n" +
                                "      > linkedin: https://www.linkedin.com/in/joaopfsilva/\n" +
                                "      > facebook: https://www.facebook.com/joaopfsilva\n" +
                                "      > github: https://github.com/joaopfsilva\n\n" +
                                "\n" +
                                "CV: https://drive.google.com/file/d/0B0P93hPSLt32VXNrZVRhMU5uNjg/view?usp=sharing\n\n" +
                                "Best,\n João Silva");
                //String filename="CV.pdf";
                //File filelocation = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), filename);
                //Uri path = Uri.fromFile(filelocation);
                //myActivity2.putExtra(Intent.EXTRA_STREAM, path);
                startActivity(myActivity2);
            };
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
}
