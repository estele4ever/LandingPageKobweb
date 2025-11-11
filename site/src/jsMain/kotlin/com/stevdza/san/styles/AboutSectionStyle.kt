package com.stevdza.san.styles

//import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.modifiers.rotate
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.Transform
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.*
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*



/*
val AboutImageStyle  = CssStyle{
    base {
        Modifier
            .styleModifier {
                filter { grayscale(100.percent) }
            }
            .borderRadius(r = 0.px)
            .rotate(0.deg)
            .transition(Transition.of(property = "filter", duration = 200.ms))
    }
    hover {
        Modifier.styleModifier {
            filter { grayscale(0.percent) }
        }
            .borderRadius(r = 100.px)
            .rotate(10.deg)
    }
}*/


val AboutImageStyle = CssStyle {
    base {
        Modifier
            .styleModifier {
                property("filter", "grayscale(100%)")
            }
            .borderRadius(0.px)
            .transform { rotate(0.deg) }
            .transition(com.varabyte.kobweb.compose.css.Transition.of(property = "all", duration = 200.ms))
    }
    hover {
        Modifier
            .styleModifier {
                property("filter", "grayscale(0%)")
            }
            .borderRadius(100.px)
            .transform { rotate(10.deg) }
    }
}