package com.androiddevs.mvvmnewsapp.utils

import android.view.View
import kotlinx.android.synthetic.main.fragment_breaking_news.*

class PaginationProgressBarVisibility {

    companion object{
         fun hideProgressBar(view: View) {
            view.visibility = View.INVISIBLE
        }

         fun showrogressBar(view: View) {
            view.visibility = View.VISIBLE
        }
    }
}