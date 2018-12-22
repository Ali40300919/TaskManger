package com.example.admin.software_1.controllers;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.admin.software_1.R;

public class TaskManagerActivity extends AppCompatActivity {


    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private Toolbar mToolbar;
    private FloatingActionButton mFab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_manager);

        initialization();


        setSupportActionBar(mToolbar);
        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });




        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return new TaskListFragment();
            }

            @Override
            public int getCount() {
                return 3;
            }

            @Override
            public CharSequence getPageTitle(int position) {

                switch (position)
                {
                    case 0:
                        return TaskManagerActivity.this.getString(R.string.All);
                    case 1:
                        return TaskManagerActivity.this.getString(R.string.Done);
                    case 2:
                        return TaskManagerActivity.this.getString(R.string.UnDone);


                }
                return "";
            }
        });


        mTabLayout.setupWithViewPager(mViewPager);
    }


    private void initialization()
    {
        mViewPager=findViewById(R.id.container_viewPager_fragment);
        mTabLayout=findViewById(R.id.tast_tabs_tabL_Activity);
         mToolbar = findViewById(R.id.toolbar);
         mFab=findViewById(R.id.add_fab_Activity);
    }

}
