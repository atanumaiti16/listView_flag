package com.example.atanu.listview_flag;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class fragment extends Fragment {

    TextView displayMessage;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment , container,false);

        displayMessage = view.findViewById(R.id.tv_country);
        String myValue = this.getArguments().getString("key");

        displayMessage.setText(myValue);

        return view;
    }
}
