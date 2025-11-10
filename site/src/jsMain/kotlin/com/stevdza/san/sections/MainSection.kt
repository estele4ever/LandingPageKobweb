package com.stevdza.san.sections





import androidx.compose.runtime.Composable
import com.stevdza.san.util.Constants.SECTION_WIDTH
import com.stevdza.san.util.Res
import com.stevdza.san.styles.MainImageStyle
import com.stevdza.san.styles.MainSectionStyle
import com.stevdza.san.components.SocialBar
import com.stevdza.san.util.Constants.FONT_FAMILY
import com.stevdza.san.util.Constants.LOREM_IPSUM_SHORTEST
import com.stevdza.san.models.Theme
import com.stevdza.san.models.Section
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

//mainsection
@Composable
fun MainSection(){
    Box(modifier = Modifier.maxWidth(SECTION_WIDTH.px),
        contentAlignment = Alignment.TopCenter) {
        MainBackground()
    MainContent()
    }
}


//mainbackground
@Composable
fun MainBackground(){
    Image(src = Res.Image.background,
        description = "background description",
        modifier = Modifier.fillMaxSize()
            .objectFit(ObjectFit.Cover)
    )
}

@Composable
fun MainContent(){
    val breakpoint = rememberBreakpoint()

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Header()
        //SocialBar()
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            SimpleGrid(
                modifier = Modifier.fillMaxSize(if(breakpoint >= Breakpoint.MD) 80.percent else 90.percent),
                numColumns = numColumns(base = 1,md = 2)
            ){
                MainText(breakpoint = breakpoint)
                MainImage()
            }

        }
    }
}

@Composable
fun MainText(breakpoint: Breakpoint){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ){
        if(breakpoint > Breakpoint.MD)
        {
            SocialBar()
        }
        Column{
            P(
                attrs = Modifier.margin(topBottom = 0.px)
                    .fontSize( if(breakpoint >= Breakpoint.LG) 45.px else 20.px)
                    .fontFamily(FONT_FAMILY)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Primary.rgb)
                    .toAttrs()
            ){
                Text("hi, here")
            }

            P(
                attrs = Modifier.margin(top = 20.px, bottom = 0.px)
                    .fontSize(if(breakpoint >= Breakpoint.LG) 68.px else 40.px)
                    .fontFamily(FONT_FAMILY)
                    .fontWeight(FontWeight.Bolder)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ){
                Text("I'm NGNEMIE estele")
            }

            P(
                attrs = Modifier.margin(top = 10.px, bottom = 5.px)
                    .fontSize(20.px)
                    .fontFamily(FONT_FAMILY)
                    .fontWeight(FontWeight.Bold)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ){
                Text("Mobile & Development/Design")
            }

            P(
                attrs = Modifier.margin( bottom = 25.px)
                    .maxWidth(400.px)
                    .fontSize(15.px)
                    .fontFamily(FONT_FAMILY)
                    .fontWeight(FontWeight.Bold)
                    .fontStyle(FontStyle.Italic)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ){
                Text(LOREM_IPSUM_SHORTEST)
            }
            Button( attrs = MainSectionStyle.toModifier().height(40.px)
                .border(width = 0.px)
                .borderRadius(r = 5.px)
                .backgroundColor(Theme.Primary.rgb)
                .color(Colors.White)
                .toAttrs()
            ){
                Link(
                    modifier = Modifier.color(Colors.White)
                        .textDecorationLine(TextDecorationLine.None),
                    text = "hire me",
                    path = Section.Contact.path
                )
            }
        }
    }
}

@Composable
fun MainImage(){
    Column(
        modifier = Modifier.fillMaxSize()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom
    ){
    Image(src = Res.Image.main_image,
        description = "main description",
        modifier = MainImageStyle.toModifier().fillMaxSize()
    )}
}