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
    RelativeLayout ShilingKonrad1Button;
    RelativeLayout ShilingConradJungButton;
    RelativeLayout ShilingConradJungDanButton;
    RelativeLayout ShilingUlrichJungButton;
    RelativeLayout ShilingHenrichPlauenButton;
    RelativeLayout ShilingHermanGansButton;
    RelativeLayout ShilingMichaelKuchButton;
    RelativeLayout ShilingMichaelKuchThornButton;
    RelativeLayout HalbshoterMichaelKuchButton;
    RelativeLayout ShilingPaulRubdorfButton;

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
        ShilingKonrad1Button = (RelativeLayout) root.findViewById(R.id.shiling_konrad1_button);
        ShilingConradJungButton = (RelativeLayout) root.findViewById(R.id.shiling_conrad_jung_button);
        ShilingConradJungDanButton = (RelativeLayout) root.findViewById(R.id.shiling_conrad_jung_dan_button);
        ShilingUlrichJungButton = (RelativeLayout) root.findViewById(R.id.shiling_ulrich_jung_button);
        ShilingHenrichPlauenButton = (RelativeLayout) root.findViewById(R.id.shiling_henrich_plauen_button);
        ShilingHermanGansButton = (RelativeLayout) root.findViewById(R.id.shiling_herman_gans_button);
        ShilingMichaelKuchButton = (RelativeLayout) root.findViewById(R.id.shiling_michael_kuch_button);
        ShilingMichaelKuchThornButton = (RelativeLayout) root.findViewById(R.id.shiling_michael_kuch_thorn_button);
        HalbshoterMichaelKuchButton = (RelativeLayout) root.findViewById(R.id.halbshoter_michael_kuch_button);
        ShilingPaulRubdorfButton = (RelativeLayout) root.findViewById(R.id.shilling_paul_rubdorf_button);

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
        ShilingKonrad1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_teutonicFragment_to_shilling_Konrad1);
            }
        });
        ShilingConradJungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_teutonicFragment_to_shilling_Conrad_jung);
            }
        });
        ShilingConradJungDanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_teutonicFragment_to_shilling_Conrad_Jung_dan);
            }
        });
        ShilingUlrichJungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_teutonicFragment_to_shilling_Ulrich_Jung);
            }
        });
        ShilingHenrichPlauenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_teutonicFragment_to_shilling_Henrich_Plauen);
            }
        });
        ShilingHermanGansButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_teutonicFragment_to_shilling_Herman_Gans);
            }
        });
        ShilingMichaelKuchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_teutonicFragment_to_shilling_Michael_Kuchmeister);
            }
        });
        ShilingMichaelKuchThornButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_teutonicFragment_to_shilling_Michael_Kuchmeister_thorn);
            }
        });
        HalbshoterMichaelKuchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_teutonicFragment_to_halbshoter_Michael_Kuchmeister);
            }
        });
        ShilingPaulRubdorfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_teutonicFragment_to_shilling_Paul_Rubdorf);
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