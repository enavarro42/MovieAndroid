package com.enavarro.movie.data.network

import com.enavarro.movie.utils.Constants.API_KEY
import okhttp3.Interceptor
import okhttp3.Response
import timber.log.Timber

class HttpRequestInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        request = request?.newBuilder()
            ?.addHeader("api_key", API_KEY)
            ?.build()
        Timber.d(request.toString())
        return chain.proceed(request)
    }
}