package com.chetana.singletonedesignpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Context parent;
    EditText editText;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        setListener();
    }

    public void init(){
        parent = MainActivity.this;

        editText = findViewById(R.id.editText);
        save = findViewById(R.id.save);

    }

    private void setListener() {

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initSingletoneClass(editText.getText().toString());
            }
        });
    }

    private void initSingletoneClass(String value){
        SingletoneClass sClass = new SingletoneClass().getInstance();
        sClass.setEdtValue(value);

        Toast.makeText(parent, sClass.getEdtValue().toString(), Toast.LENGTH_SHORT).show();

    }

}
