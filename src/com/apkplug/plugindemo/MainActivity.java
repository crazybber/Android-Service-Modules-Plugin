package com.apkplug.plugindemo;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView info=(TextView) this.findViewById(R.id.info);
		
		info.setText("plugin.xml自定义key:"+
		BundleContextFactory.getInstance().getBundleContext().
		getBundle().getHeaders().get("mykey"));
	}
}
