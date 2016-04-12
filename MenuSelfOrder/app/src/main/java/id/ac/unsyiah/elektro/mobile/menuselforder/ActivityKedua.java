package id.ac.unsyiah.elektro.mobile.menuselforder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by USER on 10/04/2016.
 */
public class ActivityKedua extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Intent pesan = getIntent();
        String pesan1 = pesan.getStringExtra("var1");
        String pesan2 = pesan.getStringExtra("var2");

        String pesan3 = pesan.getStringExtra("var3");
        String pesan4 = pesan.getStringExtra("var4");

        String pesan5 = pesan.getStringExtra("var5");
        String pesan6 = pesan.getStringExtra("var6");

        String pesan7 = pesan.getStringExtra("var7");
        String pesan8 = pesan.getStringExtra("var8");

        String pesan9 = pesan.getStringExtra("var9");
        String pesan10 = pesan.getStringExtra("var10");

        String pesan11 = pesan.getStringExtra("var11");
        String pesan12 = pesan.getStringExtra("var12");

        String pesan13 = pesan.getStringExtra("var13");
        String pesan14 = pesan.getStringExtra("var14");

        String pesan15 = pesan.getStringExtra("var15");
        String pesan16 = pesan.getStringExtra("var16");

        String pesan17 = pesan.getStringExtra("var17");
        String pesan18 = pesan.getStringExtra("var18");

        String pesan19 = pesan.getStringExtra("var19");
        String pesan20 = pesan.getStringExtra("var20");

        TextView txtHasil1 = (TextView) findViewById(R.id.txtHasil1);
        txtHasil1.setText(pesan1+",sebanyak "+pesan2+" buah");

        TextView txtHasil2 = (TextView) findViewById(R.id.txtHasil2);
        txtHasil2.setText(pesan3+",sebanyak "+pesan4+" buah");

        TextView txtHasil3 = (TextView) findViewById(R.id.txtHasil3);
        txtHasil3.setText(pesan5+",sebanyak "+pesan6+" buah");

        TextView txtHasil4 = (TextView) findViewById(R.id.txtHasil4);
        txtHasil4.setText(pesan7+",sebanyak "+pesan8+" buah");

        TextView txtHasil5 = (TextView) findViewById(R.id.txtHasil5);
        txtHasil5.setText(pesan9+",sebanyak "+pesan10+" buah");

        TextView txtHasil6 = (TextView) findViewById(R.id.txtHasil6);
        txtHasil6.setText(pesan11+",sebanyak "+pesan12+" buah");

        TextView txtHasil7 = (TextView) findViewById(R.id.txtHasil7);
        txtHasil7.setText(pesan13+",sebanyak "+pesan14+" buah");

        TextView txtHasil8 = (TextView) findViewById(R.id.txtHasil8);
        txtHasil8.setText(pesan15+",sebanyak "+pesan16+" buah");

        TextView txtHasil9 = (TextView) findViewById(R.id.txtHasil9);
        txtHasil9.setText(pesan17+",sebanyak "+pesan18+" buah");

        TextView txtHasil10 = (TextView) findViewById(R.id.txtHasil10);
        txtHasil10.setText(pesan19+",sebanyak "+pesan20+" buah");
    }
}