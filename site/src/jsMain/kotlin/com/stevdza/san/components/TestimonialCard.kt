package com.stevdza.san.components

import androidx.compose.runtime.Composable
import com.stevdza.san.models.Testimonial
import com.stevdza.san.models.Theme
import com.stevdza.san.util.Constants.FONT_FAMILY
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun TestimonialCard(
    modifier :Modifier = Modifier,
    testimonial: Testimonial,
    breakpoint: Breakpoint
){
    Row(modifier = modifier.maxWidth(450.px)){
        Image(
            modifier = Modifier.margin(20.px)
                .maxWidth(
                    if(breakpoint > Breakpoint.MD) 160.px else 80.px
                ),
            src = testimonial.image,
            description = "avatar"
        )
        Column{
            Row(modifier =Modifier.fillMaxWidth()
                .margin(bottom = 20.px)){
                Column{
                    P(
                        attrs = Modifier
                            .margin(topBottom = 0.px)
                            .fillMaxWidth()
                            .maxWidth(500.px)
                            .fontSize(18.px)
                            .fontFamily(FONT_FAMILY)
                            .fontWeight(FontWeight.Bold)
                            .color(Theme.Secondary.rgb)
                            .toAttrs()
                    ) {
                        Text( testimonial.fullname)
                    }
                    P(
                        attrs = Modifier
                            .margin(topBottom = 0.px)
                            .fillMaxWidth()
                            .maxWidth(500.px)
                            .fontSize(12.px)
                            .fontFamily(FONT_FAMILY)
                            .fontWeight(FontWeight.Normal)
                            .color(Theme.Secondary.rgb)
                            .toAttrs()
                    ) {
                        Text( testimonial.profession)
                    }
                    if(breakpoint < Breakpoint.MD) RatingBar(modifier = Modifier.margin(top = 10.px)
                }
                if(breakpoint >= Breakpoint.MD){
                    Space()
                    RatingBar()
                }
            }
            P(
                attrs = Modifier
                    .margin(topBottom = 0.px)
                    .fillMaxWidth()
                    .maxWidth(500.px)
                    .fontSize(12.px)
                    .fontFamily(FONT_FAMILY)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ) {
                Text( testimonial.review)
            }
        }
    }

}