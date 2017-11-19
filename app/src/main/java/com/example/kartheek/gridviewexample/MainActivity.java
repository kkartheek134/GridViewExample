package com.example.kartheek.gridviewexample;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    int images[] ={R.drawable.droid,R.drawable.droid,R.drawable.droid,R.drawable.droid,R.drawable.droid,R.drawable.droid,R.drawable.droid,R.drawable.droid,R.drawable.droid,R.drawable.droid,R.drawable.droid,R.drawable.droid,R.drawable.droid,R.drawable.droid,R.drawable.droid,R.drawable.droid,R.drawable.droid,R.drawable.droid,R.drawable.droid,R.drawable.droid};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView)findViewById(R.id.grid);

        ImageAdapter imageAdapter = new ImageAdapter();
        gridView.setAdapter(imageAdapter);
        getSupportActionBar().setTitle("GridView");
    }

    final class ImageAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return images[position];
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ImageView imageView = new ImageView(MainActivity.this);
            imageView.setLayoutParams(new GridView.LayoutParams(200,200));
            imageView.setImageResource(images[position]);
            return imageView;
        }
    }
}
