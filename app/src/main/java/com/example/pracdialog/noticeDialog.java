package com.example.pracdialog;

import android.widget.Toast;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

public class noticeDialog extends FragmentActivity implements NoticeDialogFragment.NoticeDialogListener {

    public void showNoticeDialog(){
        DialogFragment dialog = new NoticeDialogFragment();
        dialog.show(getSupportFragmentManager(),"NoticeDialogFragment");
    }
    @Override
    public void onDialogPositiveClick(DialogFragment Dialog) {
        Toast.makeText(getApplicationContext(),"You press Fire",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDialogNegativeClick(DialogFragment Dialog) {
        Toast.makeText(getApplicationContext(),"You Press No",Toast.LENGTH_SHORT).show();
    }
}
