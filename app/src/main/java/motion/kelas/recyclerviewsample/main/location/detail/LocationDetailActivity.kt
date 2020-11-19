package motion.kelas.recyclerviewsample.main.location.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_location_detail.*
import motion.kelas.recyclerviewsample.R

class LocationDetailActivity : AppCompatActivity() {
    // TODO : Create Variable List Here ! ! !

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location_detail)

        initRecyclerView()
        loadDummy()
    }

    private fun initRecyclerView() {
        // TODO : Load Recycler View HERE ! ! !
    }

    private fun loadDummy() {
        // TODO : Load DUMMY HERE ! ! !

        // TODO : REFRESH ADAPTER HEREE ! ! !
    }
}
