package com.melihakkose.javafragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //TextView' e "findViewById" olarak ulasamiyoruz cunku activity istiyor o yuzden viewGroup olarak ulastik
        //ViewGroup dondurerek islemimizi yapiyoruz
        ViewGroup viewGroup=(ViewGroup) inflater.inflate(R.layout.fragment_first,container,false);
        TextView textView=viewGroup.findViewById(R.id.textView);
        textView.setText("onCreateView: 1ST FRAGMENT ViewGroup");
        return viewGroup;
}
}
