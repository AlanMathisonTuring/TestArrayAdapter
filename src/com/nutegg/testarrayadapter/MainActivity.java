package com.nutegg.testarrayadapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	private static String[] functions = {"功能1","功能2","功能3","功能4","功能5","功能6","功能7","功能8","功能9","功能10"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView lv = (ListView)this.findViewById(R.id.lv);
		//查看笔记或查看源代码了解此数据适配器的实现原理(采用了layoutinflater)
		lv.setAdapter(new ArrayAdapter<String>(this, R.layout.list_view,R.id.tv,functions));
	}

}
