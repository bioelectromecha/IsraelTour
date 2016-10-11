package roman.com.israeltour.mainactivity.recycleradapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import roman.com.israeltour.MyApplication;
import roman.com.israeltour.R;
import roman.com.israeltour.data.dataobjects.Place;

public class PlacesRecyclerViewAdapter extends RecyclerView.Adapter<PlacesRecyclerViewAdapter.PlacesViewHolder> {

    private final List<Place> mValues;

    public PlacesRecyclerViewAdapter(List<Place> items) {
        mValues = items;
    }

    @Override
    public PlacesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.places_fragment_list_item, parent, false);
        return new PlacesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final PlacesViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mImageView.setImageDrawable(MyApplication.getContext().getDrawable(mValues.get(position).getImageId()));
        holder.mNameTextView.setText(mValues.get(position).getName());
        holder.mDescriptionTextView.setText(mValues.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class PlacesViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final ImageView mImageView;
        public final TextView mNameTextView;
        public final TextView mDescriptionTextView;
        public Place mItem;

        public PlacesViewHolder(View view) {
            super(view);
            mView = view;
            mImageView = (ImageView) view.findViewById(R.id.imageview_places_list_item_image);
            mNameTextView = (TextView) view.findViewById(R.id.textview_places_list_item_name);
            mDescriptionTextView = (TextView) view.findViewById(R.id.textview_places_list_item_description);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mNameTextView.getText() + "'";
        }
    }
}