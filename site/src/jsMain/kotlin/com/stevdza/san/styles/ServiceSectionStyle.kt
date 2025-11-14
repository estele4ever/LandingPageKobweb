package com.stevdza.san.styles


import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.modifiers.rotate
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.compose.ui.modifiers.transform
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.*
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import com.varabyte.kobweb.compose.ui.modifiers.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.LineStyle
import com.stevdza.san.models.Theme
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import org.jetbrains.compose.web.css.px

val ServiceCardStyle  = CssStyle{
    base {
        Modifier.border(
            width = 2.px,
            style = LineStyle.Solid,
            color = Theme.LightGray.rgb
        )
            .backgroundColor(Colors.White)
            .transition(Transition.of(property = "border", duration = 200.ms))
            .transition(Transition.of(property = "background", duration = 200.ms))
    }

    hover{
        Modifier.border(
            width = 2.px,
            style = LineStyle.Solid,
            color = Theme.Primary.rgb
        )
            .backgroundColor(Theme.Primary.rgb)
            .transition(Transition.of(property = "border", duration = 200.ms))
            .transition(Transition.of(property = "background", duration = 200.ms))
    }
    cssRule("> #iconBox"){
        Modifier
            .backgroundColor(Colors.Transparent)
            .transition(Transition.of(property = "background", duration = 200.ms))
    }
    cssRule(":hover > #indexBox"){
        Modifier
            .backgroundColor(Colors.White)
            .transition(Transition.of(property = "background", duration = 200.ms))
    }
    cssRule("> P"){
        Modifier
            .color(Theme.Secondary.rgb)
            .transition(Transition.of(property = "color", duration = 200.ms))
    }
    cssRule(":hover > P"){
        Modifier
            .color(Colors.White)
            .transition(Transition.of(property = "color", duration = 200.ms))
    }
}
