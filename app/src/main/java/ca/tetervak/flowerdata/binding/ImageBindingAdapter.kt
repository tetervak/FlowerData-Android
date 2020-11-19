package ca.tetervak.flowerdata.binding

import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import ca.tetervak.flowerdata.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

/**
 * Uses the Glide library to load an image by URL into an [ImageView]
 */
@BindingAdapter("imageUrl")
fun bindImage(imgView: ImageView, imgUrl: String?) {
    if(imgUrl is String){
        Glide.with(imgView.context)
                .load(imgUrl)
                .apply(RequestOptions()
                        .placeholder(R.drawable.loading_animation)
                        .error(R.drawable.ic_broken_image))
                .into(imgView)
    }
}