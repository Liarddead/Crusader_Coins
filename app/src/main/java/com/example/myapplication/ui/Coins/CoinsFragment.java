package com.example.myapplication.ui.Coins;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentCoinsBinding;

public class CoinsFragment extends Fragment {
    private FragmentCoinsBinding binding;
    ImageButton AntiochButton;
    ImageButton JerusalimButton;
    ImageButton TripoliButton;
    ImageButton TeutonicButton;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentCoinsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        AntiochButton = (ImageButton) root.findViewById(R.id.Antioch_button);
        JerusalimButton = (ImageButton) root.findViewById(R.id.Jerusalim_button);
        TripoliButton = (ImageButton) root.findViewById(R.id.Tripoli_button);
        TeutonicButton= (ImageButton) root.findViewById(R.id.teutonic_button);
       AntiochButton.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_gallery_to_antiochFragment);
            }
        });
        JerusalimButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_gallery_to_jerusalemFragment);
            }
        });
        TripoliButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_gallery_to_tripoliFragment);
            }
        });
        TeutonicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_gallery_to_teutonicFragment);
            }
        });

        return root;

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}