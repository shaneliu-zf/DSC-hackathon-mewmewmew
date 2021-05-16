package com.studio_alvitr.remote_store;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int current_store = 0;
    int current_product = 0;

    ArrayList<Store> stores= new ArrayList<Store>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.store_page);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.ico);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        stores.add(new Store("防疫物資商店"));
        stores.add(new Store("海產店"));
        stores.add(new Store("書店"));

        stores.get(0).addItem(new Item("口罩","哇 大家聽說了嗎?\n" +
                "單日確診病例高達185人OAOAO\n" +
                "不戴口罩出門的人是想參訪負壓隔離病房嗎?\n" +
                "不過你以為這是普通的口罩嗎?\n" +
                "那就錯了!\n" +
                "戴上本商場的口罩會提升顏值\n" +
                "能保護自己不受病毒騷擾\n" +
                "可以讓天生面癱的人不用辛苦的擠出表情\n" +
                "看到可愛的學妹還不用刻意控制上揚的嘴角\n" +
                "這麼棒的商品\n" +
                "快手刀下單！",499,R.mipmap.store1_exam1));

        stores.get(0).addItem(new Item("消毒液",
                "防疫必備三元素: 消毒液、口罩、社交距離\n" +
                "缺少一項就無法發動大招消滅病毒\n" +
                "還不快搶購起來!!!((奔",199,R.mipmap.store1_exam2));

        stores.get(0).addItem(new Item("衛生紙",
                "人類生存三要素：手機、WIFI和行充\n" + "但是在生活中，被大家忽略的第四元素----衛生紙\n" +
                "無論是上完廁所，抑或是換季過敏，沒有衛生紙的幫助，生活可謂是難上加難\n" +
                "想要方便生活嗎?那就快點買包衛生紙吧!",599,R.mipmap.store1_exam3));

        stores.get(1).addItem(new Item("鯛魚",
                "台灣除了有台灣黑熊、台灣鳳梨\n" +
                "別忘了還有台灣鯛(吳郭魚)阿\n" +
                "疫情當前\n" +
                "台灣特產購起來",299,R.mipmap.store2_exam1));

        stores.get(1).addItem(new Item("鱸魚",
                "釣魚釣魚釣到什麼魚?看我釣到一隻大鱸魚!\n" +
                "鮮甜肥美的鱸魚蒸煮炒炸樣樣行，隨購隨享新鮮冷凍的好吃鱸魚\n" +
                "心動不如馬上行動！！",399,R.mipmap.store2_exam2));

        stores.get(1).addItem(new Item("蝦子","喜歡吃蝦卻不想動手剝殼嗎?\n" +
                "這裡有滿滿一包剝好殼的蝦子ouo\n" +
                "根本就是懶人救星!",499,R.mipmap.store2_exam3));

        stores.get(2).addItem(new Item("哈利波特","歡迎來到霍格華茲的魔法世界\n" +
                "打開這本書，你不會學會製作魔藥的技能，也不會騎著掃帚飛上天，更不會拿出魔杖施展魔法\n" +
                "但是，你可以看哈利波特完成這些事ouo\n" +
                "這麼優質的做夢素材還不手刀買起來！",799,R.mipmap.store3_exam1));

        stores.get(2).addItem(new Item("科學實驗王","擁有這本書\n" +
                "你可能還是沒有辦法寫出完美的實驗預報，也沒有辦法記得多少化學知識\n" +
                "但絕對可以知道人與人之間的差距有多大\n" +
                "想看自己跟國小小朋友的能力差多少嗎?\n" +
                "那就不要猶豫了，快點買下這本書吧!",699,R.mipmap.store3_exam2));
        update();
    }
    public void viewClick(View view){
        printItem(stores.get(current_store).getItem(current_product));
    }
    public void leftClick(View view){
        current_product-=1;
        update();
    }
    public void rightClick(View view){
        current_product+=1;
        update();
    }
    public void lastStore(View view){
        current_store-=1;
        enterStore();
    }
    public void nextStore(View view){
        current_store+=1;
        enterStore();
    }

    void alertDialog(String title,String message,String button){
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setTitle(title);
        alert.setMessage(message);
        alert.setPositiveButton(button,(dialog, which) -> {});
        alert.show();
    }
    void enterStore(){
        current_product=0;
        current_store+=stores.size();
        current_store%=stores.size();

        Toast toast=Toast.makeText(MainActivity.this,"您即將進入："+stores.get(current_store).name,Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

        update();
    }
    void printItem(Item item){alertDialog(item.name,item.description+"\n\n"+"價錢："+item.price,"確定");}
    void update(){
        ImageView imageview=(ImageView)findViewById(R.id.imageView);
        TextView textView=(TextView)findViewById(R.id.textView);

        current_product+=stores.get(current_store).size();
        current_product%=stores.get(current_store).size();
        imageview.setImageResource(stores.get(current_store).getItem(current_product).image);
        textView.setText("歡迎光臨"+stores.get(current_store).name+"\n您現在瀏覽的是"+stores.get(current_store).getItem(current_product).name);
    }
}
class Store{
    public String name;
    public ArrayList<Item>items=new ArrayList<Item>();
    public Item getItem(int index){return items.get(index);}
    public void addItem(Item item){items.add(item);}
    public int size(){return items.size();}
    public Store(String _name){
        name=_name;
    }
}
class Item{
    public String name,description;
    public int price,image;
    public Item(String _name,String _description,int _price,int _image){
        name=_name;
        description=_description;
        price=_price;
        image=_image;
    }
}