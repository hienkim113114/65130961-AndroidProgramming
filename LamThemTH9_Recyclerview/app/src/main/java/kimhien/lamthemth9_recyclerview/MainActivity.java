package kimhien.lamthemth9_recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScape_Adapter landScapeAdapter;
    ArrayList<LandScape> recylerViewDatas;
    RecyclerView recyclerViewLandScape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //b3
        recylerViewDatas=getDataForRecyclerView();
        //b4
        recyclerViewLandScape= findViewById(R.id.recycleLand);
        //b5
        RecyclerView.LayoutManager layoutLinear= new LinearLayoutManager(this);
        recyclerViewLandScape.setLayoutManager(layoutLinear);
//b6
        landScapeAdapter = new LandScape_Adapter(this,recylerViewDatas);
        //b7
        recyclerViewLandScape.setAdapter(landScapeAdapter);
    }
    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsDL= new ArrayList<LandScape>();
        LandScape landScape1= new LandScape("cdh","CUNG ĐÌNH HUẾ","https://tway-air.vn/cung-dinh-hue/");
        dsDL.add(landScape1);
        dsDL.add(new LandScape("tef","THÁP EFFEL","https://vtourist.com.vn/thap-eiffel/"));
        dsDL.add(new LandScape("tr","THÁP RÙA","https://vinpearl.com/vi/cam-nang-kham-pha-thap-rua-ho-guom"));
        dsDL.add(new LandScape("vhl","VỊNH HẠ LONG","https://baoquangninh.vn/vinh-ha-long-toa-sang-3314842.html"));
        return dsDL;
    }
}