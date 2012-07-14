package com.alienff.carcode;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class CarCode extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        final EditText codeEdit;
        final TextView regionView;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        codeEdit = (EditText) findViewById(R.id.code);
        regionView = (TextView) findViewById(R.id.region);
        codeEdit.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
                }
            }
        });
        codeEdit.requestFocus();
        codeEdit.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int productId, int productId1, int productId2) {}
            @Override public void afterTextChanged(Editable editable) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int productId, int productId1, int productId2) {
                try {
                    regionView.setText(CarCodeService.getRegion(Integer.parseInt(charSequence.toString())));
                } catch (NumberFormatException e) {
                    regionView.setText(null);
                }
            }
        });
    }
}
