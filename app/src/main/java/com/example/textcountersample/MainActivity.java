package com.example.textcountersample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.textcountersample.utils.ElementsCalculator.getCharsCount;

public class MainActivity extends AppCompatActivity {

    Spinner ddSelection;
    EditText edUserInput;
    TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.ddSelection = (Spinner) findViewById(R.id.ddSelection);
        this.edUserInput = findViewById(R.id.edUserInput);
        this.tvOutput = findViewById(R.id.tvOutput);

        /*ArrayList<String> selectionOptionsList = new ArrayList<>();
        selectionOptionsList.add("Words");
        selectionOptionsList.add("Chars");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, selectionOptionsList);
         */

        //spinner
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_item);

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.ddSelection.setAdapter(arrayAdapter);
    }

    public void btnCalculateOnClick(View view) {
        EditText edUserInput = findViewById(R.id.edUserInput);
        TextView tvOutput = findViewById(R.id.tvOutput);
        String userInputText = edUserInput.getText().toString();

        String selection = this.ddSelection.getSelectedItem().toString();
        String resValue = getResources().getString(R.string.char_selection);
        //int resId = R.string.char_selection;

        Toast.makeText(this, (resValue), Toast.LENGTH_SHORT).show();

        //String selection = this.ddSelection.getSelectedItem().toString();
        if(selection.equalsIgnoreCase(resValue)){
            int count = getCharsCount(userInputText);
            tvOutput.setText(String.valueOf(count));
        }
    }

    public void btnCalculateOnClick2(View view) {
        int count = getCharsCount("tekstas2");
        tvOutput.setText(String.valueOf(count));
    }

    public static int getCharsCount(String inputText){
        if(inputText != null){
            return inputText.length();
        }
        return 0;
    }
}
