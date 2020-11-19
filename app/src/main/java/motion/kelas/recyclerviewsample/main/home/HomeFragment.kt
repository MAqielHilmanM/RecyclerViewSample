package motion.kelas.recyclerviewsample.main.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.fragment_home.view.rvFragmentHome

import motion.kelas.recyclerviewsample.R
import motion.kelas.recyclerviewsample.main.home.adapter.HomeAdapter
import motion.kelas.recyclerviewsample.main.home.model.HomeBannerModel
import motion.kelas.recyclerviewsample.main.home.model.HomeListModel
import motion.kelas.recyclerviewsample.main.home.model.HomeModel

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    val lists = arrayListOf<HomeModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.rvFragmentHome.apply {
            adapter = HomeAdapter(lists)
            layoutManager = LinearLayoutManager(activity)
        }

        initDummy()
    }

    private fun initDummy() {
        // ADD BANNER
        val banners = arrayListOf<HomeBannerModel>(
            HomeBannerModel("1","Corona Virus 1","https://citrarayacity.co.id/wp-content/uploads/2020/03/coronavirus.jpg"),
            HomeBannerModel("2","Corona Virus 2","https://citrarayacity.co.id/wp-content/uploads/2020/03/coronavirus.jpg"),
            HomeBannerModel("3","Corona Virus 3","https://citrarayacity.co.id/wp-content/uploads/2020/03/coronavirus.jpg")
        )
        lists.add(HomeModel(
            banners,
            HomeAdapter.TYPE_BANNER
        ))

        // ADD TITLE
        lists.add(
            HomeModel(
            "Berita Terbaru",
            HomeAdapter.TYPE_TITLE
        ))

        // ADD LIST ITEM
        lists.add(HomeModel(
            HomeListModel("1", "Corona Virus 1", "https://citrarayacity.co.id/wp-content/uploads/2020/03/coronavirus.jpg"),
            HomeAdapter.TYPE_LIST
        ))
        lists.add(HomeModel(
            HomeListModel("2", "Corona Virus 2", "https://citrarayacity.co.id/wp-content/uploads/2020/03/coronavirus.jpg"),
            HomeAdapter.TYPE_LIST
        ))
        lists.add(HomeModel(
            HomeListModel("2", "Corona Virus 2", "https://citrarayacity.co.id/wp-content/uploads/2020/03/coronavirus.jpg"),
            HomeAdapter.TYPE_LIST
        ))

        // Refresh List
        rvFragmentHome.adapter?.notifyDataSetChanged()
    }
}
