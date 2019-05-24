package hoa.nguyenminh.it

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import hoa.nguyenminh.it.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    private var array = arrayOf(
        "anh chính là thanh xuân của em",
        "123 12345 12 12345 1234 123 12",
        "xiaomi",
        "bitis hunter",
        "bitis hunter x",
        "tai nghe",
        "nguyễn nhật ánh",
        "đắc nhân tâm",
        "tai nghe bluetooth",
        "kem chống nắng",
        "a a a long long long",
        "banh trung thu trung muoi",
	"banh trung thu Kinh Do"

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        mBinding.recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        mBinding.recyclerView.adapter = KeyWordAdapter(array)
    }

}
