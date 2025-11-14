package com.stevdza.san.components

import androidx.compose.runtime.*
import com.stevdza.san.models.Achievement
import com.stevdza.san.models.Theme
import com.stevdza.san.util.Res
import com.stevdza.san.util.Constants.FONT_FAMILY
import com.stevdza.san.util.Constants.WEB_SITE
//import com.stevdza.san.styles.PortfolioSectionStyle
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
fun AchievementCard(
    modifier: Modifier = Modifier,
    achievement: Achievement,
    number: Int
){
    Row(modifier = modifier,
        verticalAlignment = Alignment.CenterVertically){
        Image(
            modifier = Modifier.size(70.px),
            src = achievement.icon,
            description = "icon achievement"
        )
        Column{
            P(
                attrs = Modifier
                    .margin(topBottom = 0.px)
                    .fillMaxWidth()
                    .maxWidth(500.px)
                    .fontSize(30.px)
                    .fontFamily(FONT_FAMILY)
                    .fontWeight(FontWeight.Bolder)
                    .color(Theme.Primary.rgb)
                    .toAttrs()
            ) {
               Text( if(achievement == Achievement.Completed) "$number+" else "$number")
            }
            P(
                attrs = Modifier
                    .margin(topBottom = 0.px)
                    .fillMaxWidth()
                    .maxWidth(500.px)
                    .fontSize(16.px)
                    .fontFamily(FONT_FAMILY)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Secondary.rgb)
                    .opacity(50.percent)
                    .toAttrs()
            ) {
               Text(achievement.description)
            }
        }
    }
}