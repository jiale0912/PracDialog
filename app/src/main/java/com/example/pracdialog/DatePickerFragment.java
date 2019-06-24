package com.example.pracdialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener{
    @Override
    public void onDateSet(android.widget.DatePicker datePicker, int year, int month, int day) {
        showDate(year,month,day);

    }
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
       final Calendar c = Calendar.getInstance();
       int year = c.get(Calendar.YEAR);
       int month = c.get(Calendar.MONTH);
       int day = c.get(Calendar.DAY_OF_MONTH);

       return new DatePickerDialog(getActivity(),this,year,month,day);
   }

    public void showDate(int year, int month, int day){
        String myDay = Integer.toString(day);
        String myMonth = Integer.toString(month+1);
        String myYear = Integer.toString(year);

        String myDate = day + "/" + month + "/" + year;
        Toast.makeText(getActivity(),"Date: " + myDate,Toast.LENGTH_SHORT).show();
    }
}
