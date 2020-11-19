package motion.kelas.recyclerviewsample.main.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import motion.kelas.recyclerviewsample.R
import motion.kelas.recyclerviewsample.main.home.model.HomeBannerModel
import motion.kelas.recyclerviewsample.main.home.model.HomeListModel
import motion.kelas.recyclerviewsample.main.home.model.HomeModel
import motion.kelas.recyclerviewsample.main.home.model.HomeTitleModel
import motion.kelas.recyclerviewsample.main.home.viewholder.HomeBannerViewHolder
import motion.kelas.recyclerviewsample.main.home.viewholder.HomeListViewHolder
import motion.kelas.recyclerviewsample.main.home.viewholder.HomeTitleViewHolder
import motion.kelas.recyclerviewsample.main.home.viewholder.HomeViewHolder

class HomeAdapter(val list: List<HomeModel>) : RecyclerView.Adapter<HomeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return when (viewType) {
            TYPE_BANNER -> {
                HomeBannerViewHolder(
                    LayoutInflater.from(parent.context).inflate(R.layout.item_home_banner, parent, false),
                    parent.context
                )
            }

            TYPE_TITLE -> {
                HomeTitleViewHolder(
                    LayoutInflater.from(parent.context).inflate(R.layout.item_home_title, parent, false),
                    parent.context
                )
            }

            else -> {
                HomeListViewHolder(
                    LayoutInflater.from(parent.context).inflate(R.layout.item_home_list, parent, false),
                    parent.context
                )
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        when (holder) {
            is HomeBannerViewHolder -> {
                holder.onBind(list[position].data as List<HomeBannerModel>)
            }

            is HomeTitleViewHolder -> {
                holder.onBind(list[position].data as HomeTitleModel)
                holder.onClick(list[position].data as HomeTitleModel)
            }

            is HomeListViewHolder -> {
                holder.onBind(list[position].data as HomeListModel)
                holder.onClick(list[position].data as HomeListModel)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].viewType
    }

    companion object {
        const val TYPE_LIST = 0
        const val TYPE_TITLE = 1
        const val TYPE_BANNER = 2
    }
}