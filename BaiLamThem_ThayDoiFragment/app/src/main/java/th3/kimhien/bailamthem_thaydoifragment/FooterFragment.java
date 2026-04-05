package th3.kimhien.bailamthem_thaydoifragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;




public class FooterFragment extends Fragment {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater .inflate(R.layout.fragment_footer,container,false);
        Button b1= v.findViewById(R.id.button1);
        Button b2= v.findViewById(R.id.button2);
        Button b3= v.findViewById(R.id.button3);

        FragmentManager fragmentManager= getParentFragmentManager();

        b1.setOnClickListener(view -> {
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView2_content,
                            new ArticleFragment("https://vnexpress.net"))
                    .commit();
        });

        b2.setOnClickListener(view -> {
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView2_content,
                            new ArticleFragment("https://dantri.com.vn"))
                    .commit();
        });

        b3.setOnClickListener(view -> {
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView2_content,
                            new ArticleFragment("https://tuoitre.vn"))
                    .commit();
        });
        // Inflate the layout for this fragment
        return v;
    }
}