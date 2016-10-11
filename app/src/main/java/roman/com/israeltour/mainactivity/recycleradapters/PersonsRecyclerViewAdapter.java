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
import roman.com.israeltour.data.dataobjects.Person;

public class PersonsRecyclerViewAdapter extends RecyclerView.Adapter<PersonsRecyclerViewAdapter.PersonViewHolder> {

    private final List<Person> mValues;

    public PersonsRecyclerViewAdapter(List<Person> items) {
        mValues = items;
    }

    @Override
    public PersonsRecyclerViewAdapter.PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.persons_fragment_list_item, parent, false);
        return new PersonsRecyclerViewAdapter.PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final PersonsRecyclerViewAdapter.PersonViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mNameTextView.setText(mValues.get(position).getName());
        holder.mDescriptionTextView.setText(mValues.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class PersonViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mNameTextView;
        public final TextView mDescriptionTextView;
        public Person mItem;

        public PersonViewHolder(View view) {
            super(view);
            mView = view;
            mNameTextView = (TextView) view.findViewById(R.id.textview_persons_list_item_name);
            mDescriptionTextView = (TextView) view.findViewById(R.id.textview_persons_list_item_description);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mNameTextView.getText() + "'";
        }
    }
}