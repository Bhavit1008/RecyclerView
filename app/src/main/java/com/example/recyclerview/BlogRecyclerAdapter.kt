package com.example.recyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_blog_list_item.view.*
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.recyclerview.Blogs.*
import com.example.recyclerview.models.BlogPost
import kotlin.collections.ArrayList


class BlogRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{

    private val TAG: String = "AppDebug"

    private var items: List<BlogPost> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BlogViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_blog_list_item, parent, false))

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {

            is BlogViewHolder -> {
                holder.bind(items.get(position),position)
            }
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(blogList: List<BlogPost>){
        items = blogList
    }


    class BlogViewHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val blog_image = itemView.blog_image
        val blog_title = itemView.blog_title
        val blog_author = itemView.blog_author
        val blog_description = itemView.description
        val blog_like = itemView.like
        val blog_comment = itemView.comment
        val blog_share = itemView.share

        fun bind(blogPost: BlogPost,i:Int){

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.blurbackground)
                .error(R.drawable.blurbackground)


            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(blogPost.image)
                .into(blog_image)
            blog_title.setText(blogPost.title)
            blog_author.setText(blogPost.username)
            blog_description.setText(blogPost.body)
            blog_image.setOnClickListener {
                Toast.makeText(itemView.context,"clicked on "+blog_description.text, Toast.LENGTH_SHORT).show()
                when(i){
                    0 -> {
                        var intent :Intent
                        intent = Intent(itemView.context,Dzire::class.java)
                        itemView.context.startActivity(intent)
                    }
                    1 -> {
                        var intent :Intent
                        intent = Intent(itemView.context,Brezza::class.java)
                        itemView.context.startActivity(intent)
                    }
                    2 -> {
                        var intent :Intent
                        intent = Intent(itemView.context,Kia::class.java)
                        itemView.context.startActivity(intent)
                    }
                    3 -> {
                        var intent :Intent
                        intent = Intent(itemView.context,Hector::class.java)
                        itemView.context.startActivity(intent)
                    }
                    4->{
                        var intent :Intent
                        intent = Intent(itemView.context,Xuv::class.java)
                        itemView.context.startActivity(intent)
                    }
                    5->{
                        var intent :Intent
                        intent = Intent(itemView.context,Scorpio::class.java)
                        itemView.context.startActivity(intent)
                    }
                }
            }
            blog_like.setOnClickListener {
                Toast.makeText(itemView.context,"item is liked",Toast.LENGTH_SHORT)
            }


        }

    }

}