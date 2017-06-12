package com.example.ashwin.dynamicpointscontent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TableLayout mDynamicTableLayout;
    private String[] mDynamicArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        initTableLayout();
    }

    private void initTableLayout() {
        mDynamicTableLayout = (TableLayout) findViewById(R.id.dynamic_table_layout);

        mDynamicArray = new String[]{"All these points are added programmatically",
                "This is first point in table layout",
                "This is second point in table layout",
                "This is third point in table layout, which is a long one",
                "This is fourth point in table layout, which is a very very long point, but do not worry this column will shrink",
                "This is fifth point in table layout"};

        for (String msg : mDynamicArray) {
            TextView bulletTextView = new TextView(this);
            bulletTextView.setText("\u25BA " + " " + "\t");
            //bulletTextView.setText("\u2022 " + " " + "\t");
            //bulletTextView.setText("\u25CF " + " " + "\t");
            //bulletTextView.setText("\u25CB " + " " + "\t");
            //bulletTextView.setText("\u25AA " + " " + "\t");
            //bulletTextView.setText("\u25A0 " + " " + "\t");
            //bulletTextView.setText("\u25A1 " + " " + "\t");

            TextView msgTextView = new TextView(this);
            msgTextView.setText(msg + "\n");

            TableRow row = new TableRow(this);
            row.addView(bulletTextView);
            row.addView(msgTextView);

            mDynamicTableLayout.addView(row);
        }
    }
}
