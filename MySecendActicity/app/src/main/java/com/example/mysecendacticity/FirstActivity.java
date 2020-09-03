package com.example.mysecendacticity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frist_layout);
        Button button1=(Button) findViewById(R.id.button1);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override public void onClick(View v) {
//                Toast.makeText(FirstActivity.this, "You clicked Button 1", Toast.LENGTH_SHORT).show(); }
//        });
        //销毁一个activity
//        button1.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v){
//                        finish(); }
//          });
//        button1.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        //第一个参数Context 要求提供一个启动活动的上下文， 第二个参数Class 则是指定想要启动的目标活动
//                        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                        startActivity(intent);
//                    }
//        });
//        button1.setOnClickListener(
////                new View.OnClickListener() {
////                    @Override
////                    public void onClick(View v) {
////                        Intent intent = new Intent("com.example.activitytest.ACTION_START");
////                        //这会导致程序崩溃！！
////                        intent.addCategory("com.example.activitytest.MY_CATEGORY");
////                        startActivity(intent);
////                    }
////        });
//        button1.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Intent intent = new Intent(Intent.ACTION_VIEW);
//                        //过Uri.parse() 方法，将一个 网址字符串解析成一个Uri 对象
//                        //对setData()它接收一个Uri 对象，主要用于指定当前Intent正在操作的数据，而这些数据通 常都是以字符串的形式传入到Uri.parse() 方法中解析产生的
//                        intent.setData(Uri.parse("tel:10086"));
//                        startActivity(intent); }
//                });
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            //Intent中提供了一系列putExtra() 方法的重载，可以把 我们想要传递的数据暂存在Intent中，启动了另一个活动后，只需要把这些数据再从Intent中取出 就可以了
//            public void onClick(View v) {
//                String data = "Hello SecondActivity";
//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                intent.putExtra("extra_data", data);
//                startActivity(intent);
//            }
//        });
        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                        startActivityForResult(intent, 1); }
                });


    }
    @Override
    //菜单可见
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    //菜单响应时间
    public boolean onOptionsItemSelected(MenuItem item) {
        //使用item.getItemId()判断使用哪个菜单项
        switch (item.getItemId()){
        case R.id.add_item:
            Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();
            break;
        case R.id.remove_item:
            Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show();
            break;
            default:
        }
        return true;
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("FirstActivity", returnedData);
                }
                break;
            default:
        }
    }
}