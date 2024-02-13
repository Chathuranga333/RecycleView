package com.example.recycleview
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ContactAdapter(val context: Context, val contacts: MutableList<person>):
    RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapter.ViewHolder {
        val  view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactAdapter.ViewHolder, position: Int) {
        val contact = contacts[position]
        holder.tvName.text = contact.name
        holder.tvage.text = "Age: ${contact.age}"
    }

    override fun getItemCount() = contacts.size


    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tvpersonname)
        val tvage: TextView = itemView.findViewById(R.id.tvage)

        fun bind(contact: person) {
            tvName.text = contact.name
            tvage.text = "Age: ${contact.age}"

        }


    }

}
