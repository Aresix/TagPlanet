### **Tips for revision：Disign not only a framework**

#### **1、Change Entity：Remove ```List``` object from entity**

Before change：

```Java
public class Classroom {
    private int class_id;
    private String class_name;
    private List<User> mUserList;
    private List<Integer> rsc_tag_id;

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public List<User> getUserList() {
        return mUserList;
    }

    public void setUserList(List<User> userList) {
        mUserList = userList;
    }

    public List<Integer> getRsc_tag_id() {
        return rsc_tag_id;
    }

    public void setRsc_tag_id(List<Integer> rsc_tag_id) {
        this.rsc_tag_id = rsc_tag_id;
    }
}
```

After Change：

```Java
public class Classroom {
    private int class_id;
    private String class_name;

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

}
```

**Tips：such changes may lead to some errors in other files, try to fix them！**

**Questions：why does class ```Image``` in ```Image.java``` have contribution ```String image_url```? **

#### **2、Prepare to connect to the back end（后端）：Write some useful annotation**

In ```PlanetCategoryActivity.java```：

* Where does the images come from？From back end!
* How to check if the invoke（调用） is success? Maybe is known now.
* How to due with the exception if database goes wrong? Retry or other method.

try to fix the code into following style：

```Java
const static int TEST = 1;
private static List<Image> images = Null;

if (Test)
{
    images = initData();
}
else
{
    /*
     *   download images by tag
     *   input: tag_id
     *   output: list<Image>
     */
}

public void initData()
{
    List<Image> images = Null;
    Image image = new Image(...)
    //you can use image from baidu as test image!
    ...
    return images
}
```

**Tips 1：Try to merge ```entity``` into ```activity``` and ```adapter```**

**Tips 2：Implement Download Image from url for test**

for reference：

```Java
public static Bitmap getBitmapFromUrl(final String url)
{
    URL myFileUrl = null;
    Bitmap bitmap = null;
    try {
        myFileUrl = new URL(url);
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
    try {
        HttpURLConnection conn = (HttpURLConnection) myFileUrl
                .openConnection();
        conn.setDoInput(true);
        conn.connect();
        InputStream is = conn.getInputStream();
        bitmap = BitmapFactory.decodeStream(is);
        is.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    return bitmap;
}
```

**Tips 3：How to get image url?**

Step 1：find a image network：https://image.baidu.com

Step 2：search something like cats：https://image.baidu.com/search/index?tn=baiduimage&ipn=r&ct=201326592&cl=2&lm=-1&st=-1&fm=result&fr=&sf=1&fmq=1580973198457_R&pv=&ic=&nc=1&z=&hd=&latest=&copyright=&se=1&showtab=0&fb=0&width=&height=&face=0&istype=2&ie=utf-8&sid=&word=%E7%8C%AB

Step 3：select an image and click it：https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E7%8C%AB&step_word=&hs=0&pn=3&spn=0&di=56430&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=2&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=-1&cs=1340038759%2C2253650778&os=4061713716%2C1127242320&simid=3464342663%2C347091280&adpicid=0&lpn=0&ln=1813&fr=&fmq=1580973198457_R&fm=result&ic=&s=undefined&hd=&latest=&copyright=&se=&sme=&tab=0&width=&height=&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fn.sinaimg.cn%2Fsinacn15%2F275%2Fw640h435%2F20181010%2Fcaba-hkrzvkw4936632.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fh_z%26e3Bftgw_z%26e3Bv54_z%26e3BvgAzdH3Fw6ptvsj_m9nnbnlcad_80u0vllbjaa8aau1x1_z%26e3Bip4s&gsm=&rpstart=0&rpnum=0&islist=&querylist=&force=undefined

Step 4：press ```F12``` or ```FN + F12``` to find the ```html``` file of the website

Step 5：find ```<img id="..." ... src="..." ...>``` in the html file

Step 6：double click ```src``` to copy to url of the image：https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1581578052&di=cb4ccb9774c2128dc471fa78afb17dd1&imgtype=jpg&er=1&src=http%3A%2F%2Fn.sinaimg.cn%2Fsinacn15%2F275%2Fw640h435%2F20181010%2Fcaba-hkrzvkw4936632.jpg

Step 7：download the image into ```Bitmap``` using the code above

**Advance Tip：try to minimize the total effort of revising your code if the requirement changes from downloading image from url into decoding images from a String（Something related to objected oriented analysis and design~）** 

## **General Tip：Free for revision！You have ```github``` now！**














