package com.stevdza.san.components

import androidx.compose.runtime.*
import com.stevdza.san.models.Section
import com.stevdza.san.models.Theme
import com.stevdza.san.util.Constants.FONT_FAMILY
import com.stevdza.san.util.ObserveViewportEntered
//import com.stevdza.san.util.ObserveViewportEntered
//import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ScrollSnapAlign
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun SectionTitle(
    modifier: Modifier = Modifier,
    section: Section,
    alignment: Alignment.Horizontal = Alignment.Start
){

    val scope = rememberCoroutineScope()
    var titleMargin by remember { mutableStateOf(50.px) }
    var subTitleMargin by remember { mutableStateOf(50.px) }

    ObserveViewportEntered(
        sectionId = section.id,
        distanceFromTop = 700.0,
        onViewportEntered = {
            scope.launch {
                subTitleMargin = 0.px
                if (alignment == Alignment.Center) {
                    delay(25)
                }
                titleMargin = 0.px
            }
        }
    )
    Column(
        modifier = Modifier,
        horizontalAlignment = alignment
    ){
        P(
            attrs = Modifier
                .fillMaxWidth()
                .textAlign(when(alignment){
                    Alignment.CenterHorizontally -> TextAlign.Center
                    Alignment.End -> TextAlign.End
                    else -> TextAlign.Start
                })
                .margin(
                    left = titleMargin,
                    top = 0.px,
                    bottom = 0.px
                )
                .fontFamily(FONT_FAMILY)
                .fontSize( 25.px)
                .fontWeight(FontWeight.Normal)
                .color(Theme.Primary.rgb)
                .transition(Transition.of(property = "margin", duration = 300.ms))
                .toAttrs()
        ){
            Text(section.title)
        }
        P(
            attrs = Modifier
                .fillMaxWidth()
                .textAlign(when(alignment){
                    Alignment.CenterHorizontally -> TextAlign.Center
                    Alignment.End -> TextAlign.End
                    else -> TextAlign.Start
                })
                .margin(
                    left = if (alignment == Alignment.Center) subTitleMargin else 0.px,
                    right = if (alignment == Alignment.CenterHorizontally) subTitleMargin else 0.px,
                    top = 0.px,
                    bottom = 10.px)
                .fontFamily(FONT_FAMILY)
                .fontSize( 40.px)
                .fontWeight(FontWeight.Bold)
                .color(Theme.Secondary.rgb)
                .transition(Transition.of(property = "margin", duration = 300.ms))
                .toAttrs()
        ){
            Text(section.subtitle)
        }
        Box(
            modifier = Modifier
                .height(2.px)
                .width(80.px)
                .backgroundColor(Theme.Primary.rgb)
                .borderRadius(r = 50.px)
        )
    }

}