# jisuanqi
这是我看安豆的视频写的第一个APP，哈哈哈<br>顺便当天学了下Readme.md的语法，给需要的朋友们！！
=================================================================================
在段落中填写 `[TOC]` 以显示全文内容的目录结构。

[TOC]


## 1.横线
空1行后，下面添加3个  - 或者  _ 或者  * 号，显示1条浅浅的横线

---

___

***


## 2.标题
一共有6个等级，文本前添加1个 # ，再加空格，表示一级标题，前面2个 # 表示二级坐标，以此类推...
# 这是一级标题（也是大标题）
## 这是2级标题（也是中标题）
### 这是3级标题
#### 这是4级标题
##### 这是5级标题
###### 这是6级标题
大标题（文本下面加 = ）
=
中标题（文本下面加 - ）
-

## 3.换行
文本要换行<br>记得在文本前面加上 \<br>
<br>(\为转义符号，将上面的\<br>显示出来时用)
<br>文本1
<br>文本2


## 4.排版样式(全部高亮)
    文本前面添加两个tab可以实现文本前留空格,添加tab也使文本高亮
    1 多行
     2 文本
      3 也是   
       4 这个
        5 道理


## 5.文本高亮
高亮部分用1对 \`（tab上方那个）包围起来<br>
这 是 一 个 `全 新` 的 `语 法` 结 构
<br>    `4`   8   `4`   3   <br>
高亮部分用3对 \`（tab上方那个）包围起来<br>
```
测试文本1<br>测试文本2<br>
测试文本3<br>测试文本4<br>
```
测试文本5<br>测试文本6<br>


## 6.插入符号
### 星号
*输入星号不加空格
### 实心圆点
*   前面1星号加空格
+   前面1加号加空格
-   前面1减号加空格
### 7.多级符号
共有3个等级的符号，实心圆形，空心圆形，实心方形
* 1个星号加空格（一级符号）<br>
  * 2个空格后加星号加空格（二级符号）<br>
    * 4个空格（即1个tab）后加星号加空格（三级符号）<br>


## 7.体、粗体、删除线
效果-->语法<br>
*斜体1*                    1对*<br>
**粗体1**	                 2对*<br>
***斜粗体1***	            3对*<br>

_斜体2_	                 1对_<br>
__粗体2__	                 2对_<br>
___斜粗体2___	            3对_<br>

~~删除线~~	                2对~<br>
***~~斜粗体删除线1~~***	  3对*加2对~<br>
~~***斜粗体删除线2***~~	  2对~加3对*<br>


## 8.缩进
每缩进1下就在前面添加1个\>
>数据结构<br>
此处添加数据结构的描述
>>树<br>
此处添加树的描述
>>>二叉树<br>
此处添加二叉树的描述  
>>>>平衡二叉树<br>
### 此处添加对平衡二叉树的描述  
>>>>>满二叉树<br>
此处添加满忙二叉树的描述


## 9.插入公式
$$E=mc^2$$


## 10.插入代码段
```Java
public static void main)(String[]arge){
    System.output.printfln("Hello java");                                   //Java
}
```

```C
int main (int arge, char *argv[])
{     
    printf("Hello C!");                                                     //C
    return 0;
}
```

```Bash
echo "Hello GitHub"                                                         #bash
```

```Javascript
document.getElementById("myH1").innerHTML="Welcome to my Homepage";         //Javascript
```

```C++
string &operator+(const string& A,const string B)                           //cpp
```

```Python
@requires_authorization                                                                                        
class SomeClass:                                                            //python
    pass                                                                
if __name__ == '__main__':
    # A comment
    print 'Hello Python'
