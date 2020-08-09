package coder.mtk.shoppingdetail.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coder.mtk.shoppingdetail.R
import coder.mtk.shoppingdetail.model.ViewThree
import kotlinx.android.synthetic.main.item_viewthree.view.*

class ViewThreeAdapter(var viewThreeList: ArrayList<ViewThree>) : RecyclerView.Adapter<ViewThreeAdapter.ViewThreeViewHolder>() {
    class ViewThreeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(viewThree: ViewThree) {
            itemView.itemOneImage.setBackgroundResource(viewThree.imgSrc)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewThreeViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_viewthree,parent,false)
        return ViewThreeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return viewThreeList.size
    }

    override fun onBindViewHolder(holder: ViewThreeViewHolder, position: Int) {
        holder.bind(viewThreeList[position])
    }

}
