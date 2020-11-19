package motion.kelas.recyclerviewsample.main.location

import android.content.Context
import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_location.view.*
import motion.kelas.recyclerviewsample.main.location.detail.LocationDetailActivity

class LocationViewHolder(val view: View, val context: Context): RecyclerView.ViewHolder(view) {
    fun onBind(child : LocationModel){
        view.tvItemLocation.text = child.location
    }

    fun onClick(child: LocationModel){
        view.setOnClickListener {
            val intent = Intent(context, LocationDetailActivity::class.java)
            context.startActivity(intent)
        }
    }
}