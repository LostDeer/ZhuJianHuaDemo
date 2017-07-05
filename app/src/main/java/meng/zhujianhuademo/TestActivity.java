package meng.zhujianhuademo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by LiChaoBo on 2017/7/4.
 */

public class TestActivity extends AppCompatActivity {
//    @BindView(R.id.tvs)
//    TextView mTvs;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tes);
        ButterKnife.bind(this);
    }

//    @OnClick(R.id.tvs)
//    public void onClick() {
//    }
}
