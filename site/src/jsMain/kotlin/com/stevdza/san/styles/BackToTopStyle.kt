package com.stevdza.san.styles

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.rotate
import com.varabyte.kobweb.compose.ui.modifiers.transform
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.unaryMinus

var BackToTopBStyle = CssStyle{
    base{
        Modifier.rotate(180.deg)
            .transition(Transition.of(property = "rotate", duration = 300.ms))
    }
    hover{
        Modifier.rotate(0.deg)
    }
}