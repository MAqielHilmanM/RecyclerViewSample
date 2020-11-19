package motion.kelas.recyclerviewsample.main.home.viewholder

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_home_title.view.*
import motion.kelas.recyclerviewsample.main.home.model.HomeBannerModel
import motion.kelas.recyclerviewsample.main.home.model.HomeTitleModel

class HomeTitleViewHolder(val view: View, val context: Context): HomeViewHolder(view) {
    fun onBind(child : HomeTitleModel){
        view.tvItemHomeTitle.text = child.id
    }

    fun onClick(child: HomeTitleModel){
        view.setOnClickListener {
            
        }
    }
}