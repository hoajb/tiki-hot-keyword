package hoa.nguyenminh.it

import android.graphics.drawable.GradientDrawable
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.key_word_item.view.*


/**
 * Created by Hoa Nguyen on May 16 2019.
 */
class KeyWordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun binding(keyword: String) {
        itemView.text.text = StringUtil.breakString(keyword)
        itemView.text.setBackgroundResource(R.drawable.tags_rounded_corners)

        val drawable = itemView.text.background as GradientDrawable
        drawable.setColor((Math.random() * 3158064).toInt() or (0xFF shl 24))
    }
}
