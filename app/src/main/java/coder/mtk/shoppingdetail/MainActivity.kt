package coder.mtk.shoppingdetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import coder.mtk.shoppingdetail.adapter.ViewFourAdapter
import coder.mtk.shoppingdetail.adapter.ViewOneAdapter
import coder.mtk.shoppingdetail.adapter.ViewThreeAdapter
import coder.mtk.shoppingdetail.adapter.ViewTwoAdapter
import coder.mtk.shoppingdetail.model.ViewFour
import coder.mtk.shoppingdetail.model.ViewOne
import coder.mtk.shoppingdetail.model.ViewThree
import coder.mtk.shoppingdetail.model.ViewTwo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewOneList = ArrayList<ViewOne>()
        viewOneList.add(ViewOne(R.drawable.chair,"Chair",1123))
        viewOneList.add(ViewOne(R.drawable.sofa,"Sofa",500))
        viewOneList.add(ViewOne(R.drawable.bed,"Bed",700))
        viewOneList.add(ViewOne(R.drawable.cabinet,"Cabinet",2040))

        var viewOneAdapter = ViewOneAdapter(viewOneList)

        viewOneRecycler.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter = viewOneAdapter
        }


        var viewTwoList = ArrayList<ViewTwo>()
        viewTwoList.add(ViewTwo(R.drawable.lvonnechair,"Ivonne chair, green",29.00))
        viewTwoList.add(ViewTwo(R.drawable.snakeskin,"Snakeskin Pattern Buckle",29.00))
        viewTwoList.add(ViewTwo(R.drawable.armchair,"Armchair Konna green",29.00))

        var viewTwoAdapter = ViewTwoAdapter(viewTwoList)

        viewTwoRecycler.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = viewTwoAdapter
        }


        var viewThreeList = ArrayList <ViewThree> ()
        viewThreeList.add(ViewThree(R.drawable.viewthree))
        viewThreeList.add(ViewThree(R.drawable.viewthree))
        viewThreeList.add(ViewThree(R.drawable.viewthree))


        var viewThreeAdapter = ViewThreeAdapter(viewThreeList)

        itemOneRecycler.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter = viewThreeAdapter
        }

        var viewFourList = ArrayList<ViewFour>()
        viewFourList.add(ViewFour(R.drawable.lvonnechair,"Ruffle Trim Spot",29.00))
        viewFourList.add(ViewFour(R.drawable.snakeskin,"Leaf Floral Print Random",29.00))
        viewFourList.add(ViewFour(R.drawable.armchair,"Drop Shoulder Geo Pattern",29.00))

        var viewFourAdapter = ViewFourAdapter(viewFourList)

        viewTwoRecycler1.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = viewFourAdapter
        }
    }
}