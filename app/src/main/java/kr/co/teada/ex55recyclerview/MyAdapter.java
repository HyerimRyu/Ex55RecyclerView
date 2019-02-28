package kr.co.teada.ex55recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter {

    ArrayList<String> datas;
    LayoutInflater inflater;

    //1. 생성자 alt insult
    public MyAdapter(ArrayList<String> datas, LayoutInflater inflater) {
        this.datas = datas;
        this.inflater = inflater;
    }

    //2. 재활용할 뷰가 없으면 자동으로 호출되는 메소드 --(재활용 될 때만 호출)
    //이 메소드 안에서 아이템뷰를 만드는 작업 코딩

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        //항목 하나의 뷰 객체 생성
        View itemView=inflater.inflate(R.layout.list_item, viewGroup, false);

        //뷰홀더 객체 생성!__아래 innerclass
        VH holder=new VH(itemView);

        //홀더객체를 리턴
        return holder;
    }


    //3. 현재 뷰에 아이템의 값들 연결하는 메소드
    //아이템(항목) 마다마다 호출됨--(매번 호출)
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        //데이터와 ViewHolder 객체 멤버변수로 존재하는 참조변수들에 값 연결

        String data=datas.get(position);

        VH vh=(VH)viewHolder;  //다운캐스팅
        vh.tv.setText(data);

    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    //inner class
    class VH extends RecyclerView.ViewHolder {  //애니멀 상속받아서 도그 만든겨

        TextView tv;

        public VH(@NonNull View itemView) {
            super(itemView);

            tv=itemView.findViewById(R.id.tv);
        }
    }

}
