package motion.kelas.recyclerviewsample.main.home.viewholder

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_home_list.view.*
import motion.kelas.recyclerviewsample.main.home.model.HomeBannerModel
import motion.kelas.recyclerviewsample.main.home.model.HomeListModel
import motion.kelas.recyclerviewsample.tools.load

class HomeListViewHolder(val view: View,val context: Context): HomeViewHolder(view) {
    fun onBind(child : HomeListModel){
        view.ivItemHomeList.load(child.images)
        view.tvItemHomeListLabel.text = child.title
    }

    fun onClick(child: HomeListModel){
        view.setOnClickListener {

        }
    }
}