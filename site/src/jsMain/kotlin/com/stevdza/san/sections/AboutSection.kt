package com.stevdza.san.sections


import androidx.compose.runtime.*
import com.stevdza.san.components.SectionTitle
import com.stevdza.san.components.SkillBar
import com.stevdza.san.models.Section
import com.stevdza.san.models.Skill
import com.stevdza.san.models.Theme
import com.stevdza.san.styles.AboutImageStyle
//import com.stevdza.san.styles.AboutTextStyle
import com.stevdza.san.util.Constants.FONT_FAMILY
import com.stevdza.san.util.Constants.LOREM_IPSUM_SHORT
import com.stevdza.san.util.Constants.SECTION_WIDTH
//import com.stevdza.san.util.ObserveViewportEntered
import com.stevdza.san.util.Res
//import com.stevdza.san.util.animateNumbers
import com.varabyte.kobweb.compose.css.FontStyle
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
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutSection(){
    Box(modifier = Modifier.id(Section.About.id)
        .maxWidth(SECTION_WIDTH.px)
        .padding(topBottom = 150.px),
        contentAlignment = Alignment.TopCenter) {

        AboutContent()
    }
}

@Composable
fun AboutContent(){
    val breakpoint = rememberBreakpoint()

    Column(
        modifier = Modifier.fillMaxSize(if(breakpoint >= Breakpoint.MD) 100.percent else 90.percent)
            .maxWidth(1200.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        SimpleGrid(
            numColumns = numColumns(base = 1,md = 2)
        ){
            AboutImage()
            AboutMe()
        }

    }
}

@Composable
fun AboutImage(){
    Box(modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center) {
        Image(src = Res.Image.about_image,
            description = "main description",
            modifier = AboutImageStyle.toModifier().fillMaxWidth()
        )
    }
}

@Composable
fun AboutMe(){
    Column(
        modifier = Modifier.fillMaxWidth()
            .maxWidth(1200.px),
        verticalArrangement = Arrangement.Center
    ){
        SectionTitle(section = Section.About)
        P(
            attrs = Modifier.margin(topBottom = 20.px)
                .maxWidth(500.px)
                .fontSize( 18.px)
                .fontFamily(FONT_FAMILY)
                .fontStyle(FontStyle.Italic)
                .fontWeight(FontWeight.Normal)
                .color(Theme.Primary.rgb)
                .toAttrs()
        ){
            Text(LOREM_IPSUM_SHORT)
        }
        Skill.values().forEach{skill->
            SkillBar(name = skill.title,
                percentage = skill.percentage)
        }
    }
}