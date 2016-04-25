package com.bonnguyen.countryphonepicker.demo;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.github.bonnguyen.countryphonepicker.CountryPicker;

public class MainActivity extends AppCompatActivity implements CountryPicker.CountryPickerListener {

    private TextView tvCountryInfor;
    private Button btnCountryPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCountryInfor = (TextView) findViewById(R.id.tvCountryInfor);
        btnCountryPhone = (Button) findViewById(R.id.btnCountryPhone);
        btnCountryPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CountryPicker countryPicker = new CountryPicker();
                countryPicker.setListener(MainActivity.this);
                countryPicker.show(getSupportFragmentManager(), CountryPicker.class.getSimpleName());
            }
        });
    }

    @Override
    public void onSelectCountry(DialogFragment dialog, String countryName, String phoneCode, String countryCode) {
        dialog.dismiss();
        tvCountryInfor.setText("Country " + countryName + " has country code phone: "
                + phoneCode + " and country code: " + countryCode);
    }
}
