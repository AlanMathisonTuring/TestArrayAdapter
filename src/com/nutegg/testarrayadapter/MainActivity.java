package com.nutegg.testarrayadapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	private static String[] functions = {"����1","����2","����3","����4","����5","����6","����7","����8","����9","����10"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView lv = (ListView)this.findViewById(R.id.lv);
		//�鿴�ʼǻ�鿴Դ�����˽��������������ʵ��ԭ��(������layoutinflater)
		lv.setAdapter(new ArrayAdapter<String>(this, R.layout.list_view,R.id.tv,functions));
	}

}
