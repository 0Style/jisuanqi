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
- [ ] 支持以 PDF 格式导出文稿
- [ ] 改进 Cmd 渲染算法，使用局部渲染技术提高渲染效率
- [x] 新增 Todo 列表功能
- [x] 修复 LaTex 公式渲染问题
- [x] 新增 LaTex 公式编号功能


### 13.插入表格
格式：\|AAA  \| BBB  \|  CCC  \|<br>
| 项目        | 价格   |  数量  |<br>
| --------   | -----:  | :----:  |<br>
| 计算机     | \$1600 |   5     |<br>
| 手机        |   \$12   |   12   |<br>
| 管线        |    \$1    |  234  |<br>



## 14.插入图片
`格式:`!\[标识](链接地址 "停留文本")(添加感叹号能显示出图片)

### 显示网络（外部url）的图片<br>
#### 方法1
![baidu](http://www.baidu.com/img/bdlogo.gif "百度logo")
#### 方法2
![baidu][baidulogo]:http://www.baidu.com/img/bdlogo.gif "百度logo"
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

这是一个注脚[^footnote]的样例。

这是第二个注脚[^footnote2]的样例。



## 什么是 Cmd Markdown

您可以使用很多工具书写 Markdown，但是 Cmd Markdown 是这个星球上我们已知的、最好的 Markdown 工具——没有之一 ：）因为深信文字的力量，所以我们和你一样，对流畅书写，分享思想和知识，以及阅读体验有极致的追求，我们把对于这些诉求的回应整合在 Cmd Markdown，并且一次，两次，三次，乃至无数次地提升这个工具的体验，最终将它演化成一个 **编辑/发布/阅读** Markdown 的在线平台——您可以在任何地方，任何系统/设备上管理这里的文字。

### 1. 实时同步预览

我们将 Cmd Markdown 的主界面一分为二，左边为**编辑区**，右边为**预览区**，在编辑区的操作会实时地渲染到预览区方便查看最终的版面效果，并且如果你在其中一个区拖动滚动条，我们有一个巧妙的算法把另一个区的滚动条同步到等价的位置，超酷！

### 2. 编辑工具栏

也许您还是一个 Markdown 语法的新手，在您完全熟悉它之前，我们在 **编辑区** 的顶部放置了一个如下图所示的工具栏，您可以使用鼠标在工具栏上调整格式，不过我们仍旧鼓励你使用键盘标记格式，提高书写的流畅度。

![tool-editor](https://www.zybuluo.com/static/img/toolbar-editor.png)

### 3. 编辑模式

完全心无旁骛的方式编辑文字：点击 **编辑工具栏** 最右侧的拉伸按钮或者按下 `Ctrl + M`，将 Cmd Markdown 切换到独立的编辑模式，这是一个极度简洁的写作环境，所有可能会引起分心的元素都已经被挪除，超清爽！

### 4. 实时的云端文稿

为了保障数据安全，Cmd Markdown 会将您每一次击键的内容保存至云端，同时在 **编辑工具栏** 的最右侧提示 `已保存` 的字样。无需担心浏览器崩溃，机器掉电或者地震，海啸——在编辑的过程中随时关闭浏览器或者机器，下一次回到 Cmd Markdown 的时候继续写作。

### 5. 离线模式

在网络环境不稳定的情况下记录文字一样很安全！在您写作的时候，如果电脑突然失去网络连接，Cmd Markdown 会智能切换至离线模式，将您后续键入的文字保存在本地，直到网络恢复再将他们传送至云端，即使在网络恢复前关闭浏览器或者电脑，一样没有问题，等到下次开启 Cmd Markdown 的时候，她会提醒您将离线保存的文字传送至云端。简而言之，我们尽最大的努力保障您文字的安全。

### 6. 管理工具栏

为了便于管理您的文稿，在 **预览区** 的顶部放置了如下所示的 **管理工具栏**：

![tool-manager](https://www.zybuluo.com/static/img/toolbar-manager.jpg)

通过管理工具栏可以：

<i class="icon-share"></i> 发布：将当前的文稿生成固定链接，在网络上发布，分享
<i class="icon-file"></i> 新建：开始撰写一篇新的文稿
<i class="icon-trash"></i> 删除：删除当前的文稿
<i class="icon-cloud"></i> 导出：将当前的文稿转化为 Markdown 文本或者 Html 格式，并导出到本地
<i class="icon-reorder"></i> 列表：所有新增和过往的文稿都可以在这里查看、操作
<i class="icon-pencil"></i> 模式：切换 普通/Vim/Emacs 编辑模式

### 7. 阅读工具栏

![tool-manager](https://www.zybuluo.com/static/img/toolbar-reader.jpg)

通过 **预览区** 右上角的 **阅读工具栏**，可以查看当前文稿的目录并增强阅读体验。

工具栏上的五个图标依次为：

<i class="icon-list"></i> 目录：快速导航当前文稿的目录结构以跳转到感兴趣的段落
<i class="icon-chevron-sign-left"></i> 视图：互换左边编辑区和右边预览区的位置
<i class="icon-adjust"></i> 主题：内置了黑白两种模式的主题，试试 **黑色主题**，超炫！
<i class="icon-desktop"></i> 阅读：心无旁骛的阅读模式提供超一流的阅读体验
<i class="icon-fullscreen"></i> 全屏：简洁，简洁，再简洁，一个完全沉浸式的写作和阅读环境

### 8. 阅读模式

在 **阅读工具栏** 点击 <i class="icon-desktop"></i> 或者按下 `Ctrl+Alt+M` 随即进入独立的阅读模式界面，我们在版面渲染上的每一个细节：字体，字号，行间距，前背景色都倾注了大量的时间，努力提升阅读的体验和品质。

### 9. 标签、分类和搜索

在编辑区任意行首位置输入以下格式的文字可以标签当前文档：

标签： 未分类

标签以后的文稿在【文件列表】（Ctrl+Alt+F）里会按照标签分类，用户可以同时使用键盘或者鼠标浏览查看，或者在【文件列表】的搜索文本框内搜索标题关键字过滤文稿，如下图所示：

![file-list](https://www.zybuluo.com/static/img/file-list.png)

### 10. 文稿发布和分享

在您使用 Cmd Markdown 记录，创作，整理，阅读文稿的同时，我们不仅希望它是一个有力的工具，更希望您的思想和知识通过这个平台，连同优质的阅读体验，将他们分享给有相同志趣的人，进而鼓励更多的人来到这里记录分享他们的思想和知识，尝试点击 <i class="icon-share"></i> (Ctrl+Alt+P) 发布这份文档给好友吧！

------

再一次感谢您花费时间阅读这份欢迎稿，点击 <i class="icon-file"></i> (Ctrl+Alt+N) 开始撰写新的文稿吧！祝您在这里记录、阅读、分享愉快！

作者 [@ghosert][3]     
2016 年 07月 07日    

[^LaTeX]: 支持 **LaTeX** 编辑显示支持，例如：$\sum_{i=1}^n a_i=0$， 访问 [MathJax][4] 参考更多使用方法。

[^code]: 代码高亮功能支持包括 Java, Python, JavaScript 在内的，**四十一**种主流编程语言。

[1]: https://www.zybuluo.com/mdeditor?url=https://www.zybuluo.com/static/editor/md-help.markdown
[2]: https://www.zybuluo.com/mdeditor?url=https://www.zybuluo.com/static/editor/md-help.markdown#cmd-markdown-高阶语法手册
[3]: http://weibo.com/ghosert
[4]: http://meta.math.stackexchange.com/questions/5020/mathjax-basic-tutorial-and-quick-reference






-----------------------------------------------------------------------------------------------
