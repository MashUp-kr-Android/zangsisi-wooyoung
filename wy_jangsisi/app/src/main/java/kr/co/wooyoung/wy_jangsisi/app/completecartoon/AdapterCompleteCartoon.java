package kr.co.wooyoung.wy_jangsisi.app.completecartoon;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import kr.co.wooyoung.wy_jangsisi.R;
import kr.co.wooyoung.wy_jangsisi.app.cartoonthumbnail.CartoonThumbnailActivity;

/**
 * Created by owner on 2016-11-26.
 */

public class AdapterCompleteCartoon extends RecyclerView.Adapter<AdapterCompleteCartoon.ViewHolderCompleteCartoon> {

    Context context;
    List<ItemDataCompleteCartoon> items = new ArrayList<>();

    public AdapterCompleteCartoon(Context context, List<ItemDataCompleteCartoon> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public ViewHolderCompleteCartoon onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemVIew = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_complete_cartoon,parent,false);

        ViewHolderCompleteCartoon viewHolder = new ViewHolderCompleteCartoon(itemVIew);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolderCompleteCartoon holder, int position) {
        holder.txtCompleteCartoon.setText(items.get(position).getName());
        Glide.with(context).load(items.get(position).getImage()).centerCrop().into(holder.imgCompleteCartoon);
        holder.imgCompleteCartoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, CartoonThumbnailActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolderCompleteCartoon extends RecyclerView.ViewHolder{

        @BindView(R.id.image_view_item_complete_cartoon)
        ImageView imgCompleteCartoon;
        @BindView(R.id.text_view_item_complete_cartoon)
        TextView txtCompleteCartoon;

        public ViewHolderCompleteCartoon(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }

    public static class ItemDataCompleteCartoon{
        private String image;
        private String name;

        public ItemDataCompleteCartoon(String image, String name) {
            this.image = image;
            this.name = name;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
