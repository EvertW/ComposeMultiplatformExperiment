package ui.library.buttons

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import ui.library.text.MyText
import ui.theme.MyTheme

@Composable
fun MyButton(
    modifier: Modifier = Modifier,
    text: String,
    style: MyButtonStyle = MyButtonStyle.Primary,
    onClick: () -> Unit
) {
    MyText(
        modifier = modifier
            .animateContentSize()
            .clip(CircleShape)
            .background(
                when (style) {
                    MyButtonStyle.Primary -> MyTheme.colors.primary
                    MyButtonStyle.Secondary -> MyTheme.colors.secondary
                }
            )
            .clickable {
                onClick.invoke()
            }
            .padding(horizontal = 16.dp, vertical = 12.dp),
        text = text,
        style = MyTheme.typography.button
    )
}

sealed class MyButtonStyle {
    object Primary : MyButtonStyle()
    object Secondary : MyButtonStyle()
}