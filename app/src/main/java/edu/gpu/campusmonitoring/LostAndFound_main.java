package edu.gpu.campusmonitoring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class LostAndFound_main extends AppCompatActivity {

    public Button b_register, b_lostAndFound;
    public RadioGroup radioGroup;
    public RadioButton radioButton1, radioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost_and_found_main);

        b_register = findViewById(R.id.registerButton);
        b_lostAndFound = findViewById(R.id.lostFoundButton);
        radioButton1 = findViewById(R.id.lost);
        radioButton2 = findViewById(R.id.found);

        b_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(LostAndFound_main.this, Lost_Found_Register.class);
                startActivity(ii);
            }
        });
    }
    public void onRadioButtonClicked (View v){
        boolean checked = ((RadioButton) v).isChecked();
        switch (v.getId()) {
            case R.id.lost:
                if (checked) break;
            case R.id.found:
                if (checked) break;
        }
    }
}
