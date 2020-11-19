package motion.kelas.recyclerviewsample.main.home.viewholder

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.subitem_banner_list.view.*
import motion.kelas.recyclerviewsample.main.home.model.HomeBannerModel
import motion.kelas.recyclerviewsample.main.home.model.HomeTitleModel
import motion.kelas.recyclerviewsample.tools.load

class BannerItemViewHolder(val view: View, val context: Context): RecyclerView.ViewHolder(view) {
    fun onBind(child : HomeBannerModel){
        view.ivSubItemBannerList.load(child.images)
        view.tvSubItemBannerListTitle.text = child.title
    }

    fun onClick(child: HomeBannerModel){
        view.setOnClickListener {
            
        }
    }
}