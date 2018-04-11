package com.example.lalit.eventit;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FrgLogin extends Fragment {


    TextView tvForgotPassword;
    Button btnSignin;
    Button btnGoogle;
    public FrgLogin() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frg_login, container, false);

        tvForgotPassword=(TextView)view.findViewById(R.id.tvForgotPassword);
        btnGoogle=(Button)view.findViewById(R.id.btnGoogle);
        btnSignin=(Button)view.findViewById(R.id.btnSignin);

        tvForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Ab kuch nai ho sakta!", Toast.LENGTH_SHORT).show();
            }
        });
        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Ese ni hota Login", Toast.LENGTH_SHORT).show();
            }
        });
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Api kon implement Karega?", Toast.LENGTH_SHORT).show();
                getFragmentManager().beginTransaction().replace(R.id.rlMain,new FrgSignup()).commit();
                // getChildFragmentManager().beginTransaction().replace(R.id.llMain2,new Main2Activity()).commit();
            }
        });

        return view;


    }

}
