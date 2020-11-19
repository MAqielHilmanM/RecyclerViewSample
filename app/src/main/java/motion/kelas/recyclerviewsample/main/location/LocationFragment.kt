package motion.kelas.recyclerviewsample.main.location

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_location.*
import kotlinx.android.synthetic.main.fragment_location.view.*
import kotlinx.android.synthetic.main.fragment_location.view.rvFragmentLocation

import motion.kelas.recyclerviewsample.R

/**
 * A simple [Fragment] subclass.
 */
class LocationFragment : Fragment() {
    val lists = arrayListOf<LocationModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_location, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.rvFragmentLocation.apply {
            adapter = LocationAdapter(lists)
            layoutManager = LinearLayoutManager(activity)
        }

        initDummy()
    }

    private fun initDummy() {
        lists.add(LocationModel("1", "Bandung"))
        lists.add(LocationModel("2", "Jakarta"))
        lists.add(LocationModel("3", "Sumedang"))
        lists.add(LocationModel("4", "Banjaran"))
        rvFragmentLocation.adapter?.notifyDataSetChanged()
    }
}
