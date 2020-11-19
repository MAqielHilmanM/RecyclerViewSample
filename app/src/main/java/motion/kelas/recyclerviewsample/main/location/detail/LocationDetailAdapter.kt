package motion.kelas.recyclerviewsample.main.location.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import motion.kelas.recyclerviewsample.R

// TODO : FILL ........ with some value
class LocationDetailAdapter(val list: List<........>) : RecyclerView.Adapter<............>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ......... {
        val view = LayoutInflater.from(parent.context).inflate(R.layout..........., parent, false)
        return ..........(view, parent.context)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ..........., position: Int) {
        holder.onBind(list[position])
        holder.onClick(list[position])
    }
}