package kr.co.wooyoung.wy_jangsisi.app.completecartoon;

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

public class FragmentCompleteCartoon extends Fragment {

    @BindView(R.id.recycler_view_complete_cartoon)
    RecyclerView recyclerView;

    Context context;
    List<AdapterCompleteCartoon.ItemDataCompleteCartoon> items;
    AdapterCompleteCartoon adapter;
    LinearLayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_complete_cartoon, container, false);
        ButterKnife.bind(this, view);
        context = getContext();

        layoutManager = new LinearLayoutManager(context);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.hasFixedSize();

        recyclerView.setLayoutManager(layoutManager);

        items = new ArrayList<>();
        adapter = new AdapterCompleteCartoon(context, items);

        items.add(new AdapterCompleteCartoon.ItemDataCompleteCartoon("http://cfile7.uf.tistory.com/image/170DED3C509F91E527679E","드래곤볼"));
        items.add(new AdapterCompleteCartoon.ItemDataCompleteCartoon("http://cfile7.uf.tistory.com/image/170DED3C509F91E527679E","드래곤볼"));
        items.add(new AdapterCompleteCartoon.ItemDataCompleteCartoon("http://cfile7.uf.tistory.com/image/170DED3C509F91E527679E","드래곤볼"));
        items.add(new AdapterCompleteCartoon.ItemDataCompleteCartoon("http://cfile7.uf.tistory.com/image/170DED3C509F91E527679E","드래곤볼"));
        items.add(new AdapterCompleteCartoon.ItemDataCompleteCartoon("http://cfile7.uf.tistory.com/image/170DED3C509F91E527679E","드래곤볼"));
        items.add(new AdapterCompleteCartoon.ItemDataCompleteCartoon("http://cfile7.uf.tistory.com/image/170DED3C509F91E527679E","드래곤볼"));

        recyclerView.setAdapter(adapter);


        return view;
    }
}
