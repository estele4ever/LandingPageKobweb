package com.stevdza.san.sections


import androidx.compose.runtime.*
import com.stevdza.san.components.SectionTitle
import com.stevdza.san.components.TestimonialCard
import com.stevdza.san.models.Section
import com.stevdza.san.models.Testimonial
import com.stevdza.san.models.Theme
import com.stevdza.san.util.Constants.SECTION_WIDTH
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.Visibility
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.*

@Composable
fun TestimonialSection(){

    Box(modifier = Modifier.id(Section.Testimonial.id)
        .maxWidth(SECTION_WIDTH.px)
        .padding(topBottom = 150.px),
        contentAlignment = Alignment.TopCenter) {

        TestimonialContent()
    }
}


@Composable
fun TestimonialContent() {
    val breakpoint = rememberBreakpoint()


    Column(
        modifier = Modifier.fillMaxSize(if(breakpoint >= Breakpoint.MD) 100.percent else 90.percent),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SectionTitle(
            modifier = Modifier.fillMaxWidth().margin(bottom = 20.px),
            section = Section.Testimonial,
            alignment = Alignment.CenterHorizontally
        )
    }
}