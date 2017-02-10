package com.videoview.lh.videoview;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        videoView = (VideoView) findViewById(R.id.videoView);
        /*
        本地视频播放
        */
//        videoView.setVideoPath("");

        /*
        网络播放
         */
        videoView.setVideoURI(Uri.parse("http://192.168.1.60:8080/ttttttttt/hyrz.mp4"));


        /*
        系统自带的控制 视频的界面  MediaController
         */
        MediaController mediaController = new MediaController(this);

        /*
        videoView 和 mediacontroller 关联
         */

        videoView.setMediaController(mediaController);

        /*
        mediacontroller 与videoView简历关联
         */
        mediaController.setMediaPlayer(videoView);
    }
}
