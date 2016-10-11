package roman.com.israeltour.mainactivity.recycleradapters;

/**
 * Created by roman on 10/10/16.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import roman.com.israeltour.R;
import roman.com.israeltour.data.dataobjects.Food;

public class FoodRecyclerViewAdapter extends RecyclerView.Adapter<FoodRecyclerViewAdapter.FoodViewHolder> {

    private final List<Food> mValues;

    public FoodRecyclerViewAdapter(List<Food> items) {
        mValues = items;
    }

    @Override
    public FoodViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.food_fragment_list_item, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final FoodViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mNameTextView.setText(mValues.get(position).getName());
        holder.mDescriptionTextView.setText(mValues.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mNameTextView;
        public final TextView mDescriptionTextView;
        public Food mItem;

        public FoodViewHolder(View view) {
            super(view);
            mView = view;
            mNameTextView = (TextView) view.findViewById(R.id.textview_food_list_item_name);
            mDescriptionTextView = (TextView) view.findViewById(R.id.textview_food_list_item_description);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mNameTextView.getText() + "'";
        }
    }
}