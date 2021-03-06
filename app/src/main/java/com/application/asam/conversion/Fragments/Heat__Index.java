package com.application.asam.conversion.Fragments;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.application.asam.conversion.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Aravind on 7/29/2015.
 */
public class Heat__Index extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";

    @Bind(R.id.editText)
    EditText edit;
    @Bind(R.id.editText2)
    EditText edit1;
    @Bind(R.id.textView5)
    TextView text;
    @Bind(R.id.toggleButton)
    ToggleButton F;
    @Bind(R.id.parent)
    CoordinatorLayout snackbar;
    @Bind(R.id.svheat)
    ScrollView sv;


    public static Heat__Index newInstance(int sectionNumber) {
        Heat__Index fragment = new Heat__Index();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_heat__index, container, false);
        ButterKnife.bind(this, rootView);
        loadSavedPreferences();
        return rootView;
    }

    @OnClick(R.id.toggleButton)
    public void toggle(){
        savePreferences("Heat_Value", F.isChecked());
    }

    @OnClick(R.id.button18)
    public void heatindex() {
        //savePreferences("Heat_Value", F.isChecked());

        boolean on = F.isChecked();
        if (on) heatindexI();

        else heatindexM();
    }


    public void heatindexI(){
        if (edit.getText().length() > 0 && edit1.getText().length() > 0) {
            Double T = Double.parseDouble(edit.getText().toString());
            Double R = Double.parseDouble(edit1.getText().toString());
            if (T < 75) {
                sv.scrollTo(0, sv.getTop());
                Snackbar.make(snackbar, "Enter a value of 75°F or greater!", Snackbar.LENGTH_LONG).show();
            } else if (T > 212) {
                sv.scrollTo(0, sv.getTop());
                Snackbar.make(snackbar, "Enter a value of 212°F or less!", Snackbar.LENGTH_LONG).show();
            } else if (R < 0) {
                sv.scrollTo(0, sv.getTop());
                Snackbar.make(snackbar, "Relative Humidity must be at least 0%!", Snackbar.LENGTH_LONG).show();
            } else if (R > 100) {
                sv.scrollTo(0, sv.getTop());
                Snackbar.make(snackbar, "Relative Humidity cannot exceed 100%!", Snackbar.LENGTH_LONG).show();
            } else {
                sv.scrollTo(0, sv.getBottom());
                Double T2 = T * T;
                Double R2 = R * R;
                Double C1 = -42.379;
                Double C2 = 2.04901523;
                Double C3 = 10.14333127;
                Double C4 = -0.22475541;
                Double C5 = -.00683783;
                Double C6 = -5.481717E-2;
                Double C7 = 1.22874E-3;
                Double C8 = 8.5282E-4;
                Double C9 = -1.99E-6;
                Double C10 = C1 + (C2 * T) + (C3 * R) + (C4 * T * R) + (C5 * T2) + (C6 * R2) + (C7 * T2 * R) + (C8 * T * R2) + (C9 * T2 * R2);
                C10 = (double) Math.round(C10 * 10);
                C10 = C10 / 10;
                Double x = C10 - 32;
                Double y = x * 5;
                Double z = y / 9;
                z = (double) Math.round(z * 10);
                z = z / 10;
                text.setText(C10.toString() + " °F / " + z.toString() + " °C");
            }
        }else{
            sv.scrollTo(0, sv.getTop());
        }
    }

    public void heatindexM() {
        if (edit.getText().length() > 0 && edit1.getText().length() > 0) {
            Double h = Double.parseDouble(edit.getText().toString());
            Double R = Double.parseDouble(edit1.getText().toString());
            if (h < 25) {
                sv.scrollTo(0, sv.getTop());
                Snackbar.make(snackbar, "Enter a value of 25°C or greater!", Snackbar.LENGTH_LONG).show();
            } else if (h > 100) {
                sv.scrollTo(0, sv.getTop());
                Snackbar.make(snackbar, "Enter a value of 100°C or less!", Snackbar.LENGTH_LONG).show();
            } else if (R < 0) {
                sv.scrollTo(0, sv.getTop());
                Snackbar.make(snackbar, "Relative Humidity must be at least 0%!", Snackbar.LENGTH_LONG).show();
            } else if (R > 100) {
                sv.scrollTo(0, sv.getTop());
                Snackbar.make(snackbar, "Relative Humidity cannot exceed 100%!", Snackbar.LENGTH_LONG).show();
            } else {
                sv.scrollTo(0, sv.getBottom());
                Double i = h * 9;
                Double j = i / 5;
                Double k = j + 32;
                Double T = k;
                Double T2 = T * T;
                Double R2 = R * R;
                Double C1 = -42.379;
                Double C2 = 2.04901523;
                Double C3 = 10.14333127;
                Double C4 = -0.22475541;
                Double C5 = -.00683783;
                Double C6 = -5.481717E-2;
                Double C7 = 1.22874E-3;
                Double C8 = 8.5282E-4;
                Double C9 = -1.99E-6;
                Double C10 = C1 + (C2 * T) + (C3 * R) + (C4 * T * R) + (C5 * T2) + (C6 * R2) + (C7 * T2 * R) + (C8 * T * R2) + (C9 * T2 * R2);
                C10 = (double) Math.round(C10 * 10);
                C10 = C10 / 10;
                Double x = C10 - 32;
                Double y = x * 5;
                Double z = y / 9;
                z = (double) Math.round(z * 10);
                z = z / 10;

                text.setText(z.toString() + " °C / " + C10.toString() + " °F");
            }
        }else{
            sv.scrollTo(0, sv.getTop());
        }
    }

    @OnClick(R.id.button19)
    public void clear() {
        sv.scrollTo(0, sv.getTop());
        edit.setText("");
        edit1.setText("");
        text.setText("");
    }

    private void loadSavedPreferences() {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(this.getContext());
        boolean heatValue = sharedPreferences.getBoolean("Heat_Value", false);
        if (heatValue) {
            F.setChecked(true);
        } else {
            F.setChecked(false);
        }
    }

    private void savePreferences(String key, boolean value) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(this.getContext());
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }

}