package com.stevdza.san.components



import androidx.compose.runtime.Composable
import com.stevdza.san.util.Constants.SECTION_WIDTH
import com.stevdza.san.util.Res
import com.stevdza.san.models.Theme
import com.stevdza.san.styles.SocialLinkStyle
import com.stevdza.san.util.Constants.WEB_Github
import com.stevdza.san.util.Constants.WEB_Instagram
import com.stevdza.san.util.Constants.WEB_LinkedIn
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.stevdza.san.util.Constants.WEB_SITE
import com.varabyte.kobweb.navigation.OpenLinkStrategy





@Composable
fun SocialBar(row: Boolean = false){
    if (row){
        Row(
            modifier = Modifier.margin(top = 25.px)
                .padding(leftRight = 25.px)
                .minHeight(40.px)
                .borderRadius(20.px)
                .backgroundColor(Colors.White),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            SocialLink(row = true)
        }
    }
    else{
        Column(
            modifier = Modifier.margin(right = 25.px)
                .padding(topBottom = 25.px)
                .minWidth(40.px)
                .borderRadius(20.px)
                .backgroundColor(Colors.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SocialLink()
        }
    }
}

@Composable
private fun SocialLink(row: Boolean = false){
        Link(
            path = WEB_SITE,
            openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
        ){
        FaFacebook(
            modifier = SocialLinkStyle.toModifier()
                .margin(
                    bottom = if (row)0.px else 40.px,
                    right = if(row) 40.px else 0.px),
            size = IconSize.LG
        )}

    Link(
        path = WEB_Github,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ){
        FaGithub(
            modifier = SocialLinkStyle.toModifier()
                .margin(bottom = if (row)0.px else 40.px,
                    right = if(row) 40.px else 0.px),
            size = IconSize.LG
        )
    }

    Link(
        path = WEB_Instagram,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ){
        FaInstagram(
            modifier = SocialLinkStyle.toModifier()
                .margin(bottom = if (row)0.px else 40.px,
                    right = if(row) 40.px else 0.px),
            size = IconSize.LG
        )}

    Link(
        path = WEB_LinkedIn,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ){
        FaLinkedin(
            modifier = SocialLinkStyle.toModifier(),
            size = IconSize.LG
        )
    }
}