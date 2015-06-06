package com.org.caclute;


import org.json.JSONArray;

import android.app.Activity;
import android.graphics.SumPathEffect;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener{
	private Button btn_one;
	private Button btn_two;
	private Button btn_three;
	private Button btn_four;
	private Button btn_five;
	private Button btn_six;
	private Button btn_serven;
	private Button btn_eight;
	private Button btn_nine;
	private Button btn_zero;
	
	private Button btn_clear;
	private Button btn_del;
	private Button btn_mul;
	private Button btn_dev;
	private Button btn_point;
	private Button btn_jia;
	private Button btn_jian;
	private Button btn_deng;
	
	private EditText edit_query;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn_one=(Button) findViewById(R.id.btn_one);
		btn_two=(Button) findViewById(R.id.btn_two);
		btn_three=(Button) findViewById(R.id.btn_three);
		btn_four=(Button) findViewById(R.id.btn_four);
		btn_five=(Button) findViewById(R.id.btn_five);
		btn_six=(Button) findViewById(R.id.btn_six);
		btn_serven=(Button) findViewById(R.id.btn_serven);
		btn_eight=(Button) findViewById(R.id.btn_eight);
		btn_nine=(Button) findViewById(R.id.btn_nine);
		btn_zero=(Button) findViewById(R.id.btn_zero);
		
		btn_point=(Button) findViewById(R.id.btn_point);
		btn_deng=(Button) findViewById(R.id.btn_deng);
		btn_jia=(Button) findViewById(R.id.btn_jia);
		btn_jian=(Button) findViewById(R.id.btn_jian);
		btn_del=(Button) findViewById(R.id.btn_del);
		btn_dev=(Button) findViewById(R.id.btn_dev);
		btn_mul=(Button) findViewById(R.id.btn_mul);
		btn_clear=(Button) findViewById(R.id.btn_clear);
		
		edit_query=(EditText) findViewById(R.id.edit_query);
		
		btn_one.setOnClickListener(this);
		btn_two.setOnClickListener(this);
		btn_three.setOnClickListener(this);
		btn_four.setOnClickListener(this);
		btn_five.setOnClickListener(this);
		btn_six.setOnClickListener(this);
		btn_serven.setOnClickListener(this);
		btn_eight.setOnClickListener(this);
		btn_nine.setOnClickListener(this);
		btn_zero.setOnClickListener(this);
		
		btn_point.setOnClickListener(this);
		btn_deng.setOnClickListener(this);
		btn_jia.setOnClickListener(this);
		btn_jian.setOnClickListener(this);
		btn_del.setOnClickListener(this);
		btn_dev.setOnClickListener(this);
		btn_mul.setOnClickListener(this);
		btn_clear.setOnClickListener(this);
		
	}
	String result=edit_query.getText().toString();
	@Override
	public void onClick(View v) {	
		switch (v.getId()) {
		case R.id.btn_one:
		case R.id.btn_two:
		case R.id.btn_three:
		case R.id.btn_four:
		case R.id.btn_five:
		case R.id.btn_six:
		case R.id.btn_serven:
		case R.id.btn_eight:
		case R.id.btn_nine:
		case R.id.btn_zero:
		case R.id.btn_point:
			edit_query.setText(result+((Button)v).getText());
			break;
		case R.id.btn_jia:
		case R.id.btn_jian:
		case R.id.btn_dev:
		case R.id.btn_mul:
			edit_query.setText(result+" "+((Button)v).getText()+" ");
			break;
		case R.id.btn_clear:
			edit_query.setText("");
			break;
		case R.id.btn_del:
			if(result!=null&&!result.equals("")){
				edit_query.setText(result.substring(0, result.length()-1));
			}
			break;
		case R.id.btn_deng:
			js();
			break;
		default:
			break;
		}
		
	}

	private void js() {
		
		
	}
}
