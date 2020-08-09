package coder.mtk.shoppingdetail.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coder.mtk.shoppingdetail.R
import coder.mtk.shoppingdetail.model.ViewFour
import coder.mtk.shoppingdetail.model.ViewTwo
import kotlinx.android.synthetic.main.item_viewfour.view.*
import kotlinx.android.synthetic.main.item_viewone.view.*
import kotlinx.android.synthetic.main.item_viewtwo.view.*
import kotlinx.android.synthetic.main.item_viewtwo.view.itemPrice

class ViewFourAdapter (var viewTwoList : ArrayList<ViewFour>) : RecyclerView.Adapter<ViewFourAdapter.ViewFourViewHolder>(){
    class ViewFourViewHolder (itemView : View): RecyclerView.ViewHolder (itemView){
        fun bind(viewFour : ViewFour){
            itemView.itemImage1.setBackgroundResource(viewFour.imageSrc)
            itemView.itemName1.text = viewFour.itemName
            itemView.itemPrice1.text = viewFour.itemPrice.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewFourViewHolder {
        var view = LayoutInflater.from(parent.context ).inflate(R.layout.item_viewfour,parent,false)
        return ViewFourViewHolder(view)
    }

    override fun getItemCount(): Int {
        return viewTwoList.size
    }

    override fun onBindViewHolder(holder: ViewFourViewHolder, position: Int) {
        holder.bind(viewTwoList[position])
    }


}