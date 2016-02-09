package com.application.asam.conversion.Fragments;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.application.asam.conversion.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Aravind on 7/29/2015.
 */
public class Wind__Chill extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";

    @Bind(R.id.editText3)
    EditText e1;
    @Bind(R.id.editText4)
    EditText e2;
    @Bind(R.id.textView8)
    TextView text;
    @Bind(R.id.toggleButton2)
    ToggleButton t2;
    @Bind(R.id.toggleButton3)
    ToggleButton t3;
    @Bind(R.id.parent)
    CoordinatorLayout snackbar;
    @Bind(R.id.svchill)
    ScrollView sv;



    public static Wind__Chill newInstance(int sectionNumber) {
        Wind__Chill fragment = new Wind__Chill();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fragment_wind_chill, container, false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @OnClick(R.id.toggleButton2)
    public void toggle3() {
        t3.toggle();
    }

    @OnClick(R.id.toggleButton3)
    public void toggle2() {
        t2.toggle();
    }

    @OnClick(R.id.button20)
    public void windchill() {

        boolean on = (t2.isChecked() && t3.isChecked());
        if (on) windchillI();

        else windchillM();
    }

    public void windchillI() {

        if (e1.getText().length() > 0 && e2.getText().length() > 0) {
            Double Tp = Double.parseDouble(e1.getText().toString());
            Double Wi = Double.parseDouble(e2.getText().toString());
            if (Tp < -150) {
                sv.scrollTo(0, sv.getTop());
                Snackbar.make(snackbar, "Enter a value of -150°F or more!", Snackbar.LENGTH_LONG).show();
            } else if (Tp > 70) {
                sv.scrollTo(0, sv.getTop());
                Snackbar.make(snackbar, "Enter a value of 70°F or less!", Snackbar.LENGTH_LONG).show();
            } else if (Wi < 0) {
                sv.scrollTo(0, sv.getTop());
                Snackbar.make(snackbar, "Enter a value more than 0 mph!", Snackbar.LENGTH_LONG).show();
            } else if (Wi > 300) {
                sv.scrollTo(0, sv.getTop());
                Snackbar.make(snackbar, "Enter a value between 0-300 mph!", Snackbar.LENGTH_LONG).show();
            } else {
                sv.scrollTo(0, sv.getBottom());
                Double T = Double.parseDouble(e1.getText().toString());
                Double W = Double.parseDouble(e2.getText().toString());
                Double WC = 35.74 + 0.6215 * T + (0.4275 * T - 35.75) * Math.pow(W, 0.16);
                WC = (double) Math.round(WC * 10);
                WC = WC / 10;
                Double x = WC - 32;
                Double y = x * 5;
                Double z = y / 9;
                z = (double) Math.round(z * 10);
                z = z / 10;
                text.setText(WC.toString() + " °F / " + z.toString() + " °C");
            }
        }else{
            sv.scrollTo(0, sv.getTop());
        }
    }

    public void windchillM() {

        if (e1.getText().length() > 0 && e2.getText().length() > 0) {
            Double Tp = Double.parseDouble(e1.getText().toString());
            Double Wi = Double.parseDouble(e2.getText().toString());
            if (Tp < -100) {
                sv.scrollTo(0, sv.getTop());
                Snackbar.make(snackbar, "Enter a value of -100°C or less!", Snackbar.LENGTH_LONG).show();
            } else if (Tp > 20) {
                sv.scrollTo(0, sv.getTop());
                Snackbar.make(snackbar, "Enter a value of 20°C or less!", Snackbar.LENGTH_LONG).show();
            } else if (Wi < 0) {
                sv.scrollTo(0, sv.getTop());
                Snackbar.make(snackbar, "Enter a value more than 0 kph!", Snackbar.LENGTH_LONG).show();
            } else if (Wi > 500) {
                sv.scrollTo(0, sv.getTop());
                Snackbar.make(snackbar, "Enter a value between 0-500 kph!", Snackbar.LENGTH_LONG).show();
            } else {
                sv.scrollTo(0, sv.getBottom());
                Double T = Double.parseDouble(e1.getText().toString());
                Double W = Double.parseDouble(e2.getText().toString());
                Double WC = 13.12 + 0.6215 * T - 11.37 * Math.pow(W, 0.16) + 0.3965 * T * Math.pow(W, 0.16);
                WC = (double) Math.round(WC * 10);
                WC = WC / 10;
                Double i = WC * 9;
                Double j = i / 5;
                Double k = j + 32;
                k = (double) Math.round(k * 100);
                k = k / 100;
                text.setText(WC.toString() + " °C / " + k.toString() + " °F");
            }
        }else{
            sv.scrollTo(0, sv.getTop());
        }
    }

    @OnClick(R.id.button21)
    public void clear() {
        sv.scrollTo(0, sv.getTop());
        e1.setText("");
        e2.setText("");
        text.setText("");
    }
}
