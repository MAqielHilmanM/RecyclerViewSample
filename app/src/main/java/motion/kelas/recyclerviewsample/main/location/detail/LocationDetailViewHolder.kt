package motion.kelas.recyclerviewsample.main.location.detail

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_location_detail.view.*
import motion.kelas.recyclerviewsample.tools.load

class LocationDetailViewHolder(val view : View, val context : Context) : RecyclerView.ViewHolder(view) {
    fun onBind(child : LocationDetailModel){
        // TODO : FILL ONBIND ITEM HERE ! ! !

    }

    fun onClick(child: LocationDetailModel){
        view.setOnClickListener {
            // TODO : FILL ONCLICK ITEM HERE ! ! !
        }
    }
}