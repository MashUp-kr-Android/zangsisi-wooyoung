package kr.co.wooyoung.wy_jangsisi.app.cartoonthumbnail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import kr.co.wooyoung.wy_jangsisi.R;

public class CartoonThumbnailActivity extends AppCompatActivity {

    @BindView(R.id.recycler_view_cartoon_thumbnail)
    RecyclerView recyclerView;

    LinearLayoutManager layoutManager;
    List<AdapterCartoonThumbnail.ItemDataCartoonThumbnail> items;
    AdapterCartoonThumbnail adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartoon_thumbnail);
        ButterKnife.bind(this);

        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);

        items = new ArrayList<>();
        adapter = new AdapterCartoonThumbnail(this, items);

        items.add(new AdapterCartoonThumbnail.ItemDataCartoonThumbnail("800화"));
        items.add(new AdapterCartoonThumbnail.ItemDataCartoonThumbnail("799화"));
        items.add(new AdapterCartoonThumbnail.ItemDataCartoonThumbnail("798화"));
        items.add(new AdapterCartoonThumbnail.ItemDataCartoonThumbnail("797화"));
        items.add(new AdapterCartoonThumbnail.ItemDataCartoonThumbnail("796화"));
        items.add(new AdapterCartoonThumbnail.ItemDataCartoonThumbnail("795화"));
        items.add(new AdapterCartoonThumbnail.ItemDataCartoonThumbnail("796화"));
        items.add(new AdapterCartoonThumbnail.ItemDataCartoonThumbnail("795화"));
        items.add(new AdapterCartoonThumbnail.ItemDataCartoonThumbnail("794화"));
        items.add(new AdapterCartoonThumbnail.ItemDataCartoonThumbnail("793화"));
        items.add(new AdapterCartoonThumbnail.ItemDataCartoonThumbnail("792화"));
        items.add(new AdapterCartoonThumbnail.ItemDataCartoonThumbnail("791화"));
        items.add(new AdapterCartoonThumbnail.ItemDataCartoonThumbnail("790화"));
        items.add(new AdapterCartoonThumbnail.ItemDataCartoonThumbnail("789화"));
        items.add(new AdapterCartoonThumbnail.ItemDataCartoonThumbnail("788화"));
        items.add(new AdapterCartoonThumbnail.ItemDataCartoonThumbnail("787화"));
        items.add(new AdapterCartoonThumbnail.ItemDataCartoonThumbnail("786화"));
        items.add(new AdapterCartoonThumbnail.ItemDataCartoonThumbnail("785화"));

        recyclerView.setAdapter(adapter);


    }
}
