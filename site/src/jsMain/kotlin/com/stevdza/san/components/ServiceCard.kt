package com.stevdza.san.components

import androidx.compose.runtime.*
import com.stevdza.san.models.Service
import com.stevdza.san.models.Theme
import com.stevdza.san.util.Constants.FONT_FAMILY
import com.stevdza.san.styles.ServiceCardStyle
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

@Composable
fun ServiceCard(service: Service) {

    Column(
        modifier = ServiceCardStyle.toModifier()
            .maxWidth(300.px)
            .margin(all = 20.px)
            .padding(all = 20.px)
            .border(
                width = 2.px,
                style = LineStyle.Solid,
                color = Theme.LightGray.rgb
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .id("indexBox")
                .padding(all = 10.px)
                .margin(bottom = 20.px)
                .border(width = 2.px, style = LineStyle.Solid, color = Theme.Primary.rgb)
                .borderRadius(
                    topLeft = 20.px,
                    topRight = 20.px,
                    bottomLeft = 20.px,
                    bottomRight = 0.px
                )
        ) {
            Image(
                src = service.icon,
                description = service.imageDesc,
                modifier = Modifier.size(40.px)
            )
        }
        P(
            attrs = Modifier
                .margin(top = 0.px, bottom = 10.px)
                .fillMaxWidth()
                .maxWidth(500.px)
                .fontSize(18.px)
                .fontFamily(FONT_FAMILY)
                .fontWeight(FontWeight.Bold)
                .toAttrs()
        ) {
            Text(service.title)
        }
        P(
            attrs = Modifier
                .margin(top = 0.px, bottom = 0.px)
                .fillMaxWidth()
                .maxWidth(500.px)
                .fontSize(14.px)
                .fontFamily(FONT_FAMILY)
                .fontWeight(FontWeight.Normal)
                .toAttrs()
        ) {
            Text(service.description)
        }
    }
}

