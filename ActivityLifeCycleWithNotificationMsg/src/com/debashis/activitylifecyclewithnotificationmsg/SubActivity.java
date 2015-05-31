package com.debashis.activitylifecyclewithnotificationmsg;

import android.os.Bundle;

public class SubActivity extends LifeCycle {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sub);
	}
}
