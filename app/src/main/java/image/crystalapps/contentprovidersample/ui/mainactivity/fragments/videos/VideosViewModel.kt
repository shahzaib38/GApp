package image.crystalapps.contentprovidersample.ui.mainactivity.fragments.videos

import android.content.Context
import androidx.hilt.lifecycle.ViewModelInject
import image.crystalapps.contentprovidersample.PhotoLoader
import image.crystalapps.contentprovidersample.VideoLoader
import image.crystalapps.contentprovidersample.ui.base.BaseViewModel
import javax.inject.Inject

class VideosViewModel @ViewModelInject constructor(private val videosRepository: VideosRepository):BaseViewModel<VideosNavigator>(videosRepository) {



    suspend fun getVideoContentProvider(context : Context): VideoLoader {
        return videosRepository.getVideoContentProvider(context)
    }



}