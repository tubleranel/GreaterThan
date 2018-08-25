package iics.tuble.johranel.greaterthan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       Button pressMeButton = (Button)findViewById(R.id.pressMeButton);

        pressMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputNum1 = (EditText) findViewById(R.id.inputNum1);
                EditText inputNum2 = (EditText) findViewById(R.id.inputNum2);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int firstNum = Integer.parseInt(inputNum1.getText().toString());
                int secondNum = Integer.parseInt(inputNum2.getText().toString());

                if (firstNum > secondNum){
                    resultTextView.setText(Integer.toString(firstNum) + " is Greater Than " + Integer.toString(secondNum));

                }else if (firstNum < secondNum){
                    resultTextView.setText(Integer.toString(firstNum) + " is Less Than " + Integer.toString(secondNum));
                }else if (firstNum == secondNum){
                    resultTextView.setText("The Numbers inputted are equal");
                }

            }
        });
    }
}
