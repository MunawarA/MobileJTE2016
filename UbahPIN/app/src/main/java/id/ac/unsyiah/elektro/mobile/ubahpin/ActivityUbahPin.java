package id.ac.unsyiah.elektro.mobile.ubahpin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityUbahPin extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubah_pin);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("ubah");
    }

    public void onClickBtnSimpanUbah(View view){

        EditText numInputAngkaUbah = (EditText) findViewById(R.id.numInputAngkaUbah);
        String numInputAngkaUbahStr = numInputAngkaUbah.getText().toString();
        int pinInt = Integer.valueOf(numInputAngkaUbahStr);

        SharedPreferences sharedPreferences =
                getSharedPreferences("id.ac.unsyiah.elektro.mobile.ubahPIN.PREF_BERSAMA", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("pin", pinInt);
        editor.apply();

        Intent pesan2 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(pesan2);
        finish();
    }
}