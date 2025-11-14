package com.stevdza.san.components

import androidx.compose.runtime.*
import com.stevdza.san.models.Portfolio
import com.stevdza.san.models.Theme
import com.stevdza.san.util.Res
import com.stevdza.san.util.Constants.FONT_FAMILY
import com.stevdza.san.util.Constants.WEB_SITE
import com.stevdza.san.styles.PortfolioSectionStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Button
import com.varabyte.kobweb.compose.ui.graphics.Color.Companion.argb


@Composable
fun PortfolioCard(
    modifier: Modifier = Modifier,
    portfolio: Portfolio,
    link: String = WEB_SITE) {
Link(
    modifier = PortfolioSectionStyle.toModifier()
    .textDecorationLine(TextDecorationLine.None),
    path = link
    //openExternalLinkStrategy = OpenLinkStrategy.IN_NEW_TAB
){
    Column(modifier = modifier.id("columnParent")) {
        Box(
            modifier = Modifier
                .id("boxParent")
                .fillMaxWidth()
                .maxWidth(300.px)
                .margin(bottom = 20.px)

        ) {
            Image(
                src = portfolio.image,
                description = "Portfolio image",
                modifier = Modifier
                    .size(300.px)
                    .objectFit(ObjectFit.Cover)
            )
            Box(
                modifier = Modifier
                    .id("greenOverlay")
                    .fillMaxHeight()
                    .backgroundColor(argb(a = 0.5f,r = 0, g = 167, b = 142)),
                contentAlignment = Alignment.Center
            )
            {
                Image(
                    src = Res.Image.icon,
                    description = "icon link",
                    modifier = Modifier
                        .id("linkIcon")
                        .size(32.px)
                )
            }
        }

        P(
            attrs = Modifier
                .id("portfolioTitle")
                .margin(topBottom = 0.px)
                .fillMaxWidth()
                .maxWidth(500.px)
                .fontSize(18.px)
                .fontFamily(FONT_FAMILY)
                .fontWeight(FontWeight.Bold)
                .toAttrs()
        ) {
            Text(portfolio.title)
        }
        P(
            attrs = Modifier
                .id("portfolioDesc")
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

