package com.airport.rahul.butterknifedemo;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.edt_butterkife) EditText edt_text;
    @BindView(R.id.btn_butterknife) Button btn_submit;

    //@BindString(R.string.app_name) String title;
    //@BindDrawable(R.drawable.shapeedt) Drawable graphic;
    //@BindColor(R.color.colorPrimary) int red; // int or ColorStateList field
    //@BindDimen(R.dimen.spacer) Float spacer; // int (for pixel size) or float (for exact value) field

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.edt_butterkife)
    public void EdittextClick()
    {
        Toast.makeText(this, "Edittext Clicked", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn_butterknife)
    public void submit()
    {
        String text=edt_text.getText().toString();
        edt_text.setText("");
        Toast.makeText(this, ""+text, Toast.LENGTH_SHORT).show();
    }
}


// Fragment

/*
public class FancyFragment extends Fragment {
    @BindView(R.id.button1) Button button1;
    @BindView(R.id.button2) Button button2;

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fancy_fragment, container, false);
        ButterKnife.bind(this, view);
        // TODO Use fields...
        return view;
    }
}*/


// Base Adapter Custom

/*
public class MyAdapter extends BaseAdapter {
    @Override public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view != null) {
            holder = (ViewHolder) view.getTag();
        } else {
            view = inflater.inflate(R.layout.whatever, parent, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }

        holder.name.setText("John Doe");
        // etc...

        return view;
    }

    static class ViewHolder {
        @BindView(R.id.title) TextView name;
        @BindView(R.id.job_title) TextView jobTitle;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}*/
