package com.example.linxi.fragmenttest2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by linxi on 2016/11/7.
 */

public class ContactsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View contactsLayout=inflater.inflate(R.layout.contacts_layout,container,false);
        return contactsLayout;
    }
}
