package com.stevdza.san.sections

import androidx.compose.runtime.*
import com.stevdza.san.components.SectionTitle
import com.stevdza.san.models.Service
import com.stevdza.san.models.Theme
import com.stevdza.san.util.Constants.FONT_FAMILY
import com.stevdza.san.models.Section
import com.stevdza.san.util.Constants.SECTION_WIDTH
import com.stevdza.san.components.ServiceCard
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
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun ServiceSection(){
    Box(modifier = Modifier.id(Section.Service.id)
        .maxWidth(SECTION_WIDTH.px)
        .padding(topBottom = 150.px),
        contentAlignment = Alignment.TopCenter) {

        ServiceContent()
    }
}

@Composable
fun ServiceContent(){
    val breakpoint = rememberBreakpoint()

    Column(
        modifier = Modifier.fillMaxSize(if(breakpoint >= Breakpoint.MD) 100.percent else 90.percent),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        SectionTitle(
            modifier = Modifier.fillMaxWidth().margin(bottom = 20.px),
            section = Section.Service,
            alignment = Alignment.CenterHorizontally)

        SimpleGrid(
            numColumns = numColumns(base = 1,sm = 2,md = 3)
        ){


                Service.values().forEach{service ->
                    ServiceCard(service = service)
                }
        }

    }
}
