package com.elodieferrais.sample.editor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.elodieferrais.sample.editor.R;
import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(R2.id.mytextview) TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
