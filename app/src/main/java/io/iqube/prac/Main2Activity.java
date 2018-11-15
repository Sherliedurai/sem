package io.iqube.prac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    GridView gv;
    String[] a=new String[]{"a","b","c","d"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        gv=findViewById(R.id.grid);
        BaseAdapter ba=new BaseAdapter() {
            @Override
            public int getCount() {
                return a.length;
            }

            @Override
            public Object getItem(int i) {
                return a[i];
            }

            @Override
            public long getItemId(int i) {
                return i;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                TextView view1 = new TextView(Main2Activity.this);
                view1.setGravity(Gravity.CENTER);
                ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                view1.setLayoutParams(params);
                view1.setText(a[i]);
                return view1;
            }
        };
        gv.setAdapter(ba);
    }
}
