package com.example.materialdesignsample.ui.fragment

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.util.Pair
import androidx.core.app.ActivityOptionsCompat
import androidx.fragment.app.Fragment
import androidx.navigation.ActivityNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.example.materialdesignsample.R
import com.example.materialdesignsample.data.model.Mail
import com.example.materialdesignsample.ui.adapter.MailAdapter
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    private val mailAdapter by lazy {
        MailAdapter { mail, rootView, imageView -> onItemEmailClicked(mail, rootView, imageView) }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initComponents()
    }

    private fun initComponents() {
        fragment_main_rv?.apply {
            adapter = mailAdapter
        }
    }

    private fun onItemEmailClicked(mail: Mail, rootView: View, imageView: View) {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                requireActivity(),
                Pair(rootView, getString(R.string.transition_root)),
                Pair(imageView, getString(R.string.transition_image)),
                Pair(requireActivity().findViewById(R.id.fab), getString(R.string.transition_fab)),
                Pair(requireActivity().findViewById(R.id.bar), getString(R.string.transition_bar))
            )

            val extras = ActivityNavigatorExtras(options)
//            findNavController().navigate(MainFragmentDirections.actionMainFragmentToDetailFragment(mail.id), extras)
        }
    }
}
