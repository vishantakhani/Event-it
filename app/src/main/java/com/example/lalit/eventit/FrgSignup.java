package com.example.lalit.eventit;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FrgSignup extends Fragment {

    EditText etFirstName;
    EditText etLastName;
    EditText etEmail;
    EditText etPassword;
    EditText etConfirmPassword;
    Button btnSubmit;

    public FrgSignup() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frg_signup, container, false);
        etFirstName=(EditText) view.findViewById(R.id.etFirstName);
        etLastName=(EditText) view.findViewById(R.id.etLastName);
        etEmail=(EditText) view.findViewById(R.id.etEmail);
        etPassword=(EditText) view.findViewById(R.id.etPassword);
        etConfirmPassword=(EditText) view.findViewById(R.id.etConfirmPassword);
        btnSubmit = (Button) view.findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return view;
    }

}
