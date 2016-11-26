package kr.co.wooyoung.wy_jangsisi.app.unfinishedcartoon;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import kr.co.wooyoung.wy_jangsisi.R;

/**
 * Created by owner on 2016-11-25.
 */

public class FragmentUnfinishedCartoon extends Fragment {

    @BindView(R.id.recycler_view_unfinished_cartoon)
    RecyclerView recyclerView;

    Context context;
    List<AdapterUnfinishedCartoon.ItemDataUnfinishedCartoon> items;
    AdapterUnfinishedCartoon adapter;
    LinearLayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_unfinished_cartoon,container,false);
        context = getContext();
        ButterKnife.bind(this, view);

        layoutManager = new LinearLayoutManager(context);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);

        items = new ArrayList<>();
        adapter = new AdapterUnfinishedCartoon(context, items);

        items.add(new AdapterUnfinishedCartoon.ItemDataUnfinishedCartoon("https://i.ytimg.com/vi/wXXtWbO-XP4/maxresdefault.jpg","원피스"));
        items.add(new AdapterUnfinishedCartoon.ItemDataUnfinishedCartoon("https://i.ytimg.com/vi/wXXtWbO-XP4/maxresdefault.jpg","원피스"));
        items.add(new AdapterUnfinishedCartoon.ItemDataUnfinishedCartoon("https://i.ytimg.com/vi/wXXtWbO-XP4/maxresdefault.jpg","원피스"));
        items.add(new AdapterUnfinishedCartoon.ItemDataUnfinishedCartoon("https://i.ytimg.com/vi/wXXtWbO-XP4/maxresdefault.jpg","원피스"));
        items.add(new AdapterUnfinishedCartoon.ItemDataUnfinishedCartoon("https://i.ytimg.com/vi/wXXtWbO-XP4/maxresdefault.jpg","원피스"));
        items.add(new AdapterUnfinishedCartoon.ItemDataUnfinishedCartoon("https://i.ytimg.com/vi/wXXtWbO-XP4/maxresdefault.jpg","원피스"));

        recyclerView.setAdapter(adapter);

        return view;
    }
}













