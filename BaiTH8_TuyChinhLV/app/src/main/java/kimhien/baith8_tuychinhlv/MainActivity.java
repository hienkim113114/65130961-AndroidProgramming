package kimhien.baith8_tuychinhlv;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
      //tim listview
        ListView lvDSMonAn= (ListView) findViewById(R.id.lvMonAn);
        // chuan bi nguon dl
        ArrayList<MonAn> dsMonAn= new ArrayList<MonAn>();
       dsMonAn.add(new MonAn("cơm tấm",20000," Cơm tấm dẻo thơm ăn kèm sườn nướng, bì và chả, đậm đà hương vị truyền thống.",R.drawable.ct));
       dsMonAn.add(new MonAn("cơm sườn",25000," Cơm trắng ăn với sườn nướng vàng thơm, mềm ngọt, rất hấp dẫn.",R.drawable.cs));
       dsMonAn.add(new MonAn("cơm gà",27000," Cơm nóng ăn kèm thịt gà mềm, thơm, giàu dinh dưỡng.",R.drawable.cg));
       dsMonAn.add(new MonAn("cơm tấm thịt nướng",28000," Cơm tấm kết hợp thịt nướng đậm vị, thơm lừng và hấp dẫn.",R.drawable.ctn));

       MonAn_Adapter adapter = new MonAn_Adapter(this , dsMonAn);
       lvDSMonAn.setAdapter(adapter);

       lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
               // lấy phần tử được chọn
                MonAn monAnChon= dsMonAn.get(i);

               Toast.makeText(MainActivity.this, monAnChon.getTenMonAn(),Toast.LENGTH_SHORT).show();
           }
       });

    }
}