package com.stevdza.san.components

import androidx.compose.runtime.*
import com.stevdza.san.models.Portfolio
import com.stevdza.san.models.Theme
import com.stevdza.san.util.Constants.FONT_FAMILY
import com.stevdza.san.util.Constants.WEB_SITE
//import com.stevdza.san.styles.ServiceCardStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import com.varabyte.kobweb.navigation.OpenLinkStrategy

@Composable
fun ServiceCard(
    modifier: Modifier = Modifier,
    portfolio: Portfolio,
    link: String = WEB_SITE) {
Link(
    textDecorationLine = TextDecorationLine.None,
    path = link,
    //openExternalLinkStrategy = OpenLinkStrategy.IN_NEW_TAB

){
    Column(modifier = modifier) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .maxWidth(20.px)
                .margin(bottom = 20.px)

        ) {
            Image(
                src = portfolio.image,
                description = "Portfolio image",
                modifier = Modifier.size(300.px)
                    .objectFit(ObjectFit.Cover)
            )
        }
        P(
            attrs = Modifier
                .margin(topBottom = 0.px)
                .fillMaxWidth()
                .maxWidth(500.px)
                .fontSize(18.px)
                .fontFamily(FONT_FAMILY)
                .fontWeight(FontWeight.Bold)
                .color(Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text(portfolio.title)
        }
        P(
            attrs = Modifier
                .margin(topBottom = 0.px)
                .fillMaxWidth()
                .maxWidth(500.px)
                .fontSize(14.px)
                .fontFamily(FONT_FAMILY)
                .fontWeight(FontWeight.Normal)
                .color(Theme.Secondary.rgb)
                .opacity(50.percent)
                .toAttrs()
        ) {
            Text(portfolio.description)
        }

    }
}}

