package com.example.agrivisionfp.ui.av_cam;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.agrivisionfp.databinding.FragmentAvCamBinding;
import com.example.agrivisionfp.databinding.FragmentAvCamBinding;

public class AVCamFragment extends Fragment {

    private FragmentAvCamBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AVCamViewModel dashboardViewModel =
                new ViewModelProvider(this).get(AVCamViewModel.class);

        binding = FragmentAvCamBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDashboard;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}