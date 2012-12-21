package com.example.tabheighttest;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ActionBar actionbar = getActionBar();
		actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		actionbar.setDisplayShowTitleEnabled(false);
		actionbar.setDisplayShowHomeEnabled(false);
		ActionBar.Tab PlayerTab = actionbar.newTab().setText("Tab A");
		ActionBar.Tab StationsTab = actionbar.newTab().setText("Tab B");
		ActionBar.Tab SomeTab = actionbar.newTab().setText("Tab C");

		PlayerTab.setTabListener(new MyTabsListener());
		StationsTab.setTabListener(new MyTabsListener());
		SomeTab.setTabListener(new MyTabsListener());

		actionbar.addTab(PlayerTab);
		actionbar.addTab(StationsTab);
		actionbar.addTab(SomeTab);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	class MyTabsListener implements ActionBar.TabListener {
		public Fragment fragment;

		@Override
		public void onTabReselected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTabSelected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTabUnselected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			
		}

	}

}
