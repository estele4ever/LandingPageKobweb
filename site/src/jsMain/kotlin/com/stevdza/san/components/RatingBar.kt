package com.stevdza.san.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.stevdza.san.util.Res
import org.jetbrains.compose.web.css.px
import com.varabyte.kobweb.silk.components.graphics.Image


@Composable
fun RatingBar(modifier:Modifier = Modifier) {
    Row(modifier = modifier){
        repeat(5){
            Image(
                modifier = Modifier.size(16.px)
                    .margin(right = if(it != 4) 2.px else 0.px),
                src = Res.Icon.star,
                description = "star image"
                )
        }
    }
}