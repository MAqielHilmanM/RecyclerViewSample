package motion.kelas.recyclerviewsample.main.location

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import motion.kelas.recyclerviewsample.R

/**
 * A simple [Fragment] subclass.
 */
class LocationFragment : Fragment() {
    // TODO : CREATE PROPERTY LIST HERE ! ! !

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_location, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView(view)
        initDummy()
    }

    private fun initRecyclerView(view: View) {
        // TODO : CREATE RECYCLER VIEW HERE ! ! !

    }

    private fun initDummy() {
        // TODO : LOAD DATA DUMMY HERE ! ! !
    }
}
