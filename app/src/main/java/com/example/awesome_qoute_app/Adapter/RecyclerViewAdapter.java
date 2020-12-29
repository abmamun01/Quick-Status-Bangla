package com.example.awesome_qoute_app.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.awesome_qoute_app.R;
import com.example.awesome_qoute_app.RecyclerModel.RecyclerModel;

import org.w3c.dom.Text;

import java.util.ArrayList;





public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    private Context context;
    private ArrayList<RecyclerModel> recyclerModelArrayList;

    public RecyclerViewAdapter(Context context, ArrayList<RecyclerModel> recyclerModelArrayList) {
        this.context = context;
        this.recyclerModelArrayList = recyclerModelArrayList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.quote_sample,parent,false  );
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        holder.imageView1.setImageResource(recyclerModelArrayList.get(position).getImage1());
        holder.imageView2.setImageResource(recyclerModelArrayList.get(position).getImage2());
        holder.imageView3.setImageResource(recyclerModelArrayList.get(position).getImage3());
        holder.quote.setText(recyclerModelArrayList.get(position).getQoute());

        holder.save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Saved!",Toast.LENGTH_SHORT).show();
            }
        });

        holder.copy_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context,"Copy!",Toast.LENGTH_SHORT).show();

            }
        });

        holder.sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Shared!",Toast.LENGTH_SHORT).show();

            }
        });


    }

    @Override
    public int getItemCount() {
        return recyclerModelArrayList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView1,imageView2,imageView3;
        TextView quote;

        LinearLayout save_btn,copy_btn,sharebtn;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);


            imageView1=itemView.findViewById(R.id.sample_Left_quote_id  );
            imageView2=itemView.findViewById(R.id.sample_right_quote_id);
            imageView3=itemView.findViewById(R.id.samplemainimage);
            quote=itemView.findViewById(R.id.quoteid);

            save_btn=itemView.findViewById(R.id.sample_save_id);
            copy_btn=itemView.findViewById(R.id.sample_copy_id);
            sharebtn=itemView.findViewById(R.id.sample_share_id);






        }


    }
}
