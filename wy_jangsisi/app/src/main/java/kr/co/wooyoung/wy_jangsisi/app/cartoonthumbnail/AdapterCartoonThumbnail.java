package kr.co.wooyoung.wy_jangsisi.app.cartoonthumbnail;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import kr.co.wooyoung.wy_jangsisi.R;

/**
 * Created by owner on 2016-11-26.
 */

public class AdapterCartoonThumbnail extends RecyclerView.Adapter<AdapterCartoonThumbnail.ViewHolderCartoonThumbnail> {

    Context context;
    List<ItemDataCartoonThumbnail> items = new ArrayList<>();

    public AdapterCartoonThumbnail(Context context, List<ItemDataCartoonThumbnail> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public ViewHolderCartoonThumbnail onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cartoon_thumbnail, parent, false);

        ViewHolderCartoonThumbnail viewHolder = new ViewHolderCartoonThumbnail(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolderCartoonThumbnail holder, int position) {
        holder.txtCartoonThumbnail.setText(items.get(position).cartoonNumber);
        holder.txtCartoonThumbnail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "테스트중", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolderCartoonThumbnail extends RecyclerView.ViewHolder {

        @BindView(R.id.text_view_item_cartoon_thumbnail)
        TextView txtCartoonThumbnail;

        public ViewHolderCartoonThumbnail(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }

    public static class ItemDataCartoonThumbnail {
        private String cartoonNumber;

        public ItemDataCartoonThumbnail(String cartoonNumber) {
            this.cartoonNumber = cartoonNumber;
        }

        public String getCartoonNumber() {
            return cartoonNumber;
        }

        public void setCartoonNumber(String cartoonNumber) {
            this.cartoonNumber = cartoonNumber;
        }
    }
}
