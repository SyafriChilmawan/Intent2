package id.sch.smktelkom_mlg.learn.intent2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Calendar;

public class InputActivity extends AppCompatActivity {

    public static final String NAMA = "NAMA";
    public static final String TAHUNKELAHIRAN = "TAHUNKELAHIRAN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        findViewById(R.id.buttonFinish).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                EditText etnama = (EditText) findViewById(R.id.editTextNama) ;
                EditText ettahunkelahiran = (EditText) findViewById(R.id.editTextThnLhr) ;
                String nama = etnama.getText().toString() ;
                String tahunkelahiranstr = ettahunkelahiran.getText().toString() ;

                int tahunkelahiran = tahunkelahiranstr.isEmpty()?
                        Calendar.getInstance().get(Calendar.YEAR):
                        Integer.parseInt(tahunkelahiranstr) ;


                Intent intent = new Intent() ;
                intent.putExtra(NAMA,nama) ;
                intent.putExtra(TAHUNKELAHIRAN,tahunkelahiran) ;

                setResult(RESULT_OK,intent);
                finish();

            }
        });
    }
}
