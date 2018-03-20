package cn.edu.gdmec.android.myapplication;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Timer;
import java.util.TimerTask;

import cn.edu.gdmec.android.myapplication.activity.LoginActivity;

public class MainActivity extends AppCompatActivity {
    private TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        content=findViewById(R.id.content);
        Intent intent=new Intent(MainActivity.this,LoginActivity.class);
        startActivityForResult(intent,1);




    }
//    private void init(){
//
//        //利用timer使界面延迟三秒后跳转，timer有一个线程，这个线程不断执行task
//        Timer timer = new Timer();
//        //实timertask现runable接口， TimerTask表示在一个指定时间内执行的task
//        TimerTask task = new TimerTask() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
//                startActivity(intent);
//                MainActivity.this.finish();
//            }
//        };
//        timer.schedule(task,3000);//手中这个task在延迟三秒后自动执行
//    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (data!=null){

//            if (!TextUtils.isEmpty(userName)){
            String userName = data.getStringExtra("uu");
                Toast.makeText(MainActivity.this,"登陆成功："+userName, Toast.LENGTH_SHORT).show();
content.setText(userName);

                //设置光标的位置
              //  content.setSelection(userName.length());
//            }
        }
    }
}
