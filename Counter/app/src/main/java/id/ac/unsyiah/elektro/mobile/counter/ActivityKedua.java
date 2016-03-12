package id.ac.unsyiah.elektro.mobile.counter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by USER on 12/03/2016.
 */
public class ActivityKedua extends Activity {
    @Override
    protected  void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("varl");

        TextView txtHasil = (TextView) findViewById(R.id.txtHasil);
        txtHasil.setText(pesanStr);
    }
}
