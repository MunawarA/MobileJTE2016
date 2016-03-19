package id.ac.unsyiah.elektro.mobile.testawal04;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by USER on 19/03/2016.
 */
public class ActivityCounter extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        Intent pesan = getIntent();
        String pesan1 = pesan.getStringExtra("var1");
        String pesan2 = pesan.getStringExtra("var2");

        TextView txtLabel = (TextView) findViewById(R.id.txtHasil);
        txtLabel.setText("Pilihan anda  "+pesan1+" ,sebanyak "+pesan2+" kali");
    }
}