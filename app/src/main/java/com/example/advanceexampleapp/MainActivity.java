package com.example.advanceexampleapp;

import androidx.appcompat.app.AppCompatActivity;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnFocusChangeListener {

    private ImageButton btnVoice,btnSetting, btnSearch, btnList, btnHistory;
    private TextView txtVoiceStatus, txtSettingStatus, txtSearch, txtList, txtHistory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVoice= findViewById(R.id.btnVoice);
        btnSetting= findViewById(R.id.btnSetting);
        btnSearch= findViewById(R.id.btnSearch);
        btnList= findViewById(R.id.btnList);
        btnHistory= findViewById(R.id.btnHistory);

        txtVoiceStatus= findViewById(R.id.txtVoiceStatus);
        txtSettingStatus= findViewById(R.id.txtSettingStatus);
        txtSearch= findViewById(R.id.txtSearch);
        txtList= findViewById(R.id.txtList);
        txtHistory= findViewById(R.id.txtHistory);


        btnVoice.setOnFocusChangeListener(this);
        btnSetting.setOnFocusChangeListener(this);
        btnSearch.setOnFocusChangeListener(this);
        btnList.setOnFocusChangeListener(this);
        btnHistory.setOnFocusChangeListener(this);

        selectFragment(0);
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        if(v.getId()==R.id.btnVoice){
            if(hasFocus) {
                txtVoiceStatus.setVisibility(View.VISIBLE);
                selectFragment(0);
            }
            else txtVoiceStatus.setVisibility(View.INVISIBLE);
        }
        if(v.getId()==R.id.btnSetting){
            if(hasFocus){
                txtSettingStatus.setVisibility(View.VISIBLE);
                selectFragment(1);
            }
            else txtSettingStatus.setVisibility(View.INVISIBLE);
        }

        if(v.getId()==R.id.btnSearch){
            if(hasFocus){
                txtSearch.setVisibility(View.VISIBLE);
                selectFragment(2);
            }
            else txtSearch.setVisibility(View.INVISIBLE);
        }
        if(v.getId()==R.id.btnList){
            if(hasFocus){
                txtList.setVisibility(View.VISIBLE);
                selectFragment(3);
            }
            else txtList.setVisibility(View.INVISIBLE);
        }
        if(v.getId()==R.id.btnHistory){
            if(hasFocus){
                txtHistory.setVisibility(View.VISIBLE);
                selectFragment(4);
            }
            else txtHistory.setVisibility(View.INVISIBLE);
        }
    }

    Fragment fragment = null;
    String fragmentTag = "";

    private void selectFragment(int position){
        Class fragmentClass = null;
        switch (position){
            case 0:
                fragmentClass = HomeFragment.class;
                fragmentTag = "HomeFragment";
                break;

            case 1:
                fragmentClass = SettingFragment.class;
                fragmentTag = "SettingFragment";
                break;

            case 2:
                fragmentClass = SearchFragment.class;
                fragmentTag = "SearchFragment";
                break;
            case 3:
                fragmentClass = ListFragment.class;
                fragmentTag = "ListFragment";
                break;
            case 4:
                fragmentClass = HistoryFragment.class;
                fragmentTag = "HistoryFragment";
                break;
            default:
                break;
        }
        try {
            fragment = (Fragment) fragmentClass.newInstance();
            Bundle bundle = new Bundle();
            bundle.putString("fragmentTag", fragmentTag);


            fragment.setArguments(bundle);
            // Insert the fragment by replacing any existing fragment
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_content, fragment).commitAllowingStateLoss();
        } catch (Exception e) {
            Log.d("IOTs", "selectFragment " + e.getMessage());
        }
    }

}
