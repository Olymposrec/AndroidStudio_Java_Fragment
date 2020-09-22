package com.melihakkose.javafragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //TextView' e "findViewById" olarak ulasamiyoruz cunku activity istiyor o yuzden viewGroup olarak ulastik
        //ViewGroup dondurerek islemimizi yapiyoruz
        ViewGroup viewGroup=(ViewGroup) inflater.inflate(R.layout.fragment_first,container,false);
        TextView textView2=viewGroup.findViewById(R.id.textView);
        textView2.setText("onCreateView: 2ND FRAGMENT ViewGroup");

        return viewGroup;
    }
}
