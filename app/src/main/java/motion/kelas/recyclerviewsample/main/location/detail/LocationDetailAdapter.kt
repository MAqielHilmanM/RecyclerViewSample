package motion.kelas.recyclerviewsample.main.location.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import motion.kelas.recyclerviewsample.R

class LocationDetailAdapter(val list: List<LocationDetailModel>) : RecyclerView.Adapter<LocationDetailViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocationDetailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_location, parent)
        return LocationDetailViewHolder(view, parent.context)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: LocationDetailViewHolder, position: Int) {
        holder.onBind(list[position])
        holder.onClick(list[position])
    }
}