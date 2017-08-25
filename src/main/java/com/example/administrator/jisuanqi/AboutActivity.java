package com.example.administrator.jisuanqi;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/8/25.
 */

public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //关联相关的布局文件
        setContentView(R.layout.activity_about);
        //获取版本的安装信息
        PackageManager manager = getPackageManager();
        PackageInfo info = null;
        //String version = null;
        try {
            info = manager.getPackageInfo(getPackageName(),0);
         //   String version = info.==  null?"Unknown":info.versionName;
        }catch (PackageManager.NameNotFoundException e)
        {
            e.printStackTrace();
        }
        //显示版本的相关信息
        /**if (info == null)
            version = getString(R.string.unknown);
        else
           version  = info.versionName;
         /**/
        String version = info == null ? getString(R.string.unknown): info.versionName;

        String message = String.format(getString(R.string.version_info),version);
        TextView ver = (TextView)findViewById(R.id.version_info);
        ver.setText(message);

    }

    //下面是返回计算器界面的逻辑代码
    /**
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        ActionBarDrawerToggle mDrawerToggle = null;
        mDrawerToggle.setDrawerIndicatorEnabled(false);
        if(mDrawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        switch (item.getItemId())
        {
            case android.R.id.home:     //按下ActionBar上的返回键回到上一页
                FragmentManager fm = getFragmentManager();
                if ((fm.getBackStackEntryCount()) > 0)
                {
                    fm.popBackStack();
                }
                break;
        }

        return super.onOptionsItemSelected(item);
    }
    /**/
}
