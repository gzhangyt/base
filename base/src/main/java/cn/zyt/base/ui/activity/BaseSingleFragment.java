package cn.zyt.base.ui.activity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import cn.zyt.base.R;

/**
 * Created by zyt on 2018-11-21.
 * * baseSingleFragment
 * 用于管理一个fragment的activity
 */

public abstract class BaseSingleFragment extends AppCompatActivity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_fragment);
        FragmentManager manager = getSupportFragmentManager();

        Fragment fragment = manager.findFragmentById(R.id.fragment_container);
        if(fragment == null){
            manager.beginTransaction()
                    .add(R.id.fragment_container,createFragment())
                    .commit();
        }
    }

    protected abstract Fragment createFragment() ;


}
