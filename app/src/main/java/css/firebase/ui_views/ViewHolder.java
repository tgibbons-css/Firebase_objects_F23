package css.firebase.ui_views;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import css.firebase.R;

public class ViewHolder extends RecyclerView.ViewHolder{

    TextView textViewRowItem;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewRowItem = itemView.findViewById(R.id.textViewRowItem);
    }
}
