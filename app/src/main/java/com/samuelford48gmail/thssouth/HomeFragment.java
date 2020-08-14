package com.samuelford48gmail.thssouth;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    ListView listview_home;
    ArrayList<String> list = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.content_main, container, false);


        listview_home = view.findViewById(R.id.listview_home);
        listview_home.setStackFromBottom(true);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, list);
        listview_home.setAdapter(adapter);
        FirebaseFirestore.getInstance().collection("Delays").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if (queryDocumentSnapshots != null && !queryDocumentSnapshots.isEmpty()) {
                    list.clear();
                    for (DocumentSnapshot documentSnapshot : queryDocumentSnapshots) {
                        list.add(documentSnapshot.get("delay").toString());
                        adapter.notifyDataSetChanged();
                    }
                }
            }
        });
        return view;
    }
}