package coder.mtk.shoppingdetail.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coder.mtk.shoppingdetail.R
import coder.mtk.shoppingdetail.model.ViewOne
import kotlinx.android.synthetic.main.item_viewone.view.*

class ViewOneAdapter (var viewOneList : ArrayList<ViewOne>) : RecyclerView.Adapter<ViewOneAdapter.ViewOneViewHolder>(){
    class ViewOneViewHolder (itemView : View): RecyclerView.ViewHolder (itemView){
        fun bind(viewOne : ViewOne){
            itemView.itemPhoto.setBackgroundResource(viewOne.imagsrc)
            itemView.itemName.text = viewOne.name
            itemView.itemStock.text = viewOne.stock.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewOneViewHolder {
        var view = LayoutInflater.from(parent.context ).inflate(R.layout.item_viewone,parent,false)
        return ViewOneViewHolder(view)
    }

    override fun getItemCount(): Int {
        return viewOneList.size
    }

    override fun onBindViewHolder(holder: ViewOneViewHolder, position: Int) {
        holder.bind(viewOneList[position])
    }
}