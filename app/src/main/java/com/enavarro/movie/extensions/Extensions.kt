package com.enavarro.movie.extensions

import com.enavarro.movie.data.models.Genre
import com.enavarro.movie.data.models.Images

// Manage genre formatted
fun List<Genre>.formatted(): String = map { genre -> genre.name }.reduce { prevGenres, genre -> "$prevGenres, $genre" }

// Manage Images
fun Images.generatePosterUrl(posterPath: String): String {
    return generateImageUrl(imageSizes = posterSizes, targetSize = "w500", imagePath = posterPath)
}

fun Images.generateBackdropUrl(backdropPath: String): String {
    return generateImageUrl(imageSizes = backdropSizes, targetSize = "w1280", imagePath = backdropPath)
}

private fun Images.generateImageUrl(imageSizes: List<String>?, targetSize: String, imagePath: String): String {
    return if (imageSizes.isNullOrEmpty() || imagePath.isEmpty()) {
        ""
    } else {
        val imageSize = imageSizes.find { imageSize -> imageSize == targetSize } ?: imageSizes[0]
        "$secureBaseUrl$imageSize$imagePath"
    }
}