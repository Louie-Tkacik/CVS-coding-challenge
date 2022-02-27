package com.tkacik.cvs.presentation.flickr

import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberImagePainter
import com.tkacik.cvs.presentation.theme.CvsTheme
import com.tkacik.cvs.presentation.viewmodel.FlickrViewModel
import tkacik.cvs.R

@Composable
fun FlickrDetailsScreen(
    viewModel: FlickrViewModel = viewModel((LocalContext.current as ComponentActivity)),
) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        val selectedImage = viewModel.flickrUiState.collectAsState()
        Image(
            painter = rememberImagePainter(selectedImage.value.selectedFlickrImage?.media?.m),
            contentDescription = stringResource(R.string.desc_text)+"imageContentDescription",
            modifier = Modifier
                .fillMaxWidth()
                .height(CvsTheme.dimens.detailsImageHeight),
            contentScale = ContentScale.Crop
        )
        Box {
            Column {
                Text(text = stringResource(R.string.title_text) + selectedImage.value.selectedFlickrImage?.title)
                Text(text = stringResource(R.string.desc_text) + selectedImage.value.selectedFlickrImage?.getDescription()!!.alt)
                Text(text = stringResource(R.string.width_text) + selectedImage.value.selectedFlickrImage?.getDescription()!!.width)
                Text(text = stringResource(R.string.width_text) + selectedImage.value.selectedFlickrImage?.getDescription()!!.height)
                Text(text = stringResource(R.string.author_text) + selectedImage.value.selectedFlickrImage?.author)
            }
        }
    }
}

@Preview
@Composable
fun FlickrDetailsScreen_Preview() {
    FlickrDetailsScreen()
}