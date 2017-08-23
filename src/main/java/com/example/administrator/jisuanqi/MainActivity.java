package com.example.administrator.jisuanqi;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

        import org.javia.arity.Symbols;
        import org.javia.arity.SyntaxException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_0:
            case R.id.btn_1:
            case R.id.btn_2:
            case R.id.btn_3:
            case R.id.btn_4:
            case R.id.btn_5:;
            case R.id.btn_6:
            case R.id.btn_7:
            case R.id.btn_8:
            case R.id.btn_9:
            case R.id.btn_add:
            case R.id.btn_sub:
            case R.id.btn_mul:
            case R.id.btn_div:
            case R.id.btn_dot://（表达键）
            {
                //因为传过来的ID值都是view类型，故要将view类型强制转换成Button类型，然后传给Button变量
                Button btn = (Button) view;
                //通过按钮的（获取按钮上的文本）方法，将文本传给charSequence类型变量（省略），再通过这个变量的（转换成字符)方法传给字符串变量
                String Str_B = btn.getText().toString();
                //找到要显示的区域（TextView）的ID值，再转换成TextView类型，然后传给TextView变量
                TextView dis = (TextView) findViewById(R.id.text_disarea);
                //通过TextView（获取文本显示区中的文本）方法，将文本传递给charSequence类型变量（省略），再通过（转换成字符串）方法传递给字符串变量
                String Str_V = dis.getText().toString();
                //将按钮输入的字符串（现在输入的文本）和文本显示区域中的字符串（以前输入的文本）相组合起来成为新的字符串（即将显示的文本），然后传递给新的字符串变量
                String StrNew = Str_V + Str_B;
                //通过显示区域变量的（设置输入文本）方法，将这个新的字符串变量显示在文本显示区域中
                dis.setText(StrNew);
            }
            break;
            case R.id.btn_cle://（清空键）
            {
                TextView dis = (TextView)findViewById(R.id.text_disarea);
                dis.setText("");
                TextView res = (TextView)findViewById(R.id.text_resarea);
                res.setText("");
            }
            break;
            case R.id.btn_del://（删除键）
            {
                TextView dis = (TextView)findViewById(R.id.text_disarea);
                String Str_dis = dis.getText().toString();
                if (Str_dis.length() > 0) {
                    Str_dis = Str_dis.substring(0,Str_dis.length()-1);
                    dis.setText(Str_dis);
                }
            }
            break;
            case R.id.btn_equ://(等于键)
            {
                TextView dis = (TextView) findViewById(R.id.text_disarea);
                String Str_dis = dis.getText().toString();
                try {
                    Symbols s = new Symbols();
                    double result = s.eval(Str_dis);

                    TextView res = (TextView) findViewById(R.id.text_resarea);
                    res.setText(String.valueOf(result));
                }
                catch (SyntaxException e) {
                    Toast.makeText(this, "？你是猪吗",Toast.LENGTH_SHORT).show();
                }
            }
            break;
            default:break;
        }
    }
}

