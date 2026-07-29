package com.stevdza.san.models

import com.stevdza.san.util.Constants.ANDROID_DESCRIPTION
import com.stevdza.san.util.Constants.BUSINESS_DESCRIPTION
import com.stevdza.san.util.Constants.DESIGN_DESCRIPTION
import com.stevdza.san.util.Constants.IOS_DESCRIPTION
import com.stevdza.san.util.Constants.SEO_DESCRIPTION
import com.stevdza.san.util.Constants.WEB_DESCRIPTION
import com.stevdza.san.util.Res

enum class Service(
    val icon: String,
    val imageDesc: String,
    val title: String,
    val description: String
) {
    Android(
        icon = Res.Icon.android,
        imageDesc = "Android Icon",
        title = "Android Development",
        description = ANDROID_DESCRIPTION
    ),
    IOS(
        icon = Res.Icon.apple,
        imageDesc = "Apple Icon",
        title = "iOS Development",
        description = IOS_DESCRIPTION
    ),
    Web(
        icon = Res.Icon.web,
        imageDesc = "Desktop Icon",
        title = "Web Development",
        description = WEB_DESCRIPTION
    ),
    Design(
        icon = Res.Icon.design,
        imageDesc = "Pen Icon",
        title = "UX/UI Design",
        description = DESIGN_DESCRIPTION
    ),
    Business(
        icon = Res.Icon.business,
        imageDesc = "Chart Icon",
        title = "Business Analysis",
        description = BUSINESS_DESCRIPTION
    ),
    SEO(
        icon = Res.Icon.seo,
        imageDesc = "Megaphone Icon",
        title = "SEO Marketing",
        description = SEO_DESCRIPTION
    )
}