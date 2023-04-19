package ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Immutable
class MyTypography internal constructor(
    val title: TextStyle,
    val subTitle: TextStyle,
    val body: TextStyle,
    val label: TextStyle,
    val button: TextStyle,
)

internal fun MyTypography(
    colors: MyColors
) = MyTypography(
    title = TextStyle(
        color = colors.text,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 24.sp,
        lineHeight = 28.sp,
    ),
    subTitle = TextStyle(
        color = colors.text,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        lineHeight = 24.sp,
    ),
    body = TextStyle(
        color = colors.text,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 18.sp,
    ),
    label = TextStyle(
        color = colors.text,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 14.sp,
    ),
    button = TextStyle(
        color = colors.text,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 18.sp,
    )
)