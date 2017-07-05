package meng.app_me;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import meng.app_library.TestEntity;

//@Router("me")
@Route(path = "/module/me")
public class MeActivity extends AppCompatActivity {

    @BindView(R2.id.tv_me)
    TextView mTvMe;
    @Autowired
    Long key1;
    @Autowired
    String key2;
    @Autowired
    TestEntity entity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);
        ButterKnife.bind(this);
        ARouter.getInstance().inject(this);
        //        key1=getIntent().getLongExtra("key1",-1);
        //        key2=getIntent().getStringExtra("key2");
        Log.e("MeActivity", "key1:" + key1);
        Log.e("MeActivity", key2);
        Log.e("MeActivity", entity.toString());
    }

    @OnClick(R2.id.tv_me)
    public void onClick() {
        Toast.makeText(this, "测试", Toast.LENGTH_SHORT).show();
    }


    //    @OnClick(R.id.tv_me)
    //    public void onClick() {
    //        Toast.makeText(this, "测试", Toast.LENGTH_SHORT).show();
    //    }
}