```


## 11.列表标记
#### 方法1（MD）
1. Bird
2. McHale
3. Parish
#### 方法2(原始)
<ol>
<li>Bird</li>
<li>McHale</li>
<li>Parish</li>
</ol>


## 12.办事列表[Todo 列表](https://www.zybuluo.com/mdeditor?url=https://www.zybuluo.com/static/editor/md-help.markdown#13-待办事宜-todo-列表)
格式：\- \[]文本，如若是打√，则是向方括号内写x
- [ ] 支持以 PDF 格式导出文稿
- [ ] 改进 Cmd 渲染算法，使用局部渲染技术提高渲染效率
- [x] 新增 Todo 列表功能
- [x] 修复 LaTex 公式渲染问题
- [x] 新增 LaTex 公式编号功能


### 13.插入表格
格式：\|AAA  \| BBB  \|  CCC  \|<br>
| 项目        | 价格    |  数量 |<br>
| --------  | -----:  | :----:|<br>
| 计算机     | \$1600  |   5   |<br>
| 手机       |   \$12  |   12  |<br>
| 管线       |    \$1   |  234 |<br>



## 14.显示图片
### 显示网络（外部url）的图片<br>
#### 方法1
`格式:`!\[标识](链接地址 "停留文本")    (添加感叹号能显示出图片)
<br>编辑工具栏:<br>
![tool-editor](https://www.zybuluo.com/static/img/toolbar-editor.png "好牛逼的样子")
<br>管理工具栏:<br>
![tool-manager](https://www.zybuluo.com/static/img/toolbar-manager.jpg "同意的样子")
<br>阅读工具栏:<br>
![tool-reader](https://www.zybuluo.com/static/img/toolbar-reader.jpg "我不是打广告的")
<br>如下图所示:<br>
![file-list](https://www.zybuluo.com/static/img/file-list.png "负责收集图片吧，哈哈哈")
<br>以下是百度logo：<br>
![baidu](http://www.baidu.com/img/bdlogo.gif "百度logo")
#### 方法2
`格式:`!\[标识][URL标识]（两个方括号中间不要加空格）
<br>
![baidu][baidulogo]
>使用URL标识符能达到复用的目的，一般把全文所有的URL标识符统一放在文章末尾，这样看起来比较干净。



### 显示仓库（github）的图片<br>
![计算器里的图片](https://github.com/Dshidai/jisuanqi/blob/master/src/main/res/mipmap-hdpi/ic_launcher.png "什么鬼")


## 15.超链接
`文本格式:`\[文本内容](链接地址 "停留文本")
<br>
[D时代的Github](https://github.com/Dshidai "haha") 
<br>
`图片格式:`\[图片标识](链接地址 "停留文本")
<br>
[D时代的GitHub]：(https://github.com/Dshidai "哈哈") 
<br> 


### 16.插入[流程图](https://www.zybuluo.com/mdeditor?url=https://www.zybuluo.com/static/editor/md-help.markdown#7-流程图)
```flow
st=>start: Start
op=>operation: Your Operation
cond=>condition: Yes or No?
e=>end
st->op->cond
cond(yes)->e
cond(no)->op
```
### 17.插入[序列图](https://www.zybuluo.com/mdeditor?url=https://www.zybuluo.com/static/editor/md-help.markdown#8-序列图)
```seq
Alice->Bob: Hello Bob, how are you?
Note right of Bob: Bob thinks
Bob-->Alice: I am good thanks!
```
### 18.插入[甘特图](https://www.zybuluo.com/mdeditor?url=https://www.zybuluo.com/static/editor/md-help.markdown#9-甘特图)
```gantt
    title 项目开发流程
    section 项目确定
        需求分析       :a1, 2016-06-22, 3d
        可行性报告     :after a1, 5d
        概念验证       : 5d
    section 项目实施
        概要设计      :2016-07-05  , 5d
        详细设计      :2016-07-08, 10d
        编码          :2016-07-15, 10d
        测试          :2016-07-22, 5d
    section 发布验收
        发布: 2d
        验收: 3d
```


## 19.注脚

使用 [^keyword] 表示注脚。

这是一个注脚[^footnote1]的样例。

这是第二个注脚[^footnote2]的样例。

## 20.
再一次感谢您花费时间阅读这份欢迎稿，点击 <i class="icon-file"></i> (Ctrl+Alt+N) 开始撰写新的文稿吧！祝您在这里记录、阅读、分享愉快！
作者 [@Linyu][3]     
2017 年 08月 25日    

[1]: https://www.zybuluo.com/mdeditor?url=https://www.zybuluo.com/static/editor/md-help.markdown
[2]: https://www.zybuluo.com/mdeditor?url=https://www.zybuluo.com/static/editor/md-help.markdown#cmd-markdown-高阶语法手册
[3]: http://weibo.com/Dshidai
[4]: http://meta.math.stackexchange.com/questions/5020/mathjax-basic-tutorial-and-quick-reference
[baidulogo]:http://www.baidu.com/img/bdlogo.gif "百度logo"





-----------------------------------------------------------------------------------------------
