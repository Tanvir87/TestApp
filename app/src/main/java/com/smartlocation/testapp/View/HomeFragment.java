package com.smartlocation.testapp.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.smartlocation.testapp.R;
import com.smartlocation.testapp.Util.Navigator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class HomeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        LinearLayout linearProfile = rootView.findViewById(R.id.linear_profile);
        LinearLayout linearPhotos = rootView.findViewById(R.id.linear_photos);


        //profile
        linearProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //navigator call
                Navigator.fragmentForwardWithNoStack(getContext(), R.id.mainFrame, new ProfileFragment());
            }
        });

        //photo
        linearPhotos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigator.fragmentForwardWithNoStack(getContext(), R.id.mainFrame, new PhotoFragment());
            }
});

        return rootView;

    }
}
