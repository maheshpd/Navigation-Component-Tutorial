package com.createsapp.navigationcomponenttutorial

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MoviesAdapter(private var moviesList: List<MovieModel>): RecyclerView.Adapter<MoviesAdapter.MyViewHolder>() {



    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var title: TextView = view.findViewById(R.id.title)
        var years : TextView = view.findViewById(R.id.year)
        var genre: TextView = view.findViewById(R.id.genre)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_row,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val movie = moviesList[position]
        holder.title.text = movie.title
        holder.genre.text = movie.genre
        holder.years.text = movie.year
    }

    override fun getItemCount(): Int {
        return moviesList.size
    }
}