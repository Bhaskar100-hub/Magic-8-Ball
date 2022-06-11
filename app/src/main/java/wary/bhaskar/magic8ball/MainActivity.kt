package wary.bhaskar.magic8ball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var tv_text: TextView

    val phrases = arrayOf(
        "It is certain",
        "It is decidedly so",
        "Without a doubt",
        "Yes definitely",
        "You may rely on it",
        "As I see it yes",
        "Most likely",
        "Outlook good",
        "Yes",
        "Signs point to yes",
        "Reply hazy try again",
        "Ask again later",
        "Better not tell you now",
        "Cannot predict now",
        "Concentrate and ask again",
        "Don't count on it",
        "My reply is no",
        "My sources say no",
        "Outlook not so good",
        "Very doubtful"
    )

    lateinit var random: Random

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        random = Random

        tv_text = findViewById(R.id.tv_text);

        tv_text.setOnClickListener {
            tv_text.text = phrases[random.nextInt(phrases.size)]
        }
    }
}