package com.alifstudio.mustikaiman.Fragment;
import androidx.legacy.coreutils.R;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;

 public class FragmentAmalan extends Fragment{
     
         
     

     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         View v=inflater.inflate(R.layout.fragment_list_amalan,container,false);
         
         
         RecyclerView recyclerView = (RecyclerView) inflater.inflate(
             R.layout.recycleview, container, false);
         ContentAdapter adapter = new ContentAdapter(recyclerView.getContext());
         recyclerView.setAdapter(adapter);
         recyclerView.setHasFixedSize(true);
         recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
         return recyclerView;
     }
    public static class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.MyHolder>
	{

		@Override
		public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup p1, int p2)
		{
			// TODO: Implement this method
			return null;
		}

		@Override
		public void onBindViewHolder(RecyclerView.ViewHolder p1, int p2)
		{
			// TODO: Implement this method
		}
		
        
        public static class ContentAdapter
        @NonNull
        @Override
        


        // Set numbers of List in RecyclerView.
        private static final int LENGTH = 8;

        private final String[] mPlaces;
        //private final String[] mPlaceDesc;


        public ContentAdapter(Context context) {
            Resources resources = context.getResources();
            mPlaces = resources.getStringArray(R.array.Pelajaran);
     }
    

       

        @Override
        public int getItemCount() {
            return LENGTH;
        }
}
;
}
