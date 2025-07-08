import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.moazsalem.jetpackplayground.R
import com.moazsalem.jetpackplayground.ui.theme.urbanist


@Composable
fun  Screen() {
    val colorScheme = MaterialTheme.colorScheme
    val isDarkTheme = isSystemInDarkTheme()
    Scaffold { innerPadding ->
        Column(modifier = Modifier.fillMaxSize().padding(innerPadding),verticalArrangement = Arrangement.Center, horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(64.dp))
                    .background(Color(0xFF4F3422))
                    .padding(16.dp),
                contentAlignment = androidx.compose.ui.Alignment.Center,
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.white_icon),
                    contentDescription = null,
                    tint = if (isDarkTheme) Color(0xff926247) else Color.White,
                )
            }
            Text(
                buildAnnotatedString {
                    append("Welcome to the ultimate ")
                    withStyle(style = SpanStyle(color = Color(0xFF926247))) {
                        append("freud")
                    }
                    append(" UI Kit!")
                },
                lineHeight = 32.sp,
                color = colorScheme.onBackground,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(vertical = 16.dp, horizontal = 16.dp)
            )
            Text(text = "Your mindful mental health AI companion for everyone, anywhere 🍃",fontWeight = FontWeight.Normal, fontSize = 18.sp, color = colorScheme.onSecondaryContainer, textAlign = TextAlign.Center, modifier = Modifier.padding(vertical = 16.dp, horizontal = 28.dp))
            Image(
                painter = painterResource(id = if (isDarkTheme) R.drawable.on_boarding_0_dark else R.drawable.on_boarding_0),
                contentDescription = null,
                modifier = Modifier.size(300.dp)
            )
            Button(onClick = {}, modifier = Modifier.padding(vertical = 16.dp, horizontal = 16.dp).size(width = 180.dp, height = 55.dp), colors = ButtonDefaults.buttonColors(containerColor = colorScheme.primary)) {
                Text(text = "Get Started", color = Color.White,fontSize = 18.sp, fontWeight = FontWeight.Bold, fontFamily = urbanist)
                Image(
                    painter = painterResource(id = R.drawable.arrow),
                    contentDescription = null,
                    modifier = Modifier.size(32.dp).padding(start = 8.dp)
                )
            }
            Row (modifier = Modifier.padding(vertical = 16.dp, horizontal = 16.dp)) {
                Text(
                    text = "Already have an account?",
                    color = colorScheme.onSecondaryContainer,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "Sign In.",
                    color = Color(0xFFED7E1C),
                    textDecoration = androidx.compose.ui.text.style.TextDecoration.Underline,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.clickable { println("Text clicked!") }. padding(start = 4.dp)
                )
            }
        }
    }
}