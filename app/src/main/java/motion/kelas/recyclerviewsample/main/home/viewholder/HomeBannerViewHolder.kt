package motion.kelas.recyclerviewsample.main.home.viewholder

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.item_home_banner.view.*
import motion.kelas.recyclerviewsample.main.home.adapter.BannerAdapter
import motion.kelas.recyclerviewsample.main.home.model.HomeBannerModel

class HomeBannerViewHolder(val view: View, val context: Context) : HomeViewHolder(view) {
    fun onBind(child: List<HomeBannerModel>) {
        view.rvItemHomeBanner.apply {
            adapter = BannerAdapter(child)
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        }
        view.rvItemHomeBanner.adapter?.notifyDataSetChanged()
    }
}