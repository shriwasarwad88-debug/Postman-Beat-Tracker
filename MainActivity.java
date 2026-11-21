package com.postmanbeattracker;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView status;
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(32, 48, 32, 32);
        root.setGravity(Gravity.CENTER_HORIZONTAL);

        TextView title = new TextView(this);
        title.setText("POSTMAN BEAT TRACKER");
        title.setTextSize(22);
        title.setTypeface(null, Typeface.BOLD);
        root.addView(title);

        TextView distance = new TextView(this);
        distance.setText("0.00 KM");
        distance.setTextSize(38);
        distance.setPadding(0, 48, 0, 8);
        root.addView(distance);

        status = new TextView(this);
        status.setText("स्थिती: ट्रॅकिंग सुरू नाही");
        status.setTextSize(16);
        root.addView(status);

        Button start = new Button(this);
        start.setText("START");
        start.setOnClickListener(v -> status.setText("स्थिती: डेमो सुरू — GPS अजून जोडलेले नाही"));
        root.addView(start);

        Button pause = new Button(this);
        pause.setText("PAUSE");
        pause.setOnClickListener(v -> status.setText("स्थिती: Pause (डेमो)"));
        root.addView(pause);

        Button stop = new Button(this);
        stop.setText("STOP");
        stop.setOnClickListener(v -> status.setText("स्थिती: थांबवले (डेमो)"));
        root.addView(stop);

        TextView note = new TextView(this);
        note.setText("ही प्राथमिक स्क्रीन आहे. GPS मोजमाप, रूट इतिहास आणि PDF/CSV रिपोर्ट पुढील विकासात जोडायचे आहेत.");
        note.setTextSize(14);
        note.setPadding(0, 32, 0, 0);
        root.addView(note);
        setContentView(root);
    }
}
