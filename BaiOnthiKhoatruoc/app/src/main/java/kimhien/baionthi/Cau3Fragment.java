package kimhien.baionthi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Cau3Fragment extends Fragment {
LandScape_Adapter adapter;
ArrayList<LandScape>List;
RecyclerView recyclerViewLandScape;



    public Cau3Fragment() {
        // Required empty public constructor
    }


    public static Cau3Fragment newInstance(String param1, String param2) {
        Cau3Fragment fragment = new Cau3Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        List = new ArrayList<>();

        List.add(new LandScape("cdh","CUNG ĐÌNH HUẾ",
                "https://vi.wikipedia.org/wiki/Kinh_th%C3%A0nh_Hu%E1%BA%BF"));

        List.add(new LandScape("tef","THÁP EIFFEL",
                "https://vi.wikipedia.org/wiki/Th%C3%A1p_Eiffel"));

        List.add(new LandScape("tr","THÁP RÙA",
                "https://vi.wikipedia.org/wiki/Th%C3%A1p_R%C3%B9a"));

        List.add(new LandScape("vhl","VỊNH HẠ LONG",
                "https://vi.wikipedia.org/wiki/V%E1%BB%8Bnh_H%E1%BA%A1_Long"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View viewCau3=  inflater.inflate(R.layout.fragment_cau3, container, false);
        recyclerViewLandScape= viewCau3.findViewById(R.id.ryCau3);
RecyclerView.LayoutManager layoutLinear= new LinearLayoutManager(viewCau3.getContext());
recyclerViewLandScape.setLayoutManager(layoutLinear);

adapter= new LandScape_Adapter(viewCau3.getContext(),List);
recyclerViewLandScape.setAdapter(adapter);

        return viewCau3;
    }
}