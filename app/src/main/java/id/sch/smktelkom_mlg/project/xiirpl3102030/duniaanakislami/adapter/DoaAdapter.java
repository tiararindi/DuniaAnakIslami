package id.sch.smktelkom_mlg.project.xiirpl3102030.duniaanakislami.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xiirpl3102030.duniaanakislami.R;
import id.sch.smktelkom_mlg.project.xiirpl3102030.duniaanakislami.model.Doa;

/**
 * Created by Win_8.1 on 11/24/2016.
 */
public class DoaAdapter extends RecyclerView.Adapter<DoaAdapter.ViewHolder> {
    ArrayList<Doa> doaList;
    IDoaAdapter mIDoaAdapter;

    public DoaAdapter(Context context, ArrayList<Doa> doaList) {
        this.doaList = doaList;
        mIDoaAdapter = (IDoaAdapter) context;
    }

    public DoaAdapter(ArrayList<Doa> doaList) {
        this.doaList = doaList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Doa doa = doaList.get(position);
        holder.tvJudul.setText(doa.judul);
        holder.ivFoto.setImageURI(Uri.parse(doa.foto));
    }

    @Override
    public int getItemCount() {
        if (doaList != null)
            return doaList.size();
        return 0;
    }

    public interface IDoaAdapter {
        void doClick(int pos);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvJudul;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIDoaAdapter.doClick(getAdapterPosition());
                }
            });
        }
    }
}
