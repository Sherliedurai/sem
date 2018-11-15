package io.iqube.prac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class okay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView v;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okay);

        final String name = getIntent().getExtras().getString("name");
        Toast.makeText(this, "Viewed Successfully", Toast.LENGTH_SHORT).show();
        v=findViewById(R.id.textView2);
        v.setText(name);

    }
}
