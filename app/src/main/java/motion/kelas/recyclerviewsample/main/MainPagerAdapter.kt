package motion.kelas.recyclerviewsample.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import motion.kelas.recyclerviewsample.main.home.HomeFragment
import motion.kelas.recyclerviewsample.main.location.LocationFragment

class MainPagerAdapter(fa : FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> HomeFragment()
            else -> LocationFragment()
        }
    }
}
