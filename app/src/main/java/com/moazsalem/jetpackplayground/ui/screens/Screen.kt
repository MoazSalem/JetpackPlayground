import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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


@Composable
fun  Screen() {
    Scaffold { innerPadding ->
        Column(modifier = Modifier.fillMaxSize().padding(innerPadding),verticalArrangement = Arrangement.Center, horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(64.dp))
                    .background(Color(0xFF4F3422))
                    .padding(16.dp),
                contentAlignment = androidx.compose.ui.Alignment.Center,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.white_icon),
                    contentDescription = null,
                    modifier = Modifier.size(32.dp)
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
                color = Color(0xFF4F3422),
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(vertical = 16.dp, horizontal = 16.dp)
            )
            Text(text = "Your mindful mental health AI companion for everyone, anywhere 🍃",fontWeight = FontWeight.Normal, fontSize = 18.sp, color = Color(0xFF736B66), textAlign = TextAlign.Center, modifier = Modifier.padding(vertical = 16.dp, horizontal = 28.dp))
            Image(
                painter = painterResource(id = R.drawable.on_boarding_0),
                contentDescription = null,
                modifier = Modifier.size(300.dp)
            )
            Button(onClick = {}, modifier = Modifier.padding(vertical = 16.dp, horizontal = 16.dp).size(width = 180.dp, height = 55.dp), colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4F3422))) {
                Text(text = "Get Started", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                Image(
                    painter = painterResource(id = R.drawable.arrow),
                    contentDescription = null,
                    modifier = Modifier.size(32.dp).padding(start = 8.dp)
                )
            }
            Row (modifier = Modifier.padding(vertical = 16.dp, horizontal = 16.dp)) {
                Text(
                    text = "Already have an account?",
                    color = Color(0xFF736B66),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "Sign In.",
                    color = Color(0xFFED7E1C),
                    textDecoration = androidx.compose.ui.text.style.TextDecoration.Underline,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.clickable { println("Text clicked!") }. padding(start = 4.dp)
                )
            }
        }
    }
}