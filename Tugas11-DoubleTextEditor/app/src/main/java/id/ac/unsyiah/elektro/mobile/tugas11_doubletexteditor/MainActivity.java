package id.ac.unsyiah.elektro.mobile.tugas11_doubletexteditor;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        EditText inputTextAtas = (EditText) findViewById(R.id.inputTextAtas);
        EditText inputTextBawah = (EditText) findViewById(R.id.inputTextBawah);

        SharedPreferences sharedPreferences =
                getSharedPreferences("id.ac.unsyiah.elektro.mobile.tugas11_doubletexteditor.PREF_BERSAMA", Context.MODE_PRIVATE);
        String textAtas = sharedPreferences.getString("atas", "");
        String textBawah = sharedPreferences.getString("bawah","");

        inputTextAtas.setText(textAtas);
        inputTextBawah.setText(textBawah);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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
    @Override
    protected void onStop(){
        super.onStop();

        EditText inputTextAtas = (EditText) findViewById(R.id.inputTextAtas);
        String atasStr = inputTextAtas.getText().toString();
        EditText inputTextBawah = (EditText) findViewById(R.id.inputTextBawah);
        String bawahStr = inputTextBawah.getText().toString();

        SharedPreferences sharedPreferences =
                getSharedPreferences("id.ac.unsyiah.elektro.mobile.tugas11_doubletexteditor.PREF_BERSAMA", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("atas", atasStr);
        editor.putString("bawah", bawahStr);
        editor.apply();
    }
}
