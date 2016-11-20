package id.sch.smktelkom_mlg.project.xiirpl3102030.duniaanakislami.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xiirpl3102030.duniaanakislami.R;
import id.sch.smktelkom_mlg.project.xiirpl3102030.duniaanakislami.model.modyel;

/**
 * Created by Win_8.1 on 11/20/2016.
 */
public class adapterr extends RecyclerView.Adapter<adapterr.ViewHolder> {

    ArrayList<modyel> modyelsList;

    public adapterr(ArrayList<modyel> modyelsList) {
        this.modyelsList = modyelsList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        modyel modyel = modyelsList.get(position);
        holder.ivFoto.setImageDrawable(modyel.foto);
    }


    @Override
    public int getItemCount() {
        if (modyelsList != null)
            return modyelsList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);


        }
    }
}


