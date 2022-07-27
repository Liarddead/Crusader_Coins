package com.example.myapplication.ui.TeutonicCoins;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentCoinsBinding;
import com.example.myapplication.databinding.FragmentShilingKniprodeBinding;
import com.example.myapplication.databinding.FragmentTeutonicBinding;

public class TeutonicFragment extends Fragment {
    private  FragmentTeutonicBinding binding;
    RelativeLayout ShilingKniprodeButton;
    RelativeLayout VierchenKniprodeButton;
    RelativeLayout ShilingaltKniprodeButton;
    RelativeLayout HalbschoterKniprodeButton;

    public TeutonicFragment() {
        // Required empty public constructor
    }
    // TODO: Rename and change types and number of parameter

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Teutonic Coins");
        binding = FragmentTeutonicBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        ShilingKniprodeButton = (RelativeLayout) root.findViewById(R.id.shiling_kniprode_button);
        VierchenKniprodeButton = (RelativeLayout) root.findViewById(R.id.vierchen_kniprode_button);
        ShilingaltKniprodeButton =(RelativeLayout) root.findViewById(R.id.shilling_kniprode_alt_button);
        HalbschoterKniprodeButton = (RelativeLayout) root.findViewById(R.id.halbschoter_kniprode_button);
        ShilingKniprodeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_teutonicFragment_to_shilingKniprodeFragment);
            }
        });

        VierchenKniprodeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_teutonicFragment_to_vierchen_kniprode);
            }
        });
        ShilingaltKniprodeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_teutonicFragment_to_shilling_kniprode_alternative);
            }
        });
        HalbschoterKniprodeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_teutonicFragment_to_halbschoter_Kniprode);
            }
        });

        // Inflate the layout for this fragment
        return root;
    }

    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}