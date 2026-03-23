package kimhien.baith7_listview1;

import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String>dsTenTinhThanhVN;
    //khai bao
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        dsTenTinhThanhVN= new ArrayList<>();
        dsTenTinhThanhVN.add("Ha Noi");
        dsTenTinhThanhVN.add("TP HCM");
        dsTenTinhThanhVN.add("Dong Nai");
        dsTenTinhThanhVN.add("Ninh Thuan");
        dsTenTinhThanhVN.add("Binh Thuan");
        dsTenTinhThanhVN.add("Thanh Hoa");
        //tao adapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dsTenTinhThanhVN);

        //Gan vao dk hien thi ListView
        //tim
        ListView lvTenTinhThanh=findViewById(R.id.lvDanhsachtinh);
//gan
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
// lắng nghe va sử lý sự kiện user tương tác
        //gắn bộ lắng nghe
        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaxl);

    }
    // Tạo bộ lắng nghe và xử lý sự kiện ONItemClick, đặt vào một biến

    AdapterView.OnItemClickListener BoLangNghevaxl = new AdapterView.OnItemClickListener(){
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            //i là vị trí phần tử vừa vừa được click
            String strTenTinhChon= dsTenTinhThanhVN.get(i);
            Toast.makeText(MainActivity.this,strTenTinhChon ,Toast.LENGTH_LONG ).show();
        }
    };

}