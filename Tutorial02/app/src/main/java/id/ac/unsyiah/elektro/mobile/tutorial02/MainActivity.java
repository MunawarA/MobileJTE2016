package id.ac.unsyiah.elektro.mobile.tutorial02;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
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
    public void onClickTerjemahkan(View view) {
        TextView txtTulisan = (TextView) findViewById(R.id.txtTulisan);
        Button btnTerjemahkan = (Button) findViewById(R.id.btnTerjemahkan);
        if (bahasaIndonesia == false) {
            String indonesia = getString(R.string.TERJEMAHKAN_KE_INDONESIA);
            String apakabar = getString(R.string.TULISAN_APA_KABAR_DUNIA);
            txtTulisan.setText(apakabar);
            btnTerjemahkan.setText(indonesia);
            bahasaIndonesia = true;

        } else {
            String english = getString(R.string.TERJEMAHKAN_KE_INGGRIS);
            String helloworld = getString(R.string.TULISAN_HELLO_WORLD);
            txtTulisan.setText(helloworld);
            btnTerjemahkan.setText(english);
            bahasaIndonesia = false;
        }
    }
    private boolean bahasaIndonesia = false;
}
