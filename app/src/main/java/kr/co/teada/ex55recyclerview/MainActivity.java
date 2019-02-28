package kr.co.teada.ex55recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> datas=new ArrayList<>();

    RecyclerView rv;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1. 대량의 데이터 준비
        datas.add(new String("aaa"));
        datas.add(new String("bbb"));
        datas.add(new String("ccc"));
        datas.add(new String("ddd"));
        datas.add(new String("eee"));
        datas.add(new String("fff"));
        datas.add(new String("aaa"));
        datas.add(new String("bbb"));
        datas.add(new String("ccc"));
        datas.add(new String("ddd"));
        datas.add(new String("eee"));
        datas.add(new String("fff"));
        datas.add(new String("aaa"));
        datas.add(new String("bbb"));
        datas.add(new String("ccc"));
        datas.add(new String("ddd"));
        datas.add(new String("eee"));
        datas.add(new String("fff"));

        //2. list_item.xml 설계, 3. MyAdapter.java 설계

        //4.
        rv=findViewById(R.id.recycler);
        adapter=new MyAdapter(datas, getLayoutInflater());
        rv.setAdapter(adapter);

        //5. 리사이클러뷰는 뷰(항목)들의 배치를 어떻게 할 지 설정해 줘야 해 (listView 와 GridView 를 섞은거라서 방향 정해줘야해)-->LayoutManager 필요  -- .xml에서도 가능!
//        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//        rv.setLayoutManager(layoutManager);
    }
}
