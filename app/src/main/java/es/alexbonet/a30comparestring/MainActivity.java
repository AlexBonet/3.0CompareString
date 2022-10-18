package es.alexbonet.a30comparestring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputTxt;
    TextView txtView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputTxt = findViewById(R.id.inputTxt);
        txtView = findViewById(R.id.txtView);
        button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
            String input = inputTxt.getText().toString();
            String key = String.valueOf(R.string.key);
            if (input.equals(key)){
                txtView.setText("Clave correcta :)");
            }else{
                txtView.setText(R.string.key);
            }
        });
    }
}