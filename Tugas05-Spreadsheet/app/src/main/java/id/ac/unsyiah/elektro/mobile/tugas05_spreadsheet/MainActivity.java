package id.ac.unsyiah.elektro.mobile.tugas05_spreadsheet;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;
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
    public void onClickBtnSamaDengan(View view) {
        EditText cell11 = (EditText) findViewById(R.id.cell11);
        String cell1Str = String.valueOf(cell11.getText());
        float angka1 = Float.valueOf(cell1Str);

        EditText cell12 = (EditText) findViewById(R.id.cell12);
        String cell12Str = String.valueOf(cell12.getText());
        float angka2 = Float.valueOf(cell12Str);

        EditText cell21 = (EditText) findViewById(R.id.cell21);
        String cell21Str = String.valueOf(cell21.getText());
        float angka3 = Float.valueOf(cell21Str);

        EditText cell22 = (EditText) findViewById(R.id.cell22);
        String cell22Str = String.valueOf(cell22.getText());
        float angka4 = Float.valueOf(cell22Str);

        RadioButton tambah = (RadioButton) findViewById(R.id.rdBtnTambah);
        RadioButton kurang = (RadioButton) findViewById(R.id.rdBtnKurang);
        RadioButton kali = (RadioButton) findViewById(R.id.rdBtnKali);
        RadioButton bagi = (RadioButton) findViewById(R.id.rdBtnBagi);

        float Hasil1=0;
        float Hasil2=0;
        float Hasil3=0;
        float Hasil4=0;

        if (tambah.isChecked()== true) {
            Hasil1 = angka1+angka2;
            Hasil2 = angka3+angka4;
            Hasil3 = angka1+angka3;
            Hasil4 = angka2+angka4;

        } else if (kurang.isChecked() == true) {
            Hasil1 = angka1-angka2;
            Hasil2 = angka3-angka4;
            Hasil3 = angka1-angka3;
            Hasil4 = angka2-angka4;

        } else if (kali.isChecked() == true) {
            Hasil1 = angka1*angka2;
            Hasil2 = angka3*angka4;
            Hasil3 = angka1*angka3;
            Hasil4 = angka2*angka4;

        } else if (bagi.isChecked() == true) {
            Hasil1 = angka1/angka2;
            Hasil2 = angka3/angka4;
            Hasil3 = angka1/angka3;
            Hasil4 = angka2/angka4;
        }

        String hasil1Str = String.valueOf(Hasil1);
        String hasil2Str = String.valueOf(Hasil2);
        String hasil3Str = String.valueOf(Hasil3);
        String hasil4Str = String.valueOf(Hasil4);

        TextView cell13 = (TextView) findViewById(R.id.cell13);
        cell13.setText(hasil1Str);
        TextView cell23 = (TextView) findViewById(R.id.cell23);
        cell23.setText(hasil2Str);
        TextView cell31 = (TextView) findViewById(R.id.cell31);
        cell31.setText(hasil3Str);
        TextView cell32 = (TextView) findViewById(R.id.cell32);
        cell32.setText(hasil4Str);
    }
}
