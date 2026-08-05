package com.stevdza.san.models

import com.stevdza.san.util.Constants.WEB_HomeGaz
import com.stevdza.san.util.Constants.WEB_OCR
import com.stevdza.san.util.Constants.WEB_Orion
import com.stevdza.san.util.Constants.WEB_SITE
import com.stevdza.san.util.Constants.WEB_Sgae
import com.stevdza.san.util.Constants.WEB_WoadGame
import com.stevdza.san.util.Res

enum class Portfolio(
    val image: String,
    val title: String,
    val description: String,
    val link: String
) {
    One(
        image = Res.Image.portfolio1,
        title = "CVJOB",
        description = "Frontend",
        link = WEB_Orion
    ),
    Two(
        image = Res.Image.portfolio2,
        title = "SGAE ",
        description = "Web Design/Frontend/Backend",
        link = WEB_Sgae
    ),
    Three(
        image = Res.Image.portfolio3,
        title = "HOMEGAZ",
        description = "Frontend",
        link = WEB_HomeGaz
    ),
    Four(
        image = Res.Image.portfolio4,
        title = "Woad Game",
        description = "Web App",
        link = WEB_WoadGame
    ),
    Five(
        image = Res.Image.portfolio5,
        title = "OCR service(not Ready)",
        description = "Web",
        link = WEB_OCR
    )
}