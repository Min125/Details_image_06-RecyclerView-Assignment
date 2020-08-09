package coder.mtk.shoppingdetail.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coder.mtk.shoppingdetail.R
import coder.mtk.shoppingdetail.model.ViewOne
import coder.mtk.shoppingdetail.model.ViewTwo
import kotlinx.android.synthetic.main.item_viewone.view.*
import kotlinx.android.synthetic.main.item_viewone.view.itemName
import kotlinx.android.synthetic.main.item_viewtwo.view.*

class ViewTwoAdapter (var viewTwoList : ArrayList<ViewTwo>) : RecyclerView.Adapter<ViewTwoAdapter.ViewTwoViewHolder>(){
    class ViewTwoViewHolder (itemView : View): RecyclerView.ViewHolder (itemView){
        fun bind(viewTwo : ViewTwo){
            itemView.itemImage.setBackgroundResource(viewTwo.imageSrc)
            itemView.itemName.text = viewTwo.itemName
            itemView.itemPrice.text = viewTwo.itemPrice.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewTwoViewHolder {
        var view = LayoutInflater.from(parent.context ).inflate(R.layout.item_viewtwo,parent,false)
        return ViewTwoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return viewTwoList.size
    }

    override fun onBindViewHolder(holder: ViewTwoViewHolder, position: Int) {
        holder.bind(viewTwoList[position])
    }


}
