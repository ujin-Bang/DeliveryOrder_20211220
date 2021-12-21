package com.neppplus.deliveryorder_20211220.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.neppplus.deliveryorder_20211220.R
import com.neppplus.deliveryorder_20211220.adapters.PizzaStoreAdapter
import com.neppplus.deliveryorder_20211220.datas.StoreData
import kotlinx.android.synthetic.main.fragment_pizza_store_list.*

class PizzaStoreLIstFragment: Fragment() {

    val mPizzaStoreList = ArrayList<StoreData>()
    lateinit var mPizzaStoreAdapter : PizzaStoreAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza_store_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        동작 관련 코드 작성 예정

        mPizzaStoreList.add(StoreData("피자헛", "1588-5588","https://blog.kakaocdn.net/dn/nkQca/btqwVT4rrZo/ymhFqW9uRbzrmZTxUU1QC1/img.jpg"))
        mPizzaStoreList.add(StoreData("파파존스","1577-8080","https://mblogthumb-phinf.pstatic.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800"))
        mPizzaStoreList.add(StoreData("미스터피자","1577-0077","https://upload.wikimedia.org/wikipedia/commons/2/2f/Mr.Pizza_logo.JPG"))
        mPizzaStoreList.add(StoreData("도미노피자","1577-3082","https://yt3.ggpht.com/ytc/AKedOLSWSoBqbITnKtrvNK9uzSO-nNfEQk0R-ZRJDZ8jVw=s900-c-k-c0x00ffffff-no-rj"))

        mPizzaStoreAdapter = PizzaStoreAdapter(requireContext(),R.layout.store_list_item,mPizzaStoreList)
        pizzaStoreListView.adapter = mPizzaStoreAdapter
    }
}