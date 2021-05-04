package com.example.textcountersample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.textcountersample.utils.ElementsCalculator;
import com.example.textcountersample.utils.WordCalculator;

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

        //spinner
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(this, R.array.calc_type_array, android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.ddSelection.setAdapter(arrayAdapter);
    }

    public void btnCalculateOnClick(View view) {

        String userInputText = edUserInput.getText().toString();
        String selection = this.ddSelection.getSelectedItem().toString();
        String charSelectionOption = getResources().getString(R.string.char_selection);

        //method for character counters output
        if (selection.equalsIgnoreCase(charSelectionOption)) {
            int count_char = ElementsCalculator.getCharsCount(userInputText);
            tvOutput.setText(String.valueOf(count_char));
            if (count_char == 0) {
                Toast.makeText(this, "The field is empty!", Toast.LENGTH_SHORT).show();
            }
        }

        //method for words counters output
        if (selection.equalsIgnoreCase(getResources().getString(R.string.word_selection))) {
            int count = WordCalculator.getWordsCount(userInputText);
            tvOutput.setText(String.valueOf(count));
            if (count == 0) {
                Toast.makeText(this, "The field is empty!", Toast.LENGTH_SHORT).show();
            }
        }

        }
}
