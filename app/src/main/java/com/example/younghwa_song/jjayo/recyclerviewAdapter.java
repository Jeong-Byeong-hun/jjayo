package com.example.younghwa_song.jjayo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.ArrayList;

public class recyclerviewAdapter extends RecyclerView.Adapter<recyclerviewAdapter.ViewHolder> {

    private ArrayList<Word> mData = null ;

    public class ViewHolder extends RecyclerView.ViewHolder{
       TextView word, mean, speak;
       CheckBox cbSelect;

       ViewHolder(View itemView){
           super(itemView);
           word = itemView.findViewById(R.id.hsk_Word);
           mean = itemView.findViewById(R.id.hsk_Mean);
           speak = itemView.findViewById(R.id.hsk_Speak);
           cbSelect = itemView.findViewById(R.id.cbSelect);
       }

   }

    // 생성자에서 데이터 리스트 객체를 전달받음.
    recyclerviewAdapter(ArrayList<Word> list) {
        mData = list;
    }

    // onCreateViewHolder() - 아이템 뷰를 위한 뷰홀더 객체 생성하여 리턴.
    @Override
    public recyclerviewAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;

        View view = inflater.inflate(R.layout.recyclerview_hsk_item, viewGroup, false) ;
       recyclerviewAdapter.ViewHolder viewHolder = new recyclerviewAdapter.ViewHolder(view) ;


       return viewHolder;
    }


    // onBindViewHolder() - position에 해당하는 데이터를 뷰홀더의 아이템뷰에 표시.
    @Override
    public void onBindViewHolder(recyclerviewAdapter.ViewHolder holder, int position) {
        final Word text = mData.get(position) ;


        holder.word.setText(text.getCharacter()) ;
        holder.mean.setText(text.getMeaning()) ;
        holder.speak.setText(text.getPronunciation()) ;

        holder.cbSelect.setOnCheckedChangeListener(null);

        holder.cbSelect.setChecked(mData.get(position).getSelect());

        holder.cbSelect.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                text.setSelect(isChecked);
            }
        });

    }

    // getItemCount() - 전체 데이터 갯수 리턴.
    @Override
    public int getItemCount() {
        return mData.size() ;
    }
}
