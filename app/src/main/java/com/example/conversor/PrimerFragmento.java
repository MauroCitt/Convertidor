package com.example.conversor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class PrimerFragmento extends Fragment {

    private RadioGroup radioGroup;
    private EditText inputTemperature;
    private Button convertButton;
    private TextView resultTextView;

    public PrimerFragmento() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_primer_fragmento, container, false);

        // Initialize UI elements
        radioGroup = rootView.findViewById(R.id.radioGroup);
        inputTemperature = rootView.findViewById(R.id.inputTemperature);
        convertButton = rootView.findViewById(R.id.convertButton);
        resultTextView = rootView.findViewById(R.id.resultTextView);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get selected radio button ID
                int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();

                // Check which radio button is selected
                if (selectedRadioButtonId != -1) {
                    RadioButton selectedRadioButton = rootView.findViewById(selectedRadioButtonId);
                    String selectedTemperatureType = selectedRadioButton.getText().toString();

                    // Get the temperature value entered by the user
                    String temperatureValue = inputTemperature.getText().toString();

                    // Perform temperature conversion based on selectedTemperatureType
                    double result = performConversion(selectedTemperatureType, temperatureValue);

                    // Display the result
                    resultTextView.setText("Result: " + result);
                }
            }
        });

        return rootView;
    }

    // Implement the temperature conversion logic here
    private double performConversion(String temperatureType, String temperatureValue) {
        // Add your conversion logic here based on the temperatureType and temperatureValue.
        // Return the converted temperature as a double.
        // Example: Convert from Celsius to Kelvin, Fahrenheit, or Rankine.
        // You can use formulas like:
        // double convertedValue = ...;
        // return convertedValue;
        return 0.0; // Placeholder value
    }
}
}