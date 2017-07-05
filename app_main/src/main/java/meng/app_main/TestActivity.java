package meng.app_main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by LiChaoBo on 2017/7/4.
 */
@Route(path="/test/testactivity")
public class TestActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void test(View view){
        ARouter.getInstance().build("/test/meactivity").navigation();
    }
}
