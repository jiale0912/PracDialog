package com.example.pracdialog;


import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class alertDialog extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        androidx.appcompat.app.AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
        alert.setTitle("Alert Dialog");
        alert.setMessage("Dou you wish to continue?");
        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //User Clicked OK
                Toast.makeText(getActivity(), "You Pressed OK", Toast.LENGTH_SHORT).show();
            }

        });
        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //User Cancel
                Toast.makeText(getActivity(), "You Pressed Cancel", Toast.LENGTH_SHORT).show();
            }
        });
        return alert.create();
    }
}
