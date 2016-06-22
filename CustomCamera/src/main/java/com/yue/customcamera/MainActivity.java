package com.yue.customcamera;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.yue.customcamera.utils.CameraUtil;

public class MainActivity extends Activity {

    private Button btn_camera;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn_camera = (Button)findViewById(R.id.btn_camera);
        img = (ImageView)findViewById(R.id.img);
        btn_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CameraUtil.getInstance().camera(MainActivity.this);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode != AppConstant.RESULT_CODE.RESULT_OK){
            return;
        }

        if(requestCode == AppConstant.REQUEST_CODE.CAMERA){
            String img_path = data.getStringExtra(AppConstant.KEY.IMG_PATH);
            img.setImageURI(Uri.parse(img_path));
        }
    }
}
