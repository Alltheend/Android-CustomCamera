# CustomCamera([中文说明](https://github.com/jinguangyue/CustomCamera/blob/master/README_CN.md))
It's a custom Camera Project. Now it includes Basic camera functions. Then I Will fill many functions. E.g Front and rear mirror switch， Flash Mode， Delay shooting， Square viewfinder，Then i will Add watermark effect and Camera2 Api.

You can download the apk file folder , and then install the apk demo

**If you want to define your own interface , then you can view the detailed CameraActivity and change its layout file activity_camera.xml.**

**[DownLoad Apk](https://github.com/jinguangyue/Android-CustomCamera/blob/master/apk/CustomCamera.apk?raw=true)**


**Some notes**

In My MainActivity Such calls:

```
CameraUtil.getInstance().camera(MainActivity.this);
```

Then onActivityResult get the picture returned , you can also create your Activity calls like this.
```
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);

    if(resultCode != AppConstant.RESULT_CODE.RESULT_OK){
        return;
    }

    if(requestCode == AppConstant.REQUEST_CODE.CAMERA){
        String img_path = data.getStringExtra(AppConstant.KEY.IMG_PATH);
        int picWidth = data.getIntExtra(AppConstant.KEY.PIC_WIDTH, 0);
        int picHeight = data.getIntExtra(AppConstant.KEY.PIC_HEIGHT, 0);
                
        img.setLayoutParams(new RelativeLayout.LayoutParams(picWidth, picHeight));
        img.setImageURI(Uri.parse(img_path));
    }
}
```

#Note: If you do not need to cut the square ffmpeg video works can be removed to reduce the apk volume


## 关注我的 Google Play 独立开发公众号
## 通过从零到一在 Google Play 开发出下载量 300万 APP 的经历，我将把很多精彩的故事分享到公众号，扫描下方二维码和我一起开发 APP 赚美元吧！
<img src="https://img-blog.csdnimg.cn/20190221223739781.jpg" width="252" height="252">
