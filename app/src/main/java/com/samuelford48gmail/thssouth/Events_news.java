package com.samuelford48gmail.thssouth;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by samuelford on 5/24/18.
 * <p>
 * public class Events_announcements extends AppCompatActivity {
 * DatabaseReference ref;
 * ListView listview;
 * ArrayList<String> list=new ArrayList<>();
 *
 * @Override /**
 * protected void onCreate(Bundle savedInstanceState) {
 * super.onCreate(savedInstanceState);
 * setContentView(R.layout.activity_main);
 * listview=(ListView)findViewById(R.id.listview);
 * final ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
 * listview.setAdapter(adapter);
 * ref=FirebaseDatabase.getInstance().getReference();
 * ref.addChildEventListener(new ChildEventListener() {
 * @Override public void onChildAdded(DataSnapshot dataSnapshot, String s) {
 * list.add(dataSnapshot.getValue(String.class));
 * adapter.notifyDataSetChanged();
 * }
 * @Override public void onChildChanged(DataSnapshot dataSnapshot, String s) {
 * }
 * @Override public void onChildRemoved(DataSnapshot dataSnapshot) {
 * list.remove(dataSnapshot.getValue(String.class));
 * adapter.notifyDataSetChanged();
 * }
 * @Override public void onChildMoved(DataSnapshot dataSnapshot, String s) {
 * }
 * @Override public void onCancelled(DatabaseError databaseError) {
 * }
 * });
 * }
 * }
 * <p>
 * <p>
 * }
 * }
 **/
/**
 public class Events_announcements extends AppCompatActivity {
 DatabaseReference ref;
 ListView listview;
 ArrayList<String> list=new ArrayList<>();
 @Override
 /**
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 listview=(ListView)findViewById(R.id.listview);
 final ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
 listview.setAdapter(adapter);
 ref=FirebaseDatabase.getInstance().getReference();
 ref.addChildEventListener(new ChildEventListener() {
 @Override public void onChildAdded(DataSnapshot dataSnapshot, String s) {
 list.add(dataSnapshot.getValue(String.class));
 adapter.notifyDataSetChanged();
 }
 @Override public void onChildChanged(DataSnapshot dataSnapshot, String s) {
 }
 @Override public void onChildRemoved(DataSnapshot dataSnapshot) {
 list.remove(dataSnapshot.getValue(String.class));
 adapter.notifyDataSetChanged();
 }
 @Override public void onChildMoved(DataSnapshot dataSnapshot, String s) {
 }
 @Override public void onCancelled(DatabaseError databaseError) {
 }
 });
 }
 }


 }
 }
 **/