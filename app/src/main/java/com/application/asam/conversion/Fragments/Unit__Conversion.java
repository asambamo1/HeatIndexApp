package com.application.asam.conversion.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import com.application.asam.conversion.R;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;

/**
 * Created by Aravind on 7/29/2015.
 */
public class Unit__Conversion extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";
    @Bind(R.id.editText1) EditText dis;
    @Bind(R.id.textView2) TextView text;
    @Bind(R.id.sv) ScrollView sv;

    public static Unit__Conversion newInstance(int sectionNumber) {
        Unit__Conversion fragment = new Unit__Conversion();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.convert, container, false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @OnClick(R.id.button1)
    public void KMtoMI() {

        if (dis.getText().length() > 0) {
            sv.scrollTo(0, sv.getTop());
            Double h = Double.parseDouble(dis.getText().toString());
            Double i = 1.60934;
            Double j = h / i;
            j = (double) Math.round(j * 100);
            j = j / 100;
            text.setText(h + " kilometers = " + j.toString() + " miles");
        }
        else{
            sv.scrollTo(0, sv.getTop());
        }
    }

    @OnClick(R.id.button5)
    public void MItoKM() {

        if (dis.getText().length() > 0) {
            sv.scrollTo(0, sv.getTop());
            Double h = Double.parseDouble(dis.getText().toString());
            Double i = 1.60934;
            Double j = h * i;
            j = (double) Math.round(j * 100);
            j = j / 100;
            text.setText(h + " miles = " + j.toString() + " kilometers");
        }
        else{
            sv.scrollTo(0, sv.getTop());
        }

    }

    @OnClick(R.id.button2)
    public void LiterstoGallons() {

        if (dis.getText().length() > 0) {
            sv.scrollTo(0, sv.getTop());
            Double h = Double.parseDouble(dis.getText().toString());
            Double i = 0.264172;
            Double j = h * i;
            j = (double) Math.round(j * 100);
            j = j / 100;
            text.setText(h + " Liters = " + j.toString() + " US Gallons");

        }
        else{
            sv.scrollTo(0, sv.getTop());
        }

    }

    @OnClick(R.id.button6)
    public void GallonstoLiters() {

        if (dis.getText().length() > 0) {
            sv.scrollTo(0, sv.getTop());
            Double h = Double.parseDouble(dis.getText().toString());
            Double i = 0.264172;
            Double j = h / i;
            j = (double) Math.round(j * 100);
            j = j / 100;
            text.setText(h + " US Gallons = " + j.toString() + " Liters");

        }
        else{
            sv.scrollTo(0, sv.getTop());
        }

    }

    @OnClick(R.id.button3)
    public void CtoF() {

        if (dis.getText().length() > 0) {
            sv.scrollTo(0, sv.getTop());
            Double h = Double.parseDouble(dis.getText().toString());
            Double i = h * 9;
            Double j = i / 5;
            Double k = j + 32;
            k = (double) Math.round(k * 100);
            k = k / 100;
            text.setText(h + " Celsius = " + k.toString() + " Fahrenheit");

        }
        else{
            sv.scrollTo(0, sv.getTop());
        }

    }

    @OnClick(R.id.button7)
    public void FtoC() {

        if (dis.getText().length() > 0) {
            sv.scrollTo(0, sv.getTop());
            Double h = Double.parseDouble(dis.getText().toString());
            Double i = h - 32;
            Double j = i * 5;
            Double k = j / 9;
            k = (double) Math.round(k * 100);
            k = k / 100;
            text.setText(h + " Fahrenheit = " + k.toString() + " Celsius");
        }
        else{
            sv.scrollTo(0, sv.getTop());
        }
    }

    @OnClick(R.id.button4)
    public void KGtoLB() {

        if (dis.getText().length() > 0) {
            sv.scrollTo(0, sv.getTop());
            Double h = Double.parseDouble(dis.getText().toString());
            Double i = 2.20462;
            Double j = h * i;
            j = (double) Math.round(j * 100);
            j = j / 100;
            text.setText(h + " kilograms = " + j.toString() + " pounds");
        }
        else{
            sv.scrollTo(0, sv.getTop());
        }

    }

    @OnClick(R.id.button8)
    public void LBtoKG() {

        if (dis.getText().length() > 0) {
            sv.scrollTo(0, sv.getTop());
            Double h = Double.parseDouble(dis.getText().toString());
            Double i = 2.20462;
            Double j = h / i;
            j = (double) Math.round(j * 100);
            j = j / 100;
            text.setText(h + " pounds = " + j.toString() + " kilograms");

        }
        else{
            sv.scrollTo(0, sv.getTop());
        }

    }

    @OnClick(R.id.button1a)
    public void MPGtoKPL() {

        if (dis.getText().length() > 0) {
            sv.scrollTo(0, sv.getTop());
            Double h = Double.parseDouble(dis.getText().toString());
            Double i = 0.425143707;
            Double j = h * i;
            j = (double) Math.round(j * 100);
            j = j / 100;
            text.setText(h + " Miles per Gallon = " + j.toString() + " KM per liter");
        }
        else{
            sv.scrollTo(0, sv.getTop());
        }
    }

    @OnClick(R.id.button5a)
    public void KPLtoMPG() {

        if (dis.getText().length() > 0) {
            sv.scrollTo(0, sv.getTop());
            Double h = Double.parseDouble(dis.getText().toString());
            Double i = 0.425143707;
            Double j = h / i;
            j = (double) Math.round(j * 100);
            j = j / 100;
            text.setText(h + " KM per Liter = " + j.toString() + " Miles per Gallon");
        }
        else{
            sv.scrollTo(0, sv.getTop());
        }
    }

    @OnClick(R.id.button2a)
    public void FeettoMeters() {

        if (dis.getText().length() > 0) {
            sv.scrollTo(0, sv.getTop());
            Double h = Double.parseDouble(dis.getText().toString());
            Double i = 0.3048;
            Double j = h * i;
            j = (double) Math.round(j * 100);
            j = j / 100;
            text.setText(h + " Feet = " + j.toString() + " Meters");
        }
        else{
            sv.scrollTo(0, sv.getTop());
        }
    }

    @OnClick(R.id.button6a)
    public void MeterstoFeet() {

        if (dis.getText().length() > 0) {
            sv.scrollTo(0, sv.getTop());
            Double h = Double.parseDouble(dis.getText().toString());
            Double i = 3.28084;
            Double j = h * i;
            j = (double) Math.round(j * 100);
            j = j / 100;
            text.setText(h + " Meters = " + j.toString() + " Feet");
        }
        else{
            sv.scrollTo(0, sv.getTop());
        }
    }

    @OnClick(R.id.button10)
    public void INtoCM() {

        if (dis.getText().length() > 0) {
            sv.scrollTo(0, sv.getTop());
            Double h = Double.parseDouble(dis.getText().toString());
            Double i = 2.54;
            Double j = h * i;
            j = (double) Math.round(j * 100);
            j = j / 100;
            text.setText(h + " Inches = " + j.toString() + " CM");
        }
        else{
            sv.scrollTo(0, sv.getTop());
        }
    }

    @OnClick(R.id.button11)
    public void CMtoIN() {

        if (dis.getText().length() > 0) {
            sv.scrollTo(0, sv.getTop());
            Double h = Double.parseDouble(dis.getText().toString());
            Double i = 0.393701;
            Double j = h * i;
            j = (double) Math.round(j * 100);
            j = j / 100;
            text.setText(h + " CM = " + j.toString() + " Inches");
        }
        else{
            sv.scrollTo(0, sv.getTop());
        }
    }

    @OnClick(R.id.button3a)
    public void fttom() {

        if (dis.getText().length() > 0) {
            sv.scrollTo(0, sv.getTop());
            Double h = Double.parseDouble(dis.getText().toString());
            Double i = 0.092903;
            Double j = h * i;
            j = (double) Math.round(j * 100);
            j = j / 100;
            text.setText(h + " Square Feet = " + j.toString() + " Square Meters");
        }
        else{
            sv.scrollTo(0, sv.getTop());
        }
    }

    @OnClick(R.id.button7a)
    public void mtoft() {
        if (dis.getText().length() > 0) {
            sv.scrollTo(0, sv.getTop());
            Double h = Double.parseDouble(dis.getText().toString());
            Double i = 10.7639;
            Double j = h * i;
            j = (double) Math.round(j * 100);
            j = j / 100;
            text.setText(h + " Square Meters = " + j.toString() + " Square Feet");
        }
        else{
            sv.scrollTo(0, sv.getTop());
        }
    }

    @OnClick(R.id.button4a)
    public void mitokm() {
        if (dis.getText().length() > 0) {
            sv.scrollTo(0, sv.getTop());
            Double h = Double.parseDouble(dis.getText().toString());
            Double i = 2.58999;
            Double j = h * i;
            j = (double) Math.round(j * 100);
            j = j / 100;
            text.setText(h + " Square miles = " + j.toString() + " Square KM");
        }
        else{
            sv.scrollTo(0, sv.getTop());
        }
    }

    @OnClick(R.id.button8a)
    public void kmtomi() {
        if (dis.getText().length() > 0) {
            sv.scrollTo(0, sv.getTop());
            Double h = Double.parseDouble(dis.getText().toString());
            Double i = 0.386102;
            Double j = h * i;
            j = (double) Math.round(j * 100);
            j = j / 100;
            text.setText(h + " Square KM = " + j.toString() + " Square miles");
        }
        else{
            sv.scrollTo(0, sv.getTop());
        }
    }

    @OnClick(R.id.button13)
    public void clear() {
        sv.scrollTo(0, sv.getTop());
        dis.setText("");
        text.setText("");
    }
}