package kimhien.myapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
List<TASKS> lstVCL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        System.out.println("APP DA CHAY");
//TAO KET NOI CSDL
        FirebaseDatabase database= FirebaseDatabase.getInstance();
        DatabaseReference databaseReference= database.getReference("TASKS2");
//LANG NGHe VA XU LY
        lstVCL= new ArrayList<TASKS>();
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
// lay du lieu tu bien snapshot, dua vao mot bien danh sach de xu ly
                for(DataSnapshot obj: snapshot.getChildren()){
                    TASKS tasks = obj.getValue(TASKS.class);
                    lstVCL.add(tasks);
                    Log.w("VCL app","tên việc làm:"+ tasks.getName() );

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }

        });

    }
}