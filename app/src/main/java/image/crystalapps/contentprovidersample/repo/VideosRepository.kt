package image.crystalapps.contentprovidersample.repo

import android.content.Context
import image.crystalapps.contentprovidersample.VideoLoader
import image.crystalapps.contentprovidersample.repo.BaseRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class VideosRepository @Inject constructor():
    BaseRepository() {




    suspend fun getVideoContentProvider(context : Context): VideoLoader = withContext(Dispatchers.IO) {
        return@withContext VideoLoader.getInstance(context)
    }





}