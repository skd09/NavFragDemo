package com.sharvari.navfragdemo.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sharvari.navfragdemo.R;

public class ProfileFragment extends Fragment {

    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_profile, container, false);
        textView = v.findViewById(R.id.textView2);

        String label = ProfileFragmentArgs.fromBundle(getArguments()).getScreenName();

        textView.setText(label);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.actionToSettingsFragment);
            }
        });

        return v;
    }
}