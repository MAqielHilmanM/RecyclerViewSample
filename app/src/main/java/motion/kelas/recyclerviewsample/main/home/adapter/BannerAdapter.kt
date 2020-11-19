package motion.kelas.recyclerviewsample.main.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import motion.kelas.recyclerviewsample.R
import motion.kelas.recyclerviewsample.main.home.model.HomeBannerModel
import motion.kelas.recyclerviewsample.main.home.viewholder.BannerItemViewHolder

class BannerAdapter(val list: List<HomeBannerModel>) :
    RecyclerView.Adapter<BannerItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.subitem_banner_list, parent, false)
        return BannerItemViewHolder(view, parent.context)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: BannerItemViewHolder, position: Int) {
        holder.onBind(list[position])
        holder.onClick(list[position])
    }
}