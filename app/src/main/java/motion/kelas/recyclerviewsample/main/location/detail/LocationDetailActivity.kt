package motion.kelas.recyclerviewsample.main.location.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_location_detail.*
import motion.kelas.recyclerviewsample.R

class LocationDetailActivity : AppCompatActivity() {
    val lists = arrayListOf<LocationDetailModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location_detail)

        rvLocationDetail.apply {
            adapter = LocationDetailAdapter(lists)
            layoutManager = LinearLayoutManager(this@LocationDetailActivity)
        }

        loadDummy()
    }

    private fun loadDummy() {
        lists.add(
            LocationDetailModel(
            "1","Corona Virus 1", "Lorem Ipsum Sim Dolor Amet", "https://citrarayacity.co.id/wp-content/uploads/2020/03/coronavirus.jpg"
        ))
        lists.add(
            LocationDetailModel(
            "2","Corona Virus 2", "Lorem Ipsum Sim Dolor Amet", "https://citrarayacity.co.id/wp-content/uploads/2020/03/coronavirus.jpg"
        ))
        lists.add(
            LocationDetailModel(
            "3","Corona Virus 3", "Lorem Ipsum Sim Dolor Amet", "https://citrarayacity.co.id/wp-content/uploads/2020/03/coronavirus.jpg"
        ))
        rvLocationDetail.adapter?.notifyDataSetChanged()
    }
}
