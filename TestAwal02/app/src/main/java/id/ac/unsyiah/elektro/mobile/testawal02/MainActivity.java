package id.ac.unsyiah.elektro.mobile.testawal02;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

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
    public void onClickBtnJumlahkan(View view) {
        EditText angkaAwal = (EditText) findViewById(R.id.awal);
        String angkaAwalStr = angkaAwal.getText().toString();
        int awal = Integer.valueOf(angkaAwalStr);

        EditText angkaAkhir = (EditText) findViewById(R.id.akhir);
        String angkaAkhirStr = angkaAkhir.getText().toString();
        int akhir = Integer.valueOf(angkaAkhirStr);

        TextView txtHasil = (TextView) findViewById(R.id.txtHasil);

        int total = 0;
        if (awal <= akhir) {
            while (awal <= akhir) {
                total += awal;
                awal++;
            }
            String totalStr = Integer.toString(total);
            txtHasil.setText(totalStr);
        }

        else if (awal >= akhir){
            while (awal >= akhir) {
                total += awal;
                awal--;
            }
            String totalStr = Integer.toString(total);
            txtHasil.setText(totalStr);
        }
    }
}
