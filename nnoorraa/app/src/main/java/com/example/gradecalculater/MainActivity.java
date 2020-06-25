package com.example.gradecalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText quizes,hw,midterms,final
    TextView gradecalculate ,yourgrade
    String CALCULATE,RESET
    button=CALCULATE
            button2=RESET
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText quizes = findViewById(R.id.quizes);
        final EditText homework = findViewById(R.id.hw);
        final EditText midterms = findViewById(R.id.midterms);
        final EditText final1 =findViewById(R.id. final1);
        Button button = findViewById(R.id.button);
        Button button1 = findViewById(R.id.button2);
        final TextView yourgrade = findViewById(R.id.yourgrade);

        public class ResetExampleActivity extends Activity {
            EditText uname;

            /** Called when the activity is first created. */
            @Override
            public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.main);
                uname =(EditText)findViewById(R.id.username);
                Button reset=(Button)findViewById(R.id.reset);
                reset.setOnClickListener(new OnClickListener() {

                    @Override
                    public void onClick(View v) {

                        uname.setText(" ");
                    }

        public void onClick(View arg0) {
            // TODO Auto-generated method stub
            txtCount.setText(String.valueOf(0));
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = quizes.getText().toString();
                String b = homework.getText().toString();
                String c = midterms.getText().toString();
                String d = final1.getText().toString();

                float n1 = Float.parseFloat(a);
                float n2 = Float.parseFloat(b);
                float n3 = Float.parseFloat(c);
                float n4 = Float.parseFloat(d);

                float grade = n1 + n2 + n3 + n4;
                char x= max(grade);
                yourgrade.setText(x);
            }
        });


    }

    public static char max (float grade ){
    if (grade >= 90)
   return='A';
        else if (grade >= 80){
        return= 'B';
        if (grade>= 70) {
            return='C';
        }else if (grade >= 60) {
            return= 'D';
        }else
            return='f';
    }

}







