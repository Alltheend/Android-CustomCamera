# CustomCamera([中文说明](https://github.com/jinguangyue/CustomCamera/blob/master/README_CN.md))
It's a custom Camera Project. Now it includes Basic camera functions. Then I Will fill many functions. E.g Front and rear mirror switch， Flash Mode， Delay shooting， Square viewfinder，Then i will Add watermark effect and Camera2 Api.

You can download the apk file folder , and then install the apk demo

If you want to define your own interface , then you can view the detailed CameraActivity and change its layout file activity_camera.xml.

**some Code Explanation**
```
//Test Android studio markdown
private Camera getCamera(int id){
        Camera camera = null;
        try{
            camera = Camera.open(id);
        }catch (Exception e){

        }
        return camera;
    }
```

