package org.yadav.recyclerviewdummy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class ContactAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    List<Contact> contacts;

    public ContactAdapter(Context context, List<Contact> contacts) {
        this.context = context;
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list_item, parent, false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Contact curr = contacts.get(position);
        ContactsViewHolder viewHolder = (ContactsViewHolder) holder;

        viewHolder.nameHolder.setText(curr.getcName());
        viewHolder.numHolder.setText(curr.getcNumber());
    }

    public static class ContactsViewHolder extends RecyclerView.ViewHolder {

        public TextView nameHolder;
        public TextView numHolder;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);

            nameHolder = itemView.findViewById(R.id.contactName);
            numHolder = itemView.findViewById(R.id.contactNum);
        }
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }
}
