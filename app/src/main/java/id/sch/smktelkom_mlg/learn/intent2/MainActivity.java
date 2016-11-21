package id.sch.smktelkom_mlg.learn.intent2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonInput).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivityForResult(new Intent(MainActivity.this, InputActivity.class), 123);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 123) {

            if (resultCode == RESULT_OK) {

                String Nama = data.getStringExtra(InputActivity.NAMA);
                int tahunlahir = data.getIntExtra(InputActivity.TAHUNKELAHIRAN, 0);

                TextView tvbiodata = (TextView) findViewById(R.id.textViewBiodata);
                tvbiodata.setText("Nama\t\t\t\t\t\t\t\t : " + Nama + "Tahun Kelahiran\t\t\t\t\t : " + tahunlahir);

            }

        }
}
