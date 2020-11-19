package motion.kelas.recyclerviewsample.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*
import motion.kelas.recyclerviewsample.R

class MainActivity : AppCompatActivity() {

    lateinit var menuItem : MenuItem

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vpMain.adapter = MainPagerAdapter(this)

        bnvMain.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_home -> {
                    vpMain.currentItem = 0
                }
                R.id.menu_list -> {
                    vpMain.currentItem = 1
                }
            }
            return@setOnNavigationItemSelectedListener false
        }

        vpMain.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                bnvMain.menu.getItem(position).isChecked = true
                menuItem = bnvMain.menu.getItem(position)
            }
        })
    }
}
