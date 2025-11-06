package com.stevdza.san.styles

import com.stevdza.san.models.Theme
//import com.varabyte.kobweb.compose.css.TransitionOff
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.transform
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.*
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*


val NavigationItemStyle = CssStyle{
    base{
    Modifier.color(Theme.Secondary.rgb)
      //  .transition(TransitionOff(property = "color", duration = 200.ms))
}
    anyLink{
    Modifier.color(Theme.Secondary.rgb)
       // .transition(TransitionOff(property = "color", duration = 200.ms))
}
    hover{
    Modifier.color(Theme.Primary.rgb)
}
}

@OptIn(ExperimentalComposeWebApi::class)
val LogoStyle = CssStyle{
    base{
        Modifier.transform{rotate(0.deg)}
            .transition(property = "transform", duration = 200.ms)
    }
    hover{

        Modifier.transform{rotate(-10.deg)}
    }
}
