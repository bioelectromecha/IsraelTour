package roman.com.israeltour.recycleradapters;

/**
 * Created by roman on 10/10/16.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import roman.com.israeltour.MyApplication;
import roman.com.israeltour.R;
import roman.com.israeltour.data.dataobjects.History;

public class HistoryRecyclerViewAdapter extends RecyclerView.Adapter<HistoryRecyclerViewAdapter.HistoryViewHolder> {

    private final List<History> mValues;

    public HistoryRecyclerViewAdapter(List<History> items) {
        mValues = items;
    }

    @Override
    public HistoryRecyclerViewAdapter.HistoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.history_fragment_list_item, parent, false);
        return new HistoryRecyclerViewAdapter.HistoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final HistoryRecyclerViewAdapter.HistoryViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mNameTextView.setText(MyApplication.getContext().getResources().getString(mValues.get(position).getName()));
        holder.mDescriptionTextView.setText(MyApplication.getContext().getResources().getString(mValues.get(position).getDescription()));
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class HistoryViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mNameTextView;
        public final TextView mDescriptionTextView;
        public History mItem;

        public HistoryViewHolder(View view) {
            super(view);
            mView = view;
            mNameTextView = (TextView) view.findViewById(R.id.textview_history_list_item_name);
            mDescriptionTextView = (TextView) view.findViewById(R.id.textview_history_list_item_description);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mNameTextView.getText() + "'";
        }
    }
}