package com.example.fragmentsample;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class MenuListFragment extends Fragment {

    private Activity _parentActivity;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        _parentActivity = getActivity();
    }


    public MenuListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu_list,container,false);
        ListView lvMenu = view.findViewById(R.id.lvMenu);
        List<Map<String,Object>> menuList = new ArrayList<>();

        Map<String,Object> menu = new HashMap<>();
        menu.put("name","唐揚げ定食");
        menu.put("price","700");
        menu.put("desc","から揚げ６個、サラダ、味噌汁");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","ハンバーグ定食");
        menu.put("price","850");
        menu.put("desc","デミグラスソースハンバーグ、サラダ、味噌汁");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","生姜焼き定食");
        menu.put("price","800");
        menu.put("desc","生姜焼き、サラダ、味噌汁");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","ステーキ定食");
        menu.put("price","1050");
        menu.put("desc","牛ステーキ150g、サラダ、味噌汁");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","野菜炒め定食");
        menu.put("price","750");
        menu.put("desc","野菜炒め、漬物、味噌汁");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","とんかつ定食");
        menu.put("price","850");
        menu.put("desc","ヒレカツ、サラダ、味噌汁");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","ミンチかつ定食");
        menu.put("price","850");
        menu.put("desc","メンチカツ、サラダ、味噌汁");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","チキンカツ定食");
        menu.put("price","950");
        menu.put("desc","チキンカツ、サラダ、味噌汁");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","コロッケ定食");
        menu.put("price","650");
        menu.put("desc","コロッケ、サラダ、味噌汁");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","焼き魚定食");
        menu.put("price","800");
        menu.put("desc","アジの開き、おひたし、味噌汁");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","焼肉定食");
        menu.put("price","850");
        menu.put("desc","焼肉200g、サラダ、味噌汁");
        menuList.add(menu);

        String[] form = {"name","price"};
        int [] to = {android.R.id.text1,android.R.id.text2};
        SimpleAdapter adapter = new SimpleAdapter(_parentActivity,menuList,android.R.layout.simple_list_item_2,form,to);
        lvMenu.setAdapter(adapter);
        return view;
    }

}
