package meng.app_main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import meng.app_library.TestEntity;

@Route(path = "/test/main")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void main(View view) {
        //        Routers.open(MainActivity.this,"module://me");
        //         1. 应用内简单的跳转(通过URL跳转在'进阶用法'中)
        ARouter.getInstance().build("/module/me")
                .withLong("key1", 666L)
                .withParcelable("entity",new TestEntity(666,"123"))
                .withString("key2", "888").navigation();
    }
}
