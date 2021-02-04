package com.eman.mapmtms.presenters.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.eman.mapmtms.R
import com.eman.mapmtms.databinding.RowPlaceBinding
import com.eman.mapmtms.presenters.listener.Place_Listener
import com.eman.mapmtms.domain.models.Place

class PlacesAdapter(var list: List<Place>,val listener: Place_Listener) :
    RecyclerView.Adapter<PlacesAdapter.DataViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val binding = DataBindingUtil.inflate<RowPlaceBinding>(
            LayoutInflater.from(parent.context),
            R.layout.row_place,
            parent,
            false
        )
        return DataViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.binding.place=list.get(position)
        holder.binding.pListener = listener
        holder.binding.txtPlace.text = list.get(position).name

    }

    class DataViewHolder(val binding: RowPlaceBinding) : RecyclerView.ViewHolder(binding.root)


}