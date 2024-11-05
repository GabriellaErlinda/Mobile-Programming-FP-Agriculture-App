package com.example.agrivisionfp.ui.monitoring;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.agrivisionfp.databinding.FragmentMonitoringBinding;
import com.example.agrivisionfp.databinding.FragmentMonitoringBinding;

public class MonitoringFragment extends Fragment {

    private FragmentMonitoringBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MonitoringViewModel notificationsViewModel =
                new ViewModelProvider(this).get(MonitoringViewModel.class);

        binding = FragmentMonitoringBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textMonitoring;
        notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}