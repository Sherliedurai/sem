package io.iqube.prac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btc;
    EditText txt;
    EditText pass;
    TextView log;
    RadioGroup rg;
    RadioButton rb1;
    RadioButton rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btc=findViewById(R.id.button);
        txt=findViewById(R.id.editText);
        pass=findViewById(R.id.editText2);
        rg=findViewById(R.id.rg);
        rb1=findViewById(R.id.male);
        rb2=findViewById(R.id.female);

        log=findViewById(R.id.textView);
        log.setText("HIIIIIIIII!@");
        final String n=txt.getText().toString();

        RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if(checkedId == R.id.male){
                    Toast.makeText(getApplicationContext(),"male");
                }

            }
        });
        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent msg=new Intent(MainActivity.this,Main2Activity.class);
                msg.putExtra("name",n);
                startActivity(msg);
            }
        });



    }
}
