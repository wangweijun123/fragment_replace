package com.example.administrator.searchfragmentreplace;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SearchHotKeyFragment extends Fragment {

    public static Fragment getInstance() {
        Bundle data = new Bundle();
        data.putSerializable("hotKey", "ddd");
        Fragment fragment = new SearchHotKeyFragment();
        fragment.setArguments(data);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.hotkey, null);


        return root;
    }
}
