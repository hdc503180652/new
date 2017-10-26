package com.xiaowu.bottomtab.demo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.xiaowu.bottomtab.demo.R.layout.main_tab2_fragment;


public class IWantKnowFragment extends Fragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);


//        /**
//         * 只有调用了该方法，TextView才能不依赖于ScrollView而实现滚动的效果。
//         * 要在XML中设置TextView的textcolor，否则，当TextView被触摸时，会灰掉。
//         */
//        main_tab2_fragment.setMovementMethod(ScrollingMovementMethod.getInstance());
	}
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(main_tab2_fragment, container,
				false);

		return view;
	}
	
}
