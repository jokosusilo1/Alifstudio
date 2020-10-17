package com.alifstudio.mustikaiman.Fragment;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import androidx.legacy.coreutils.R;

public class FragmentLaporan extends Fragment {
    public FragmentLaporan(){
        
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_list_laporan,container,false);
        return v;
    }
    
}
