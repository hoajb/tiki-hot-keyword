package hoa.nguyenminh.it

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Hoa Nguyen on May 16 2019.
 */
class KeyWordAdapter(private val list: Array<String>) : RecyclerView.Adapter<KeyWordViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KeyWordViewHolder {
        val dataBinding = DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context),
            R.layout.key_word_item,
            parent,
            false
        )
        return KeyWordViewHolder(dataBinding.root)
    }

    override fun onBindViewHolder(holder: KeyWordViewHolder, position: Int) {
        holder.binding(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
