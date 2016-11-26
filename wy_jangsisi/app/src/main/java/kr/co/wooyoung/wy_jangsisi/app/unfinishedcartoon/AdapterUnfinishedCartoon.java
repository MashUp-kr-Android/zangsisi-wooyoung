package kr.co.wooyoung.wy_jangsisi.app.unfinishedcartoon;

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

public class AdapterUnfinishedCartoon extends RecyclerView.Adapter<AdapterUnfinishedCartoon.ViewHolderUnfinishedCartoon> {

    Context context;
    List<ItemDataUnfinishedCartoon> items = new ArrayList<>();

    public AdapterUnfinishedCartoon(Context context, List<ItemDataUnfinishedCartoon> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public ViewHolderUnfinishedCartoon onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemVIew = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_unfinished_cartoon,parent,false);

        ViewHolderUnfinishedCartoon viewHolder = new ViewHolderUnfinishedCartoon(itemVIew);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolderUnfinishedCartoon holder, int position) {
        holder.txtUnfinishedCartoon.setText(items.get(position).getName());
        Glide.with(context).load(items.get(position).getImage()).centerCrop().into(holder.imgUnfinishedCartoon);
        holder.imgUnfinishedCartoon.setOnClickListener(new View.OnClickListener() {
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

    public static class ViewHolderUnfinishedCartoon extends RecyclerView.ViewHolder{

        @BindView(R.id.image_view_item_unfinished_cartoon)
        ImageView imgUnfinishedCartoon;
        @BindView(R.id.text_view_item_unfinished_cartoon)
        TextView txtUnfinishedCartoon;

        public ViewHolderUnfinishedCartoon(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public static class ItemDataUnfinishedCartoon {

        private String image;
        private String name;

        public ItemDataUnfinishedCartoon(String image, String name) {
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
