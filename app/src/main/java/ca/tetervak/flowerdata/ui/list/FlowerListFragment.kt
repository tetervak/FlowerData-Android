package ca.tetervak.flowerdata.ui.list

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ca.tetervak.flowerdata.R

class FlowerListFragment : Fragment() {

    companion object {
        fun newInstance() = FlowerListFragment()
    }

    private lateinit var viewModel: FlowerListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.flower_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FlowerListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}