package com.intern.cheatcamera;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author furyu
 *
 */
public class CheatCameraActivity extends Activity {
    /** Called when the activity is first created. */
	// commit test by 松谷　康子
	// commit test by mtbr
	private Button startBtn;// 偽着信画面へ
	private Button settingBtn;// 設定画面へ
	private Button playBtn;// 遊び方画面へ
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        startBtn = (Button)findViewById(R.id.button1);
        settingBtn = (Button)findViewById(R.id.button2);
        playBtn = (Button)findViewById(R.id.button3);
    }
    // 設定画面へ
    public void onClickSetting(View v){
    	 //次の画面に遷移させる
        Intent intent = new Intent();
        intent.setClassName(
                "com.intern.cheatcamera",
                "com.intern.cheatcamera.MenuList");
        startActivity(intent);
    }
    
}