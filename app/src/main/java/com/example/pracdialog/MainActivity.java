package com.example.pracdialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showTimePickerDialog(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }

    public void showDatePickerDialog(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");

    }


    public void alertWithButton(View view) {
        DialogFragment myAlert = new alertDialog();
        myAlert.show(getSupportFragmentManager(),"AlertDialog");
    }

    public void SignIn(View view) {
        Intent intent = new Intent(this,logInDialog.class);
        startActivity(intent);

    }


    public void showNotice(View view) {
        noticeDialog myNotice = new noticeDialog();
        myNotice.showNoticeDialog();
    }

    public void showList(View view) {
        DialogFragment myList = new listDialog();
        myList.show(getSupportFragmentManager(),"ListDialog");
    }

    public void multiChoiceDialog(View view) {
        DialogFragment myMultiChoice = new multiChoice();
        myMultiChoice.show(getSupportFragmentManager(),"MultiChoiceDialog");
    }
}
