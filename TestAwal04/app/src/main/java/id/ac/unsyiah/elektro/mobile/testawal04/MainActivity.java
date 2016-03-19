package id.ac.unsyiah.elektro.mobile.testawal04;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;

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
    public void onClickPilih (View view){

        final Intent pesan = new Intent(getApplicationContext(), ActivityCounter.class);

        RadioButton rdBtnA = (RadioButton) findViewById(R.id.rdBtnA);
        RadioButton rdBtnB = (RadioButton) findViewById(R.id.rdBtnB);
        RadioButton rdBtnC = (RadioButton) findViewById(R.id.rdBtnC);
        RadioButton rdBtnD = (RadioButton) findViewById(R.id.rdBtnD);
        RadioButton rdBtnE = (RadioButton) findViewById(R.id.rdBtnE);

        rdBtnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a++;
                pesan.putExtra("var1", "A");
                pesan.putExtra("var2", (String.valueOf(a)));
                startActivity(pesan);
            }
        });

        rdBtnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b++;
                pesan.putExtra("var1", "B");
                pesan.putExtra("var2", (String.valueOf(b)));
                startActivity(pesan);
            }
        });

        rdBtnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c++;
                pesan.putExtra("var1", "C");
                pesan.putExtra("var2", (String.valueOf(c)));
                startActivity(pesan);
            }
        });

        rdBtnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d++;
                pesan.putExtra("var1", "D");
                pesan.putExtra("var2", (String.valueOf(d)));
                startActivity(pesan);
            }
        });

        rdBtnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e++;
                pesan.putExtra("var1", "E");
                pesan.putExtra("var2", (String.valueOf(e)));
                startActivity(pesan);
            }
        });
    }
    int a =0;
    int b =0;
    int c =0;
    int d =0;
    int e =0;
}