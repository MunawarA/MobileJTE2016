package id.ac.unsyiah.elektro.mobile.menuselforder;

import android.content.Intent;
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

    public void onClickButton (View view){

        final Intent pesan = new Intent(getApplicationContext(), ActivityKedua.class);

        final TextView txtJumlahMakanan1 = (TextView) findViewById(R.id.txtJumlahMakanan1);
        final TextView txtJumlahMakanan2 = (TextView) findViewById(R.id.txtJumlahMakanan2);
        final TextView txtJumlahMakanan3 = (TextView) findViewById(R.id.txtJumlahMakanan3);
        final TextView txtJumlahMakanan4 = (TextView) findViewById(R.id.txtJumlahMakanan4);
        final TextView txtJumlahMakanan5 = (TextView) findViewById(R.id.txtJumlahMakanan5);
        final TextView txtJumlahMakanan6 = (TextView) findViewById(R.id.txtJumlahMakanan6);
        final TextView txtJumlahMakanan7 = (TextView) findViewById(R.id.txtJumlahMakanan7);
        final TextView txtJumlahMakanan8 = (TextView) findViewById(R.id.txtJumlahMakanan8);
        final TextView txtJumlahMakanan9 = (TextView) findViewById(R.id.txtJumlahMakanan9);
        final TextView txtJumlahMakanan10 = (TextView) findViewById(R.id.txtJumlahMakanan10);

        Button btnTambahMakanan1 = (Button) findViewById(R.id.btnTambahMakanan1);
        Button btnKurangMakanan1 = (Button) findViewById(R.id.btnKurangMakanan1);

        Button btnTambahMakanan2 = (Button) findViewById(R.id.btnTambahMakanan2);
        Button btnKurangMakanan2 = (Button) findViewById(R.id.btnKurangMakanan2);

        Button btnTambahMakanan3 = (Button) findViewById(R.id.btnTambahMakanan3);
        Button btnKurangMakanan3 = (Button) findViewById(R.id.btnKurangMakanan3);

        Button btnTambahMakanan4 = (Button) findViewById(R.id.btnTambahMakanan4);
        Button btnKurangMakanan4 = (Button) findViewById(R.id.btnKurangMakanan4);

        Button btnTambahMakanan5 = (Button) findViewById(R.id.btnTambahMakanan5);
        Button btnKurangMakanan5 = (Button) findViewById(R.id.btnKurangMakanan5);

        Button btnTambahMakanan6 = (Button) findViewById(R.id.btnTambahMakanan6);
        Button btnKurangMakanan6 = (Button) findViewById(R.id.btnKurangMakanan6);

        Button btnTambahMakanan7 = (Button) findViewById(R.id.btnTambahMakanan7);
        Button btnKurangMakanan7 = (Button) findViewById(R.id.btnKurangMakanan7);

        Button btnTambahMakanan8 = (Button) findViewById(R.id.btnTambahMakanan8);
        Button btnKurangMakanan8 = (Button) findViewById(R.id.btnKurangMakanan8);

        Button btnTambahMakanan9 = (Button) findViewById(R.id.btnTambahMakanan9);
        Button btnKurangMakanan9 = (Button) findViewById(R.id.btnKurangMakanan9);

        Button btnTambahMakanan10 = (Button) findViewById(R.id.btnTambahMakanan10);
        Button btnKurangMakanan10 = (Button) findViewById(R.id.btnKurangMakanan10);

        Button btnSelesai = (Button) findViewById(R.id.btnSelesai);

        btnTambahMakanan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a++;
                txtJumlahMakanan1.setText((String.valueOf(a)));
                pesan.putExtra("var1", "Sate Gurita");
                pesan.putExtra("var2", (String.valueOf(a)));
            }
        });

        btnKurangMakanan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a--;
                txtJumlahMakanan1.setText((String.valueOf(a)));
                pesan.putExtra("var1", "Sate Gurita");
                pesan.putExtra("var2", (String.valueOf(a)));
                if(a<=0){
                    a=0;
                    txtJumlahMakanan1.setText((String.valueOf(a)));
                }
            }
        });

        btnTambahMakanan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b++;
                txtJumlahMakanan2.setText((String.valueOf(b)));
                pesan.putExtra("var3", "Burger");
                pesan.putExtra("var4", (String.valueOf(b)));
            }
        });

        btnKurangMakanan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b--;
                txtJumlahMakanan2.setText((String.valueOf(b)));
                pesan.putExtra("var3", "Burger");
                pesan.putExtra("var4", (String.valueOf(b)));
                if(b<=0){
                    b=0;
                    txtJumlahMakanan2.setText((String.valueOf(b)));
                }
            }
        });

        btnTambahMakanan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c++;
                txtJumlahMakanan3.setText((String.valueOf(c)));
                pesan.putExtra("var5", "Nasi Seafood");
                pesan.putExtra("var6", (String.valueOf(c)));
            }
        });

        btnKurangMakanan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c--;
                txtJumlahMakanan3.setText((String.valueOf(c)));
                pesan.putExtra("var5", "Nasi Seafood");
                pesan.putExtra("var6", (String.valueOf(c)));
                if(c<=0){
                    c=0;
                    txtJumlahMakanan3.setText((String.valueOf(c)));
                }
            }
        });

        btnTambahMakanan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d++;
                txtJumlahMakanan4.setText((String.valueOf(d)));
                pesan.putExtra("var7", "Bakso Bakar");
                pesan.putExtra("var8", (String.valueOf(d)));
            }
        });

        btnKurangMakanan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d--;
                txtJumlahMakanan4.setText((String.valueOf(d)));
                pesan.putExtra("var7", "Bakso Bakar");
                pesan.putExtra("var8", (String.valueOf(d)));
                if(d<=0){
                    d=0;
                    txtJumlahMakanan4.setText((String.valueOf(d)));
                }
            }
        });

        btnTambahMakanan5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e++;
                txtJumlahMakanan5.setText((String.valueOf(e)));
                pesan.putExtra("var9", "Nasi Soto");
                pesan.putExtra("var10", (String.valueOf(e)));
            }
        });

        btnKurangMakanan5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e--;
                txtJumlahMakanan5.setText((String.valueOf(e)));
                pesan.putExtra("var9", "Nasi Soto");
                pesan.putExtra("var10", (String.valueOf(e)));
                if(e<=0){
                    e=0;
                    txtJumlahMakanan5.setText((String.valueOf(e)));
                }
            }
        });

        btnTambahMakanan6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f++;
                txtJumlahMakanan6.setText((String.valueOf(f)));
                pesan.putExtra("var11", "Martabak Telur");
                pesan.putExtra("var12", (String.valueOf(f)));
            }
        });

        btnKurangMakanan6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f--;
                txtJumlahMakanan6.setText((String.valueOf(f)));
                pesan.putExtra("var11", "Martabak Telur");
                pesan.putExtra("var12", (String.valueOf(f)));
                if(f<=0){
                    f=0;
                    txtJumlahMakanan6.setText((String.valueOf(f)));
                }
            }
        });

        btnTambahMakanan7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g++;
                txtJumlahMakanan7.setText((String.valueOf(g)));
                pesan.putExtra("var13", "Mie Kepiting");
                pesan.putExtra("var14", (String.valueOf(g)));
            }
        });

        btnKurangMakanan7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g--;
                txtJumlahMakanan7.setText((String.valueOf(g)));
                pesan.putExtra("var13", "Mie Kepiting");
                pesan.putExtra("var14", (String.valueOf(g)));
                if(g<=0){
                    g=0;
                    txtJumlahMakanan7.setText((String.valueOf(g)));
                }
            }
        });

        btnTambahMakanan8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                h++;
                txtJumlahMakanan8.setText((String.valueOf(h)));
                pesan.putExtra("var15", "Kari Kambing");
                pesan.putExtra("var16", (String.valueOf(h)));
            }
        });

        btnKurangMakanan8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                h--;
                txtJumlahMakanan8.setText((String.valueOf(h)));
                pesan.putExtra("var15", "Kari Kambing");
                pesan.putExtra("var16", (String.valueOf(h)));
                if(h<=0){
                    h=0;
                    txtJumlahMakanan8.setText((String.valueOf(h)));
                }
            }
        });

        btnTambahMakanan9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                txtJumlahMakanan9.setText((String.valueOf(i)));
                pesan.putExtra("var17", "Mie Rebus");
                pesan.putExtra("var18", (String.valueOf(i)));
            }
        });

        btnKurangMakanan9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                txtJumlahMakanan9.setText((String.valueOf(i)));
                pesan.putExtra("var17", "Mie Rebus");
                pesan.putExtra("var18", (String.valueOf(i)));
                if(i<=0){
                    i=0;
                    txtJumlahMakanan9.setText((String.valueOf(i)));
                }
            }
        });

        btnTambahMakanan10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j++;
                txtJumlahMakanan10.setText((String.valueOf(j)));
                pesan.putExtra("var19", "Tahu Isi");
                pesan.putExtra("var20", (String.valueOf(j)));
            }
        });

        btnKurangMakanan10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j--;
                txtJumlahMakanan10.setText((String.valueOf(j)));
                pesan.putExtra("var19", "Tahu Isi");
                pesan.putExtra("var20", (String.valueOf(j)));
                if(j<=0){
                    j=0;
                    txtJumlahMakanan10.setText((String.valueOf(j)));
                }
            }
        });

        btnSelesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(pesan);
            }
        });
    }
    int a=0;
    int b=0;
    int c=0;
    int d=0;
    int e=0;
    int f=0;
    int g=0;
    int h=0;
    int i=0;
    int j=0;
}
