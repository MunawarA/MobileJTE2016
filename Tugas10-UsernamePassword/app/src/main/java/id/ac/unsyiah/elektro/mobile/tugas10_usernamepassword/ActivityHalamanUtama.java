package id.ac.unsyiah.elektro.mobile.tugas10_usernamepassword;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityHalamanUtama extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("var1");

        TextView txtHasil = (TextView) findViewById(R.id.txtHasil);
        txtHasil.setText(pesanStr);
    }

    public void onClickBtnUbah(View view){
        Intent pesan = new Intent(getApplicationContext(), ActivityUbahLogin.class);
        startActivity(pesan);
    }
}
