package css.firebase.ui_views;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import css.firebase.data_model.Item;
import css.firebase.ViewModelItem;
import css.firebase.R;

public class RecycleViewAdapter extends RecyclerView.Adapter<ViewHolder>  {

    ViewModelItem itemViewHolder;

    public RecycleViewAdapter(ViewModelItem itemViewHolder) {
        //this.application = application;
        this.itemViewHolder = itemViewHolder;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = itemViewHolder.getItem(position);
        holder.textViewRowItem.setText(item.getItemDescription());
    }

    @Override
    public int getItemCount() {
        return itemViewHolder.getNumberOfItems();
    }
}
