package com.example.thehiveapp_android.ui.hive

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.example.thehiveapp_android.R
import com.example.thehiveapp_android.data.HiveRealmObject


class HiveListItemView : LinearLayout {
    private lateinit var hiveNameTextView: TextView
    private lateinit var hiveLastInspectedAtTextView: TextView


    constructor(context: Context) : super(context){

    }

    @Suppress("UNUSED_PARAMETER")
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {

    }

    @Suppress("UNUSED_PARAMETER")
    constructor(context: Context, attrs: AttributeSet, defaultAttrsId: Int) : super(context, attrs, defaultAttrsId) {

    }

    fun populate(hive: HiveRealmObject){
        //This is where we actually populate the views in this item.
        hiveNameTextView = this.findViewById(R.id.hive_name_text) as TextView
        hiveLastInspectedAtTextView = this.findViewById(R.id.hive_last_inspected_text) as TextView

        hiveNameTextView.text = hive.name

        var hiveDateString = "Not Yet Inspected"
        if (hive.hiveLogs.size > 0) {
            hiveDateString = hive.hiveLogs.last()!!.date.toString()
        }

        hiveLastInspectedAtTextView.text = hiveDateString
    }

    fun openHiveDetail(view: View) {

    }


    fun onClick(v: View) {
        Log.d("HiveListItemView", "Clicked Hive")
    }


}