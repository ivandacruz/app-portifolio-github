package com.ivan.app_portifolio_github.ui


import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ivan.app_portifolio_github.data.model.Repo
import com.ivan.app_portifolio_github.databinding.ItemRepoBinding
import com.bumptech.glide.Glide

class RepoListAdapter(var mContext: Context) : ListAdapter<Repo, RepoListAdapter.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemRepoBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(
        private val binding: ItemRepoBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Repo) {
            //Log.d("_itemExibido", "Element $adapterPosition show.")

            binding.root.setOnClickListener {
                //Log.d("_itemClick", "Element $adapterPosition clicked.")

                val intent = Intent( mContext , DetailsActivity::class.java)
                intent.putExtra("repository", this@RepoListAdapter.currentList[adapterPosition] )
                binding.root.context.startActivity(intent)
            }

            with(binding) {
                tvRepoName.text = item.name
                tvRepoDescription.text = item.description
                tvRepoLanguage.text = item.language
                chipStar.text = item.stargazersCount.toString()
            }

            Glide.with(binding.root.context)
                .load(item.owner.avatarURL).into(binding.ivOwner)
        }
    }

}

class DiffCallback : DiffUtil.ItemCallback<Repo>() {
    override fun areItemsTheSame(oldItem: Repo, newItem: Repo) = oldItem == newItem
    override fun areContentsTheSame(oldItem: Repo, newItem: Repo) = oldItem.id == newItem.id
}