package id.ac.unsyiah.elektro.mobile.kumpulandoa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by USER on 13/05/2016.
 */
public class ActivityDaftarDoa1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_daftardoa1);
    }

    public void onClickBtnK1Doa1(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        startActivity(pesan);
    }
}