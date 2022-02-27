package com.tkacik.cvs.presentation.flickr

import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.zIndex
import androidx.lifecycle.viewmodel.compose.viewModel
import com.tkacik.cvs.presentation.theme.CvsTheme
import com.tkacik.cvs.presentation.viewmodel.FlickrViewModel
import tkacik.cvs.R

@Composable
fun FlickrListScreen(
    viewModel: FlickrViewModel = viewModel((LocalContext.current as ComponentActivity)),
    onItemClick: () -> Unit = {}
) {
    Column {
        val images = viewModel.flickrUiState.collectAsState()

        Row {
            SuggestionTextField(
                modifier = Modifier
                    .weight(3f)
                    .zIndex(1f),
                viewModel = viewModel
            )
            Button(
                modifier = Modifier.weight(1f),
                onClick = {
                    viewModel.onSearchClicked()
                }) {
                Text(text = stringResource(R.string.placeholder_text))

            }
        }
        LazyVerticalGrid(
            cells = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(CvsTheme.dimens.listItemPadding)
        ) {
            items(images.value.flickrImages) { image ->
                FlickrRowItem(
                    imageUrl = image.media.m,
                    imageTitle = image.title,
                    imageContentDescription = image.getDescription().alt
                ) {
                    viewModel.onItemClick(image)
                    onItemClick()
                }
            }
        }
    }
}

@Preview
@Composable
fun FlickrListScreen_Preview() {
    FlickrListScreen()
}